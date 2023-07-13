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
}
