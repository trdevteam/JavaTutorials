package DesignPatterns.Behavioral.Interpreter;

public interface Expression {
	 
    String interpret(InterpreterContext ic);
    
}