/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miningtest;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;
import java.util.List;
import org.apache.commons.io.IOUtils;

/**
 *
 * @author Thomas
 */
public class API {
    String CoinName;
    String api_key;
    String url_connection;
    String data_balance;

    public API(String CoinName, String url_connection, String api_key) {
        this.CoinName = CoinName;
        this.api_key = api_key;
        this.url_connection = url_connection;
    }

    public String getApi_key() {
        return api_key;
    }

    public void setApi_key(String api_key) {
        this.api_key = api_key;
    }

    public String getUrl_connection() {
        return url_connection;
    }

    public void setUrl_connection(String url_connection) {
        this.url_connection = url_connection;
    }

    public String getCoinName() {
        return CoinName;
    }

    public void setCoinName(String CoinName) {
        this.CoinName = CoinName;
    }

    public String getData_balance() {
        return data_balance;
    }

    public void setData_balance(String data_balance) {
        this.data_balance = data_balance;
    }
    
    public String setJsonSuprnova(String action, List<log> log) {
        String jsonString="";
        try {
        URL url = new URL(url_connection+action+"&api_key="+api_key);
        final HttpURLConnection httpcon = (HttpURLConnection) url.openConnection();
        httpcon.addRequestProperty("User-Agent", "Mozilla/4.76");
        httpcon.setReadTimeout(5000);
        InputStream in = httpcon.getInputStream();
        jsonString = IOUtils.toString(in);
        } catch (IOException ex) {
        log.add(new log(new Date(), "No connection API Suprnova"));
        }
        return jsonString;
    }
        public String setJsonBittrex(String action, List<log> log) {
        String jsonString="";
        try {
        URL url = new URL(url_connection+action);
        final HttpURLConnection httpcon = (HttpURLConnection) url.openConnection();
        httpcon.addRequestProperty("User-Agent", "Mozilla/4.76");
        httpcon.setReadTimeout(5000);
        InputStream in = httpcon.getInputStream();
        jsonString = IOUtils.toString(in);
        } catch (IOException ex) {
        log.add(new log(new Date(), "No connection API bittrex"));
        }
        return jsonString;
    }
        public String setJsonWhattomine(List<log> log) {
        String jsonString="";
        try {
        URL url = new URL(url_connection);
        final HttpURLConnection httpcon = (HttpURLConnection) url.openConnection();
        httpcon.addRequestProperty("User-Agent", "Mozilla/4.76");
        httpcon.setReadTimeout(5000);
        InputStream in = httpcon.getInputStream();
        jsonString = IOUtils.toString(in);
        } catch (IOException ex) {
        log.add(new log(new Date(), "No connection API Whattomine"));
        }
        return jsonString;
    }
    public String setJsonFlypool(String action, List<log> log) {
        String jsonString="";
        try {
        URL url = new URL(url_connection+action);
        final HttpURLConnection httpcon = (HttpURLConnection) url.openConnection();
        httpcon.addRequestProperty("User-Agent", "Mozilla/4.76");
        httpcon.setReadTimeout(5000);
        InputStream in = httpcon.getInputStream();
        jsonString = IOUtils.toString(in);
        } catch (IOException ex) {
        log.add(new log(new Date(), "No connection API Flypool"));
        }
        return jsonString;
    }
}
