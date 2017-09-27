/**
 * Project Name:FactoryPatternLab
 * File Name:Customer.java
 * Package Name:tw.com.studio.jimmy.lab
 * Date:2015年8月18日上午10:58:55
 * Copyright (c) 2015, jim@sinopac.com All Rights Reserved.
 */

package tw.jimmy.lab.factory;

/**
 * ClassName:Customer Function: TODO ADD FUNCTION. Reason: TODO ADD REASON.
 * Date: 2015年8月18日 上午10:58:55
 * 
 * @author Jimmy
 * @version
 * @since JDK 1.7
 * @see
 */
public class Customer {

	public static void main(String[] args) {
		PizzaStore nyPizzaStore = new NYStylePizzaStore();
		Pizza cp = nyPizzaStore.orderPizza("cheese");
		if (cp instanceof NYStyleCheesePizza) {
			System.out.println("It's NY Style Cheese Pizza!!");
		}
	}

}
