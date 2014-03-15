/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Services.Impl.Employees;

import com.Services.crud.Employees.CoachCrudSerice;
import com.Services.crud.PersonCrudService;
import com.models.Coach;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Roman
 */
public class CoachCrudServiceImpl implements CoachCrudSerice {

    
     
    @Override
    @SuppressWarnings("unchecked")
    @Transactional(propagation = Propagation.SUPPORTS)    
    public Coach find(String id) {
      return (Coach) this.find(id);
    }
    
  @Override    
    @Transactional(propagation = Propagation.MANDATORY)
    public Coach persist(Coach entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
     @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Coach merge(Coach entity) {
       
      
        if (entity == null) {            
             try {
                 throw new Exception();
             } catch (Exception ex) {
                 Logger.getLogger(CoachCrudServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
               
        return entity;
    }

    @Override
    public Coach remove(Coach entity) {
        return null;
    }

    @Override
    public List<Coach> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
