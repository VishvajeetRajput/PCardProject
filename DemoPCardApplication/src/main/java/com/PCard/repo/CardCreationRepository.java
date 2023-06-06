package com.PCard.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.PCard.entity.CardCreation;

@Repository
public interface CardCreationRepository extends JpaRepository<CardCreation, Long> {

}
