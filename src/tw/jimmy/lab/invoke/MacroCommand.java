/**
 * Project Name:MethodInvokeLab
 * File Name:MacroCommand.java
 * Package Name:tw.com.studio.jimmy.lab
 * Date:2015年8月18日下午4:22:11
 * Copyright (c) 2015, jim@sinopac.com All Rights Reserved.
*/

package tw.jimmy.lab.invoke;
/**
 * ClassName:MacroCommand
 * Function: TODO ADD FUNCTION.
 * Reason:	 TODO ADD REASON.
 * Date:     2015年8月18日 下午4:22:11
 * @author   Jimmy
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class MacroCommand implements Command {
	Command[] commands;
	public MacroCommand(Command[] commands){
		this.commands = commands;
	}
	
	@Override
	public void execute(){
		for(int i=0;i<commands.length;i++){
			commands[i].execute();
		}
	}

	@Override
	public void undo() {
		for(int i=0;i<commands.length;i++){
			commands[i].undo();
		}
	}

}
