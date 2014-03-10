package com.mycompany.sportsclubimmutable.PlayerRecords;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.Model.classes.ImmutableClasses.PlayerRecords.Try_Scorers;
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
public class Try_ScorersTest {
    
    private static Try_Scorers try_scorers;
    
    public Try_ScorersTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    public void testImmutable() {                
        try_scorers = new Try_Scorers("Sharief","Roman",3,9);
        
        //Test the object was created
        Assert.assertEquals(try_scorers.getName(),"Sharief","Error names weren't the same");                                     
    }    
   
    @Test
    public void ObjectsAreNotTheSame() {                
        //Test objects aren't the same
       try_scorers = new Try_Scorers("Sharief","Roman",3,9);
        Assert.assertNotSame(try_scorers  ,try_scorers.updateGamesPlayed(4),"The Objects are the same");  
        
   }
    
    @Test
    public void testUsingHascode()
    {
        //Confirming that these objects are different
        //The Object is not updated or modified but a new object was returned
        
       try_scorers = new Try_Scorers("Sharief","Roman",3,9);
                                 
        /********  Get  HashCode   *****************/        
        //return hascode as a string the is an easy way of doing this
        // all u have to do is state the object preceeded with a dot hashcode 
        //*** E.g object.hashcode() ***
        String num1 = Integer.toHexString(System.identityHashCode(try_scorers)) ;        
        String num2 = Integer.toHexString(System.identityHashCode(try_scorers.updateTries(5)));
        
        //Different hashcodes mean that it isnt the same object
        Assert.assertNotEquals(num1,num2,"Objects are same");
        
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        try_scorers = null;
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
