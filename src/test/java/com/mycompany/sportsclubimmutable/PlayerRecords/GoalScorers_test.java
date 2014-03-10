/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.sportsclubimmutable.PlayerRecords;

import com.Model.classes.ImmutableClasses.PlayerRecords.goal_Scorers;
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
public class GoalScorers_test {
    private static goal_Scorers goal_scorers;
    
    public GoalScorers_test() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testImmutable() {                
        goal_scorers = new goal_Scorers("Rafiq","Roman",5,20);
        
        //Test the object was created
        Assert.assertEquals(goal_scorers.getName(),"Rafiq","Error names werent the same");                                     
    }    
   
    @Test
    public void ObjectsAreNotTheSame() {                
        //Test objects aren't the same
       goal_scorers = new goal_Scorers("Rafiq","Roman",5,20);
        Assert.assertNotSame(goal_scorers,goal_scorers.updateGoals(27),"The Objects are the same");            
   }
    
    @Test
    public void testUsingHascode()
    {
        //Confirming that these objects are different
        //The Object is not updated or modified but a new object was returned
        
       goal_scorers = new goal_Scorers("Rafiq","Roman",5,20);
                                 
        /********  Get  HashCode   *****************/        
        //return hascode as a string the is an easy way of doing this
        // all u have to do is state the object preceeded with a dot hashcode 
        //*** E.g object.hashcode() ***
        String num1 = Integer.toHexString(System.identityHashCode(goal_scorers)) ;        
        String num2 = Integer.toHexString(System.identityHashCode(goal_scorers.updateGamesPlayed(4)));
        
        //Different hashcodes mean that it isnt the same object
        Assert.assertNotEquals(num1,num2,"Objects are same");
        
    }
    
    @BeforeClass
    public static void setUpClass() throws Exception {
        
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        goal_scorers = null;
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
