/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Model.classes.ImmutableClasses.Employees;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Roman
 */
public final class OtherEmployeeList {
    
    private List <Other_Employees> OtherEmployeeList;
    
    
    public OtherEmployeeList(List OtherEmployeeList)
    {
        this.OtherEmployeeList = OtherEmployeeList;
    }
    
     public OtherEmployeeList addToList(Other_Employees newEmployee)
     {
         List newEmp_list = new ArrayList<Other_Employees>();
         newEmp_list.add(newEmployee);
         
         return new OtherEmployeeList(newEmp_list);
     }
    
    public  List <Other_Employees> getList()
    {
        return OtherEmployeeList;
    }
    
    
            
}
