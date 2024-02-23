/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructures;

/**
 *
 * @author User
 */
public class Vacation {
    private String location;
    private String activities;
    private String facilities;
    private String scenery;
    private String environment;
    private int duration;
    private int budget;

    public Vacation(String location, String activities, String facilities, String scenery, String environment, int duration, int budget) {
        this.location = location;
        this.activities = activities;
        this.facilities = facilities;
        this.scenery = scenery;
        this.environment = environment;
        this.duration = duration;
        this.budget = budget;
    }

    public String getLocation() {
        return location;
    }

    public String getActivities() {
        return activities;
    }

    public String getFacilities() {
        return facilities;
    }

    public String getScenery() {
        return scenery;
    }

    public String getEnvironment() {
        return environment;
    }

    public int getDuration() {
        return duration;
    }

    public int getBudget() {
        return budget;
    }

    @Override
    public String toString() {
        return "Location: " + location + ", Activities: " + activities + ", Facilities: " + facilities + ", Scenery: " + scenery + ", Environment: " + environment + ", Duration: " + duration + ", Budget: " + budget;
    }
}
