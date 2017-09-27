/**
 * Project Name:SingletonPatternLab
 * File Name:ClassLoaderLab.java
 * Package Name:tw.com.studio.jimmy.lab
 * Date:2015年8月18日下午2:46:09
 * Copyright (c) 2015, jim@sinopac.com All Rights Reserved.
*/

package tw.jimmy.lab.singleton;

import java.net.URL;

/**
 * ClassName:ClassLoaderLab
 * Function: TODO ADD FUNCTION.
 * Reason:	 TODO ADD REASON.
 * Date:     2015年8月18日 下午2:46:09
 * @author   Jimmy
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class ClassLoaderLab {
	public static void main(String[] args){
		URL[] urls = sun.misc.Launcher.getBootstrapClassPath().getURLs();
		for (int i = 0; i < urls.length; i++) {
			System.out.println(urls[i].toExternalForm());
		}
	}
}
