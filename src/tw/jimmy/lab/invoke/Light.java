/**
 * Project Name:MethodInvokeLab
 * File Name:Light.java
 * Package Name:tw.com.studio.jimmy.lab
 * Date:2015年8月18日下午3:10:24
 * Copyright (c) 2015, jim@sinopac.com All Rights Reserved.
 */

package tw.jimmy.lab.invoke;

/**
 * ClassName:Light Function: TODO ADD FUNCTION. Reason: TODO ADD REASON. Date:
 * 2015年8月18日 下午3:10:24
 * 
 * @author Jimmy
 * @version
 * @since JDK 1.7
 * @see
 */
public class Light {
	String description;
	public Light(){
		
	}
	
	public Light(String description){
		this.description = description;
	}

	public void on() {
		System.out.println(description + " light is on");
	}

	public void off() {
		System.out.println(description + " light is off");
	}

}
