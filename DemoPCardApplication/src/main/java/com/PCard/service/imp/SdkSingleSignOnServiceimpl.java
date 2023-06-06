package com.PCard.service.imp;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PCard.entity.SdkSingleSignOn;
import com.PCard.repo.SdkSingleSignOnRepository;
import com.PCard.service.SdkSingleSignOnService;
import com.google.gson.Gson;

@Service
public class SdkSingleSignOnServiceimpl implements SdkSingleSignOnService {

	@Autowired
	private SdkSingleSignOnRepository sdkSingleSignOnRepository;

	@Override
	public Map<String, Object> saveSdkSingleSign(String response) {

		Gson gson = new Gson();
		SdkSingleSignOn SdkSingleSignreq = gson.fromJson(response, SdkSingleSignOn.class);

		Date date = new Date();
		Timestamp timestamp = new Timestamp(date.getTime());

		Map<String, Object> map = new HashMap<String, Object>();

		@SuppressWarnings("unused")
		SdkSingleSignOn SdkSingleSign = sdkSingleSignOnRepository
				.save(new SdkSingleSignOn(SdkSingleSignreq.getEventId(), SdkSingleSignreq.getMobile(), timestamp,
						SdkSingleSignreq.getSdkAuthToken()));

		map.put("success", true);
		
		return map;
	}

	@Override
	public List<com.PCard.entity.SdkSingleSignOn> findAll() {

		return sdkSingleSignOnRepository.findAll();
	}

}
