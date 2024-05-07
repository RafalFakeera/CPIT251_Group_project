package pkg251_group_project;

import java.util.*;

public class HaweiaProgram {

    //User profile
    static Customer Ahmed = new Customer("CU001");

    //Create a LinkedList to store volunteer opportunities
    static LinkedList <VolunteerOpportunity> Opportunity = new LinkedList<>();
    // Create a LinkedList to store events
    static LinkedList<Event> events = new LinkedList<>();

    static Scanner scanner = new Scanner(System.in);

    //Methods:
    
    //Method to print a welcoming message in the beginning of the program
    private static void displayWelcomeMessage() {
        System.out.println("____________________________________________");
        System.out.println("               Welcome to Haweia!               ");
        System.out.println("____________________________________________");
        System.out.println("Our goal is to promote and highlight the rich culture and heritage of our Kingdom by "
                + "providing an engaging and informative experience for users to explore.");
        System.out.println("\n");
    }

    //Print the services we provide and let the user choose one of them to see their details
    private static int promptUserForServiceChoice() {
        System.out.println("Services:");
        System.out.println("1. Events");
        System.out.println("2. Volunteer Opportunities");
        System.out.println("3. Stores");
        System.out.print("Enter the number of the service you want to explore: ");
        //User choose by the number of the service
        int choice = scanner.nextInt();
        return choice;
    }

    //Initialize volunteer opportunities ->  multiple VolunteerOpportunity objects (default method)
    public static void initializeOpportunity() {

        LinkedList<String> requirements_opportunity1 = new LinkedList<>();
        requirements_opportunity1.add("Must be 18 years or older");
        requirements_opportunity1.add("Physically fit");
        VolunteerOpportunity opportunity1 = new VolunteerOpportunity(
                "OPP001",
                "Helping Hands",
                "Assist in community clean-up activities",
                "Riyadh",
                20,
                requirements_opportunity1,
                "2024-05-01",
                "2024-05-15"
        );
        Opportunity.add(opportunity1);

        LinkedList<String> requirements_opportunity2 = new LinkedList<>();
        requirements_opportunity2.add("Background check required");
        requirements_opportunity2.add("Experience working with youth");
        VolunteerOpportunity opportunity2 = new VolunteerOpportunity(
                "OPP002",
                "Youth Mentoring Program",
                "Provide mentorship to underprivileged youth",
                "Riyadh",
                10,
                requirements_opportunity2,
                "2024-06-01",
                "2024-07-31"
        );
        Opportunity.add(opportunity2);
        
        LinkedList<String> requirements_opportunity3 = new LinkedList<>();
        requirements_opportunity3.add("Able to lift and carry heavy items");
        VolunteerOpportunity opportunity3 = new VolunteerOpportunity(
                "OPP003",
                "Food Bank Assistance",
                "Help with sorting and packaging food donations",
                "Jeddah",
                15,
                requirements_opportunity3,
                "2024-08-01",
                "2024-08-31"
        );
        Opportunity.add(opportunity3);
    }
    
    // Initialize events
    public static void initializeEvents() {
    Event event1 = new Event(1, "interactive mini golf event", "2024-05-10", "Events And More", "Elevate your golfing adventure on our futuristic course!", 40.00);
    events.add(event1);

    Event event2 = new Event(2, "Experience Bujairr event", "2024-06-15", "Bujairi Terrace and At-Turaif", "Diriyah's newest dining destination, Bujairi Terrace offers a vibrant program of events and activities in addition to see", 150.0);
    events.add(event2);

    Event event3 = new Event(3, "BlackBox event", "2024-07-20", "Events And More", "Dive into a classic arcade gaming experience at our social entertainment venue. From Pac-man to Pinball and beyond, it's a gaming paradise waiting to be explored!", 30.0);
    events.add(event3);
    }


    //After choosing the desired service, detailed information will be displayed
    private static String processServiceChoice(int choice) {
        switch (choice) {
            case 1:
                // Call method to display events 
                displayEvents();
               
                return "Event";
            case 2:
                // Call method to display volunteer opportunities
                displayOpportunityMessage();

                return "Volunteer";
            case 3:
                // Call method to display stores 

                return "Stores";
            default:
                System.out.println("Invalid service choice. Please try again.");
                return "Invalid";
        }

    }
    private static void displayEvents() {
    System.out.println("Events:");
    for (Event event : events) {
        System.out.println("Event ID: " + event.getId());
        System.out.println("Name: " + event.getName());
        System.out.println("Date: " + event.getDate());
        System.out.println("Location: " + event.getLocation());
        System.out.println("Description: " + event.getDescription());
        System.out.println("Price: " + event.getPrice());
        System.out.println("____________________________________________");
    }
    // After displaying events, prompt the user to add an event to favorites
    askForFavoriteEvent();
}
 
