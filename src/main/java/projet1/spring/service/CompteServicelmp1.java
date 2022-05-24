package projet1.spring.service;



import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projet1.spring.repository.CompteRepository;
import projet1.spring.entity.Compte;


@Service
public class CompteServicelmp1 implements ICompteService {

@Autowired
CompteRepository CompteRepository;
private static final Logger L = LogManager.getLogger(CompteServicelmp1.class);


@Override
public List<Compte> retrieveAllCompte() {
	List<Compte> comptes = (List<Compte>) CompteRepository.findAll();
	for(Compte Compte: comptes)
	{
	L.info("comptes: "+Compte);
	}
	return comptes;
}
@Override
public Compte addCompte(Compte C) {
	CompteRepository.save(C);
	return C;
}
@Override
public void deleteCompte(int idCompte) {
	CompteRepository.deleteById(idCompte);
	
}
@Override
public Compte updateCompte(Compte c) {
	CompteRepository.save(c);
	return c;
}
public Compte retrieveCompte(int idCompte) {
	return CompteRepository.findById(idCompte).get();

}
}