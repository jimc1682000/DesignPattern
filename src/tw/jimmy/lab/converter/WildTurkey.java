/**
 * Project Name:ConverterLab
 * File Name:WildTurkey.java
 * Package Name:tw.com.studio.jimmy.lab
 * Date:2015年8月18日下午4:42:35
 * Copyright (c) 2015, jim@sinopac.com All Rights Reserved.
*/

package tw.jimmy.lab.converter;
/**
 * ClassName:WildTurkey
 * Function: TODO ADD FUNCTION.
 * Reason:	 TODO ADD REASON.
 * Date:     2015年8月18日 下午4:42:35
 * @author   Jimmy
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class WildTurkey implements Turkey {

	@Override
	public void gobble() {
		System.out.println("Gobble gobble");
	}

	@Override
	public void fly() {
		System.out.println("I'm flying a short distance");
	}

}
