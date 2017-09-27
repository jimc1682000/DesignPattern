/**
 * Project Name:MethodInvokeLab
 * File Name:RemoteControl.java
 * Package Name:tw.com.studio.jimmy.lab
 * Date:2015年8月18日下午3:37:28
 * Copyright (c) 2015, jim@sinopac.com All Rights Reserved.
 */

package tw.jimmy.lab.invoke;

/**
 * ClassName:RemoteControl Function: TODO ADD FUNCTION. Reason: TODO ADD REASON.
 * Date: 2015年8月18日 下午3:37:28
 * 
 * @author Jimmy
 * @version
 * @since JDK 1.7
 * @see
 */
public class RemoteControl {
	Command[] onCommands;
	Command[] offCommands;

	public RemoteControl() {
		onCommands = new Command[7];
		offCommands = new Command[7];

		Command noCommand = new NoCommand();
		for (int i = 0; i < 7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}

	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}

	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
	}

	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
	}

	public String toString() {
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n------ Remote Control ------\n");
		for (int i = 0; i < onCommands.length; i++) {
			stringBuff.append("[slot " + i + "] "
					+ onCommands[i].getClass().getName() + "  "
					+ offCommands[i].getClass().getName() + "\n");
		}
		
		return stringBuff.toString();
	}
}
