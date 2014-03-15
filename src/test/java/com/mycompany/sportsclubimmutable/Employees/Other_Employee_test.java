/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.sportsclubimmutable.Employees;



import com.Model.classes.ImmutableClasses.Employees.Other_Employees;
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
public class Other_Employee_test {
    
    private static Other_Employees other_employee;
    
    public Other_Employee_test() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
      @Test
    public void testImmutable() {     
        
        other_employee = new Other_Employees( "900125","Eesa","Abrahams",convertDate("1990-01-10"),900231,"Admin","Secetary");
        
        
        //Test the object was created
        Assert.assertEquals(other_employee.getName(),"Eesa","Error names werent the same"); 
        Assert.assertEquals(other_employee.getDOB(),convertDate("1990-01-10"), "Dates aren't the same");
    }    
        
   
    @Test
    public void ObjectsAreNotTheSame() {                
        //Test objects aren't the same
       other_employee = new Other_Employees( "900125","Eesa","Abrahams",convertDate("1990-01-10"),900231,"Admin","Secetary");
        Assert.assertNotSame(other_employee,other_employee.updateName("Nefta"),"The Objects are the same");            
   }
    
    @Test
    public void testUsingHascode()
    {
        //Confirming that these objects are different
        //The Object is not updated or modified but a new object was returned
        
      other_employee = new Other_Employees( "900125","Eesa","Abrahams",convertDate("1990-01-10"),900231,"Admin","Secetary");
                                 
        /********  Get  HashCode   *****************/        
        //return hascode as a string the is an easy way of doing this
        // all u have to do is state the object preceeded with a dot hashcode 
        //*** E.g object.hashcode() ***
        String num1 = Integer.toHexString(System.identityHashCode(other_employee)) ;        
        String num2 = Integer.toHexString(System.identityHashCode(other_employee.changePosition("Manager")));
        
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
