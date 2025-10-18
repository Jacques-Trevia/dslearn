package com.devsuperior.dslearn.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslearn.services.ResourceService;

@RestController
@RequestMapping(value = "resources")
public class ResourceController {

	@Autowired
	private ResourceService resourceService;
}
