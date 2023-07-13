/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mg.agence.voyage.model;

import java.sql.Time;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author ihari
 */
@Entity
@Table(name = "vol")
public class Vol extends BaseModel{
    
    @Column(name = "id_avion")
    private int idAvion;
    
    @Column(name = "lieu_depart")
    private String lieuDepart;
    
    @Column(name = "lieu_arrivee")
    private String lieuArrivee;
    
    private int duree;
    
    @Column(name = "date_depart")
    @Temporal(TemporalType.DATE)
    private Date dateDepart;
    
    @Column(name = "heure_depart")
    private Time heureDepart;

    public Vol() {
    }

    public Vol(int idAvion, String lieuDepart, String lieuArrivee, int duree, Date dateDepart, Time heureDepart) {
        this.idAvion = idAvion;
        this.lieuDepart = lieuDepart;
        this.lieuArrivee = lieuArrivee;
        this.duree = duree;
        this.dateDepart = dateDepart;
        this.heureDepart = heureDepart;
    }

    public int getIdAvion() {
        return idAvion;
    }

    public void setIdAvion(int idAvion) {
        this.idAvion = idAvion;
    }

    public String getLieuDepart() {
        return lieuDepart;
    }

    public void setLieuDepart(String lieuDepart) {
        this.lieuDepart = lieuDepart;
    }

    public String getLieuArrivee() {
        return lieuArrivee;
    }

    public void setLieuArrivee(String lieuArrivee) {
        this.lieuArrivee = lieuArrivee;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public Date getDateDepart() {
        return dateDepart;
    }

    public void setDateDepart(Date dateDepart) {
        this.dateDepart = dateDepart;
    }

    public Time getHeureDepart() {
        return heureDepart;
    }

    public void setHeureDepart(Time heureDepart) {
        this.heureDepart = heureDepart;
    }
}
