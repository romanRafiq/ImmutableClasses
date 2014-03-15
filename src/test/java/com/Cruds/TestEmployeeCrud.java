/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Cruds;

import com.Services.crud.Employees.Other_employeesCrudService;
import com.Model.classes.ImmutableClasses.Employees.Other_Employees;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
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
public class TestEmployeeCrud {
    
    
     @Mock
    Other_employeesCrudService crudService;
    public TestEmployeeCrud() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCreate() throws Exception {      
//coach = new Coach( 900125,"Lester","Nesta",convertDate("1990-01-10"), "Cricket","A", 21);
      Other_Employees employees = new Other_Employees( "900125","Eesa","Abrahams",convertDate("1990-01-10"),900231,"Admin","Secetary");
        
      Other_Employees returnObject = crudService.persist(employees);     
      when(crudService.persist(employees)).thenReturn(returnObject);
      Mockito.verify(crudService).persist(employees);
        
      Assert.assertEquals("900125",employees.getID(),"Name was changed");
      Assert.assertEquals(employees.getName(),"Eesa" ,"The sport update didnt run");
     
      
    }

    
   @Test
    public void testRead() throws Exception {
        Other_Employees  employee = new Other_Employees( "900125","Eesa","Abrahams",convertDate("1990-01-10"),900231,"Admin","Secetary");
        Other_Employees returnObject = crudService.find(employee.getName());
                
        when(crudService.find(employee.getName())).thenReturn(returnObject);
        Mockito.verify(crudService).find(employee.getName());              
    }

    
    @Test
    public void testUpdate() throws Exception {
     
        Other_Employees employee = new Other_Employees( "900125","Eesa","Abrahams",convertDate("1990-01-10"),900231,"Admin","Secetary");
                 
        when(crudService.merge(employee)).thenReturn(employee);
        System.out.println("Person::::  "+employee); 
        Other_Employees returnObject = crudService.merge(employee);  
        
        
        System.out.println("Return::::  "+returnObject); 
        Mockito.verify(crudService).merge(employee);        
        //////////////////////////////////////////////////////
        Other_Employees updated = employee.changeJobDescription("Cleaner");
         System.out.println("Update "+updated);          
         
         when(crudService.merge(updated)).thenReturn(employee);
        
         Other_Employees returned = crudService.merge(updated);
        System.out.println("Return: "+returned);  
        
        System.out.println("Update2 "+updated); 
      /*  Mockito.verify(crudService).merge(updated);
        Mockito.verifyNoMoreInteractions(crudService);
       */
        Assert.assertNotSame(returned,updated);
                
    }
    
    @Test
    public void testDelete() throws Exception {

        Other_Employees employee = new Other_Employees( "900125","Eesa","Abrahams",convertDate("1990-01-10"),900231,"Admin","Secetary");
        Other_Employees returnObject = crudService.remove(employee);
        when(crudService.remove(employee)).thenReturn(returnObject);
        Mockito.verify(crudService).remove(employee);

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
         MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(Other_employeesCrudService.class);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
