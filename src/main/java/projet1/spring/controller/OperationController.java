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

import projet1.spring.entity.Operation;
import projet1.spring.service.IOperationService;

@RestController

public class OperationController {

	@Autowired
	IOperationService OperationService;

	//http://localhost:8081/SpringMVC/servlet/retrieveAllOperations
	@GetMapping("/retrieveAllOperations")
	@ResponseBody
	public List<Operation> retrieveAllOperations() {
	List<Operation> operations = OperationService.retrieveAllOperation();
	return operations;
	}




	//http://localhost:8081/SpringMVC/servlet/retrieve-Operation/{Operation-id}
	@GetMapping("/retrieveOperations/{id}")
	@ResponseBody
	public Operation retrieveOperation(@PathVariable("id") int id) {
	return OperationService.retrieveOperation(id);

	}


	//AjouterEmlpoyee : http://localhost:8081/SpringMVC/servlet/add-Operation
	@PostMapping("/addOperation")
	@ResponseBody
	public Operation addOperation(@RequestBody Operation O) {
		Operation O1 = OperationService.addOperation(O);
	return O;
	}


	//http://localhost:8081/SpringMVC/servlet/remove-Operation/{Operation-id}
	@DeleteMapping("/remove-user/{id}")
	@ResponseBody
	public void deleteOperation(@PathVariable("id") int id) {
		OperationService.deleteOperation(id);
	}



	//http://localhost:8081/SpringMVC/servlet/modify-Operation
	@PutMapping("/updateOperation")
	@ResponseBody
	public Operation updateOperation(@RequestBody Operation o){
	return OperationService.updateOperation(o);
	}

	 }

