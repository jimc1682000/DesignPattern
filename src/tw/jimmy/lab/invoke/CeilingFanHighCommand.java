/**
 * Project Name:MethodInvokeLab
 * File Name:CeilingFanHighCommand.java
 * Package Name:tw.com.studio.jimmy.lab
 * Date:2015年8月18日下午4:12:47
 * Copyright (c) 2015, jim@sinopac.com All Rights Reserved.
*/

package tw.jimmy.lab.invoke;
/**
 * ClassName:CeilingFanHighCommand
 * Function: TODO ADD FUNCTION.
 * Reason:	 TODO ADD REASON.
 * Date:     2015年8月18日 下午4:12:47
 * @author   Jimmy
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class CeilingFanHighCommand implements Command {
	CeilingFan ceilingFan;
	int prevSpeed;
	
	public CeilingFanHighCommand(CeilingFan ceilingFan){
		this.ceilingFan = ceilingFan;
	}
	
	@Override
	public void execute() {
		prevSpeed = ceilingFan.getSpeed();
		ceilingFan.high();
	}

	@Override
	public void undo() {
		if(prevSpeed == CeilingFan.HIGH){
			ceilingFan.high();
		}else if(prevSpeed == CeilingFan.MEDIUM){
			ceilingFan.medium();
		}else if(prevSpeed == CeilingFan.LOW){
			ceilingFan.low();
		}else if(prevSpeed == CeilingFan.OFF){
			ceilingFan.off();
		}
	}
}
