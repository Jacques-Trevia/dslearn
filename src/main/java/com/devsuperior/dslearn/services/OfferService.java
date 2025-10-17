package com.devsuperior.dslearn.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dslearn.repositories.OfferRepository;

@Service
public class OfferService {

	@Autowired
	private OfferRepository offerRepository;
	
}
