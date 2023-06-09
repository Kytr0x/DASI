/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @authors Raphaël SIMAR & Lina Borg : B3129 
 * Dominque DROUILLY TORRES : Étudiante d'échange
 */

@Entity
public class Soutien implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @ManyToOne
    private Eleve eleve;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date emissionDemande;
    @Temporal(TemporalType.TIMESTAMP)
    private Date debutSoutien;
    @Temporal(TemporalType.TIMESTAMP)
    private Date finSoutien;
   
    private Integer note;
    
    @ManyToOne
    private Intervenant intervenant;
    
    @ManyToOne
    private Matiere matiere;
    
    private String description_demande;

    private boolean visioLancee;

    
    public Soutien(Eleve eleve, Matiere matiere, String description_demande) {
        this.eleve = eleve;
        this.emissionDemande = new Date();
        this.debutSoutien = null;
        this.finSoutien = null;
        this.note = null;
        this.intervenant = null;
        this.matiere = matiere;
        this.description_demande = description_demande;
        this.visioLancee = false;
    }

    public Soutien() {
    }

    public boolean getVisioLancee() {
        return visioLancee;
    }
    
    public Long getId() {
        return id;
    }

    public Eleve getEleve() {
        return eleve;
    }

    public Date getEmissionDemande() {
        return emissionDemande;
    }

    public Date getDebutSoutien() {
        return debutSoutien;
    }

    public Date getFinSoutien() {
        return finSoutien;
    }

    public Integer getNote() {
        return note;
    }

    public Intervenant getIntervenant() {
        return intervenant;
    }

    public Matiere getMatiere() {
        return matiere;
    }

    public String getDescription_demande() {
        return description_demande;
    }

    public void setEleve(Eleve eleve) {
        this.eleve = eleve;
    }

    public void setEmissionDemande(Date emissionDemande) {
        this.emissionDemande = emissionDemande;
    }

    public void setDebutSoutien(Date debutSoutien) {
        this.debutSoutien = debutSoutien;
    }

    public void setFinSoutien(Date finSoutien) {
        this.finSoutien = finSoutien;
    }

    public void setNote(Integer note) {
        this.note = note;
    }

    public void setIntervenant(Intervenant intervenant) {
        this.intervenant = intervenant;
    }

    public void setMatiere(Matiere matiere) {
        this.matiere = matiere;
    }

    public void setDescription_demande(String description_demande) {
        this.description_demande = description_demande;
    }

    public void setVisioLancee(boolean visioLancee) {
        this.visioLancee = visioLancee;
    }

    @Override
    public String toString() {
        return "Soutien : " + "id=" + id + " | eleve=" + eleve.getNom() + " " + eleve.getPrenom() + " de niveau " + eleve.getNiveau() + " dont id=" + eleve.getId() + " | intervenant=" + intervenant.getNom() + " " + intervenant.getPrenom() + " de type " + intervenant.getClass().getSimpleName() + " dont id=" + intervenant.getId() + " | emissionDemande=" + emissionDemande + " | debutSoutien=" + debutSoutien + " | finSoutien=" + finSoutien + " | note=" + note + " | matiere=" + matiere.getNom() + " dont id=" + matiere.getId() + " | description_demande=" + description_demande;
    }
    
    
    
}
