package com.prabha.techno.controller;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.prabha.techno.entity.CurrencyExchange;
import com.prabha.techno.repository.CurrencyExchangeRepository;

@RestController
public class CurrencyExchangeController {
	
	private Logger logger=LoggerFactory.getLogger(CurrencyExchangeController.class);
	
	@Autowired
	private Environment environment;
	
	@Autowired
	private CurrencyExchangeRepository exchangeRepository;
		
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyExchange retrieveExchangeValue(
			@PathVariable String from,
			@PathVariable String to) {
//		CurrencyExchange exchange=new CurrencyExchange(1000L, from, to, 
//				BigDecimal.valueOf(50));
		
		logger.info("retrieveExchangeValue called with {} to {}",from,to);
		CurrencyExchange  exchange=exchangeRepository.findByFromAndTo(from, to);
		
		if(exchange==null) {
			throw new RuntimeException("unable to find data for "+from+" to"+" to");
		}
		String port=environment.getProperty("local.server.port");
		exchange.setEnvironment(port);
		
		return exchange;
		
	}
	
}