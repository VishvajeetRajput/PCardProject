package com.PCard.service.imp;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PCard.entity.CardWebhook;
import com.PCard.repo.CardWebhookRepository;
import com.google.gson.Gson;

@Service
public class CardWebhookServiceImpl implements com.PCard.service.CardWebhookService {

	@Autowired
	private CardWebhookRepository cardWebhookRepository;

	@Override
	public Map<String, Object> saveCardWebhook(String response) {
		Gson gson = new Gson();
		CardWebhook CardWebhookreq = gson.fromJson(response, CardWebhook.class);

		Date date = new Date();
		Timestamp timestamp = new Timestamp(date.getTime());

		Map<String, Object> map = new HashMap<String, Object>();

		@SuppressWarnings("unused")
		CardWebhook CardWebhook = cardWebhookRepository
				.save(new CardWebhook(CardWebhookreq.getCardId(), CardWebhookreq.getCardLast4Digits(),
						CardWebhookreq.getDocketNumber(), CardWebhookreq.getStatus(), timestamp));
		return map;
	}

	@Override
	public List<CardWebhook> findAll() {
		return cardWebhookRepository.findAll();
	}
}
