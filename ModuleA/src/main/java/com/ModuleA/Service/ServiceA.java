package com.ModuleA.Service;

import com.ModuleA.model.ModuleA;

//every exposed class should be final to prevent a override in another module
public final class ServiceA {
	public static String getModuleBsValue() {
		return ModuleA.getModuleAValue();
	}
}
