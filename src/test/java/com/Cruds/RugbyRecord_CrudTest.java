/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Cruds;

import com.Model.classes.ImmutableClasses.Sport_records.Rugby_Records;
import com.Services.crud.SportRecords.RugbyRecords_Crud;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Roman
 */
public class RugbyRecord_CrudTest {
    
     @Mock
    RugbyRecords_Crud crudService;
    
    
    public RugbyRecord_CrudTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
  
     @Test
    public void testCreate() throws Exception {      
        
      Rugby_Records team = new Rugby_Records( "A","17",8,9,2);
        
      Rugby_Records returnObject = crudService.persist(team);
     
      when(crudService.persist(team)).thenReturn(returnObject);
      Mockito.verify(crudService).persist(team);
        
      Assert.assertEquals("17",team.getAgeGroup(),"Name was changed");
      Assert.assertEquals(team.getDivision(),"A" ,"The name update didnt run");
     
      
    }

    
   @Test
    public void testRead() throws Exception {
        Rugby_Records  team = new Rugby_Records( "A","17",8,9,2);
        Rugby_Records returnObject = crudService.find(team.getAgeGroup());
                
        when(crudService.find(team.getAgeGroup())).thenReturn(returnObject);
        Mockito.verify(crudService).find(team.getAgeGroup());              
    }

    
    @Test
    public void testUpdate() throws Exception {
     
        Rugby_Records team = new Rugby_Records( "A","17",8,9,2);
                 
        when(crudService.merge(team)).thenReturn(team);
        System.out.println("Person::::  "+team); 
        Rugby_Records returnObject = crudService.merge(team);  
        
        
        System.out.println("Return::::  "+returnObject); 
        Mockito.verify(crudService).merge(team);        
        //////////////////////////////////////////////////////
        Rugby_Records updated =  team.updateWins(19);
         System.out.println("Update "+updated);          
         
         when(crudService.merge(updated)).thenReturn(team);
        
         Rugby_Records returned = crudService.merge(updated);
        System.out.println("Return: "+returned);  
        
        System.out.println("Update2 "+updated); 
      
        Assert.assertNotSame(returned,updated);
                
    }
    
    @Test
    public void testDelete() throws Exception {

          Rugby_Records team = new Rugby_Records( "A","17",8,9,2);
        Rugby_Records returnObject = crudService.remove(team);
        when(crudService.remove(team)).thenReturn(returnObject);
        Mockito.verify(crudService).remove(team);

    }
	
	 public Date convertDate(String strDate)
    {
        Date date = null;
        strDate += " 00:00:00.0";
                
        SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"); 
        try
        {        
             date = dt.parse(strDate); 
        }
        catch(Exception ex)
        {
            
        }
        SimpleDateFormat dt1 = new SimpleDateFormat("yyyy-MM-dd");
        
        
        return date;
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
         MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(RugbyRecords_Crud.class);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
