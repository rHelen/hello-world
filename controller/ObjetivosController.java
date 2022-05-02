package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class ObjetivosController {
	
	@GetMapping
	public String bsm() {
		return "Objetivos de aprendizagem:\n1-Atualizar as atividades da plataforma\n2-Assistir a todos os vídeos disponíveis na plataforma\n3-Pesquisar sobre Spring boot e praticar";
	}
}
