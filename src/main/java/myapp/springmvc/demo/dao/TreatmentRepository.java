package myapp.springmvc.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import myapp.springmvc.demo.entity.Treatment;

@RepositoryRestResource(collectionResourceRel = "treatment", path = "treatment")
public interface TreatmentRepository extends JpaRepository<Treatment, Long> {
	// List<Treatment> findByName(@RequestParam("name") String name, Model
	// theModel);

//	@Query("Select * from virus a left join treatment b where a.treatment_id=3")
//	String findByJoin();
}
