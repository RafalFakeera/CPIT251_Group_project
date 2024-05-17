/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg251_group_project;

public class cancelEnrollment {
    
    
    public static boolean cancelOpportunity(String opportunityId, Customer customer) {
        // Find the opportunity in the enrolled volunteer opportunities
        VolunteerOpportunity opportunityToCancel = null;
        for (VolunteerOpportunity opportunity : customer.getEnrolledVolunteer()) {
            if (opportunity.getOpportunityId().equalsIgnoreCase(opportunityId)) {
                opportunityToCancel = opportunity;
                break;
            }
        }

        if (opportunityToCancel != null) {
            // Check the number of cancellations
            if (customer.getCancelNumber() >= 3) {
                System.out.println("You cannot cancel the enrollment as you have reached the maximum number of cancellations.");
                return false;
            } else {
                // Remove the opportunity from the enrolled list
                customer.cancelEnrollment(opportunityToCancel);
                // Increase the cancellation counter
                customer.setCancelNumber(customer.getCancelNumber() + 1);
                // Increase the capacity of the opportunity after cancel
                opportunityToCancel.setCapacity(opportunityToCancel.getCapacity() + 1);
                System.out.println("Enrollment canceled successfully.");
                return true;
            }
        } else {
            System.out.println("Opportunity not found.");
            return false;
        }
    }
}

