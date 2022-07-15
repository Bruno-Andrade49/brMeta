package com.bruno.projetos.reactjava.dsmeta.brMeta.services;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.bruno.projetos.reactjava.dsmeta.brMeta.entities.Sale;
import com.bruno.projetos.reactjava.dsmeta.brMeta.repositories.SaleRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository saleRepository;
	
	public Page<Sale> findSales(String minDate, String maxDate, Pageable pageable) {
		
			LocalDate hoje = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());
		
			LocalDate min = minDate.equals("") ? hoje.minusDays(365) : LocalDate.parse(minDate);
			LocalDate max = maxDate.equals("") ? hoje : LocalDate.parse(maxDate);
		
		
		return saleRepository.findSales(min, max, pageable);
	}

}
