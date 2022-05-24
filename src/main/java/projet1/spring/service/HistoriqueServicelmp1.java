package projet1.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projet1.spring.entity.Historique;


import projet1.spring.repository.HistoriqueRepository;

@Service
public class HistoriqueServicelmp1 implements IHistoriqueService{


@Autowired
HistoriqueRepository historiqueRepository;
private static final Logger L = LogManager.getLogger(HistoriqueServicelmp1.class);



@Override
public List<Historique> retrieveAllHistorique() {
	List<Historique> historiques = (List<Historique>)historiqueRepository.findAll();
	for(Historique Historique: historiques)
	{
	L.info("historiques: "+Historique);
	}
	return historiques;
}
@Override
public Historique addHistorique(Historique H) {
	historiqueRepository.save(H);
	return H;
}


@Override
public void deleteHistorique(int id) {
	historiqueRepository.deleteById(id);
	
}
@Override
public Historique updateHistorique(Historique h) {
	historiqueRepository.save(h);
	return h;
}
public Historique retrieveHistorique(int id) {
	return historiqueRepository.findById(id).get();

}
}
