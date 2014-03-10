package com.mycompany.sportsclubimmutable.PlayerRecords;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.AppConfig.AppConfig;
import com.Model.classes.ImmutableClasses.PlayerRecords.Batsman_runs;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
public class testRuns {
    
    private static ApplicationContext ctx;

    private static Batsman_runs  bts_runs,bts_runs2;
    
    public testRuns() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testRuns() {
            
        bts_runs = new Batsman_runs( "Rafiq","Samsodien",5,50);
        
        Assert.assertEquals(bts_runs.getName(),"Rafiq","Values are not equal");
        
        
        bts_runs2 =  bts_runs.updateGamesPlayed(7);
         
        Assert.assertEquals(bts_runs2.getaGamesPlayed(),7,"Values are not equal");                                      
        
        
        Assert.assertNotSame(bts_runs.getaGamesPlayed(), bts_runs.updateGamesPlayed(7),"Objects are same");               
       }
    
    
    @Test//
    public void testImmutable()
    {
         //Testing that the object wasn't edited or changed but that
         //A whole new object was created and returned
        
        
         bts_runs = new Batsman_runs( "Rafiq","Samsodien",5,50);
                        
        /********  Get  HashCode   *****************/        
        String num1 = Integer.toHexString(System.identityHashCode(bts_runs)) ;
        
        String num2 = Integer.toHexString(System.identityHashCode(bts_runs.updateGamesPlayed(7)));
        
        Assert.assertNotEquals(num1,num2,"Objects are same");
    }

    
    
    @BeforeClass
    public static void setUpClass() throws Exception {        
         /*ctx = new AnnotationConfigApplicationContext(AppConfig.class);
         bts_runs = (Batsman_runs)ctx.getBean("Runsclases");*/
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        bts_runs = null;
        bts_runs2 = null;
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
