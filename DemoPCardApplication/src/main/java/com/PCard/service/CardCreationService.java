package com.PCard.service;

import java.util.List;
import java.util.Map;

import com.PCard.entity.CardCreation;

public interface CardCreationService {

	Map<String, Object> saveCardCreation(String response);

	List<CardCreation> findAll();

}
