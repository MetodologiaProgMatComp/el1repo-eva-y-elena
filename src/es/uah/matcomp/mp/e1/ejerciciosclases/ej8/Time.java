package es.uah.matcomp.mp.e1.ejerciciosclases.ej8;

public class Time {
    private int hour;
    private int minute;
    private int second;
    private String second0;
    private String minute0;
    private String hour0;
    public Time(int day, int month, int year) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toString(){
        if (second < 10) {
            second0 = "0" + second;
        }
        else {second0 = String.valueOf(second);
        }
        if (minute < 10) {
            minute0 = "0" + minute;
        }
        else {minute0 = String.valueOf(minute);
        }
        if (hour < 10) {
            hour0 = "0" + hour;
        }
        else {hour0 = String.valueOf(hour);
        }
        return hour0 + ":" + minute0 + ":" + second0;
    }

    public Time nextSecond() {
        second+=1;
        if (second == 60) {
            second = 0;
            minute+=1;
            if (minute == 60) {
                minute = 0;
                hour+=1;
                if (hour == 24) {
                    hour = 0;
                }
            }
        }
        return this;
    }

    public Time previousSecond() {
        second-=1;
        if (second == -1) {
            second = 59;
            minute-=1;
            if (minute == -1) {
                minute = 59;
                hour-=1;
                if (hour == -1) {
                    hour = 23;
                }
            }
        }
        return this;
    }
}
