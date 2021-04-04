package factory.pizza;

public class NYStyleVeggiePizza extends Pizza {
	public NYStyleVeggiePizza() {
		name = "NY Style Veggie Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Veggie Tomato Sauce";
		
		toppings.add("Grated Reggiano Cheese");
		toppings.add("Garlic");
		toppings.add("Onion");
		toppings.add("Mushroom");
		toppings.add("Red Pepper");
	}
}
