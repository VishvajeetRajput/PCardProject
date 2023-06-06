package com.PCard.controller;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.PCard.entity.CardKycEvents;
import com.PCard.service.CardKycEventsService;

@RestController
public class CardKycEventsController {

	@Autowired
	private CardKycEventsService CardKycEventsService;

	@PostMapping("/cardKycEvents")
	public Map<String, Object> saveCardKycEvents(@RequestBody String request) {
		return CardKycEventsService.saveCardKycEvents(request);
	}

	@GetMapping("/findAllCardKycEvents")
	public List<CardKycEvents> findAllCardKycEvents() {
		return CardKycEventsService.findAll();
	}

}
