package com.mycompany.sportsclubimmutable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.Model.classes.ImmutableClasses.Fixture_List;
import com.Model.classes.ImmutableClasses.Sport_Fixtures;
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
public class Fixture_List_test {
    
    
    //List 
    private static List sport_fixtures_list = new ArrayList<Sport_Fixtures>();
    
    public Fixture_List_test() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testImmutable() {     
        
        //Object of class That Returns the array
        Fixture_List fix_list = new Fixture_List(sport_fixtures_list);
        
        //Object To be added
       Sport_Fixtures sport_fix = new Sport_Fixtures( convertDate("2014-03-08"),"A",17,"Westridge","Not Played","Cricket");
       
       
       //Size is zero
       Assert.assertEquals(sport_fixtures_list.size(),0,"Error names werent the same"); 
                        
        fix_list = fix_list.AddToList(sport_fix);        
        sport_fixtures_list = fix_list.getList();
         Assert.assertNotEquals(fix_list.hashCode(),fix_list.AddToList(sport_fix).hashCode(),"Error It is still the same object");
                       
        //Test if an object got added
        Assert.assertEquals(sport_fixtures_list.size(),1,"Error Nothing was add");
                
        sport_fix = (Sport_Fixtures)  sport_fixtures_list.get(0);        
        Assert.assertEquals(sport_fix.getSportType(),"Cricket","Error Sport werent the same");
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
