
package pkg251_group_project;

import java.util.*;

public class VolunteerOpportunity {
    private String opportunityId;
    private String name;
    private String description;
    private String location;
    private int capacity;
    private LinkedList <String> requirements;
    private String startDate;
    private String endDate;

    public VolunteerOpportunity(String opportunityId, String name, String description, String location, int capacity, LinkedList <String> requirements, String startDate, String endDate) {
        this.opportunityId = opportunityId;
        this.name = name;
        this.description = description;
        this.location = location;
        this.capacity = capacity;
        this.requirements = requirements;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    //Getters:
    public String getOpportunityId() {
        return opportunityId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getLocation() {
        return location;
    }

    public int getCapacity() {
        return capacity;
    }

    public LinkedList<String> getRequirements() {
        return requirements;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    //Setters:
    public void setOpportunityId(String opportunityId) {
        this.opportunityId = opportunityId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setRequirements(LinkedList<String> requirements) {
        this.requirements = requirements;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
    
    public boolean isCapacityFull() {
        // Check if the opportunity has reached its maximum capacity
        return capacity <= 0;
    }
    
    public void decreaseCapacity() {
        // Decrease the capacity of the opportunity by a given count
        if (capacity >= 0) {
            capacity -= capacity;
        }
    }
    
        
}
