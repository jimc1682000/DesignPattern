/**
 * Project Name:DecoratorPatternLab
 * File Name:InputTest.java
 * Package Name:tw.com.studio.jimmy.lab
 * Date:2015年8月18日上午10:18:13
 * Copyright (c) 2015, jim@sinopac.com All Rights Reserved.
 */

package tw.jimmy.lab.decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * ClassName:InputTest Function: TODO ADD FUNCTION. Reason: TODO ADD REASON.
 * Date: 2015年8月18日 上午10:18:13
 * 
 * @author Jimmy
 * @version
 * @since JDK 1.7
 * @see
 */
public class InputTest {
	public static void main(String[] args) throws IOException {
		int c;
		try{
			FileInputStream fis = new FileInputStream("D:/test.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);
			
			InputStream in = new LowerCaseInputStream(bis);
			
			while((c = in.read()) >= 0){
				System.out.print((char)c);
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
