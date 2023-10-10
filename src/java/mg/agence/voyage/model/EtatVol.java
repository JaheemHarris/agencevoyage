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
@Table(name = "view_etat_vol")
public class EtatVol extends BaseModel{
    
    @Column(name = "id_avion")
    private int idAvion;
    
    private String modele;
    
    @Column(name = "nombre_siege_affaire")
    private int nombrePlaceAffaire;
    
    @Column(name = "nombre_siege_eco")
    private int nombbrePlaceEco;
    
    @Column(name = "lieu_depart")
    private String lieuDepart;
    
    @Column(name = "lieu_arrivee")
    private String lieuArrivee;
    
    private int duree;
    
    @Column(name = "date_depart")
    private String dateDepart;
    
    @Column(name = "heure_depart")
    private String heureDepart;
    
    @Column(name = "total_place_reserver ")
    private int totalPlaceReserver;
    
    @Column(name = "nombre_place_disponible ")
    private int nombrePlaceDisponible;

    public EtatVol() {
    }

    public EtatVol(int idAvion, String modele, int nombrePlaceAffaire, int nombbrePlaceEco, String lieuDepart, String lieuArrivee, int duree, String dateDepart, String heureDepart, int totalPlaceReserver, int nombrePlaceDisponible) {
        this.idAvion = idAvion;
        this.modele = modele;
        this.nombrePlaceAffaire = nombrePlaceAffaire;
        this.nombbrePlaceEco = nombbrePlaceEco;
        this.lieuDepart = lieuDepart;
        this.lieuArrivee = lieuArrivee;
        this.duree = duree;
        this.dateDepart = dateDepart;
        this.heureDepart = heureDepart;
        this.totalPlaceReserver = totalPlaceReserver;
        this.nombrePlaceDisponible = nombrePlaceDisponible;
    }

    public int getIdAvion() {
        return idAvion;
    }

    public void setIdAvion(int idAvion) {
        this.idAvion = idAvion;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public int getNombrePlaceAffaire() {
        return nombrePlaceAffaire;
    }

    public void setNombrePlaceAffaire(int nombrePlaceAffaire) {
        this.nombrePlaceAffaire = nombrePlaceAffaire;
    }

    public int getNombbrePlaceEco() {
        return nombbrePlaceEco;
    }

    public void setNombbrePlaceEco(int nombbrePlaceEco) {
        this.nombbrePlaceEco = nombbrePlaceEco;
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

    public int getTotalPlaceReserver() {
        return totalPlaceReserver;
    }

    public void setTotalPlaceReserver(int totalPlaceReserver) {
        this.totalPlaceReserver = totalPlaceReserver;
    }

    public int getNombrePlaceDisponible() {
        return nombrePlaceDisponible;
    }

    public void setNombrePlaceDisponible(int nombrePlaceDisponible) {
        this.nombrePlaceDisponible = nombrePlaceDisponible;
    }
    
    
}
