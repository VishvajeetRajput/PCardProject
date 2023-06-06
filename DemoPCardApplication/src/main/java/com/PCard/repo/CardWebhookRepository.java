package com.PCard.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.PCard.entity.CardWebhook;

@Repository
public interface CardWebhookRepository extends JpaRepository<CardWebhook, Long> {

}
