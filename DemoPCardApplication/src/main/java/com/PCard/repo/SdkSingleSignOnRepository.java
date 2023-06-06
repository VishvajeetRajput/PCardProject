package com.PCard.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.PCard.entity.SdkSingleSignOn;

@Repository
public interface SdkSingleSignOnRepository extends JpaRepository<SdkSingleSignOn, Long> {

}
