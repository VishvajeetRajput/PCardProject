package com.PCard.service;

import java.util.List;
import java.util.Map;

import com.PCard.entity.CardKycEvents;

public interface CardKycEventsService {

	Map<String, Object> saveCardKycEvents(String response);

	List<CardKycEvents> findAll();

}
