package DesignPatterns.Structural.Decorator;

import java.util.HashMap;
import java.util.Map;

public interface Car {

	public Map<String,String> errors = new HashMap<>();
	
	public void assemble();
	
}