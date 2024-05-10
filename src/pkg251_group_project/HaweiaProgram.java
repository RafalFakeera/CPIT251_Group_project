package pkg251_group_project;

import java.util.*;

public class HaweiaProgram {

    //User profile
    static Customer Ahmed = new Customer("CU001");

    //Create a LinkedList to store volunteer opportunities
    static LinkedList <VolunteerOpportunity> Opportunity = new LinkedList<>();
    // Create a LinkedList to store events
    static LinkedList<Event> events = new LinkedList<>();
    // Create a LinkedList to store products
    static LinkedList<Products> products = new LinkedList<>();
    
    static Scanner scanner = new Scanner(System.in);

    public HaweiaProgram(){ 
        //Initialize all volunteer opportunities
        initializeOpportunity();
        
        // Initialize all events
        initializeEvents();
        
        // Initialize all products
        initializeProducts();
    }
    //Methods:
    
    //Method to print a welcoming message in the beginning of the program
    public static void displayWelcomeMessage() {
        System.out.println("____________________________________________");
        System.out.println("               Welcome to Haweia!               ");
        System.out.println("____________________________________________");
        System.out.println("Our goal is to promote and highlight the rich culture and heritage of our Kingdom by "
                + "providing an engaging and informative experience for users to explore.");
        System.out.println("\n");
    }

    //Print the services we provide and let the user choose one of them to see their details
    public static int promptUserForServiceChoice() {
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
    
    // Initialize products
    public static void initializeProducts() {
    Products product1 = new Products(1, "Qassim dates", 40, "A distinctive agricultural product produced in the Qassim region of the Kingdom of Saudi Arabia.");
    products.add(product1);

    Products product2 = new Products(2, "Saudi Arabian coffee", 20, "Saudi coffee is a Saudi product known for its high quality and unique flavor.");
    products.add(product2);

    Products product3 = new Products(3, "Noug milk", 10, "Noug milk is a product of Saudi company Noug.");
    products.add(product3);
    }

    //After choosing the desired service, detailed information will be displayed
    public static String processServiceChoice(int choice) {
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
                displayProducts();

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
         
    public static void displayProducts() {
        System.out.println("Products:");
        for (Products product : products) {
            System.out.println("Product ID: " + product.getproductId());
            System.out.println("Product Name: " + product.getproductName());
            System.out.println("Product Price: " + product.getproductPrice());
            System.out.println("Product Description: " + product.getproductDescription());
            System.out.println("____________________________________________");
        }
        // After displaying products, prompt the user to buy product
        askForBuyProduct();
    }
    
    //If the user chose 2 (Volunteer Opportunity) then print detailed information about each opportunity
    public static void displayOpportunityMessage() {
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
            System.out.println("Event added to Cart.");
            displayFavoriteEvents(Ahmed, scanner);

   
          }else {
            System.out.println("Event not found.");
    }
}
    private static void askForBuyProduct() {
        System.out.print("Enter the Product ID of the product you want to buy: ");
        int productID = scanner.nextInt();
      
        // Find the Product corresponding to the given Product ID
        Products ProductToBuy = null;
        for (Products product : products) {
            if (product.getproductId() == productID) {
              ProductToBuy = product;
              break;
        }
      } 
        // Check if the Product is found
           if (ProductToBuy != null) {
             // Call the addToCart method of the Customer class with the product object
            Ahmed.addToCart(ProductToBuy);
            System.out.println("Product added to Cart.");
            displayCart(Ahmed, scanner);

          }else {
            System.out.println("Product not found.");
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
    //Displays the cart products for a given customer.
    public static void displayCart(Customer customer, Scanner scanner) {
         System.out.print("Do you want to see your cart? (y/n): ");
         String response = scanner.next();

    if (response.equalsIgnoreCase("y")) {
        List<Products> cart = customer.getCart();

        if (cart.isEmpty()) {
            System.out.println("You have no product in your cart.");
        } else {
            System.out.println("____________________________________________");
            System.out.println("              Cart Products:              ");
            for (Products product : cart) {
                System.out.println("Product ID: " + product.getproductId());
                System.out.println("Product Name: " + product.getproductName());
                System.out.println("Product Price: " + product.getproductPrice());
                System.out.println("Product Description: " + product.getproductDescription());
                System.out.println("____________________________________________");
            }
            System.out.print("Do you want to buy the products? (y/n): ");
            String res = scanner.next();
            if (res.equalsIgnoreCase("y")) {
                 if (cart.isEmpty()) {
                     System.out.println("You have no product in your cart.");
                  } else 
                     cart.clear();
                      System.out.println("Cart items purchased successfully.");
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
    public static boolean askForEnrollment() {
        System.out.print("Would you like to enroll in a volunteer opportunity? (y/n): ");
        String response = scanner.next();

        return response.equalsIgnoreCase("y");
        
    }

    //This method will check if the requirements are fulfilled using isRequirementsFulfilled() method and the capacity using !isCapacityFull()
    //If both are true, then enroll
    public static boolean enrollOpportunity(String opportunityId, boolean requirementsFulfilled) {
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
            
            
            if (requirementsFulfilled) {
                
                if(!selectedOpportunity.isCapacityFull()){
                    Ahmed.enroll(selectedOpportunity);
                    selectedOpportunity.decreaseCapacity();
                    System.out.println("You have successfully enrolled in the volunteer opportunity.");
                    return true;
                } else { //If capacity is full
                    System.out.println("You cannot enroll in this opportunity because the capacity is full.");
                }
                
            } else { //If not all requirements are met
                System.out.print("You cannot enroll in this opportunity as not all requirements are met.");   
            }
            
            
        } else { //If selectedOpportunity = null
            System.out.println("Invalid opportunity ID.");
            
        }
        
        return false;
    }

    public static VolunteerOpportunity findOpportunity(String opportunityId){

        //Finding opportunity using opportunityId
        for (VolunteerOpportunity opportunity : Opportunity) {
            if (opportunity.getOpportunityId().equalsIgnoreCase(opportunityId)) {
                VolunteerOpportunity selectedOpportunity = opportunity;
                return selectedOpportunity;
            }
        } return null;
    }
    
//Method to print each requirement and ask the user if he fulfill the requirement
    public static boolean isRequirementsFulfilled(String opportunityId) {

        VolunteerOpportunity selectedOpportunity = findOpportunity(opportunityId);
        
        if (selectedOpportunity == null){
            return false;
        }
        
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
        HaweiaProgram Haweia = new HaweiaProgram();
        
        //A loop that constantly ask the user if he want another service until he type “n”
        while (true) {

            int choice = promptUserForServiceChoice();
            String service = processServiceChoice(choice);

            //Process user's choice and check if it's volunteer opportunities
            if (service.equalsIgnoreCase("Volunteer")) {
                if(askForEnrollment()){
                    System.out.print("Choose the volunteer opportunity you like to enroll in (write opportunity ID):");
                    String opportunityID = scanner.next();
                    boolean requirementsFulfilled = isRequirementsFulfilled(opportunityID);
                    enrollOpportunity(opportunityID,  requirementsFulfilled);
                }

            }

            System.out.print("\nDo you need another service? (y/n) ");
            String response = scanner.next();
            if (!response.equalsIgnoreCase("y")) {
                break;
            }
        }
    }
}
