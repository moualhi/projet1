package projet1.spring.service;

import java.util.List;


import projet1.spring.entity.Operation;

public interface IOperationService {
	List<Operation> retrieveAllOperation();
	Operation addOperation(Operation O);
	void deleteOperation(int id);
	Operation updateOperation(Operation o);
	Operation retrieveOperation(int id);


}
