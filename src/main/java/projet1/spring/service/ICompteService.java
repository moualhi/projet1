package projet1.spring.service;

import java.util.List;

import projet1.spring.entity.Compte;



public interface ICompteService {


List<Compte> retrieveAllCompte();//rechercher
Compte addCompte(Compte C);
void deleteCompte(int idCompte);
Compte updateCompte(Compte c);
Compte retrieveCompte(int idCompte);

}
