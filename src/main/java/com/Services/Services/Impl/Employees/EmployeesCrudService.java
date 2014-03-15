/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Services.Impl.Employees;

import com.Services.crud.Employees.Other_employeesCrudService;
import com.Services.crud.PersonCrudService;
import com.models.Other_Employees;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Roman
 */
public class EmployeesCrudService implements Other_employeesCrudService {

     @Override
    @SuppressWarnings("unchecked")
    @Transactional(propagation = Propagation.SUPPORTS)   
    public Other_Employees find(String id) {
         return (Other_Employees) this.find(id);
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Other_Employees persist(Other_Employees entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
     @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Other_Employees merge(Other_Employees entity) {
        if (entity == null) {            
             try {
                 throw new Exception();
             } catch (Exception ex) {
                 Logger.getLogger(EmployeesCrudService.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
               
        return entity;
    }

    @Override
    public Other_Employees remove(Other_Employees entity) {
       return null;
    }

    @Override
    public List<Other_Employees> findAll() {
        return null;
    }
    
}
