package es.uah.matcomp.mp.e1.ejerciciosclases.ej7;

public class Date {

    private int day;
    private int month;
    private int year;
    private String day0;
    private String month0;
    private String year0;
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString(){
        if (day < 10) {
            day0 = "0" + day;}
        else {day0 = String.valueOf(day);
            }

        if (month < 10) {
            month0 = "0" + month;}
        else {month0 = String.valueOf(month);
        }

        if (year < 10) {
            year0 = "0" + year;}
        else {year0 = String.valueOf(year);
        }

        return day0 + "/" + month0 + "/" + year0;
    }
}
