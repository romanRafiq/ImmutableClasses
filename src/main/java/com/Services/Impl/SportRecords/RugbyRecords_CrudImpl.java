/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Services.Impl.SportRecords;

import com.Model.classes.ImmutableClasses.Sport_records.Rugby_Records;
import com.Services.crud.SportRecords.RugbyRecords_Crud;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Roman
 */
public class RugbyRecords_CrudImpl implements RugbyRecords_Crud{

    @Override
    @SuppressWarnings("unchecked")
    @Transactional(propagation = Propagation.SUPPORTS)
    public Rugby_Records find(String id) {
        return (Rugby_Records)this.find(id);
    }

    @Override
     @Transactional(propagation = Propagation.MANDATORY)
    public Rugby_Records persist(Rugby_Records entity) {
        return null;
    }

    @Override
      @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Rugby_Records merge(Rugby_Records entity) {
        if(entity == null)
        {
            try {
                 throw new Exception();
             } catch (Exception ex) {
                 Logger.getLogger(RugbyRecords_CrudImpl.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        return entity;
    }

    @Override
     @Transactional(propagation = Propagation.REQUIRED)
    public Rugby_Records remove(Rugby_Records entity) {
       return null;
    }

    @Override
    public List<Rugby_Records> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
