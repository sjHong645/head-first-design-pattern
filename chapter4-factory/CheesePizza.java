public class CheesePizza extends Pizza{

    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("준비 중:" + name);
        dough = ingredientFactory.createDough();
        cheese = ingredientFactory.createCheese(); 
        sauce = ingredientFactory.createSauce();

    }

}
