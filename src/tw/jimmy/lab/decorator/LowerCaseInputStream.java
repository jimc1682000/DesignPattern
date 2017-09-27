/**
 * Project Name:DecoratorPatternLab
 * File Name:LowerCaseInputStream.java
 * Package Name:tw.com.studio.jimmy.lab
 * Date:2015年8月18日上午10:14:39
 * Copyright (c) 2015, jim@sinopac.com All Rights Reserved.
*/

package tw.jimmy.lab.decorator;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * ClassName:LowerCaseInputStream
 * Function: TODO ADD FUNCTION.
 * Reason:	 TODO ADD REASON.
 * Date:     2015年8月18日 上午10:14:39
 * @author   Jimmy
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class LowerCaseInputStream extends FilterInputStream {
	public LowerCaseInputStream(InputStream in){
		super(in);
	}
	public int read() throws IOException{
		int c = super.read();
		return (c == -1 ? c: Character.toLowerCase((char)c));
	}
	public int read(byte[] b, int offset, int len) throws IOException{
		int result = super.read(b, offset, len);
		for(int i = offset; i<offset+result; i++){
			b[i] = (byte)Character.toLowerCase((char)b[i]);
		}
		return result;
	}
}
