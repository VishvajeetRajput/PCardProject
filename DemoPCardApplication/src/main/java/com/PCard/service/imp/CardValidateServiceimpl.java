package com.PCard.service.imp;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PCard.entity.CardValidate;
import com.PCard.repo.CardValidateRepository;
import com.PCard.service.CardValidateService;
import com.google.gson.Gson;

@Service
public class CardValidateServiceimpl implements CardValidateService {

	@Autowired
	private CardValidateRepository cardValidateRepository;

	@Override
	public Map<String, Object> saveCardValidate(String response) {

		Map<String, Object> map = new HashMap<String, Object>();

		Gson gson = new Gson();
		CardValidate CardValidateReq = gson.fromJson(response, CardValidate.class);

		Date date = new Date();
		Timestamp timestamp = new Timestamp(date.getTime());

		@SuppressWarnings("unused")
		CardValidate cardValidate = cardValidateRepository
				.save(new CardValidate(CardValidateReq.getEventId(), CardValidateReq.getTxnId(),
						CardValidateReq.getAmount(), CardValidateReq.getCardId(), timestamp, response));

		map.put("approveTxn", true);
		return map;
	}

	@Override
	public List<CardValidate> findAll() {
		return cardValidateRepository.findAll();
	}

}
