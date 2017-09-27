/**
 * Project Name:ConverterLab
 * File Name:DuckAdapter.java
 * Package Name:tw.com.studio.jimmy.lab
 * Date:2015年8月18日下午5:16:42
 * Copyright (c) 2015, jim@sinopac.com All Rights Reserved.
 */

package tw.jimmy.lab.converter;

/**
 * ClassName:DuckAdapter Function: TODO ADD FUNCTION. Reason: TODO ADD REASON.
 * Date: 2015年8月18日 下午5:16:42
 * 
 * @author Jimmy
 * @version
 * @since JDK 1.7
 * @see
 */
public class DuckAdapter implements Turkey {
	Duck duck;
	
	public DuckAdapter(Duck duck){
		this.duck = duck;
	}

	@Override
	public void gobble() {
		for (int i = 0; i < 5; i++) {
			duck.quack();
		}
	}

	@Override
	public void fly() {
		duck.fly();
	}

}
