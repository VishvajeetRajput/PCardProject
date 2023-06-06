package com.PCard.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.PCard.entity.CardKycEvents;

@Repository
public interface CardKycEventsRepository extends JpaRepository<CardKycEvents, Long> {

}
