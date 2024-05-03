package edu.iu.habahram.pizzashop.model;

public class NewYorkPizzaIngridientFactory
        implements PizzaIngredientFactory
{

    public Dough createDough() {
        return new ThickCrustDough();
    }

    public Sauce createSauce() {
        return new Marinara();
    }

    public Cheese createCheese() {
        //add the garlic
        return new Regianno();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = { new Garlic(),
                new Mushrooms(),
                new RedPeppers(),
                new Onions()};
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClam() {
        return new FrozenClams();
    }
}
