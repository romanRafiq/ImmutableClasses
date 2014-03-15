/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Services.Impl.PlayerRecords;

import com.Model.classes.ImmutableClasses.PlayerRecords.Try_Scorers;
import com.Services.crud.PlayerRecords.TryScorer_CrudService;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Roman
 */
public class TryScorer_CrudImpl implements TryScorer_CrudService{

    @Override
     @SuppressWarnings("unchecked")
    @Transactional(propagation = Propagation.SUPPORTS)
    public Try_Scorers find(String id) {
        return (Try_Scorers)this.find(id);
    }

    @Override
     @Transactional(propagation = Propagation.MANDATORY)
    public Try_Scorers persist(Try_Scorers entity) {
        return null;
    }

    @Override
     @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Try_Scorers merge(Try_Scorers entity) {
        if(entity == null)
        {
          try {
                 throw new Exception();
             } catch (Exception ex) {
                 Logger.getLogger(TryScorer_CrudImpl.class.getName()).log(Level.SEVERE, null, ex);
             }  
        }
        return entity; 
    }

    @Override
       @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Try_Scorers remove(Try_Scorers entity) {
        return null;       
    }

    @Override
         @Transactional(propagation = Propagation.REQUIRED)
    public List<Try_Scorers> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
