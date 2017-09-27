/**
 * Project Name:FacadeLab
 * File Name:Amplifier.java
 * Package Name:tw.com.studio.jimmy.lab
 * Date:2015年8月18日下午5:49:16
 * Copyright (c) 2015, jim@sinopac.com All Rights Reserved.
*/

package tw.jimmy.lab.facade;
/**
 * ClassName:Amplifier
 * Function: TODO ADD FUNCTION.
 * Reason:	 TODO ADD REASON.
 * Date:     2015年8月18日 下午5:49:16
 * @author   Jimmy
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class Amplifier {

	public void on() {
		System.out.println("Amp On");
	}

	public void setDvd(DvdPlayer dvd) {
		System.out.println("Amp setting " + dvd.getDvdPlayerName() + "DVD Player");
	}

	public void setSurroundSound() {
		System.out.println("Amp Surrund Sound on");
	}

	public void setVolume(int i) {
		System.out.println("Amp volume to " + i);
	}

	public void off() {
		System.out.println("Amp off");
	}

}
