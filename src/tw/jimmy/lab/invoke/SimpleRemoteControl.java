/**
 * Project Name:MethodInvokeLab
 * File Name:SimpleRemoteControl.java
 * Package Name:tw.com.studio.jimmy.lab
 * Date:2015年8月18日下午3:10:50
 * Copyright (c) 2015, jim@sinopac.com All Rights Reserved.
 */

package tw.jimmy.lab.invoke;

/**
 * ClassName:SimpleRemoteControl Function: TODO ADD FUNCTION. Reason: TODO ADD
 * REASON. Date: 2015年8月18日 下午3:10:50
 * 
 * @author Jimmy
 * @version
 * @since JDK 1.7
 * @see
 */
public class SimpleRemoteControl {
	Command slot;

	public SimpleRemoteControl() {

	}

	public void setCommand(Command command) {
		slot = command;
	}

	public void buttonWasPressed() {
		slot.execute();
	}
}
