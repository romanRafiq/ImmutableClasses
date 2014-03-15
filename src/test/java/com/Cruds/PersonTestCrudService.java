/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Cruds;

import com.Model.classes.ImmutableClasses.Person;
import com.Services.crud.PersonCrudService;

import java.text.SimpleDateFormat;
import java.util.Date;
//import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import static org.mockito.Mockito.when;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import org.mockito.MockitoAnnotations;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author Roman
 */
public class PersonTestCrudService {
    
    @Mock
    PersonCrudService crudService;
    
   
    public PersonTestCrudService() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCreate() throws Exception {      
        
      Person person = new Person( "900125","Rafiq","Roman",convertDate("1990-03-25")).updateName("Moses");
        
      Person returnObject = crudService.persist(person);
     
      when(crudService.persist(person)).thenReturn(returnObject);
      Mockito.verify(crudService).persist(person);
        
      Assert.assertEquals("Moses",person.getName(),"Name was changed");
      Assert.assertEquals(person.getSurname(),"Roman" ,"The sport update didnt run");
     
      
    }

    
   @Test
    public void testRead() throws Exception {
        Person  person = new Person( "900125","Rafiq","Roman",convertDate("1990-03-25"));
        Person returnObject = crudService.find(person.getName());
        
        
        when(crudService.find(person.getName())).thenReturn(returnObject);
        Mockito.verify(crudService).find(person.getName());              
    }

    
    @Test
    public void testUpdate() throws Exception {
     
        Person person = new Person( "900125","Rafiq","Roman",convertDate("1990-03-25"));
                 
        when(crudService.merge(person)).thenReturn(person);
        System.out.println("Person::::  "+person); 
        Person returnObject = crudService.merge(person);  
        
        
        System.out.println("Return::::  "+returnObject); 
        Mockito.verify(crudService).merge(person);        
        //////////////////////////////////////////////////////
        Person updated = person.updateSurname("Awesome");
         System.out.println("Update "+updated);          
         
         when(crudService.merge(updated)).thenReturn(person);
        
         Person returned = crudService.merge(updated);
        System.out.println("Return: "+returned);  
        
        System.out.println("Update2 "+updated); 
      /*  Mockito.verify(crudService).merge(updated);
        Mockito.verifyNoMoreInteractions(crudService);
       */
        Assert.assertNotSame(returned,updated);
                
    }
    
    @Test
    public void testDelete() throws Exception {

        Person person = new Person( "900125","Rafiq","Roman",convertDate("1990-03-25"));
        Person returnObject = crudService.remove(person);
        when(crudService.remove(person)).thenReturn(returnObject);
        Mockito.verify(crudService).remove(person);

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
        crudService = Mockito.mock(PersonCrudService.class);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
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
}