    //If the user chose 2 (Volunteer Opportunity) then print detailed information about each opportunity
    private static void displayOpportunityMessage() {
        System.out.println("Volunteer Opportunities:\n");
        for (VolunteerOpportunity volunteeropportunity : Opportunity) {
            System.out.println("Opportunity ID: " + volunteeropportunity.getOpportunityId());
            System.out.println("Name: " + volunteeropportunity.getName());
            System.out.println("Description: " + volunteeropportunity.getDescription());
            System.out.println("Requirements:");
            displayRequirements(volunteeropportunity.getRequirements());
            System.out.println("Start Date: " + volunteeropportunity.getStartDate());
            System.out.println("End Date: " + volunteeropportunity.getEndDate());
            System.out.println("____________________________________________\n");
        }
    }
    private static void askForFavoriteEvent() {
      System.out.print("Enter the Event ID of the event you want to add to favorites: ");
      int eventId = scanner.nextInt();
      
       // Find the event corresponding to the given Event ID
      Event eventToAdd = null;
      for (Event event : events) {
           if (event.getId() == eventId) {
              eventToAdd = event;
              break;
         }
      }
       // Check if the event is found
           if (eventToAdd != null) {
             // Call the addToFavorite method of the Customer class with the Event object
            Ahmed.addToFavorite(eventToAdd);
            System.out.println("Event added to favorites.");
            displayFavoriteEvents(Ahmed, scanner);

   
          }else {
            System.out.println("Event not found.");
    }
}
    //Displays the favorite events for a given customer.
   public static void displayFavoriteEvents(Customer customer, Scanner scanner) {
    System.out.print("Do you want to see your favorite events? (y/n): ");
    String response = scanner.next();

    if (response.equalsIgnoreCase("y")) {
        List<Event> favoriteEvents = customer.getFavoriteEvents();

        if (favoriteEvents.isEmpty()) {
            System.out.println("You have no favorite events.");
        } else {
            System.out.println("____________________________________________");
            System.out.println("              Favorite Events:              ");
            for (Event event : favoriteEvents) {
                System.out.println("Event ID: " + event.getId());
                System.out.println("Name: " + event.getName());
                System.out.println("Date: " + event.getDate());
                System.out.println("Location: " + event.getLocation());
                System.out.println("Description: " + event.getDescription());
                System.out.println("Price: " + event.getPrice());
                System.out.println("____________________________________________");
            }
        }
    }
}

    //Method to print the requirements of each volunteer opportunity
    private static void displayRequirements(LinkedList <String> requirements) {
        if (requirements.isEmpty()) {
            System.out.println("No requirements specified.");
        } else {
            for (String requirement : requirements) {
                System.out.println("- " + requirement);
            }
        }
    }

     //Method to ask the user if he want to enroll to one of the volunteer opportunities, if yes then call enrollOpportunity(response) method
    private static void askForEnrollment() {
        System.out.print("Would you like to enroll in a volunteer opportunity? (y/n): ");
        String response = scanner.next();

        if (response.equalsIgnoreCase("y")) {
            System.out.print("Choose the volunteer opportunity you like to enroll in (write opportunity ID):");
            response = scanner.next();

            enrollOpportunity(response);
        } 
        
    }

    //This method will check if the requirements are fulfilled using isRequirementsFulfilled() method and the capacity using !isCapacityFull()
    //If both are true, then enroll
    public static void enrollOpportunity(String opportunityId) {
        // Find the selected opportunity in the linked list
        VolunteerOpportunity selectedOpportunity = null;

        //Finding opportunity using opportunityId
        for (VolunteerOpportunity opportunity : Opportunity) {
            if (opportunity.getOpportunityId().equalsIgnoreCase(opportunityId)) {
                selectedOpportunity = opportunity;
                break;
            }
        }

        if (selectedOpportunity != null) {
            
            
            if (isRequirementsFulfilled(selectedOpportunity)) {
                
                if(!selectedOpportunity.isCapacityFull()){
                    Ahmed.enroll(selectedOpportunity);
                    selectedOpportunity.decreaseCapacity();
                    System.out.println("You have successfully enrolled in the volunteer opportunity.");
                } else { //If capacity is full
                    System.out.println("You cannot enroll in this opportunity because the capacity is full.");
                }
                
            } else { //If not all requirements are met
                System.out.print("You cannot enroll in this opportunity as not all requirements are met.");
            }
            
            
        } else { //If selectedOpportunity = null
            System.out.println("Invalid opportunity ID.");
        }
        
        
    }

    //Method to print each requirement and ask the user if he fulfill the requirement
    public static boolean isRequirementsFulfilled(VolunteerOpportunity selectedOpportunity) {

        LinkedList<String> requirements = selectedOpportunity.getRequirements();

        for (String requirement : requirements) {
            System.out.print("Do you fulfill the requirement: " + requirement + "? (y/n): ");
            String response = scanner.next();

            if (!response.equalsIgnoreCase("y")) {
                return false; // If user doesn't fulfill a requirement, return false immediately
            }
        }

        return true; // If all requirements are fulfilled, return true
    }

//Main method:
    public static void main(String[] args) {

        // Welcome message and program description
        displayWelcomeMessage();
        
        //Initialize all volunteer opportunities
        initializeOpportunity();
        
        // Initialize all events
        initializeEvents();
         
        //A loop that constantly ask the user if he want another service until he type “n”
        while (true) {

            int choice = promptUserForServiceChoice();
            String service = processServiceChoice(choice);

            //Process user's choice and check if it's volunteer opportunities
            if (service.equalsIgnoreCase("Volunteer")) {
                askForEnrollment();
            }

            System.out.print("\nDo you need another service? (y/n) ");
            String response = scanner.next();
            if (!response.equalsIgnoreCase("y")) {
                break;
            }
        }
    }
}
