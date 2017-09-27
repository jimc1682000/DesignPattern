/**
 * Project Name:MethodInvokeLab
 * File Name:LightOffCommand.java
 * Package Name:tw.com.studio.jimmy.lab
 * Date:2015年8月18日下午3:44:05
 * Copyright (c) 2015, jim@sinopac.com All Rights Reserved.
 */

package tw.jimmy.lab.invoke;

/**
 * ClassName:LightOffCommand Function: TODO ADD FUNCTION. Reason: TODO ADD
 * REASON. Date: 2015年8月18日 下午3:44:05
 * 
 * @author Jimmy
 * @version
 * @since JDK 1.7
 * @see
 */
public class LightOffCommand implements Command {
	Light light;

	public LightOffCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.off();
	}

	@Override
	public void undo() {
		light.on();
	}

}
