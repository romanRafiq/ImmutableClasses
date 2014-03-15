/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Services.Impl.SportRecords;

import com.Model.classes.ImmutableClasses.Sport_records.Cricket_records;
import com.Services.crud.SportRecords.CricketRecords_CrudService;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Roman
 */
public class CricketRecords_CrudImpl implements CricketRecords_CrudService{

    @Override
     @SuppressWarnings("unchecked")
    @Transactional(propagation = Propagation.SUPPORTS)
    public Cricket_records find(String id) {
        return (Cricket_records)this.find(id);
    }

    @Override
     @Transactional(propagation = Propagation.MANDATORY)
    public Cricket_records persist(Cricket_records entity) {
        return null;
    }

    @Override
       @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Cricket_records merge(Cricket_records entity) {
        if(entity == null)
        {
             try {
                 throw new Exception();
             } catch (Exception ex) {
                 Logger.getLogger(CricketRecords_CrudImpl.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        
        return entity;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Cricket_records remove(Cricket_records entity) {
        return null;
    }

    @Override
    public List<Cricket_records> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
