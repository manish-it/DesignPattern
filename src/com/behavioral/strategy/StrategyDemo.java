package com.behavioral.strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StrategyDemo {

	public static void main(String[] args) {
		Person person1= new Person(32, "Person1", "1234");
		Person person2= new Person(28, "Person2", "2345");
		Person person3= new Person(21, "Person3", "3456");
		
		List<Person> people = new ArrayList<Person>();
		people.add(person1);
		people.add(person2);
		people.add(person3);
		
		System.out.println("Not sorted");
		printContent(people);
		
		System.out.println("Sorted by age: ");
		Collections.sort(people, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				if(o1.getAge() > o2.getAge()) {
					return 1;
				}else if(o1.getAge() < o2.getAge()) {
					return -1;
				}else {
					return 0;
				}
			}
		});
		
		printContent(people);
		
		System.out.println("Sorted by Name:");
		Collections.sort(people, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return (o1.getName().compareTo(o2.getName()));
			}
		});
		printContent(people);
	}
	
	

	private static void printContent(List<Person> people) {
		for(Person person: people) {
			System.out.println(person.getName());
		}
		
	}

}
