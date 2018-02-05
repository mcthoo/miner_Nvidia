/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miningtest;

import java.io.IOException;

/**
 *
 * @author Thomas
 */
public class Miner {
    String name; // Nom du miner
    String url;  // Lien du raccourci à lancer
    String nameProcess; // Nom du processus
    boolean run; // Run ou non
    int time; // Temps executé
    API api; // API du miner s'il en a un !
    boolean api_valid; // Si un API existe
    float payout;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isRun() {
        return run;
    }

    public void setRun(boolean run) {
        this.run = run;
    }

    public float getPayout() {
        return payout;
    }

    public void setPayout(float payout) {
        this.payout = payout;
    }

    public API getApi() {
        return api;
    }

    public void setApi(API api) {
        this.api = api;
    }

    public String getNameProcess() {
        return nameProcess;
    }

    public void setNameProcess(String nameProcess) {
        this.nameProcess = nameProcess;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public boolean isApi_valid() {
        return api_valid;
    }

    public void setApi_valid(boolean api_valid) {
        this.api_valid = api_valid;
    }

    public Miner(String name, String url, String nameProcess, boolean run) {
        this.name = name;
        this.url = url;
        this.nameProcess = nameProcess;
        this.run = run;
        this.time = 0;
        this.api_valid = false;
    }

    
}
