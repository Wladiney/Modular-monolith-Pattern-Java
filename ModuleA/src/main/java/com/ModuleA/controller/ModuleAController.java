package com.ModuleA.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ModuleA.model.ModuleA;

@RestController
@RequestMapping("/moduleA")
final class ModuleAController {

	@RequestMapping(value = "/getModuleA", method = RequestMethod.GET)
	public String firstPage() {
		return ModuleA.getModuleAValue();
	}

}