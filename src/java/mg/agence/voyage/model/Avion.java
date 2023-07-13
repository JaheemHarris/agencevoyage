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
@Table(name = "avion")
public class Avion extends BaseModel{
    
    private String modele;
    
    @Column(name = "nombre_siege_eco")
    private int nombrePlaceEco;
    
    @Column(name = "nombre_siege_affaire")
    private int nombrePlaceAffaire;

    public Avion() {
    }

    public Avion(String modele, int nombrePlaceEco, int nombrePlaceAffaire) {
        this.modele = modele;
        this.nombrePlaceEco = nombrePlaceEco;
        this.nombrePlaceAffaire = nombrePlaceAffaire;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public int getNombrePlaceEco() {
        return nombrePlaceEco;
    }

    public void setNombrePlaceEco(int nombrePlaceEco) {
        this.nombrePlaceEco = nombrePlaceEco;
    }

    public int getNombrePlaceAffaire() {
        return nombrePlaceAffaire;
    }

    public void setNombrePlaceAffaire(int nombrePlaceAffaire) {
        this.nombrePlaceAffaire = nombrePlaceAffaire;
    }
    
}
