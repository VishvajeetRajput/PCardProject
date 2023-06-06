package com.PCard.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.PCard.entity.CardValidate;

@Repository
public interface CardValidateRepository extends JpaRepository<CardValidate, Long> {

}
