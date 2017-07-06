/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;

/**
 *
 * @author user
 */
public class RunJenisTrans{

	public static void main(String[] args){
		Transportasi runNuclear = new TransLaut();
		System.out.println(runNuclear.getPower());
		runNuclear.countPower();

		Transportasi runDarat   = new TransDarat();
		System.out.println(runDarat.getPower());
		runDarat.countPower();
	}

}
