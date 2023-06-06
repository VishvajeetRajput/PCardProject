package com.PCard.service;

import java.util.*;
import java.util.List;

import com.PCard.entity.CardValidate;

public interface CardValidateService {

	Map<String, Object> saveCardValidate(String response);

	List<CardValidate> findAll();

}
