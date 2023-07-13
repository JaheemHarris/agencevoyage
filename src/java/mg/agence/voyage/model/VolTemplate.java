/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mg.agence.voyage.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author ihari
 */
public class VolTemplate {
    private int idAvion;
    private String lieuDepart;
    private String lieuArrivee;
    private int duree;
    private String dateDepart;
    private String heureDepart;

    public VolTemplate() {
    }

    public VolTemplate(int idAvion, String lieuDepart, String lieuArrivee, int duree, String dateDepart, String heureDepart) {
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

    public String getDateDepart() {
        return dateDepart;
    }

    public void setDateDepart(String dateDepart) {
        this.dateDepart = dateDepart;
    }

    public String getHeureDepart() {
        return heureDepart;
    }

    public void setHeureDepart(String heureDepart) {
        this.heureDepart = heureDepart;
    }
}
