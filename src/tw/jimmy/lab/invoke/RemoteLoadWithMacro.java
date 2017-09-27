/**
 * Project Name:MethodInvokeLab
 * File Name:RemoteControlWithMacro.java
 * Package Name:tw.com.studio.jimmy.lab
 * Date:2015年8月18日下午4:27:20
 * Copyright (c) 2015, jim@sinopac.com All Rights Reserved.
 */

package tw.jimmy.lab.invoke;

/**
 * ClassName:RemoteControlWithMacro Function: TODO ADD FUNCTION. Reason: TODO
 * ADD REASON. Date: 2015年8月18日 下午4:27:20
 * 
 * @author Jimmy
 * @version
 * @since JDK 1.7
 * @see
 */
public class RemoteLoadWithMacro {
	public static void main(String[] args) {
		RemoteControlWithUndo rc = new RemoteControlWithUndo();
		Light livingRoomLight = new Light("Living room");
		Light kitchenLight = new Light("Kitchen");

		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(
				livingRoomLight);

		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

		Command[] partyOn = { livingRoomLightOn, kitchenLightOn };
		Command[] partyOff = { livingRoomLightOff, kitchenLightOff };
		MacroCommand partyOnMarco = new MacroCommand(partyOn);
		MacroCommand partyOffMacro = new MacroCommand(partyOff);
		
		rc.setCommand(0, partyOnMarco, partyOffMacro);
		
		rc.onButtonWasPushed(0);
		rc.offButtonWasPushed(0);
	}
}
