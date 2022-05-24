package projet1.spring.service;


import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projet1.spring.entity.Operation;

import projet1.spring.repository.OperationRepository;

@Service
public class OperationServicelmp1  implements IOperationService {

@Autowired
OperationRepository operationRepository;
private static final Logger L = LogManager.getLogger(OperationServicelmp1.class);



@Override
public List<Operation> retrieveAllOperation() {
	List<Operation> operations = (List<Operation>) operationRepository.findAll();
	for(Operation Operation: operations)
	{
	L.info("operations: "+Operation);
	}
	return operations;
}


@Override
public Operation addOperation(Operation O) {
	operationRepository.save(O);
	return O;
}
@Override
public void deleteOperation(int id) {
	operationRepository.deleteById(id);
	
}
@Override
public Operation updateOperation(Operation o) {
	operationRepository.save(o);
	return o;
}
public Operation retrieveOperation(int id) {
	return operationRepository.findById(id).get();

}
}


