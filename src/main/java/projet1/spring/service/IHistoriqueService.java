package projet1.spring.service;

import java.util.List;

import projet1.spring.entity.Historique;



public interface IHistoriqueService {
	
	List<Historique> retrieveAllHistorique();
	Historique addHistorique(Historique H);
	void deleteHistorique(int id);
	Historique updateHistorique(Historique h);
	Historique retrieveHistorique(int id);

}
