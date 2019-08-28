//package fr.formation.inti.entities;
//
//import java.util.Collection;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.ManyToMany;
//
//@Entity
//public class Passager {
//	private String Nom;
//	private String Prenom;
//	private int passId;
//	private Collection<Voiture> voit ;
//	
//	
//	@Override
//	public String toString() {
//		return "Passager [Nom=" + Nom + ", Prenom=" + Prenom + ", passId=" + passId + ", voit=" + voit + "]";
//	}
//	
//	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "psgr")
//	public Collection<Voiture> getVoit() {
//		return voit;
//	}
//	public void setVoit(Collection<Voiture> voit) {
//		this.voit = voit;
//	}
//	
//	
//	@Column (name = "Nom", nullable=false)
//	public String getNom() {
//		return Nom;
//	}
//	public void setNom(String nom) {
//		Nom = nom;
//	}
//	
//	@Column (name = "Prenom", nullable =false)
//	public String getPrenom() {
//		return Prenom;
//	}
//	public void setPrenom(String prenom) {
//		Prenom = prenom;
//	}
//	
//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	@Column(name = "Pass_Id")
//	public int getPass_id() {
//		return passId;
//	}
//	public void setPass_id(int pass_id) {
//		this.passId = pass_id;
//	}
//}
