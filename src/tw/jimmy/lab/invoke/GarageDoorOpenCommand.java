/**
 * Project Name:MethodInvokeLab
 * File Name:GarageDoorOpenCommand.java
 * Package Name:tw.com.studio.jimmy.lab
 * Date:2015年8月18日下午3:18:26
 * Copyright (c) 2015, jim@sinopac.com All Rights Reserved.
*/

package tw.jimmy.lab.invoke;
/**
 * ClassName:GarageDoorOpenCommand
 * Function: TODO ADD FUNCTION.
 * Reason:	 TODO ADD REASON.
 * Date:     2015年8月18日 下午3:18:26
 * @author   Jimmy
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class GarageDoorOpenCommand implements Command {
	GarageDoor gd;
	
	public GarageDoorOpenCommand(GarageDoor gd){
		this.gd = gd;
	}

	@Override
	public void execute() {
		gd.up();
	}

	@Override
	public void undo() {
		gd.down();
	}
}
