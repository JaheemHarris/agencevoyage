/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mg.agence.voyage.service;

import mg.agence.voyage.dao.HibernateDAO;
import mg.agence.voyage.model.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ihari
 */
@Service
public class ReservationService {
    
    @Autowired
    private HibernateDAO hibernateDAO;
    
    public Reservation saveReservation(Reservation reservation) throws Exception{
        Reservation savedReservation = null;
        try{
            savedReservation = (Reservation) this.hibernateDAO.save(reservation);
        }catch(Exception e){
            throw e;
        }
        return savedReservation;
    }
}
