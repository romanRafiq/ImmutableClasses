/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.sportsclubimmutable.PlayerList;

import com.Model.classes.ImmutableClasses.Player_Lists.Cricket_list;
import com.Model.classes.ImmutableClasses.Players.Cricket_player;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
public class Cricket_list_test {
    
    //List
    private static List cricket_player_list = new ArrayList <Cricket_player>();
    
    public Cricket_list_test() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testImmutable() {             
        //Object of class That Returns the array
        Cricket_list soccer_list_Obj = new Cricket_list(cricket_player_list);
        
        //Object To be added
       Cricket_player player = new Cricket_player( 900125,"Fiki","Roman",convertDate("1990-01-10"), "A", 23, "Right");        
       
       
       //Size is zero
       Assert.assertEquals(cricket_player_list.size(),0,"Error List isnt empty"); 
                        
        soccer_list_Obj = soccer_list_Obj.addToList(player); 
        
        cricket_player_list = soccer_list_Obj.getList();
         Assert.assertNotEquals(soccer_list_Obj.hashCode(),soccer_list_Obj.addToList(player).hashCode(),"Error It is still the same object");
                       
        //Test if an object got added
        Assert.assertEquals(cricket_player_list.size(),1,"Error Nothing was added");
                
        player = (Cricket_player)  cricket_player_list.get(0); 
        
        Assert.assertEquals(player.getName(),"Fiki","Error The value in the list is incorrect");
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
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
