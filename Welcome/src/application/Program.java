package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Person;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter with the number of people: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		System.out.println();
		
		List<Person> list = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			System.out.print("\nEnter with your name: ");
			String name = sc.nextLine();
			System.out.print("Enter with your age: ");
			int age = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter with your height: ");
			double height = sc.nextDouble();
			sc.nextLine();
			System.out.print("Enter with your genre: ");
			String genre = sc.nextLine();
			list.add(new Person(name, age, height, genre));
		}
		
		List<Person> woman = list.stream()
				.filter(x -> x.getGenre().toUpperCase().charAt(0) == 'F')
				.collect(Collectors.toList());
		
		System.out.println();
		
		List<Person> man = list.stream()
				.filter(x -> x.getGenre().toUpperCase().charAt(0) == 'M')
				.collect(Collectors.toList());
		
		
		System.out.println("List of man:");
		for(Person i : man) {
			System.out.println(i);
		}
		
		System.out.println();
		
		System.out.println("List of woman:");
		for(Person i : woman) {
			System.out.println(i);
		}
		
		sc.close();
		System.exit(0);
	}

}
