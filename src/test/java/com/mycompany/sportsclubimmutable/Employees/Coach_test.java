/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.sportsclubimmutable.Employees;



import com.Model.classes.ImmutableClasses.Employees.Coach;
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
public class Coach_test {
    
     private static Coach coach;
    
    public Coach_test() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    public void testImmutable() {     
        
        coach = new Coach( "900125","Lester","Nesta",convertDate("1990-01-10"), "Cricket","A", 21);
        
        //Test the object was created
        Assert.assertEquals(coach.getName(),"Lester","Error names werent the same"); 
        Assert.assertEquals(coach.getDOB(),convertDate("1990-01-10"), "Dates aren't the same");
    }    
        
   
    @Test
    public void ObjectsAreNotTheSame() {                
        //Test objects aren't the same
       coach = new Coach("900125","Lester","Nesta",convertDate("1990-01-10"), "Cricket","A", 21);
        Assert.assertNotSame(coach,coach.updateDivision("B"),"The Objects are the same");            
   }
    
    @Test
    public void testUsingHascode()
    {
        //Confirming that these objects are different
        //The Object is not updated or modified but a new object was returned
        
      coach = new Coach( "900125","Lester","Nesta",convertDate("1990-01-10"), "Cricket","A", 21);
                                 
        /********  Get  HashCode   *****************/        
        //return hascode as a string the is an easy way of doing this
        // all u have to do is state the object preceeded with a dot hashcode 
        //*** E.g object.hashcode() ***
        String num1 = Integer.toHexString(System.identityHashCode(coach)) ;        
        String num2 = Integer.toHexString(System.identityHashCode(coach.updateAgeGroup(19)));
        
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
