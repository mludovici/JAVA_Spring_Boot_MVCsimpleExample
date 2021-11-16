package myapp.springmvc.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myapp.springmvc.demo.dao.VirusRepository;
import myapp.springmvc.demo.entity.Virus;

@Service
public class VirusServiceImpl implements VirusService {

	private VirusRepository virusRepository;

	@Autowired
	public VirusServiceImpl(VirusRepository someVirusRepository) {
		virusRepository = someVirusRepository;
	}

	@Override
	public List<Virus> findAll() {
		return virusRepository.findAll();
	}
	
	@Override
	public List<Virus> findByRisk() {
		return virusRepository.findByRisk(null);
	}
}
