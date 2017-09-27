/**
 * Project Name:ConverterLab
 * File Name:EnumerationIterator.java
 * Package Name:tw.com.studio.jimmy.lab
 * Date:2015年8月18日下午5:32:03
 * Copyright (c) 2015, jim@sinopac.com All Rights Reserved.
*/

package tw.jimmy.lab.converter;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * ClassName:EnumerationIterator
 * Function: TODO ADD FUNCTION.
 * Reason:	 TODO ADD REASON.
 * Date:     2015年8月18日 下午5:32:03
 * @author   Jimmy
 * @version  
 * @param <E>
 * @since    JDK 1.7
 * @see 	 
 */
public class EnumerationIterator<E> implements Iterator<E> {
	Enumeration<E> eee;
	
	@Override
	public boolean hasNext() {
		return eee.hasMoreElements();
	}

	@Override
	public E next() {
		return eee.nextElement();
	}

	@Override
	public void remove(){
		throw new UnsupportedOperationException();
	}
	
}
