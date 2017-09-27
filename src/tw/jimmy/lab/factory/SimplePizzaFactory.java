/**
 * Project Name:FactoryPatternLab
 * File Name:SimplePizzaFactory.java
 * Package Name:tw.com.studio.jimmy.lab
 * Date:2015年8月18日上午10:39:40
 * Copyright (c) 2015, jim@sinopac.com All Rights Reserved.
*/

package tw.jimmy.lab.factory;
/**
 * ClassName:SimplePizzaFactory
 * Function: TODO ADD FUNCTION.
 * Reason:	 TODO ADD REASON.
 * Date:     2015年8月18日 上午10:39:40
 * @author   Jimmy
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class SimplePizzaFactory {
	public Pizza createPizza(String type){
		Pizza pizza = null;
		
		if(type.equals("cheese")){
			pizza = new CheesePizza();
		}else if(type.equals("greek")){
			pizza = new GreekPizza();
		}else if(type.equals("pepperoni")){
			pizza = new PepperoniPizza();
		}else if(type.equals("clam")){
			pizza = new ClamPizza();
		}else if(type.equals("veggie")){
			pizza = new VeggiePizza();
		}
		return pizza;
	}
}
