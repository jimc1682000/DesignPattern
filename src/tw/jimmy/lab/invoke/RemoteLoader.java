/**
 * Project Name:MethodInvokeLab
 * File Name:RemoteLoader.java
 * Package Name:tw.com.studio.jimmy.lab
 * Date:2015年8月18日下午3:53:42
 * Copyright (c) 2015, jim@sinopac.com All Rights Reserved.
*/

package tw.jimmy.lab.invoke;
/**
 * ClassName:RemoteLoader
 * Function: TODO ADD FUNCTION.
 * Reason:	 TODO ADD REASON.
 * Date:     2015年8月18日 下午3:53:42
 * @author   Jimmy
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class RemoteLoader {
	public static void main(String[] args){
		RemoteControl rc = new RemoteControl();
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
		rc.onButtonWasPushed(1);
		rc.offButtonWasPushed(1);
		rc.onButtonWasPushed(2);
		rc.offButtonWasPushed(2);
		
	}
}
