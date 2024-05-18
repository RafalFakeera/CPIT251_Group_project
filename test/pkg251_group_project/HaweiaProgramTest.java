/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package pkg251_group_project;

import java.util.LinkedList;
import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static pkg251_group_project.HaweiaProgram.Opportunity;
import static pkg251_group_project.HaweiaProgram.events;
import static pkg251_group_project.HaweiaProgram.products;

import static pkg251_group_project.HaweiaProgram.Ahmed;

/**
 *
 * @author cw
 */
public class HaweiaProgramTest {
    
    public HaweiaProgramTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        Event event1 = new Event(1, "interactive mini golf event", "2024-05-10", "Events And More", "Elevate your golfing adventure on our futuristic course!", 40.00);
        events.add(event1);
        
        Products product1 = new Products(1, "Qassim dates", 40, "A distinctive agricultural product produced in the Qassim region of the Kingdom of Saudi Arabia.");
        products.add(product1);
        
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
        
        
        Ahmed.enroll(opportunity3);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of displayWelcomeMessage method, of class HaweiaProgram.
     */
    
    @Test
    public void testaddToFavoriteEvent_IfIdFound() {
         System.out.println("askForFavoriteEvent");
        int Id = 1;
        boolean result = HaweiaProgram.addToFavoriteEvent(Id);
        assertTrue( result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
     @Test
    public void testaddToFavoriteEvent_IfIdNotFound() {
        System.out.println("askForFavoriteEvent");
        int eventId = 5;
        boolean result = HaweiaProgram.addToFavoriteEvent(eventId);
        assertFalse( result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of askForBuyProduct method, of class HaweiaProgram.
     */
    @Test
    public void testaddToCart_IfFaound() {
        int ProductId =1;
        boolean result = HaweiaProgram.addToCart(ProductId);
        assertTrue( result);
    }
    
     @Test
    public void testaddToCart_IfNotFaound() {
        int ProductId =7;
        boolean result = HaweiaProgram.addToCart(ProductId);
        assertFalse( result);
    }


    /**
     * Test of enrollOpportunity method, of class HaweiaProgram.
     */
    @Test
    public void testEnrollOpportunity_IfIdFound_FulFilld() {
        String opportunityId = "OPP003";
        boolean result= HaweiaProgram.enrollOpportunity(opportunityId,true);
        assertTrue( result);
    }
    @Test
    public void testEnrollOpportunity_IfIdFound_NotFulFilld() {
        String opportunityId = "OPP003";
        boolean result= HaweiaProgram.enrollOpportunity(opportunityId,false);
        assertFalse( result);
    }
    @Test
    public void testEnrollOpportunity_IfIdNotValid() {
        String opportunityId = "OPPttyrey001";
        boolean result= HaweiaProgram.enrollOpportunity(opportunityId,true);
        assertFalse( result);
    }

    
    /**
     * Test of isRequirementsFulfilled method, of class HaweiaProgram.
     */
    @Test

  public void testCancelOpportunity_IfFound() {
        // Find the opportunity in the enrolled volunteer opportunities
        String opportunityId ="opp003";
    
        boolean result= HaweiaProgram.cancelOpportunity(opportunityId,Ahmed);
        assertTrue( result);
        
        
    }
  @Test
  public void testCancelOpportunity_IfNotFound() {
        // Find the opportunity in the enrolled volunteer opportunities
        String opportunityId ="opp005";
    
        boolean result= HaweiaProgram.cancelOpportunity(opportunityId,Ahmed);
        assertFalse( result);
        
        
    }
  @Test
   public void testCancelOpportunity_IfEmpty() {
        // Find the opportunity in the enrolled volunteer opportunities
        String opportunityId ="OPP003";
        Ahmed.cancelEnrollment(Opportunity.remove());
        boolean result= HaweiaProgram.cancelOpportunity(opportunityId,Ahmed);
        assertFalse( result);
        
        
    }
    
}
