/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
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
