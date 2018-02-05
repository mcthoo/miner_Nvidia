/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miningtest;

import java.text.DateFormat;
import java.util.Date;

/**
 *
 * @author Thomas
 */
public class log {
    Date date;
    String msg;

    @Override
    public String toString() {
        DateFormat shortDateFormat = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT);
        return shortDateFormat.format(date) + ": " + msg;
    }

    public log(Date date, String msg) {
        this.date = date;
        this.msg = msg;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    
    
    
}
