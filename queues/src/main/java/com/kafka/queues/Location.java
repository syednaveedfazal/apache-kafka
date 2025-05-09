package com.kafka.queues;


public class Location {

    private String area;
    private String latitute;
    private String longitute;

    public Location(String area, String latitute, String longitute) {
        this.area = area;
        this.latitute = latitute;
        this.longitute = longitute;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getLatitute() {
        return latitute;
    }

    public void setLatitute(String latitute) {
        this.latitute = latitute;
    }

    public String getLongitute() {
        return longitute;
    }

    public void setLongitute(String longitute) {
        this.longitute = longitute;
    }
}
