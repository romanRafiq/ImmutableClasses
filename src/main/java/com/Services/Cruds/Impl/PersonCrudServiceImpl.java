/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Services.Cruds.Impl;


import com.Model.classes.ImmutableClasses.Person;
import com.Services.Cruds.PersonCrudService;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


public class PersonCrudServiceImpl implements PersonCrudService {
     
   
    @Override
    @SuppressWarnings("unchecked")
    @Transactional(propagation = Propagation.SUPPORTS)
    public Person find(String id) {
        
        return (Person) this.find(id);
    }

    @Override    
    @Transactional(propagation = Propagation.MANDATORY)
    public Person persist(Person entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Person merge(Person entity) {
       
         Person person = new Person(entity);
       
        if (person == null) {            
             try {
                 throw new Exception();
             } catch (Exception ex) {
                 Logger.getLogger(PersonCrudServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
               
        return person;                        
    }

    @Override
     @Transactional(propagation = Propagation.REQUIRED)
    public Person remove(Person entity) {
       return null;
    }
    
    @Override
    public List<Person> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}