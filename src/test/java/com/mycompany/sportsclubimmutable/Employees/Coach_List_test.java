/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.sportsclubimmutable.Employees;


import com.Model.classes.ImmutableClasses.Employees.Coach;
import com.Model.classes.ImmutableClasses.Employees.coach_list;
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
public class Coach_List_test {
    
     //List
    private static List Coaches = new ArrayList <Coach>();
    public Coach_List_test() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testImmutable() {             
        //Object of class That Returns the array
        coach_list coach_list_Obj = new coach_list(Coaches);
        
        //Object To be added
       Coach coach = new Coach( "900125","Lester","Nesta",convertDate("1990-01-10"), "Cricket","A", 21);   
       
       
       //Size is zero
       Assert.assertEquals(Coaches.size(),0,"Error List isnt empty"); 
                        
        coach_list_Obj = coach_list_Obj.AddToList(coach); 
        
        Coaches = coach_list_Obj.getList();
         Assert.assertNotEquals(coach_list_Obj.hashCode(),coach_list_Obj.AddToList(coach).hashCode(),"Error It is still the same object");
                       
        //Test if an object got added
        Assert.assertEquals(Coaches.size(),1,"Error Nothing was added");
                
        coach = (Coach)  Coaches.get(0); 
        
        Assert.assertEquals(coach.getName(),"Lester","Error The value in the list is incorrect");
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
