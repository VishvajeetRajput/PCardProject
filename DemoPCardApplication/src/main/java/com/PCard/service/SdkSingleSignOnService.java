package com.PCard.service;

import java.util.List;
import java.util.Map;

import com.PCard.entity.SdkSingleSignOn;

public interface SdkSingleSignOnService {

	Map<String, Object> saveSdkSingleSign(String response);

	List<SdkSingleSignOn> findAll();
}
