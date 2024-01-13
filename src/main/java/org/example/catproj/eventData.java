package org.example.catproj;

import java.sql.Time;
import java.sql.Date;

public class eventData {
    private int eventId;
    private String name;
    private String date;
    private String time;
    private String desc;
    private String imag;

    public eventData(String name, String date, String time, String desc, String imag){
        this.name = name;
        this.date = date;
        this.time = time;
        this.desc = desc;
        this.imag = imag;
    }

    public String getName(){
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getDesc() {
        return desc;
    }

    public String getImag() {
        return imag;
    }
}
