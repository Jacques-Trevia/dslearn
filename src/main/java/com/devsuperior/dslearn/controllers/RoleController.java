package com.devsuperior.dslearn.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslearn.services.RoleService;

@RestController
@RequestMapping(value = "roles")
public class RoleController {

	@Autowired
	private RoleService roleService;
}
