/**
 * Project Name:FactoryPatternLab
 * File Name:CheesePizza.java
 * Package Name:tw.com.studio.jimmy.lab
 * Date:2015年8月18日上午10:41:03
 * Copyright (c) 2015, jim@sinopac.com All Rights Reserved.
 */

package tw.jimmy.lab.factory;

/**
 * ClassName:CheesePizza Function: TODO ADD FUNCTION. Reason: TODO ADD REASON.
 * Date: 2015年8月18日 上午10:41:03
 * 
 * @author Jimmy
 * @version
 * @since JDK 1.7
 * @see
 */
public class CheesePizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;

	public CheesePizza() {
		super();
	}

	public CheesePizza(PizzaIngredientFactory ingredientFactory) {
		super();
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
	}

}
