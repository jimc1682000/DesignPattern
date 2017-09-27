/**
 * Project Name:SingletonPatternLab
 * File Name:ChocolateBoiler.java
 * Package Name:tw.com.studio.jimmy.lab
 * Date:2015�~8��18��U��2:25:29
 * Copyright (c) 2015, jim@sinopac.com All Rights Reserved.
 */

package tw.jimmy.lab.singleton;

/**
 * ClassName:ChocolateBoiler Function: TODO ADD FUNCTION. Reason: TODO ADD
 * REASON. Date: 2015�~8��18�� �U��2:25:29
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
			// �b���l���񺡥��J�O�M�������V�X��
		}
	}

	public void drain() {
		if (!isEmpty() && isBoiled()) {
			// �ƥX�N�m�����J�O�M����
			empty = true;
		}
	}

	public void boil() {
		if (!isEmpty() && !isBoiled()) {
			// �N���e���N�m
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
