package com.mycompany.sportsclubimmutable.PlayerRecords;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.BowlerWickets;
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
public class BowlerWickets_test {
    
    private static BowlerWickets bowler;
    
    public BowlerWickets_test() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testImmutable() {                
        bowler = new BowlerWickets("Tatum","Love",10,20);
        
        //Test the object was created
        Assert.assertEquals(bowler.getName(),"Tatum","Error names werent the same");                                     
    }    
   
    @Test
    public void ObjectsAreNotTheSame() {                
        //Test objects aren't the same
        bowler = new BowlerWickets("Tatum","Love",10,20);
        Assert.assertNotSame(bowler,bowler.updateWickets(33),"The Objects are the same");            
   }
    
    @Test
    public void testUsingHascode()
    {
        //Confirming that these objects are different
        //The Object is not updated or modified but a new object was returned
        
        bowler = new BowlerWickets("Cleo","Robb",6,5);
                                 
        /********  Get  HashCode   *****************/        
        //return hascode as a string the is an easy way of doing this
        // all u have to do is state the object preceeded with a dot hashcode 
        //*** E.g object.hashcode() ***
        String num1 = Integer.toHexString(System.identityHashCode(bowler)) ;        
        String num2 = Integer.toHexString(System.identityHashCode(bowler.updateWickets(7)));
        
        //Different hashcodes mean that it isnt the same object
        Assert.assertNotEquals(num1,num2,"Objects are same");
        
    }
        
    

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        //Free memory after the test
        bowler = null;
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
