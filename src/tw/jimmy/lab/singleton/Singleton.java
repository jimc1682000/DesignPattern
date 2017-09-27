/**
 * Project Name:SingletonPatternLab
 * File Name:Singleton.java
 * Package Name:tw.com.studio.jimmy.lab
 * Date:2015年8月18日下午2:19:10
 * Copyright (c) 2015, jim@sinopac.com All Rights Reserved.
 */

package tw.jimmy.lab.singleton;

/**
 * ClassName:Singleton Function: TODO ADD FUNCTION. Reason: TODO ADD REASON.
 * Date: 2015年8月18日 下午2:19:10
 * 
 * @author Jimmy
 * @version
 * @since JDK 1.7
 * @see
 */
public class Singleton {
	private volatile static Singleton uniqueInstance;

	// other useful instance variables here
	private Singleton() {
	}

	public static synchronized Singleton getInstance() {
		if (uniqueInstance == null) {
			synchronized (Singleton.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new Singleton();
				}
			}
		}
		return uniqueInstance;
	}
	// other useful methods here
}
