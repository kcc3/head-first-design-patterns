package factory.pizzaIngredients;

public interface PizzaIngredientFactory {
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperonic createPepperoni();
	public Clams createClam();
}
