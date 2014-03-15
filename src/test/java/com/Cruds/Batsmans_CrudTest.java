/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Cruds;

import com.Model.classes.ImmutableClasses.PlayerRecords.Batsman_runs;
import com.Services.crud.PlayerRecords.BatsmansRuns_CrudService;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import org.testng.Assert;
import static org.testng.Assert.*;


/**
 *
 * @author Roman
 */
public class Batsmans_CrudTest {
    
     @Mock
     BatsmansRuns_CrudService crudService;
    
    public Batsmans_CrudTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    public void testCreate() throws Exception {
                       
      Batsman_runs player = new Batsman_runs( "Rafiq","Samsodien",5,50);
        
      Batsman_runs returnObject = crudService.persist(player);
     
      when(crudService.persist(player)).thenReturn(returnObject);
      Mockito.verify(crudService).persist(player);
        
      Assert.assertEquals("Rafiq",player.getName(),"Name was changed");
      Assert.assertEquals(player.getSurname(),"Samsodien" ,"The name update didnt run");           
    }

    
   @Test
    public void testRead() throws Exception {
        Batsman_runs  player = new Batsman_runs( "Rafiq","Samsodien",5,50);
        Batsman_runs returnObject = crudService.find(player.getName());
                
        when(crudService.find(player.getName())).thenReturn(returnObject);
        Mockito.verify(crudService).find(player.getName());              
    }

    
    @Test
    public void testUpdate() throws Exception {
     
        Batsman_runs player = new Batsman_runs( "Rafiq","Samsodien",5,50);
                 
        when(crudService.merge(player)).thenReturn(player);
        System.out.println("Person::::  "+player); 
        Batsman_runs returnObject = crudService.merge(player);  
        
        
        System.out.println("Return::::  "+returnObject); 
        Mockito.verify(crudService).merge(player);        
        //////////////////////////////////////////////////////
        Batsman_runs updated =  player.updateGamesPlayed(6);
         System.out.println("Update "+updated);          
         
         when(crudService.merge(updated)).thenReturn(player);
        
         Batsman_runs returned = crudService.merge(updated);
        System.out.println("Return: "+returned);  
        
        System.out.println("Update2 "+updated); 
      
        Assert.assertNotSame(returned,updated);
                
    }
    
    @Test
    public void testDelete() throws Exception {

        Batsman_runs player = new Batsman_runs( "Rafiq","Samsodien",5,50);
        Batsman_runs returnObject = crudService.remove(player);
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
        crudService = Mockito.mock(BatsmansRuns_CrudService.class);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
