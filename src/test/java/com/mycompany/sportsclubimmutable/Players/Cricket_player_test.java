/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.sportsclubimmutable.Players;

import com.Model.classes.ImmutableClasses.Players.Cricket_player;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
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
public class Cricket_player_test {
    
    private static Cricket_player player;
    
    private Date date;
    
    public Cricket_player_test() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testImmutable() {     
        
        player = new Cricket_player( "900125","Imo","Sturks",convertDate("1990-01-10"), "A", 21, "right");
        
        //Test the object was created
        Assert.assertEquals(player.getName(),"Imo","Error names werent the same"); 
        Assert.assertEquals(player.getDOB(),convertDate("1990-01-10"), "Dates aren't the same");
    }    
        
   
    @Test
    public void ObjectsAreNotTheSame() {                
        //Test objects aren't the same
       player = new Cricket_player( "900125","Imo","Sturks",convertDate("1990-04-23"), "A", 21, "right");
        Assert.assertNotSame(player,player.updateDivision("B"),"The Objects are the same");            
   }
    
    @Test
    public void testUsingHascode()
    {
        //Confirming that these objects are different
        //The Object is not updated or modified but a new object was returned
        
      player = new Cricket_player( "900125","Imo","Sturks",convertDate("1990-09-23"), "A", 21, "right");
                                 
        /********  Get  HashCode   *****************/        
        //return hascode as a string the is an easy way of doing this
        // all u have to do is state the object preceeded with a dot hashcode 
        //*** E.g object.hashcode() ***
        String num1 = Integer.toHexString(System.identityHashCode(player)) ;        
        String num2 = Integer.toHexString(System.identityHashCode(player.updateAgeGroup(19)));
        
        //Different hashcodes mean that it isnt the same object
        Assert.assertNotEquals(num1,num2,"Objects are same");
        
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
        player = null;
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
