/**
 * Project Name:FacadeLab
 * File Name:DvdPlayer.java
 * Package Name:tw.com.studio.jimmy.lab
 * Date:2015年8月18日下午5:49:28
 * Copyright (c) 2015, jim@sinopac.com All Rights Reserved.
*/

package tw.jimmy.lab.facade;
/**
 * ClassName:DvdPlayer
 * Function: TODO ADD FUNCTION.
 * Reason:	 TODO ADD REASON.
 * Date:     2015年8月18日 下午5:49:28
 * @author   Jimmy
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class DvdPlayer {
	public String getDvdPlayerName(){
		return "Top-O-Line";
	}
	public void on() {
		System.out.println("DVD Player on");
	}

	public void play(String movie) {
		System.out.println("DVD Player playing " + movie);
	}

	public void stop() {
		System.out.println("DVD Player stop");
	}

	public void eject() {
		System.out.println("DVD Player eject");
	}

	public void off() {
		System.out.println("DVD Player off");
	}

}
