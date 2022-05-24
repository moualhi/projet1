package projet1.spring.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;


@Entity
public class Operation implements Serializable{
@Id
@GeneratedValue//auto incr
private int idOpp;
private Date date;
private double montant;
private TypeOperation typeOperation;
@ManyToOne
//@JoinColumn(name="CODE_CPTE")
private Compte compte;
public Operation() {
super();
}


public Operation(int idOpp,Date date, double montant,TypeOperation typeOperation, Compte compte) {
super();
this.idOpp=idOpp;
this.date = date;
this.montant = montant;
this.typeOperation=typeOperation;
this.compte = compte;
}

public Operation(Date date, double montant,TypeOperation typeOperation, Compte compte) {
super();
this.date = date;
this.montant = montant;
this.typeOperation=typeOperation;
this.compte = compte;
}
public Date getDate() {
return date;
}
public void setDate(Date date) {
this.date = date;
}

public int getIdOpp() {
return idOpp;
}
public void setIdOpp(int intOpp) {
this.idOpp = idOpp;
}


public double getMontant() {
return montant;
}
public void setMontant(double montant) {
this.montant = montant;
}


public TypeOperation typeOperation() {
return typeOperation;
}
public void setTypeOperation(TypeOperation typeOperation) {
this.typeOperation = typeOperation;
}
public Compte getCompte() {
return compte;
}
public void setCompte(Compte compte) {
this.compte = compte;
}






}