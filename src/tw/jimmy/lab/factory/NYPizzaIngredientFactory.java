/**
 * Project Name:FactoryPatternLab
 * File Name:NYPizzaIngredientFactory.java
 * Package Name:tw.com.studio.jimmy.lab
 * Date:2015年8月18日上午11:34:12
 * Copyright (c) 2015, jim@sinopac.com All Rights Reserved.
 */

package tw.jimmy.lab.factory;

/**
 * ClassName:NYPizzaIngredientFactory Function: TODO ADD FUNCTION. Reason: TODO
 * ADD REASON. Date: 2015年8月18日 上午11:34:12
 * 
 * @author Jimmy
 * @version
 * @since JDK 1.7
 * @see
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		System.out.println("NY factory creating Dough...");
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		System.out.println("NY factory creating Sauce...");
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		System.out.println("NY factory creating Cheese...");
		return new RiggianoCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		System.out.println("NY factory creating Veggies...");
		Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(),
				new RedPeper() };
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		System.out.println("NY factory creating Pepperoni...");
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClam() {
		System.out.println("NY factory creating Clams...");
		return new FreshClams();
	}
}
