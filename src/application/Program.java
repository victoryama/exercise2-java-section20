package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 450.00));
		list.add(new Product("HD Case", 80.90));
		
		//Implementacao da interface
		//list.removeIf(new ProductPredicate());
		
		//Reference method com metodo estatico
		//list.removeIf(Product::staticProductPredicate); //referencia para metodo
		
		//PREDICATE Reference method com metodo nao estatico
		//list.removeIf(Product::nonStaticProductPredicate);
		
		//PREDICATE Expressao Lambda declarada
		//double min = 100.0;//permite valor parametrizado
		//Predicate<Product> pred = p -> p.getPrice() >= min;
		//list.removeIf(pred);
		
		//PREDICATE Expressao Lambda Inline
		double min = 100.0;
		list.removeIf(p -> p.getPrice() >= min);
		
		for (Product p : list) {
			System.out.println(p);
		}
		
	}

}
