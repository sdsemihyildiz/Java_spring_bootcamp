package kodlama.io.Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {
	private LanguageService languageService;

	@Autowired
	public LanguagesController(LanguageService languageService) {
		this.languageService = languageService;
	}

	@PostMapping("/add")
	public void add(ProgrammingLanguage pLanguage) {
		this.languageService.add(pLanguage);
	}

	@PostMapping("/delete")
	public void delete(ProgrammingLanguage pLanguage) {
		this.languageService.delete(pLanguage);
	}

	@PostMapping("/update")
	public void update(ProgrammingLanguage pLanguage) {
		this.languageService.update(pLanguage);
	}

	@GetMapping("/getall")
	public List<ProgrammingLanguage> getAll(int plID) {
		return this.languageService.getAll();

	}

	@GetMapping("/getbyid")
	public ProgrammingLanguage getByID(int plID) {
		return this.languageService.getByID(plID);

	}
}
