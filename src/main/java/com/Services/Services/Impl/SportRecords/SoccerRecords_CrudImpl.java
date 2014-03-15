/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Services.Impl.SportRecords;

import com.Services.crud.SportRecords.SoccerRecords_Crud;
import com.models.Soccer_records;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Roman
 */
public class SoccerRecords_CrudImpl implements SoccerRecords_Crud{

    @Override
    @SuppressWarnings("unchecked")
    @Transactional(propagation = Propagation.SUPPORTS)
    public Soccer_records find(String id) {
        return (Soccer_records) this.find(id);
    }

    @Override
      @Transactional(propagation = Propagation.MANDATORY)
    public Soccer_records persist(Soccer_records entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Soccer_records merge(Soccer_records entity) {
        
         System.out.println("FOUND A FUCKING NULL");
        if(entity == null)
        {
           
             try {
                 
                 throw new Exception();
             } catch (Exception ex) {
                 Logger.getLogger(SoccerRecords_CrudImpl.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        return entity;
    }

    @Override
     @Transactional(propagation = Propagation.REQUIRED)
    public Soccer_records remove(Soccer_records entity) {
        return null;
    }

    @Override
    public List<Soccer_records> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
