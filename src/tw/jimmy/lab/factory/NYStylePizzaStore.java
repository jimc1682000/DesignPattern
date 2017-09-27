/**
 * Project Name:FactoryPatternLab
 * File Name:NYStylePizzaStore.java
 * Package Name:tw.com.studio.jimmy.lab
 * Date:2015年8月18日上午10:51:07
 * Copyright (c) 2015, jim@sinopac.com All Rights Reserved.
 */

package tw.jimmy.lab.factory;

/**
 * ClassName:NYStylePizzaStore Function: TODO ADD FUNCTION. Reason: TODO ADD
 * REASON. Date: 2015年8月18日 上午10:51:07
 * 
 * @author Jimmy
 * @version
 * @since JDK 1.7
 * @see
 */
public class NYStylePizzaStore extends PizzaStore {
	
	@Override
	Pizza createPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
		if (type.equals("cheese")) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York Style Cheese Pizza");
		} else if (type.equals("greek")) {
			pizza = new NYStyleGreekPizza();
		} else if (type.equals("pepperoni")) {
			pizza = new NYStylePepperoniPizza();
		} else if (type.equals("clam")) {
			pizza = new NYStyleClamPizza();
		} else if (type.equals("veggie")) {
			pizza = new NYStyleVeggiePizza();
		}
		return pizza;
	}

}
