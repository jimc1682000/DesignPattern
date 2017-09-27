/**
 * Project Name:FacadeLab
 * File Name:HomeTheaterTestDrive.java
 * Package Name:tw.com.studio.jimmy.lab
 * Date:2015年8月18日下午6:22:26
 * Copyright (c) 2015, jim@sinopac.com All Rights Reserved.
*/

package tw.jimmy.lab.facade;
/**
 * ClassName:HomeTheaterTestDrive
 * Function: TODO ADD FUNCTION.
 * Reason:	 TODO ADD REASON.
 * Date:     2015年8月18日 下午6:22:26
 * @author   Jimmy
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class HomeTheaterTestDrive {

	public static void main(String[] args) {
		// instantiate components here
		HomeTheaterFacade homeTheater = new HomeTheaterFacade();
		homeTheater.watchMovie("<Breaking Bad>");
		homeTheater.endMovie();
	}

}
