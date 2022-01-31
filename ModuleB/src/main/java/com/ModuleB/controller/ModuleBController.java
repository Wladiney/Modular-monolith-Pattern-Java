package com.ModuleB.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ModuleB.model.ModuleB;

@RestController
public class ModuleBController {
	@RequestMapping(value = "/getModuleB", method = RequestMethod.GET)
	public String firstPage() {
		return ModuleB.getModuleBValue();
	}
}