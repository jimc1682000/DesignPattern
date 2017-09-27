/**
 * Project Name:ConverterLab
 * File Name:TurkeyAdapter.java
 * Package Name:tw.com.studio.jimmy.lab
 * Date:2015�~8��18��U��5:10:59
 * Copyright (c) 2015, jim@sinopac.com All Rights Reserved.
 */

package tw.jimmy.lab.converter;

/**
 * ClassName:TurkeyAdapter Function: TODO ADD FUNCTION. Reason: TODO ADD REASON.
 * Date: 2015�~8��18�� �U��5:10:59
 * 
 * @author Jimmy
 * @version
 * @since JDK 1.7
 * @see
 */
public class TurkeyAdapter implements Duck {
	Turkey turkey;

	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}

	@Override
	public void quack() {
		turkey.gobble();
	}

	@Override
	public void fly() {
		for (int i = 0; i < 5; i++) {
			turkey.fly();
		}
	}

}
