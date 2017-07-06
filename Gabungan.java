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
public class Gabungan implements JenisTrans, Transportasi, Mahasiswa{
	public String gabungan(){
		return "Ini Ganbungan Transportasi";
	}
	
	public void jadwalUTS(){
		System.out.println("UTS dilaksanakan pada tanggal ");
	}

	public void jadwalUAS(){
		System.out.println("UAS dilaksanakan pada tanggal 4 Juli 2017");
	}

	public String getPower(){
		return "Ini adalah tenaga Udara";
	}

	public void countPower(){
		System.out.println("Perhitungan tenaga Udara");
	}
}