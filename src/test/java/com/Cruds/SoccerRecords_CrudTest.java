/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Cruds;

import com.Model.classes.ImmutableClasses.Sport_records.Soccer_records;
import com.Services.crud.SportRecords.SoccerRecords_Crud;

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
public class SoccerRecords_CrudTest {
    
     @Mock
    SoccerRecords_Crud crudService;
    
    
    public SoccerRecords_CrudTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
     @Test
    public void testCreate() throws Exception {      
        
      Soccer_records team = new Soccer_records( "A","17",8,9,2);
        
      Soccer_records returnObject = crudService.persist(team);
     
      when(crudService.persist(team)).thenReturn(returnObject);
      Mockito.verify(crudService).persist(team);
        
      Assert.assertEquals("17",team.getAgeGroup(),"Name was changed");
      Assert.assertEquals(team.getDivision(),"A" ,"The name update didnt run");
     
      
    }

    
   @Test
    public void testRead() throws Exception {
        Soccer_records  team = new Soccer_records( "A","17",8,9,2);
        
        Soccer_records returnObject = crudService.find(team.getAgeGroup());
                
        when(crudService.find(team.getAgeGroup())).thenReturn(returnObject);
        Mockito.verify(crudService).find(team.getAgeGroup());              
    }

    
    @Test
    public void testUpdate() throws Exception {
     
        Soccer_records team = new Soccer_records( "A","17",8,9,2);
                 
        when(crudService.merge(team)).thenReturn(team);
       
        Soccer_records returnObject = crudService.merge(team);  
        
       
        Mockito.verify(crudService).merge(team);        
        //////////////////////////////////////////////////////
        Soccer_records updated =  team.updateLoses(19);
       
         when(crudService.merge(updated)).thenReturn(team);
        
        Soccer_records returned = crudService.merge(updated);
       
        Assert.assertNotSame(returned,updated);
                
    }
    
    @Test
    public void testDelete() throws Exception {

        Soccer_records player = new Soccer_records( "A","17",8,9,2);
        Soccer_records returnObject = crudService.remove(player);
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
        crudService = Mockito.mock(SoccerRecords_Crud.class);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
