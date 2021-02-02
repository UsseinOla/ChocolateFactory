/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chocolatefactory;

import java.util.*;
public class ChocoMachine implements Tasks{
    
    
    private int age;
	private int numProducts;
	private boolean broken;
 
	public ChocoMachine() {
		this.age = (int) (Math.random() * 34);
		this.numProducts = 0;
		this.broken = false;
	}

        public void fix() {
		this.broken = false;
	}
 
    @Override
	public void produce(int amt) throws BrokenMachineException {
		if ( this.broken ) {
			throw new BrokenMachineException(this.age);
		}
 
		for (int i=0; i < amt; i++ ) {
			System.out.println("Yummy");			
			this.numProducts += 1;
 
			if (  this.numProducts % 7 == 0 ) { 
				this.broken = true;
				throw new BrokenMachineException(this.age);
			}
		}
	}

    
    
    
}
