/**
 * Project Name:SingletonPatternLab
 * File Name:MyClass.java
 * Package Name:tw.com.studio.jimmy.lab
 * Date:2015年8月18日下午2:17:10
 * Copyright (c) 2015, jim@sinopac.com All Rights Reserved.
 */

package tw.jimmy.lab.singleton;

/**
 * ClassName:MyClass Function: TODO ADD FUNCTION. Reason: TODO ADD REASON. Date:
 * 2015年8月18日 下午2:17:10
 * 
 * @author Jimmy
 * @version
 * @since JDK 1.7
 * @see
 */
public class MyClass {
	private MyClass() {
	}

	public static MyClass getInstance() {
		return new MyClass();
	}
}
