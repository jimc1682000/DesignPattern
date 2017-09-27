/**
 * Project Name:FactoryPatternLab
 * File Name:PizzaStore.java
 * Package Name:tw.com.studio.jimmy.lab
 * Date:2015年8月18日上午10:35:17
 * Copyright (c) 2015, jim@sinopac.com All Rights Reserved.
 */

package tw.jimmy.lab.factory;

/**
 * ClassName:PizzaStore Function: TODO ADD FUNCTION. Reason: TODO ADD REASON.
 * Date: 2015年8月18日 上午10:35:17
 * 
 * @author Jimmy
 * @version
 * @since JDK 1.7
 * @see
 */
public abstract class PizzaStore {
	SimplePizzaFactory factory;

	// public PizzaStore(SimplePizzaFactory factory){
	// this.factory = factory;
	// }

	public Pizza orderPizza() {
		Pizza pizza = new NYStyleCheesePizza();

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}

	public Pizza orderPizza(String type) {
		Pizza pizza;

		// pizza = factory.createPizza(type);
		pizza = createPizza(type);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}

	abstract Pizza createPizza(String type);
}
