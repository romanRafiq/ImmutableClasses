package com.mycompany.sportsclubimmutable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.Model.classes.ImmutableClasses.Sport_Fixtures;
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
public class Sport_Fixtures_test {
    
    private static Sport_Fixtures sport_fix;
    
    public Sport_Fixtures_test() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    public void testImmutable() {     
        
        sport_fix = new Sport_Fixtures( convertDate("2014-03-08"),"A",17,"Westridge","Not Played","Cricket");
                      
        //Test the object was created
        Assert.assertEquals(sport_fix.getDivision(),"A","Error names werent the same"); 
        
        Assert.assertEquals(sport_fix.getSportType(),"Cricket", "Cricket aren't the same");
        
        Assert.assertNotNull(sport_fix);
    }    
        
   
    @Test
    public void ObjectsAreNotTheSame() {                
        //Test objects aren't the same
       sport_fix = new Sport_Fixtures( convertDate("2014-03-08"),"A",17,"Westridge","Not Played","Cricket");
        Assert.assertNotSame(sport_fix,sport_fix.updateStatus("Cancelled"),"The Objects are the same");            
   }
    
    @Test
    public void testUsingHascode()
    {
        //Confirming that these objects are different
        //The Object is not updated or modified but a new object was returned
        
      sport_fix = new Sport_Fixtures( convertDate("2014-03-08"),"A",17,"Westridge","Not Played","Cricket");
                                 
        /********  Get  HashCode   *****************/        
        //return hascode as a string the is an easy way of doing this
        // all u have to do is state the object preceeded with a dot hashcode 
        //*** E.g object.hashcode() ***
        String num1 = Integer.toHexString(System.identityHashCode(sport_fix)) ;        
        String num2 = Integer.toHexString(System.identityHashCode(sport_fix.updateDate( convertDate("2014-04-08"))));
        
         Assert.assertNotNull(sport_fix.getDate());
        
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
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
