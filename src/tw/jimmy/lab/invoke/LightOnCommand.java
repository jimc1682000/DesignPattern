/**
 * Project Name:MethodInvokeLab
 * File Name:LightOnCommand.java
 * Package Name:tw.com.studio.jimmy.lab
 * Date:2015年8月18日下午3:09:07
 * Copyright (c) 2015, jim@sinopac.com All Rights Reserved.
*/

package tw.jimmy.lab.invoke;
/**
 * ClassName:LightOnCommand
 * Function: TODO ADD FUNCTION.
 * Reason:	 TODO ADD REASON.
 * Date:     2015年8月18日 下午3:09:07
 * @author   Jimmy
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class LightOnCommand implements Command {
	Light light;
	
	public LightOnCommand(Light light){
		this.light = light;
	}

	@Override
	public void execute() {
		light.on();
	}

	@Override
	public void undo() {
		light.off();
	}
}
