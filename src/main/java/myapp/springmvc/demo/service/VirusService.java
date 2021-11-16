package myapp.springmvc.demo.service;

import java.util.List;

import myapp.springmvc.demo.entity.Virus;

public interface VirusService {

	public List<Virus> findAll();

	public List<Virus> findByRisk();
}
