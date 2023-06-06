package com.PCard.controller;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.PCard.entity.SdkSingleSignOn;
import com.PCard.service.SdkSingleSignOnService;

@RestController
public class SdkSingleSignOnController {

	@Autowired
	private SdkSingleSignOnService sdkSingleSignOnService;

	@PostMapping("/sdkSingleSignOn")
	public Map<String, Object> saveSdkSingleSignOn(@RequestBody String request) {
		return sdkSingleSignOnService.saveSdkSingleSign(request);
	}

	@GetMapping("/findAllSdkSingleSignOn")
	public List<SdkSingleSignOn> findAllSdkSingleSignOn() {
		return sdkSingleSignOnService.findAll();
	}
}
