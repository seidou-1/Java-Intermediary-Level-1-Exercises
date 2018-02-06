/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlooringOrdersDTO;

import java.math.BigDecimal;

/**
 *
 * @author laptop
 */
public class CalculatedTotals {
    
    public String calculateTotals (Order usersOrder){
        
        int orderNumber = usersOrder.getOrderNumber();
        String name = usersOrder.getCustomerName();
        BigDecimal area = usersOrder.getArea();
        BigDecimal usersStateTax = usersOrder.getTaxClass().getStatesTax();//gets the bigdecimal of the state
                
        BigDecimal costPerSqFt = usersOrder.getProductClass().getCostPerSqFt();
        //Set costPerSqFt
        
        BigDecimal laborCostPerSqFt = usersOrder.getProductClass().getlaborCostPerSqFt(); 
        //Set laborCostPerSqFt
        
        
        BigDecimal taxOfStateSelection = usersOrder.getTaxClass().getStatesTax();

        
        BigDecimal totalTax = 
                
        (area.multiply(costPerSqFt)).add((area.multiply(laborCostPerSqFt)))
        .multiply(usersStateTax);
        
        usersOrder.setTaxCharged(totalTax); //Here i'm setting the totalTax to the taxCharged
        
        BigDecimal grandTotal =
        (area.multiply(costPerSqFt)).add((area.multiply(laborCostPerSqFt)))        
        .add(totalTax);  

        usersOrder.setGrandTotal(grandTotal); //Here i'm stting the grandTotal to the grandTotal of my Enum
        
        
        //user's product selection * their area * their state
        
        return "Order Number: " + orderNumber
                + " Name: " + name
                + " Area: " + area
                + " State Tax: " + usersStateTax
                + " Cost Per Sq. Ft: " + costPerSqFt
                + " Labor Cost per Sq. Ft: " + laborCostPerSqFt
                + " Total Tax: " + totalTax
                + " Grand Total: " + grandTotal;
           
                
    }
    
}