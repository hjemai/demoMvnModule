package com.hj.util;

public class Calculette {
	private int a,b;
	
	
	
	public Calculette() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Calculette(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	
	
	
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int somme() {
		return a+b;
	}
	
	public int difference() {
		return a-b;
		
	}
	
	public int div() {
		if(b!=0)
		return a/b;
		else
			throw new RuntimeException("division par zero");
	}
	
	
	public int multi() {
		return a*b;
	}
	
	

}
