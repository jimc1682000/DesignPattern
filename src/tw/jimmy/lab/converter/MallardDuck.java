/**
 * Project Name:ConverterLab
 * File Name:MallardDuck.java
 * Package Name:tw.com.studio.jimmy.lab
 * Date:2015年8月18日下午4:41:04
 * Copyright (c) 2015, jim@sinopac.com All Rights Reserved.
*/

package tw.jimmy.lab.converter;
/**
 * ClassName:MallardDuck
 * Function: TODO ADD FUNCTION.
 * Reason:	 TODO ADD REASON.
 * Date:     2015年8月18日 下午4:41:04
 * @author   Jimmy
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class MallardDuck implements Duck {

	@Override
	public void quack() {
		System.out.println("Quack");
	}

	@Override
	public void fly() {
		System.out.println("I'm flying");
	}

}
