package projet1.spring.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import projet1.spring.entity.Historique;
import projet1.spring.service.IHistoriqueService;



@RestController
public class HistoriqueController {



	@Autowired
	IHistoriqueService HistoriqueService;

	//http://localhost:8081/SpringMVC/servlet/retrieveAllHistoriques
	@GetMapping("/retrieveAllHistoriques")
	@ResponseBody
	public List<Historique> retrieveAllHistoriques() {
	List<Historique> Historiques = HistoriqueService.retrieveAllHistorique();
	return Historiques;
	}

	
	//http://localhost:8081/SpringMVC/servlet/retrieveHistorique/{Historique-id}
	@GetMapping("/retrieveHistoriques/{id}")
	@ResponseBody
	public Historique retrieveHistorique(@PathVariable("id") int id) {
	return HistoriqueService.retrieveHistorique(id);

	}


	//AjouterHistorique : http://localhost:8081/SpringMVC/servlet/addHistorique
	@PostMapping("/addHistorique")
	@ResponseBody
	public Historique addHistorique(@RequestBody Historique H) {
		Historique h = HistoriqueService.addHistorique(H);
	return h;
	}


	//http://localhost:8081/SpringMVC/servlet/removeHistorique/{Historique-id}
	@DeleteMapping("/removeHistorique/{id}")
	@ResponseBody
	public void deleteHistorique(@PathVariable("id") int id) {
		HistoriqueService.deleteHistorique(id);
	}



	//http://localhost:8081/SpringMVC/servlet/modifyHistorique
	@PutMapping("/updateHistorique")
	@ResponseBody
	public Historique updateHistorique(@RequestBody Historique h){
	return HistoriqueService.updateHistorique(h);
	}

	 }


