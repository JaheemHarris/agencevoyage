/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mg.agence.voyage.controller;

import java.util.logging.Level;
import java.util.logging.Logger;
import mg.agence.voyage.model.Reservation;
import mg.agence.voyage.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author ihari
 */

@Controller
public class ReservationController {
    
    @Autowired
    private ReservationService reservationService;
    
    @RequestMapping(value = "reservervol", method = RequestMethod.GET)
    public String reserverVol(@RequestParam(value = "idvol", required = true) int idVol ){
        Reservation savedReservation = null;
        try {
            Reservation reservation = new Reservation();
            reservation.setIdVol(idVol);
            savedReservation = this.reservationService.saveReservation(reservation);
        } catch (Exception ex) {
            Logger.getLogger(ReservationController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return savedReservation;
    }
}
