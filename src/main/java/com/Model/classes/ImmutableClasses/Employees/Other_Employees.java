/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Model.classes.ImmutableClasses.Employees;

import com.Model.classes.ImmutableClasses.Person;
import java.util.Date;

/**
 *
 * @author Roman
 */
public final class Other_Employees extends Person{
    
    //variables
    private int emp_id;
    private String postion;
    private String job_description;
    
    public Other_Employees(String idNumber, String name, String surname, Date DoB,int emp_id,String postion,String job_description) {
        super(idNumber, name, surname, DoB);
        
      this.emp_id = emp_id;
      this.postion = postion;
      this.job_description = job_description;
      
    }
    
     public Other_Employees changePosition(String NewPosition)
     {
         return new Other_Employees( super.getID(),super.getName(),super.getSurname(),super.getDOB(), emp_id, NewPosition, job_description);
     }
     
     public Other_Employees changeJobDescription(String newJobDescription)
     {
         return new Other_Employees( super.getID(),super.getName(),super.getSurname(),super.getDOB(), emp_id, postion, newJobDescription);
     }
    
    public int getEmpId()
    {
        return emp_id;
    }
     public String getPosition()
    {
        return postion;
    }
      public String getJobDesc()
    {
        return job_description;
    }
    
}
