/**
 * Project Name:FactoryPatternLab
 * File Name:Pizza.java
 * Package Name:tw.com.studio.jimmy.lab
 * Date:2015年8月18日上午10:36:19
 * Copyright (c) 2015, jim@sinopac.com All Rights Reserved.
 */

package tw.jimmy.lab.factory;

import java.util.ArrayList;

/**
 * ClassName:Pizza Function: TODO ADD FUNCTION. Reason: TODO ADD REASON. Date:
 * 2015年8月18日 上午10:36:19
 * 
 * @author Jimmy
 * @version
 * @since JDK 1.7
 * @see
 */
public abstract class Pizza {
	String name;
	// String dough;
	// String sauce;
	Dough dough;
	Sauce sauce;
	Veggies veggies[];
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clam;
	ArrayList<String> toppings = new ArrayList<>();

	abstract void prepare();

	// public void prepare() {
	// System.out.println("Preparing " + name);
	// System.out.println("Tossing dough...");
	// System.out.println("Adding sauce...");
	// System.out.println("Adding toppings: ");
	// for (int i = 0; i < toppings.size(); i++) {
	// System.out.println("  " + toppings.get(i));
	// }
	// }

	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}

	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
