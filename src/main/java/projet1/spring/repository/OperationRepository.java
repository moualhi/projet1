package projet1.spring.repository;



import org.springframework.data.repository.CrudRepository;

import projet1.spring.entity.Operation;



public interface OperationRepository extends CrudRepository<Operation,Integer> {

}
