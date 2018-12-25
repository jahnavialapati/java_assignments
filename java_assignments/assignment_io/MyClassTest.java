package com.cg.file;

import static org.junit.Assert.*;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.ArrayList;
	import org.junit.Before;
	import org.junit.Test;

	public class MyClassTest {
		private MyClass myclass1,myclass2,myclass3,myclass4;
		private ArrayList<MyClass> list;
		
		@Before
		public void setUp() {
			myclass1 = new MyClass(501,"jahnavi",10000);
			myclass2 = new MyClass(502,"ram",11000);
			myclass3 = new MyClass(503,"siva",12000);
			myclass4 = new MyClass(504,"priyanka",13000);
			list = new ArrayList<MyClass>();
			list.add(myclass1);
			list.add(myclass2);
			list.add(myclass3);
			list.add(myclass4);
		}

		@Test
		public void test() throws FileNotFoundException, IOException {
			MyClass myclass= new MyClass();
			myclass.write(list);
		}

		@Test
		public void test2() throws ClassNotFoundException, IOException {
			MyClass mclass = new MyClass();
			ArrayList<MyClass> myClass=mclass.read();
			System.out.println(myClass);
		}
}
