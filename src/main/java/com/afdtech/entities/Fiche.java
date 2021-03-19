package com.afdtech.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
public class Fiche {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    private String description;
    private String contenu;
    private String detailAcronyme;
    private String updateFile;
    private Boolean status;
    private Date dateCreation;
    private Date dateModification;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private Utilisateur utilisateur;

    public Fiche() {
    }

    public Fiche(Long id, String nom, String description,
                 String detailAcronyme, Boolean status,
                 Date dateCreation, Date dateModification,
                 Utilisateur utilisateur) {
        this.id = id;
        this.nom = nom;
        this.description = description;
        this.detailAcronyme = detailAcronyme;
        this.status = status;
        this.dateCreation = dateCreation;
        this.dateModification = dateModification;
        this.utilisateur = utilisateur;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public String getUpdateFile() {
        return updateFile;
    }

    public void setUpdateFile(String updateFile) {
        this.updateFile = updateFile;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDetailAcronyme() {
        return detailAcronyme;
    }

    public void setDetailAcronyme(String detailAcronyme) {
        this.detailAcronyme = detailAcronyme;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Date getDateModification() {
        return dateModification;
    }

    public void setDateModification(Date dateModification) {
        this.dateModification = dateModification;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fiche fiche = (Fiche) o;
        return Objects.equals(id, fiche.id)
                && Objects.equals(nom, fiche.nom)
                && Objects.equals(description, fiche.description)
                && Objects.equals(contenu, fiche.contenu)
                && Objects.equals(detailAcronyme, fiche.detailAcronyme)
                && Objects.equals(updateFile, fiche.updateFile)
                && Objects.equals(status, fiche.status)
                && Objects.equals(dateCreation, fiche.dateCreation)
                && Objects.equals(dateModification, fiche.dateModification)
                && Objects.equals(utilisateur, fiche.utilisateur);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom, description, contenu, detailAcronyme, updateFile, status, dateCreation, dateModification, utilisateur);
    }

    @Override
    public String toString() {
        return "Fiche{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", description='" + description + '\'' +
                ", contenu='" + contenu + '\'' +
                ", detaiAcronyme='" + detailAcronyme + '\'' +
                ", updateFile='" + updateFile + '\'' +
                ", status=" + status +
                ", dateCreation=" + dateCreation +
                ", dateModification=" + dateModification +
                ", utilisateur=" + utilisateur +
                '}';
    }
}
