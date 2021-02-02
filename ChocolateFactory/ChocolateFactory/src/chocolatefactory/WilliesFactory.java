/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chocolatefactory;
import java.util.*;
public class WilliesFactory {
	ArrayList<ChocoMachine> machines;
 	public WilliesFactory() {
		machines = new ArrayList<ChocoMachine>();
		for ( int i=0; i < 10; i++ ) {
			machines.add(new ChocoMachine());
		}
	}
 
	public void startTheDay() {
		for ( ChocoMachine m : machines ) {
			int amt = (int) (Math.random() * 17);
 
			try {
				m.produce(amt);	
			} 
			catch ( BrokenMachineException e ) {
				System.out.println(" ===> " + e.getMessage() );
				System.out.println("Repair team - get to work !");
				if ( e.isItWorthFixing() ) {
					m.fix();	
				} else {
System.out.println("To the junk yard");
				}
			}
 
		}
	}
}
