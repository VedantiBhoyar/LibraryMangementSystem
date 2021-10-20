package LibraryMangementSystem;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Library {
	Books ref = new Books();

	public void displaybooks() {
		System.out.println("***Displaying Books***");
		System.out
				.println("**** Civil Sevices Books Available In Library Are****");
		ref.civilservicesBook();
		System.out
				.println("**** Mathematics Books Available In Library Are****");
		ref.MathsBook();
		System.out
				.println("**** Literature Books Available In Library Are: ****");
		ref.LiteratureBook();
		System.out.println("**** Other Books Available In Library Are: ****");
		ref.MiscellaneousBooks();

	}

	public void lendbooks(String name, String book) {
		if (ref.list.contains(book) || ref.list1.contains(book)
				|| ref.list2.contains(book) || ref.list3.contains(book)) {
			HashMap<String, String> map = new HashMap<>();
			map.put(name, book);

			for (String str : map.keySet()) {
				System.out.println(str + " you are borrowing " + map.values());
			}
		} else {
			System.out.println("Book is not available");
		}

	}

	public void addBook(ArrayList<String> addbook) {
		ArrayList<String> finalList = new ArrayList<>();
		finalList.addAll(ref.list);
		finalList.addAll(ref.list1);
		finalList.addAll(ref.list2);
		finalList.addAll(ref.list3);
		finalList.addAll(addbook);
		System.out.println("****FINAL BOOK LIST****");
		Iterator<String> finalitr = finalList.iterator();
		while (finalitr.hasNext()) {
			System.out.println(finalitr.next());
		}
	}

	public void returnBook(String name, String book, Date bdate, Date rdate) {
		System.out.println(name + " you borrow " + book + " on " + bdate);
		System.out.println("you are returning  " + book + " on " + rdate);
	}

	@SuppressWarnings("deprecation")
	public void fine(Date bdate, Date rdate) {
		int m1 = bdate.getMonth();
		int y1 = bdate.getYear();
		int m2 = rdate.getMonth();
		int y2 = rdate.getYear();

		int fine;
		if (y2 == y1 || y1 > y2) {
			if (m2 == m1 || m1 > m2) {

				fine = 0;

			} else
				fine = (m1 - m2) * 500;
		} else
			fine = 10000;
		System.out.println("You have to give : " + fine + " Rs/- as a fine ");

	}

	public void details(String NameOfStudent, String NameOfBook,
			String NameOfUniversity, int uniqueId, int uniCode,
			String Semester, String Branch, Date bdate, Date rdate) {
		System.out.println("Name of Student :" + NameOfStudent);
		System.out.println("Name of Book :" + NameOfBook);
		System.out.println("Name of University :" + NameOfUniversity);
		System.out.println("Id of Student :" + uniqueId);
		System.out.println("University Code : " + uniCode);
		System.out.println("Semester  :" + Semester);
		System.out.println("Name of branch  :" + Branch);
		returnBook(NameOfStudent, NameOfBook, bdate, rdate);
		fine(bdate, rdate);

	}

	public static void main(String[] args) throws Exception {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Library ref1 = new Library();
		ref1.displaybooks();
		;
		while (true) {
			System.out.println("Enter your name...");
			String NameOfStudent = sc.nextLine();
			System.out.println("Enter Book name....");
			String NameOfBook = sc.nextLine();
			System.out.println("Enter University name...");
			String NameOfUniversity = sc.nextLine();
			System.out.println("Enter Id of Student...");
			int uniqueId = sc.nextInt();
			System.out.println("Enter University code");
			int uniCode = sc.nextInt();
			System.out.println("Enter the semsester...");
			String Semester = sc.next();
			System.out.println("Enter the Branch");
			String Branch = sc.next();
			sc.nextLine();
			ref1.lendbooks(NameOfStudent, NameOfBook);
			System.out.println("Enter Books to add");
			String AddBook = sc.nextLine();
			ArrayList<String> Add = new ArrayList<>();
			Add.add(AddBook);
			ref1.addBook(Add);
			System.out
					.println("If you borrow and want to return the book give input as yes");
			String input = sc.next();
			if (input.endsWith("yes")) {
				System.out.println("Date of borrowing the book");
				String date = sc.next();

				Date date2 = new SimpleDateFormat("dd/MM/yyyy/hh:mm:ss")
						.parse(date);

				System.out.println("Date of returning the book");
				String Date1 = sc.next();

				Date date1 = new SimpleDateFormat("dd/MM/yyyy/hh:mm:ss")
						.parse(Date1);

				ref1.details(NameOfStudent, NameOfBook, NameOfUniversity,
						uniqueId, uniCode, Semester, Branch, date2, date1);
			} else {
				System.out.println("See you soon!!!!");
			}
		}
	}
}
