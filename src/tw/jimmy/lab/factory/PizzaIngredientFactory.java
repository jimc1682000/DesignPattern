/**
 * Project Name:FactoryPatternLab
 * File Name:PizzaIngredientFactory.java
 * Package Name:tw.com.studio.jimmy.lab
 * Date:2015年8月18日上午11:32:51
 * Copyright (c) 2015, jim@sinopac.com All Rights Reserved.
*/

package tw.jimmy.lab.factory;
/**
 * ClassName:PizzaIngredientFactory
 * Function: TODO ADD FUNCTION.
 * Reason:	 TODO ADD REASON.
 * Date:     2015年8月18日 上午11:32:51
 * @author   Jimmy
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public interface PizzaIngredientFactory {
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
}
