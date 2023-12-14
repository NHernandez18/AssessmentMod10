package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import dmacc.beans.Event;
import dmacc.repository.EventRepository;

/**
 * Nicholas Hernandez - NHernandez6
 * CIS175 - Fall 2023
 * Dec 13, 2023
 */
@Controller
public class WebController {
	@Autowired
	EventRepository repo;
	
	@GetMapping({ "/", "viewAll" })
	public String viewAllContacts(Model model) {
		if(repo.findAll().isEmpty()) {
			return addNewContact(model);
		}
		
		model.addAttribute("contacts", repo.findAll());
		return "results";
	}

	@GetMapping("/inputContact")
	public String addNewContact(Model model) {
		Event c = new Event();
		model.addAttribute("newContact", c);
		return "input";
	}

	@GetMapping("/edit/{id}")
	public String showUpdateContact(@PathVariable("id") long id, Model model) {
		Event c = repo.findById(id).orElse(null);
		System.out.println("ITEM TO EDIT: " + c.toString());
		model.addAttribute("newContact", c);
		return "input";
	}

	@PostMapping("/update/{id}")
	public String reviseContact(Event c, Model model) {
		repo.save(c);
		return viewAllContacts(model);
	}
	
	@GetMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") long id, Model model) {
		Event c = repo.findById(id).orElse(null);
	    repo.delete(c);
	    return viewAllContacts(model);
	}
}
