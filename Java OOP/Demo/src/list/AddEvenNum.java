package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class AddEvenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<>();
		
		// java 9
		// List<Integer> list3 = List.of(0,2);

//		for (int i = 0; i < 5; i++)
//			list.add(i * 2 );
//
//		System.out.println(list);
//
//		int size = list.size();
//		
//		for (int i = 0; i < size; i++) {
//			list.add(i, 42); // add 42 at index i
//		}
//		
//		System.out.println(list);
//		System.out.println();
//
		List<Integer> listPrime = Arrays.asList(2,3,5,7,11);
//		
//		System.out.println(listPrime);
//		
//		List<Integer> listMorePrime = new ArrayList(listPrime);
//		
//		System.out.println(listMorePrime);

		for (int i = 10; i <= 100; i += 10) {
			list.add(i);
		}
		System.out.println(list);
		
		for (Integer i = 10; i < 100; i += 20)
			list.remove(i);
		
		System.out.println(list);
		
		ListIterator<Integer> it = list.listIterator();
		while ( it.hasNext() ) {
			System.out.print(it.nextIndex() + " -> ");
			System.out.println(it.next());
		}
		
	}

}
