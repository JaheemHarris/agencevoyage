/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mg.agence.voyage.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author ihari
 */
@Entity
@Table(name = "reservation")
public class Reservation extends BaseModel{
    
    @Column(name = "id_vol")
    private int idVol;
    
    private String token;
    
    @Column(name = "date_reservation")
    private String dateReservation;

    public Reservation() {
    }

    public Reservation(int idVol, String token, String dateReservation) {
        this.idVol = idVol;
        this.token = token;
        this.dateReservation = dateReservation;
    }

    public int getIdVol() {
        return idVol;
    }

    public void setIdVol(int idVol) {
        this.idVol = idVol;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(String dateReservation) {
        this.dateReservation = dateReservation;
    }
    
    
}
