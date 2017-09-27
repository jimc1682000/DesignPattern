/**
 * Project Name:MethodInvokeLab
 * File Name:RemoteControlTest.java
 * Package Name:tw.com.studio.jimmy.lab
 * Date:2015年8月18日下午3:11:56
 * Copyright (c) 2015, jim@sinopac.com All Rights Reserved.
*/

package tw.jimmy.lab.invoke;
/**
 * ClassName:RemoteControlTest
 * Function: TODO ADD FUNCTION.
 * Reason:	 TODO ADD REASON.
 * Date:     2015年8月18日 下午3:11:56
 * @author   Jimmy
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class RemoteControlTest {
	public static void main(String[] args){
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		LightOnCommand lightOn = new LightOnCommand(light);
		LightOffCommand lightOff = new LightOffCommand(light);
		
		GarageDoor gd = new GarageDoor();
		GarageDoorOpenCommand gdOpen = new GarageDoorOpenCommand(gd);
		
		
		remote.setCommand(lightOn);
		remote.buttonWasPressed();
		
		remote.setCommand(gdOpen);
		remote.buttonWasPressed();
		
		RemoteControl rc = new RemoteControl();
		rc.setCommand(0, lightOn, lightOff);
		rc.offButtonWasPushed(0);
		
	}
}
