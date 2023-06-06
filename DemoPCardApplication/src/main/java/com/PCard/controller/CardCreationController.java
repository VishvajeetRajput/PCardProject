package com.PCard.controller;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.PCard.entity.CardCreation;
import com.PCard.service.CardCreationService;

@RestController
public class CardCreationController {

	@Autowired
	private CardCreationService cardCreationService;

	@PostMapping("/cardCreation")
	public Map<String, Object> saveCardCreation(@RequestBody String request) {
		return cardCreationService.saveCardCreation(request);
	}

	@GetMapping("/findAllCardCreation")
	public List<CardCreation> findAllCardCreation() {
		return cardCreationService.findAll();
	}
	
}
