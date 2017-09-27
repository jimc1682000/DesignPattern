/**
 * Project Name:MethodInvokeLab
 * File Name:RemoteLoadWithUndo.java
 * Package Name:tw.com.studio.jimmy.lab
 * Date:2015年8月18日下午4:04:44
 * Copyright (c) 2015, jim@sinopac.com All Rights Reserved.
*/

package tw.jimmy.lab.invoke;
/**
 * ClassName:RemoteLoadWithUndo
 * Function: TODO ADD FUNCTION.
 * Reason:	 TODO ADD REASON.
 * Date:     2015年8月18日 下午4:04:44
 * @author   Jimmy
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class RemoteLoadWithUndo {
	public static void main(String[] args){
		RemoteControlWithUndo rc = new RemoteControlWithUndo();
		Light livingRoomLight = new Light("Living room");
		Light kitchenLight = new Light("Kitchen");
		
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		
		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
		
		rc.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		rc.setCommand(1, kitchenLightOn, kitchenLightOff);
		
		System.out.println(rc);
		
		rc.onButtonWasPushed(0);
		rc.offButtonWasPushed(0);
		System.out.println(rc);
		rc.undoButtonWasPushed();
		rc.onButtonWasPushed(1);
		rc.undoButtonWasPushed();
		System.out.println(rc);
	}
}
