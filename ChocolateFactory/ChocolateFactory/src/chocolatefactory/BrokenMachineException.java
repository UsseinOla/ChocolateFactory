/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chocolatefactory;

public class BrokenMachineException extends Exception {
	private int age;
 
	public BrokenMachineException(int age) {
		super("This machine is broken and its age is " + age);
		this.age = age;
	}
 
	public boolean isItWorthFixing() {
		return age < 10;
	}
}
