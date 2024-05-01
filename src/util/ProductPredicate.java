package util;

import java.util.function.Predicate;

import entities.Product;

//PREDICATE Implementacao da interface
public class ProductPredicate implements Predicate<Product>{

	@Override
	public boolean test(Product p) {
		return p.getPrice() >= 100.00;
	}
	
}
