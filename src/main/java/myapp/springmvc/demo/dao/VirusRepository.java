package myapp.springmvc.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;

import myapp.springmvc.demo.entity.Virus;

public interface VirusRepository extends JpaRepository<Virus, Long> {

	public List<Virus> findByRisk(@RequestParam("risk") String risk);

	public List<Virus> findAll();

	// public List<Virus> findAllByOrderByNameAsc();

	public List<Virus> findByMortalityRateGreaterThanEqual(@RequestParam("mortalityRate") float mortalityRate);

}
