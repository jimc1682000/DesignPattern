/**
 * Project Name:MethodInvokeLab
 * File Name:CeilingFan.java
 * Package Name:tw.com.studio.jimmy.lab
 * Date:2015年8月18日下午4:08:15
 * Copyright (c) 2015, jim@sinopac.com All Rights Reserved.
*/

package tw.jimmy.lab.invoke;
/**
 * ClassName:CeilingFan
 * Function: TODO ADD FUNCTION.
 * Reason:	 TODO ADD REASON.
 * Date:     2015年8月18日 下午4:08:15
 * @author   Jimmy
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class CeilingFan {
	public static final int HIGH = 3;
	public static final int MEDIUM = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;
	String location;
	int speed;
	
	public CeilingFan(String location){
		this.location = location;
		speed = OFF;
	}
	
	public void high(){
		speed = HIGH;
		// high speed
	}
	
	public void medium(){
		speed = MEDIUM;
		// medium speed
	}
	
	public void low(){
		speed = LOW;
		// low speed
	}
	
	public void off(){
		speed = OFF;
		// off
	}
	
	public int getSpeed(){
		return speed;
	}
}
