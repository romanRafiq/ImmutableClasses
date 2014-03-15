/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Cruds;

import com.Model.classes.ImmutableClasses.PlayerRecords.Try_Scorers;
import com.Services.crud.PlayerRecords.TryScorer_CrudService;

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
public class TryScorer_CrudTest {
    
    @Mock
    TryScorer_CrudService crudService;
    
    public TryScorer_CrudTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
      @Test
    public void testCreate() throws Exception {      
        
      Try_Scorers player = new Try_Scorers("Sharief","Roman",3,9);
        
      Try_Scorers returnObject = crudService.persist(player);
     
      when(crudService.persist(player)).thenReturn(returnObject);
      Mockito.verify(crudService).persist(player);
        
      Assert.assertEquals("Sharief",player.getName(),"Name was changed");
      Assert.assertEquals(player.getSurname(),"Roman" ,"The Surname update didnt run");     
      
    }

    
   @Test
    public void testRead() throws Exception {
        Try_Scorers  player = new Try_Scorers("Sharief","Roman",3,9);
        Try_Scorers returnObject = crudService.find(player.getName());
                
        when(crudService.find(player.getName())).thenReturn(returnObject);
        Mockito.verify(crudService).find(player.getName());              
    }

    
    @Test
    public void testUpdate() throws Exception {
     
        Try_Scorers player = new Try_Scorers("Sharief","Roman",3,9);
                 
        when(crudService.merge(player)).thenReturn(player);
        System.out.println("Person::::  "+player); 
        Try_Scorers returnObject = crudService.merge(player);  
        
        
        System.out.println("Return::::  "+returnObject); 
        Mockito.verify(crudService).merge(player);        
        //////////////////////////////////////////////////////
        Try_Scorers updated =  player.updateGamesPlayed(6);
         System.out.println("Update "+updated);          
         
         when(crudService.merge(updated)).thenReturn(player);
        
         Try_Scorers returned = crudService.merge(updated);
        System.out.println("Return: "+returned);  
        
        System.out.println("Update2 "+updated); 
      /*  Mockito.verify(crudService).merge(updated);
        Mockito.verifyNoMoreInteractions(crudService);
       */
        Assert.assertNotSame(returned,updated);
                
    }
    
    @Test
    public void testDelete() throws Exception {

        Try_Scorers player = new Try_Scorers("Sharief","Roman",3,9);
        Try_Scorers returnObject = crudService.remove(player);
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
        crudService = Mockito.mock(TryScorer_CrudService.class);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
