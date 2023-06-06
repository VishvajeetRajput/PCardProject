package com.PCard.service;

import java.util.List;
import java.util.Map;

import com.PCard.entity.CardWebhook;

public interface CardWebhookService {

	Map<String, Object> saveCardWebhook(String response);

	List<CardWebhook> findAll();

}
