/**
 * Project Name:FactoryPatternLab
 * File Name:NYStyleCheesePizza.java
 * Package Name:tw.com.studio.jimmy.lab
 * Date:2015年8月18日上午10:55:01
 * Copyright (c) 2015, jim@sinopac.com All Rights Reserved.
 */

package tw.jimmy.lab.factory;

/**
 * ClassName:NYStyleCheesePizza Function: TODO ADD FUNCTION. Reason: TODO ADD
 * REASON. Date: 2015年8月18日 上午10:55:01
 * 
 * @author Jimmy
 * @version
 * @since JDK 1.7
 * @see
 */
public class NYStyleCheesePizza extends Pizza {
	public NYStyleCheesePizza() {
		name = "NY Style Sauce and Cheese Pizza";

		toppings.add("Grated Reggiano Cheese");
	}

	@Override
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}

	@Override
	void prepare() {
		// TODO Auto-generated method stub
		
	}
}
