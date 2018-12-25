package com.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;


public class CollectionsSetTest {

	private Laptop laptopOne,laptopTwo,laptopThree;
	private Car carOne,carTwo,carThree;
	private Television televisionOne,televisionTwo,televisionThree;
	private CellPhone cellPhoneOne,cellPhoneTwo,cellPhoneThree;
	private School schoolOne,schoolTwo,schoolThree;

	@Before
	public void setUp() {
		laptopOne = new Laptop("dell","Model d1","Windows", "Intel i5");
		laptopTwo= new Laptop("dell", "Model d1", "Linux", "Intel i5");
		laptopThree = new Laptop("Lenovo", "Model l1", "Linux", "Intel i3");

		carOne = new Car("BMW", "Model s7",2010, 10200000);
		carTwo= new Car("BMW", "Model s9", 2008, 1000000);
		carThree = new Car("Audi", "Model a3", 2014, 7000000);

		televisionOne = new Television("Samsung", "LCD",  50000,false);
		televisionTwo = new Television("LG", "LED", 200000, true);
		televisionThree = new Television("Samsung", "LCD", 50000, true);

		cellPhoneOne = new CellPhone("Lenovo", "A7000", "Dual Camera", "Lolipop", 12000);
		cellPhoneTwo = new CellPhone("Apple", "Iphone", "Speed Accessing,high end camera", "IOS 8", 70000);
		cellPhoneThree = new CellPhone("Lenovo", "A7000","Good camera", "Lolipop", 10000);

		schoolOne = new School("Viswabharati", "Gudivada", "Krishna", 1);
		schoolTwo = new School("Vidyavikas", "Jangareddygudem", "WestGodavari", 5);
		schoolThree= new School("Surya", "Jangareddygudem", "WestGodavari", 3);
	}
	
	@Test
	public void duplicates(){
		Set<Object> set=new HashSet<Object>();
		
		set.add(laptopOne);
		set.add(laptopTwo);
		set.add(laptopThree);

		set.add(carOne);
		set.add(carTwo);
		set.add(carThree);

		set.add(televisionOne);
		set.add(televisionTwo);
		set.add(televisionThree);

		set.add(cellPhoneOne);
		set.add(cellPhoneTwo);
		set.add(cellPhoneThree);

		set.add(schoolOne);
		set.add(schoolTwo);
		set.add(schoolThree);
		
		Iterator<Object> iterator = set.iterator();
	    for (Object object : set) {
			System.out.println(object);
		}
	}
}

	