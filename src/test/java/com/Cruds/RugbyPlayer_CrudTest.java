/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Cruds;


import com.Model.classes.ImmutableClasses.Players.Rugby_player;
import com.Services.crud.Players.RugbyCrudService;


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
public class RugbyPlayer_CrudTest {
    
    @Mock
    RugbyCrudService crudService;
    public RugbyPlayer_CrudTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCreate() throws Exception {      
        
      Rugby_player player = new Rugby_player( "900125","Imo","Sturks",convertDate("1990-01-10"), "A", 21, "Wing");
        
      Rugby_player returnObject = crudService.persist(player);
     
      when(crudService.persist(player)).thenReturn(returnObject);
      Mockito.verify(crudService).persist(player);
        
      Assert.assertEquals("Imo",player.getName(),"Name was changed");
      Assert.assertEquals(player.getSurname(),"Sturks" ,"The sport update didnt run");
     
      
    }

    
   @Test
    public void testRead() throws Exception {
        Rugby_player  player = new Rugby_player( "900125","Imo","Sturks",convertDate("1990-01-10"), "A", 21, "Wing");
        Rugby_player returnObject = crudService.find(player.getName());
        
        
        when(crudService.find(player.getName())).thenReturn(returnObject);
        Mockito.verify(crudService).find(player.getName());              
    }

    
    @Test
    public void testUpdate() throws Exception {
     
        Rugby_player player = new Rugby_player( "900125","Imo","Sturks",convertDate("1990-01-10"), "A", 21, "Wing");
                 
        when(crudService.merge(player)).thenReturn(player);
       
        Rugby_player returnObject = crudService.merge(player);  
        
              
        Mockito.verify(crudService).merge(player);        
        //////////////////////////////////////////////////////
        Rugby_player updated =  player.updateAgeGroup(19);
        
         
         when(crudService.merge(updated)).thenReturn(player);
        
         Rugby_player returned = crudService.merge(updated);
                        
        Assert.assertNotSame(returned,updated);
                
    }
    
    @Test
    public void testDelete() throws Exception {

        Rugby_player player = new Rugby_player( "900125","Imo","Sturks",convertDate("1990-01-10"), "A", 21, "Wing");
        Rugby_player returnObject = crudService.remove(player);
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
        crudService = Mockito.mock(RugbyCrudService.class);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
