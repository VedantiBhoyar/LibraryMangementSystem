package LibraryMangementSystem;

import java.util.ArrayList;
import java.util.Iterator;

public class Books {
	ArrayList<String> list = new ArrayList<>();
	ArrayList<String> list1 = new ArrayList<>();
	ArrayList<String> list2 = new ArrayList<>();
	ArrayList<String> list3 = new ArrayList<>();

	public void civilservicesBook() {
		list.add("Indian Polity by Lakshimikanth");
		list.add("Spectrum");
		list.add("Ancient History");
		list.add("Medievel History");
		list.add("Modern History");
		list.add("Ncert 6-12 History");
		list.add("Ncert 6-12 Geography");
		list.add("Economy by BB Basu");
		list.add("Sociology");
		Iterator<String> itr = list.listIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println();

	}

	public void MathsBook() {
		list1.add("RD Sharma");
		list1.add("MD Raisinghania for Ordinary and Partial Diffrential Equation");
		list1.add("Cengage for Jee");
		list1.add("Dinesh Khatkat for Jee");
		list1.add("Ncert 6-12");
		Iterator<String> itr = list1.listIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println();

	}

	public void LiteratureBook() {

		list2.add("My name is Red");
		list2.add("A History Of Western Philosophy");
		list2.add("The Wretched Of The Earth");
		Iterator<String> itr = list2.listIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println();

	}

	public void MiscellaneousBooks() {

		list3.add("Harry Potter and Philosopher Stone");
		list3.add("Harry Potter and Chamber of Secrets");
		list3.add("Harry Potter and Prisoner of Askabaan");
		list3.add("Harry Potter and Globet Of Fire");
		list3.add("Harry Potter and Half Blood Prince");
		list3.add("Harry Potter and The Order of Phoneix");
		list3.add("Harry Potter and Deathly Hollow Part1");
		list3.add("Harry Potter and Deathly Hollow Part2");
		Iterator<String> itr = list3.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println();
	}

}
