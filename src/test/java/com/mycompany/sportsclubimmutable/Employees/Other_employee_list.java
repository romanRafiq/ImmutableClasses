/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.sportsclubimmutable.Employees;



import com.Model.classes.ImmutableClasses.Employees.OtherEmployeeList;
import com.Model.classes.ImmutableClasses.Employees.Other_Employees;
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
public class Other_employee_list {
    
    //List
    private static List other_employees = new ArrayList <Other_Employees>();
    public Other_employee_list() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    public void testImmutable() {             
        //Object of class That Returns the array
        OtherEmployeeList Other_Emp_list_Obj = new OtherEmployeeList(other_employees);
        
        //Object To be added
       Other_Employees empObj = new Other_Employees( "900125","Eesa","Abrahams",convertDate("1990-01-10"),900231,"Admin","Secetary");
       
       
       //Size is zero
       Assert.assertEquals(other_employees.size(),0,"Error List isnt empty"); 
                        
        Other_Emp_list_Obj = Other_Emp_list_Obj.addToList(empObj); 
        
        other_employees = Other_Emp_list_Obj.getList();
         Assert.assertNotEquals(Other_Emp_list_Obj.hashCode(),Other_Emp_list_Obj.addToList(empObj).hashCode(),"Error It is still the same object");
                       
        //Test if an object got added
        Assert.assertEquals(other_employees.size(),1,"Error Nothing was added");
                
        empObj = (Other_Employees)  other_employees.get(0); 
        
        Assert.assertEquals(empObj.getName(),"Eesa","Error The value in the list is incorrect");
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
