package com.bruno.projetos.reactjava.dsmeta.brMeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bruno.projetos.reactjava.dsmeta.brMeta.entities.Sale;
import com.bruno.projetos.reactjava.dsmeta.brMeta.repositories.SaleRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository saleRepository;
	
	public List<Sale> findSales() {
		return saleRepository.findAll();
	}

}
