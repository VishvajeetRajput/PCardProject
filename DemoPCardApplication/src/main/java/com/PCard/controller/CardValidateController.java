package com.PCard.controller;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.PCard.entity.CardValidate;
import com.PCard.service.CardValidateService;

@RestController
public class CardValidateController {

	@Autowired
	private CardValidateService cardValidateService;

	@PostMapping("/cardValidate")
	public Map<String, Object> saveCardValidate(@RequestBody String request) {
		return cardValidateService.saveCardValidate(request);
	}

	@GetMapping("/findAllCardValidate")
	public List<CardValidate> findAllCardValidate() {
		return cardValidateService.findAll();
	}
}
