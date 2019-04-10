package chapter10ArrayListsHomework2ndPart;

import java.util.*;

public class Exercise17 {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		ArrayList a2 = new ArrayList();
		int i;

		a1.add(10);
		a1.add(20);
		a1.add(30);

		a2.add(4);
		a2.add(5);
		a2.add(6);
		a2.add(7);
		a2.add(8);
		a2.add(9);

		System.out.print("before: a1 = [");

		for (i = 0; i < a1.size(); i++) {
			System.out.print(a1.get(i) + " ");
		}

		System.out.print("]\n");

		System.out.print("a2=[");
		for (i = 0; i < a2.size(); i++) {
			System.out.print(a2.get(i) + " ");
		}
		System.out.print("]\n");
		InterLeave(a1, a2);

		System.out.println("After interleaving:");
		System.out.print("a1=[");
		for (i = 0; i < a1.size(); i++) {
			System.out.print(a1.get(i) + " ");
		}
		System.out.print("]\n");
	}

	public static void InterLeave(ArrayList a1, ArrayList a2) {
		ArrayList a3 = new ArrayList();
		int i;
		for (i = 0; i < (a1.size() > a2.size() ? a1.size() : a2.size()); i++) {
			if (i < a1.size())
				a3.add(a1.get(i));
			if (i < a2.size())
				a3.add(a2.get(i));
		}
		a1.clear();
		a1.addAll(a3);
	}
}
