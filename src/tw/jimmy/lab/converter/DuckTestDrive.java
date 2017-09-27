/**
 * Project Name:ConverterLab
 * File Name:DuckTestDrive.java
 * Package Name:tw.com.studio.jimmy.lab
 * Date:2015年8月18日下午5:12:43
 * Copyright (c) 2015, jim@sinopac.com All Rights Reserved.
*/

package tw.jimmy.lab.converter;
/**
 * ClassName:DuckTestDrive
 * Function: TODO ADD FUNCTION.
 * Reason:	 TODO ADD REASON.
 * Date:     2015年8月18日 下午5:12:43
 * @author   Jimmy
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class DuckTestDrive {

	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();
		WildTurkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		Turkey duckAdapter = new DuckAdapter(duck);
		
		System.out.println("The Turkey says...");
		testTurkey(turkey);
		
		System.out.println("\nThe Duck says...");
		testDuck(duck);
		
		System.out.println("\nThe TurkeyAdapter says...");
		testDuck(turkeyAdapter);
		
		System.out.println("\nThe DuckAdapter says...");
		testTurkey(duckAdapter);
	}
	
	static void testTurkey(Turkey turkey){
		turkey.gobble();
		turkey.fly();
	}
	
	static void testDuck(Duck duck){
		duck.quack();
		duck.fly();
	}

}
