package projet1.spring.entity;
import java.io.Serializable;


import javax.persistence.*;


@Entity

public  class Historique implements Serializable{ 
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String Validite;
	private Operation operation;
	private Statut statut;

	
	@OneToOne
	private Compte compte;
	
	public Historique() {
		super();
		}
	public Historique(String Validite,Operation operation ,Statut statut) {
		super();
		this.Validite = Validite;
		this.operation = operation;
		this.statut=statut;
		}
	
	public Historique(int id,String Validite,Operation operation ,Statut statut) {
		super();
		this.id=id;
		this.Validite = Validite;
		this.operation = operation;
		this.statut=statut;
		}
	
	
	public String Validite() {
		return Validite;
		}
		public void setValidite(String Validite) {
		this.Validite = Validite;
		}
	
	
	public Operation getOperation() {
		return operation ;
		}
		public void setOperation(Operation operation) {
		this.operation = operation;
		}
		

		public Statut statut() {
			return statut;
			}
			public void setStatut(Statut statut) {
			this.statut = statut;
			}
		
		
		
		
}


