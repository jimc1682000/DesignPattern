/**
 * Project Name:SingletonPatternLab
 * File Name:ChocolateBoiler.java
 * Package Name:tw.com.studio.jimmy.lab
 * Date:2015年8月18日下午2:25:29
 * Copyright (c) 2015, jim@sinopac.com All Rights Reserved.
 */

package tw.jimmy.lab.singleton;

/**
 * ClassName:ChocolateBoiler Function: TODO ADD FUNCTION. Reason: TODO ADD
 * REASON. Date: 2015年8月18日 下午2:25:29
 * 
 * @author Jimmy
 * @version
 * @since JDK 1.7
 * @see
 */
public class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;
	private static ChocolateBoiler uniqChocolateBoiler = null;

	private ChocolateBoiler() {
		empty = true;
		boiled = false;
	}

	public static ChocolateBoiler getInstance(){
		if(uniqChocolateBoiler==null){
			uniqChocolateBoiler = new ChocolateBoiler();
		}
		return uniqChocolateBoiler;
	}
	public void fill() {
		if (isEmpty()) {
			empty = false;
			boiled = false;
			// 在鍋爐內填滿巧克力和牛奶的混合物
		}
	}

	public void drain() {
		if (!isEmpty() && isBoiled()) {
			// 排出煮沸的巧克力和牛奶
			empty = true;
		}
	}

	public void boil() {
		if (!isEmpty() && !isBoiled()) {
			// 將內容物煮沸
			boiled = true;
		}
	}

	public boolean isEmpty() {
		return empty;
	}

	public boolean isBoiled() {
		return boiled;
	}
}
