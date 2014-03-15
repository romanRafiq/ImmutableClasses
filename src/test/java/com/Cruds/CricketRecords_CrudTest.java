/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Cruds;

import com.Model.classes.ImmutableClasses.Sport_records.Cricket_records;
import com.Services.crud.SportRecords.CricketRecords_CrudService;

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
public class CricketRecords_CrudTest {
    
    @Mock
    CricketRecords_CrudService crudService;
    
    public CricketRecords_CrudTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}    
     @Test
    public void testCreate() throws Exception {      
        
      Cricket_records team = new Cricket_records( "A","17",8,9,2);
        
      Cricket_records returnObject = crudService.persist(team);
     
      when(crudService.persist(team)).thenReturn(returnObject);
      Mockito.verify(crudService).persist(team);
        
      Assert.assertEquals("A",team.getDivision()," was changed");
      Assert.assertEquals(team.getAgeGroup(),"17" ,"The name update didnt run");           
    }

    
   @Test
    public void testRead() throws Exception {
        Cricket_records  team = new Cricket_records( "A","17",8,9,2);
        Cricket_records returnObject = crudService.find(team.getAgeGroup());
                
        when(crudService.find(team.getAgeGroup())).thenReturn(returnObject);
        Mockito.verify(crudService).find(team.getAgeGroup());              
    }

    
    @Test
    public void testUpdate() throws Exception {
     
         Cricket_records  team = new Cricket_records( "A","17",8,9,2);
                 
        when(crudService.merge(team)).thenReturn(team);
       
        Cricket_records returnObject = crudService.merge(team);  
        
        
       
        Mockito.verify(crudService).merge(team);        
        //////////////////////////////////////////////////////
        Cricket_records updated =  team.updateLoses(19);
         
         
         when(crudService.merge(updated)).thenReturn(team);
        
         Cricket_records returned = crudService.merge(updated);
        

      
        Assert.assertNotSame(returned,updated);
                
    }
    
    @Test
    public void testDelete() throws Exception {

        Cricket_records player = new  Cricket_records( "A","17",8,9,2);
        Cricket_records returnObject = crudService.remove(player);
        when(crudService.remove(player)).thenReturn(returnObject);
        Mockito.verify(crudService).remove(player);

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
        crudService = Mockito.mock(CricketRecords_CrudService.class);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
