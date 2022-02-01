module com.moduleB {
	requires spring.web;
	requires com.moduleA;
    exports com.ModuleB.Service;
    exports com.ModuleB.controller;
}