/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mg.agence.voyage.controller;

import mg.agence.voyage.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * @author ihari
 */

@Controller
public class ReservationController {
    
    @Autowired
    private ReservationService reservationService;
}
