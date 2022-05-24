package projet1.spring.repository;



import org.springframework.data.repository.CrudRepository;

import projet1.spring.entity.Compte;




public interface CompteRepository extends CrudRepository<Compte,Integer> {

	

}
