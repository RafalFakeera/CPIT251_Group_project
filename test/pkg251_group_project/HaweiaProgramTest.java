/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package pkg251_group_project;

import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static pkg251_group_project.HaweiaProgram.initializeEvents;
import static pkg251_group_project.HaweiaProgram.initializeOpportunity;
import static pkg251_group_project.HaweiaProgram.initializeProducts;

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
        initializeOpportunity();
        
        // Initialize all events
        initializeEvents();
        
        // Initialize all products
        initializeProducts();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of displayWelcomeMessage method, of class HaweiaProgram.
     */
    
    @Test
    public void testAskForFavoriteEvent_IfIdFound() {
         System.out.println("askForFavoriteEvent");
        int Id = 2;
        boolean result = HaweiaProgram.askForFavoriteEvent(Id);
        assertTrue( result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
     @Test
    public void testAskForFavoriteEvent_IfIdNotFound() {
        System.out.println("askForFavoriteEvent");
        int eventId = 5;
        boolean result = HaweiaProgram.askForFavoriteEvent(eventId);
        assertFalse( result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of askForBuyProduct method, of class HaweiaProgram.
     */
    @Test
    public void testAskForBuyProduct_IfFaound() {
        int ProductId =1;
        boolean result = HaweiaProgram.askForBuyProduct(ProductId);
        assertTrue( result);
    }
    
     @Test
    public void testAskForBuyProduct_IfNotFaound() {
        int ProductId =7;
        boolean result = HaweiaProgram.askForBuyProduct(ProductId);
        assertFalse( result);
    }


    /**
     * Test of enrollOpportunity method, of class HaweiaProgram.
     */
    @Test
    public void testEnrollOpportunity_IfIdFound_FulFilld() {
        String opportunityId = "OPP001";
        boolean result= HaweiaProgram.enrollOpportunity(opportunityId,true);
        assertTrue( result);
    }
    @Test
    public void testEnrollOpportunity_IfIdFound_NotFulFilld() {
        String opportunityId = "OPP001";
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
    public void testIsRequirementsFulfilled() {
        System.out.println("isRequirementsFulfilled");
        String opportunityId = "OPP002";
        boolean result = HaweiaProgram.isRequirementsFulfilled(opportunityId,"y");
        boolean expected=true;
        assertEquals( expected,result);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    @Test
    public void testIsRequirementsNotFulfilled() {
        System.out.println("isRequirementsFulfilled");
        String opportunityId = "OPP002";
        boolean result = HaweiaProgram.isRequirementsFulfilled(opportunityId,"n");
        assertFalse( result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    public void testIsRequirementsNotValid() {
        System.out.println("isRequirementsFulfilled");
        String opportunityId = "OPP002";
        boolean result = HaweiaProgram.isRequirementsFulfilled(opportunityId,"ytre");
        assertFalse( result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
