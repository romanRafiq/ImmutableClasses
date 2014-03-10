/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.sportsclubimmutable.SportRecords;

import com.Model.classes.ImmutableClasses.Sport_records.Cricket_records;
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
public class Cricket_Records_test {
    
    private static Cricket_records cricket_record;
            
    public Cricket_Records_test() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testImmutable() {     
        
        cricket_record = new Cricket_records( "A","17",8,9,2);
      
        //Test the object was created
        Assert.assertEquals(cricket_record.getDivision(),"A","Error names werent the same"); 
        Assert.assertEquals(cricket_record.getWins(),8, "Wins aren't the same");
        
        Assert.assertNotNull(cricket_record);
    }    
        
   
    @Test
    public void ObjectsAreNotTheSame() {                
        //Test objects aren't the same
       cricket_record = new Cricket_records( "A","17",8,9,2);
        Assert.assertNotSame(cricket_record,cricket_record.updateDraws(3),"The Objects are the same");            
   }
    
    @Test
    public void testUsingHascode()
    {
        //Confirming that these objects are different
        //The Object is not updated or modified but a new object was returned
        
      cricket_record = new Cricket_records( "A","17",8,9,2);
                                 
        /********  Get  HashCode   *****************/        
        //return hascode as a string the is an easy way of doing this
        // all u have to do is state the object preceeded with a dot hashcode 
        //*** E.g object.hashcode() ***
        String num1 = Integer.toHexString(System.identityHashCode(cricket_record)) ;        
        String num2 = Integer.toHexString(System.identityHashCode(cricket_record.updateLoses(5)));
        
         Assert.assertNotNull(cricket_record.getLoses());
        
        //Different hashcodes mean that it isnt the same object
        Assert.assertNotEquals(num1,num2,"Objects are same");
        
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
