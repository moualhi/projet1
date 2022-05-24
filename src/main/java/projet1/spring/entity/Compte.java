package projet1.spring.entity;


import java.io.Serializable;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public  class Compte implements Serializable {
@Id
private int idCompte;
private double solde;
private Date dateOuverture;
private TypeCompte typeCompte;




@OneToMany(mappedBy = "compte")
@JsonIgnore//pour afficher que les attributs
private List<Operation> operations;
@OneToOne
private Historique historique;

public Compte() {
super();
// TODO Auto-generated constructor stub
}

public Compte( Date dateOuverture, double solde, TypeCompte typeCompte) {
super();
this.dateOuverture = dateOuverture;
this.solde = solde;
this.typeCompte = typeCompte;
}



public Compte(int idCompte, Date dateOuverture, double solde, TypeCompte typeCompte) {
super();
this.idCompte = idCompte;
this.dateOuverture = dateOuverture;
this.solde = solde;

this.typeCompte = typeCompte;
}
public int getidCompte() {
return idCompte;
}
public void setidCompte(int idCompte) {
this.idCompte = idCompte;
}
public Date getDateOuverture() {
return dateOuverture;
}
public void setDateOuverture(Date dateOuverture) {
this.dateOuverture = dateOuverture;
}
public double getSolde() {
return solde;
}
public void setSolde(double solde) {
this.solde = solde;
}

public TypeCompte getTypeCompte() {
return typeCompte;
}
public void setTypeCompte(TypeCompte typeCompte) {
this.typeCompte = typeCompte;
}

public List<Operation> getOperations() {
return operations;
}
public void setOperations(List<Operation> operations) {
this.operations = operations;
}

}