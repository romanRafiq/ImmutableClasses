/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Services.Impl.PlayerRecords;

import com.Services.crud.Impl.PersonCrudServiceImpl;
import com.Services.crud.PlayerRecords.BatsmansRuns_CrudService;
import com.models.Batsman_runs;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Roman
 */
public class BatmansRuns_CrudImpl implements BatsmansRuns_CrudService{

    @Override
     @SuppressWarnings("unchecked")
    @Transactional(propagation = Propagation.SUPPORTS)
    public Batsman_runs find(String id) {
        return (Batsman_runs)this.find(id);
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Batsman_runs persist(Batsman_runs entity) {
        return null;
    }

    @Override
     @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Batsman_runs merge(Batsman_runs entity) {
        if(entity == null)
        {
            try {
                 throw new Exception();
             } catch (Exception ex) {
                 Logger.getLogger(PersonCrudServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
             } 
        }
        return entity;
        
    }

    @Override
     @Transactional(propagation = Propagation.REQUIRED)
    public Batsman_runs remove(Batsman_runs entity) {
       return null;
    }

    @Override
    public List<Batsman_runs> findAll() {
        return null;
    }
    
}
