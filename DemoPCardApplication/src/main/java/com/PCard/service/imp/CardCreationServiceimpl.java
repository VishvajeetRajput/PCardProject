package com.PCard.service.imp;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.PCard.entity.CardCreation;
import com.PCard.repo.CardCreationRepository;
import com.PCard.service.CardCreationService;
import com.google.gson.Gson;

@Service
public class CardCreationServiceimpl implements CardCreationService {

	@Autowired
	private CardCreationRepository cardCreationRepository;

	@Override
	public Map<String, Object> saveCardCreation(String response) {

		Gson gson = new Gson();
		CardCreation cardCreationReq = gson.fromJson(response, CardCreation.class);

		Date date = new Date();
		Timestamp timestamp = new Timestamp(date.getTime());

		Map<String, Object> map = new HashMap<String, Object>();
		@SuppressWarnings("unused")
		CardCreation cardCreation = cardCreationRepository.save(
				new CardCreation(cardCreationReq.getEventId(), cardCreationReq.getTxnId(), cardCreationReq.getAmount(),
						cardCreationReq.getCardId(), timestamp, response, cardCreationReq.getTxnStatus()));
		return map;
	}

	@Override
	public List<CardCreation> findAll() {
		return cardCreationRepository.findAll();
	}
}
