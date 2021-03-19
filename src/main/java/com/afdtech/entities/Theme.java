package com.afdtech.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.*;

@Entity
public class Theme implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nom;
	private String description;
	private String detailAcronyme;
	private Boolean status;
	private Date dateCreation;
	private Date dateModification;

	@ManyToOne
	@JoinColumn(name = "id_user")
	private Utilisateur utilisateur;

	public Theme() {
	}

	public Theme(Long id, String nom, String description,
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
		Theme theme = (Theme) o;
		return Objects.equals(id, theme.id)
				&& Objects.equals(nom, theme.nom)
				&& Objects.equals(description, theme.description)
				&& Objects.equals(detailAcronyme, theme.detailAcronyme)
				&& Objects.equals(status, theme.status)
				&& Objects.equals(dateCreation, theme.dateCreation)
				&& Objects.equals(dateModification, theme.dateModification)
				&& Objects.equals(utilisateur, theme.utilisateur);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nom, description, detailAcronyme, status, dateCreation, dateModification, utilisateur);
	}

	@Override
	public String toString() {
		return "Theme{" +
				"id=" + id +
				", nom='" + nom + '\'' +
				", description='" + description + '\'' +
				", detailAcronyme='" + detailAcronyme + '\'' +
				", status=" + status +
				", dateCreation=" + dateCreation +
				", dateModification=" + dateModification +
				", utilisateur=" + utilisateur +
				'}';
	}
}
