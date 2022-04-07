package com.prabha.techno.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prabha.techno.entity.CurrencyExchange;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long> {
	
   CurrencyExchange	findByFromAndTo(String from,String to);

}
