package myapp.springmvc.demo.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import myapp.springmvc.demo.entity.Virus;
import myapp.springmvc.demo.service.VirusService;

@Controller
@RequestMapping("/virus")
public class VirusController {

	private VirusService virusService;

	public VirusController(VirusService theVirusService) {
		virusService = theVirusService;
	}

	// add mapping for "/list"

	@GetMapping("/list")
	public String listVirus(Model theModel) {

		// get virus from db
		List<Virus> theVirus = virusService.findAll();

		// add to the spring model
		theModel.addAttribute("virus", theVirus);

		return "/virus/list-viruses";
	}

}
