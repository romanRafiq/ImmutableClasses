/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Cruds;

import com.Model.classes.ImmutableClasses.Players.Cricket_player;
import com.Services.crud.Players.CricketCrudService;
import com.Services.crud.PersonCrudService;

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
public class CricketPlayer_CrudTest {
    
     @Mock
    CricketCrudService crudService;
    
    public CricketPlayer_CrudTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCreate() throws Exception {      
        
      Cricket_player player = new Cricket_player( "900125","Imo","Sturks",convertDate("1990-01-10"), "A", 21, "right");
        
      Cricket_player returnObject = crudService.persist(player);
     
      when(crudService.persist(player)).thenReturn(returnObject);
      Mockito.verify(crudService).persist(player);
        
      Assert.assertEquals("Imo",player.getName(),"Name was changed");
      Assert.assertEquals(player.getSurname(),"Sturks" ,"The sport update didnt run");
     
      
    }

    
   @Test
    public void testRead() throws Exception {
        Cricket_player  player = new Cricket_player( "900125","Imo","Sturks",convertDate("1990-01-10"), "A", 21, "right");
        Cricket_player returnObject = crudService.find(player.getName());
        
        
        when(crudService.find(player.getName())).thenReturn(returnObject);
        Mockito.verify(crudService).find(player.getName());              
    }

    
    @Test
    public void testUpdate() throws Exception {
     
        Cricket_player player = new Cricket_player( "900125","Imo","Sturks",convertDate("1990-01-10"), "A", 21, "right");
                 
        when(crudService.merge(player)).thenReturn(player);
        System.out.println("Person::::  "+player); 
        Cricket_player returnObject = crudService.merge(player);  
        
        
        System.out.println("Return::::  "+returnObject); 
        Mockito.verify(crudService).merge(player);        
        //////////////////////////////////////////////////////
        Cricket_player updated =  player.updateAgeGroup(19);
         System.out.println("Update "+updated);          
         
         when(crudService.merge(updated)).thenReturn(player);
        
         Cricket_player returned = crudService.merge(updated);
        System.out.println("Return: "+returned);  
        
        System.out.println("Update2 "+updated); 
      /*  Mockito.verify(crudService).merge(updated);
        Mockito.verifyNoMoreInteractions(crudService);
       */
        Assert.assertNotSame(returned,updated);
                
    }
    
    @Test
    public void testDelete() throws Exception {

        Cricket_player player = new Cricket_player( "900125","Imo","Sturks",convertDate("1990-01-10"), "A", 21, "right");
        Cricket_player returnObject = crudService.remove(player);
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
        crudService = Mockito.mock(CricketCrudService.class);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
