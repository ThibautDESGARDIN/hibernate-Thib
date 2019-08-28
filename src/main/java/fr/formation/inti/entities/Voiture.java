//package fr.formation.inti.entities;
//
//import java.util.Collection;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.JoinTable;
//import javax.persistence.ManyToMany;
//import javax.persistence.Table;
//
//@Entity
//@Table(name="car")
//public class Voiture {
//	private int carId;
//	private String marque;
//	private Collection<Passager> psgr ;
//	
//	
//	@ManyToMany(fetch=FetchType.LAZY, cascade = CascadeType.PERSIST)
//	@JoinTable(name="Passager_Voiture",
//			   joinColumns= {@JoinColumn(name="car_ID")},
//			   inverseJoinColumns= {@JoinColumn(name="pass_ID")})
//	public Collection<Passager> getPsgr() {
//		return psgr;
//	}
//	public void setPsgr(Collection<Passager> psgr) {
//		this.psgr = psgr;
//	}
//	
//	
//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	@Column(name = "CAR_ID")
//	public int getCarId() {
//		return carId;
//	}
//	
//	public void setCarId(int carId) {
//		this.carId = carId;
//	}
//	
//	@Column(name="MARQUE", nullable = false)
//	public String getMarque() {
//		return marque;
//	}
//	public void setMarque(String marque) {
//		this.marque = marque;
//	}
//	
//	
//}
