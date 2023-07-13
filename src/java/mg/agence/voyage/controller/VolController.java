/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mg.agence.voyage.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mg.agence.voyage.model.Avion;
import mg.agence.voyage.model.DetailsVol;
import mg.agence.voyage.model.Vol;
import mg.agence.voyage.model.VolTemplate;
import mg.agence.voyage.service.AvionService;
import mg.agence.voyage.service.VolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author ihari
 */
@Controller
public class VolController {
    
    @Autowired
    private VolService volService;
    
    @Autowired
    private AvionService avionService;
    
    @RequestMapping(method = RequestMethod.GET, value = "/newvol")
    public String newVol(Model model){
        try {
            List<Avion> avions = this.avionService.getListAvion();
            model.addAttribute("avions", avions);
        } catch (Exception ex) {
            Logger.getLogger(VolController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "add-vol";
    }
    
    @RequestMapping(method = RequestMethod.POST, value = "/addvol")
    public String addVol(@ModelAttribute VolTemplate vol){
        try {
            Vol savedVol = volService.saveVol(vol);
        } catch (Exception ex) {
            Logger.getLogger(VolController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "redirect:/newvol";
    }
    
    @RequestMapping(value={"","searchVol"},method=RequestMethod.GET)
    public String searchVol(Model model) throws Exception{
        try{
            List<DetailsVol> vols = new ArrayList<DetailsVol>();
            model.addAttribute("date", "");
            model.addAttribute("vols", vols);
        }catch(Exception e){
            throw e;
        }
        return "recherche-vol";
    }
    
    @RequestMapping(value={"searchVol"},method=RequestMethod.POST)
    public String availableVol(Model model,@RequestParam(value = "date", required=true) String date) throws Exception{
        try{
            List<DetailsVol> vols = new ArrayList<DetailsVol>();
            vols = this.volService.rechercheVol(date);
            model.addAttribute("date", date);
            model.addAttribute("vols", vols);
        }catch(Exception e){
            throw e;
        }
        return "recherche-vol";
    }
}
