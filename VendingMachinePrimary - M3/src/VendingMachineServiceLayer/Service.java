/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VendingMachineServiceLayer;

import VendingMachineDao.PersistenceException;
import VendingMachineDto.Products;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author laptop
 */
public interface Service {
    
    
   Products getProduct(String productID) throws PersistenceException;
   
   List <Products> getAllProducts() throws PersistenceException;
   
//   public void justWriteInventory() throws PersistenceException;
//   vreduceInventory ()
    
    void justWriteInventory();
    
   int reduceInventory(Products selectedProduct); 
    
   boolean checkIfMoneyIsEnough(BigDecimal userMoney, Products selectedProduct) throws InsufficientFundsException;
   
   boolean inventoryAvailability (BigDecimal userMoney, Products selectedProduct) throws InventoryAvailabilityException;
   
}