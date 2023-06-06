package com.PCard.service.imp;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PCard.entity.CardKycEvents;
import com.PCard.repo.CardKycEventsRepository;
import com.PCard.service.CardKycEventsService;
import com.google.gson.Gson;

@Service
public class CardKycEventsServiceimpl implements CardKycEventsService {

	@Autowired
	private CardKycEventsRepository cardKycEventsRepository;

	@Override
	public Map<String, Object> saveCardKycEvents(String response) {

		Gson gson = new Gson();
		CardKycEvents cardKycEventsreq = gson.fromJson(response, CardKycEvents.class);
		Date date = new Date();
		Timestamp timestamp = new Timestamp(date.getTime());
		Map<String, Object> map = new HashMap<String, Object>();

		@SuppressWarnings("unused")
		CardKycEvents cardKycEvents = cardKycEventsRepository.save(new CardKycEvents(cardKycEventsreq.getCardholderId(),
				cardKycEventsreq.getKycType(), cardKycEventsreq.getIssuerCode(), cardKycEventsreq.getKycStatus(),
				cardKycEventsreq.getEventId(), cardKycEventsreq.getErrorCode(), cardKycEventsreq.getErrorMessage(),
				timestamp));
		return map;
	}

	@Override
	public List<CardKycEvents> findAll() {
		return cardKycEventsRepository.findAll();
	}

}
