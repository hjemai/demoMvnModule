package com.hj.demojenk;
import com.hj.util.*;

public class Main {

	public static void main(String[] args) {

		Calculette c=new Calculette(25,2);
		System.out.println("Somme "+c.somme());
		System.out.println("Difference "+c.difference());
		System.out.println("Multiplication "+c.multi());
		System.out.println("Division "+ c.div());
		System.out.println("ok finish calculating ");

	}

}
