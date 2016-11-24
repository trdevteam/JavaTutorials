package DesignPatterns.Behavioral.Visitor;

public interface ShoppingCartVisitor {

	int calculateTotalPrice(Book book);
	int calculateTotalPrice(Fruit fruit);
	
}