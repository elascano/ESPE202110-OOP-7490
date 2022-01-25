/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.model;

/**
 *
 * @author darling.cruz
 */

public class A {
    A a[]=new A[7];
//	ArrayList<B> bs = ArrayList<>();

	public void m(C c){
	 System.out.println("method m of class A, receiving a C object"+ c );
	}

	public C m(){
		return new C();
	}
}



