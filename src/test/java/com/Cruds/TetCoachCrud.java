/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Cruds;

import com.Services.crud.Employees.CoachCrudSerice;

import com.Model.classes.ImmutableClasses.Employees.Coach;
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
public class TetCoachCrud {
    
    @Mock
    CoachCrudSerice crudService;
    public TetCoachCrud() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCreate() throws Exception {      
//coach = new Coach( 900125,"Lester","Nesta",convertDate("1990-01-10"), "Cricket","A", 21);
      Coach coach = new Coach( "900125","Rafiq","Roman",convertDate("1990-03-25"), "Cricket","A", 21).updateSport("Soccer");
        
      Coach returnObject = crudService.persist(coach);     
      when(crudService.persist(coach)).thenReturn(returnObject);
      Mockito.verify(crudService).persist(coach);
        
      Assert.assertEquals("Rafiq",coach.getName(),"Name was changed");
      Assert.assertEquals(coach.getSport(),"Soccer" ,"The sport update didnt run");
     
      
    }

    
   @Test
    public void testRead() throws Exception {
        Coach  coach = new Coach( "900125","Rafiq","Roman",convertDate("1990-03-25"), "Cricket","A", 21);
        Coach returnObject = crudService.find(coach.getName());
        
        
        when(crudService.find(coach.getName())).thenReturn(returnObject);
        Mockito.verify(crudService).find(coach.getName());              
    }

    
    @Test
    public void testUpdate() throws Exception {
     
        Coach coach = new Coach( "900125","Rafiq","Roman",convertDate("1990-03-25"), "Cricket","A", 21);
                 
        when(crudService.merge(coach)).thenReturn(coach);
       
        Coach returnObject = crudService.merge(coach);  
        
        
       
        Mockito.verify(crudService).merge(coach);        
        //////////////////////////////////////////////////////
        Coach updated = coach.updateAgeGroup(21);
         
         
         when(crudService.merge(updated)).thenReturn(coach);
        
         Coach returned = crudService.merge(updated);
        
        Assert.assertNotSame(returned,updated);
                
    }
    
    @Test
    public void testDelete() throws Exception {

        Coach coach = new Coach( "900125","Rafiq","Roman",convertDate("1990-03-25"), "Cricket","A", 21);
        Coach returnObject = crudService.remove(coach);
        when(crudService.remove(coach)).thenReturn(returnObject);
        Mockito.verify(crudService).remove(coach);

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
        crudService = Mockito.mock(CoachCrudSerice.class);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
