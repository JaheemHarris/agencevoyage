/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mg.agence.voyage.service;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import mg.agence.voyage.dao.HibernateDAO;
import mg.agence.voyage.model.DetailsVol;
import mg.agence.voyage.model.EtatVol;
import mg.agence.voyage.model.Vol;
import mg.agence.voyage.model.VolTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ihari
 */
@Service
public class VolService {
    
    @Autowired
    private HibernateDAO hibernateDAO;
    
    public Vol saveVol(VolTemplate volTemplate) throws Exception{
        Vol savedVol = null;
        Vol vol = new Vol();
        try{
            vol.setIdAvion(volTemplate.getIdAvion());
            vol.setLieuDepart(volTemplate.getLieuDepart());
            vol.setLieuArrivee(volTemplate.getLieuArrivee());
            vol.setDuree(volTemplate.getDuree());
            vol.setHeureDepart(Time.valueOf(LocalTime.parse(volTemplate.getHeureDepart(), DateTimeFormatter.ofPattern("HH:mm"))));
            vol.setDateDepart(new SimpleDateFormat("yyyy-MM-dd").parse(volTemplate.getDateDepart()));
            savedVol = (Vol) this.hibernateDAO.save(vol);
        }catch(Exception e){
            throw e;
        }
        return savedVol;
    }
    
    public List<EtatVol> getEtatVols() throws Exception{
        List<EtatVol> result = null;
        try{
            result = this.hibernateDAO.find(new EtatVol());
        }catch(Exception e){
            throw e;
        }
        return result;
    }
    
    public List<DetailsVol> rechercheVol(String date) throws Exception{
        List<DetailsVol> result = null;
        try{
            String query = "SELECT * FROM view_details_vol WHERE date_depart = '"+date+"'";
            result = this.hibernateDAO.findByQuery(query, new DetailsVol());
            if(result != null){
                if(result.size() <= 0){
                    query = "SELECT * FROM view_details_vol WHERE date_depart >= '" + date + "' ORDER BY date_depart, heure_depart LIMIT 1";
                    result = this.hibernateDAO.findByQuery(query, new DetailsVol());
                }
            }
        }catch(Exception e){
            throw e;
        }
        return result;
    }
}
