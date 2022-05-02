package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm")
public class BsmController {

	@GetMapping
	public String bsm() {
		return "\nResponsabilidade pessoal\r\nMentalidade de crescimento\r\nOrientação ao futuro\r\nPersistência\r\nComunicação\r\nAtenção para detalhes\r\nTrabalho em equipe\r\nProatividade\r\n";
	}
}
