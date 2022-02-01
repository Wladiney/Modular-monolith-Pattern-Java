package com.ModuleB.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ModuleA.Service.ServiceA;
import com.ModuleB.Service.ServiceB;

@RestController
final class  ModuleBController {
	
	@RequestMapping(value = "/getModuleB", method = RequestMethod.GET)
	public String firstPage() {
		return ServiceB.getModuleBValue();
	}
	
	@RequestMapping(value = "/getModuleBS", method = RequestMethod.GET)
	public String firstPag2e() {
		return ServiceA.getModuleBsValue();
	}
}