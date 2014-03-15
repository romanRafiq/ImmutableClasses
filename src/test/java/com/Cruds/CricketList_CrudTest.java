/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Cruds;

import com.Model.classes.ImmutableClasses.Player_Lists.Cricket_list;
import com.Model.classes.ImmutableClasses.Players.Cricket_player;
import com.Services.crud.PlayerList.CrickList_Crud;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
public class CricketList_CrudTest {
    @Mock
    CrickList_Crud crudService;
    
     private static List cricket_player_list = new ArrayList <Cricket_player>();
    public CricketList_CrudTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCreate() throws Exception { 
      
      //Object 
      Cricket_player player = new Cricket_player( "900125","Imo","Sturks",convertDate("1990-01-10"), "A", 21, "right");
        
      Cricket_list list = new Cricket_list(cricket_player_list); 
      list.addToList(player);
        
      Cricket_list returnObject = crudService.persist(list.addToList(player));
     
      when(crudService.persist(list)).thenReturn(returnObject);
      Mockito.verify(crudService).persist(list);
        
      Assert.assertEquals(1,returnObject.getList().size(),"Size didnt change");
     // Assert.assertEquals(list.getSurname(),"Roman" ,"The name update didnt run");
     
      
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
        crudService = Mockito.mock(CrickList_Crud.class);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
