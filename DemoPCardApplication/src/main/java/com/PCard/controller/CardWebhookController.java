package com.PCard.controller;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.PCard.entity.CardWebhook;
import com.PCard.service.CardWebhookService;

@RestController
public class CardWebhookController {

	@Autowired
	private CardWebhookService cardWebhookService;

	@PostMapping("/cardWebhook")
	public Map<String, Object> saveCardWebhook(@RequestBody String request) {
		return cardWebhookService.saveCardWebhook(request);
	}

	@GetMapping("/findAllCardWebhook")
	public List<CardWebhook> findAllCardWebhook() {
		return cardWebhookService.findAll();
	}
}
