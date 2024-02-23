/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructproject;

public class Vacay {

    private String location;
    private String activity;
    private String fac;
    private double budget;
    private int days;
    
    public Vacay(String location, String activity, String fac, double budget, int days){
        this.location = location;
        this.activity = activity;
        this.fac = fac;
        this.budget = budget;
        this.days = days;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getFac() {
        return fac;
    }

    public void setFac(String fac) {
        this.fac = fac;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
   
       
    public String toString(){
        String s = "Location: "+location+"\nActivity: "+activity+"\nFacilities: "+fac+"\nBudget (RM): "+String.format("%.2f",budget)+"\nDuration (Days): "+days+"\n\n";
        return s;
    }

}
