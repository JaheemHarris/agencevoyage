/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mg.agence.voyage.service;

import java.util.ArrayList;
import java.util.List;
import mg.agence.voyage.dao.HibernateDAO;
import mg.agence.voyage.model.Avion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ihari
 */

@Service
public class AvionService {
    
    @Autowired
    private HibernateDAO hibernateDAO;
    
    public List<Avion> getListAvion() throws Exception{
        List<Avion> listAvion = null;
        try{
            listAvion = new ArrayList<>();
            listAvion = this.hibernateDAO.find(new Avion());
        }catch(Exception e){
            throw e;
        }
        return listAvion;
    }
}
