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

import projet1.spring.entity.Compte;
import projet1.spring.service.ICompteService;

@RestController
public class CompteController {



@Autowired
ICompteService CompteService;

//http://localhost:8080/SpringMVC/servlet/retrieveAllComptes
@GetMapping("/retrieveAllComptes")
@ResponseBody
public List<Compte> retrieveAllComptes() {
List<Compte> Comptes = CompteService.retrieveAllCompte();
return Comptes;
}


//http://localhost:8080/SpringMVC/servlet/retrieve-Compte/{Compte-id}
@GetMapping("/retrieveCompte/{id}")
@ResponseBody
public Compte retrieveCompte(@PathVariable("id") int id) {
return CompteService.retrieveCompte(id);

}


//AjouterCompte : http://localhost:8080/SpringMVC/servlet/add-Compte
@PostMapping("/addCompte")
@ResponseBody
public Compte addCompte(@RequestBody Compte C) {
	Compte c = CompteService.addCompte(C);
return c;
}


//http://localhost:8080/SpringMVC/servlet/remove-Compte/{Compte-id}
@DeleteMapping("/remove-compte/{id}")
@ResponseBody
public void deleteCompte(@PathVariable("id") int id) {
	CompteService.deleteCompte(id);
}



//http://localhost:8080/SpringMVC/servlet/updateCompte
@PutMapping("/updateCompte")
@ResponseBody
public Compte updateCompte(@RequestBody Compte c){
return CompteService.updateCompte(c);
}

 }