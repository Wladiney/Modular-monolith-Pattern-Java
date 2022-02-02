package com.ModuleB.Service;

import com.ModuleB.model.ModuleB;

//every exposed class should be final to prevent a override in another module
public final class ServiceB {

	public static String getModuleBValue() {
		return ModuleB.getModel();
	}
}
