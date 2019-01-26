package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class RemovePlural {

	public static void main(String[] args) {
		
		String[] a = {"cat", "cats", "rat", "rats", "mats", "mat"};
		
		ArrayList<String> list = new ArrayList<>();
		for (String string : a) 
			list.add(string);

		System.out.println(list);
//		removePlural(list);
		removeWithIterator(list);
		System.out.println(list);
		
		ArrayList<String> list2 = new ArrayList<>(Arrays.asList("the","quick","brown","fox"));
		
		System.out.println(list2);
		addStars(list2);
		System.out.println(list2);
		removeStars(list2);
		System.out.println(list2);
		
		list = new ArrayList<>(Arrays.asList("cat", "cats", "rat", "rats", "mats", "mat"));
		
		System.out.println(list);
		capitalizePlural(list);
		System.out.println(list);
		
		
	}

	public static void removePlural(ArrayList<String> list) {
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			if (str.endsWith("s")) {
				list.remove(i);
				i--;
			}
		}
	}
	
	public static void removeWithIterator(ArrayList<String> list) {
		
		ListIterator<String> it = list.listIterator();
		
		while(it.hasNext()) 
			if (it.next().endsWith("s"))
				it.remove();
		
		while(it.hasPrevious())
			System.out.println(it.previousIndex() + "  " + it.previous());
	}
	
	private static void addStars(ArrayList<String> list2) {
		ListIterator<String> it = list2.listIterator();
		
		while(it.hasNext()) { 
			it.next();
			it.add("*");
		}
	}

	private static void removeStars(ArrayList<String> list2) {
		
		// lazy version
//		list2.removeAll(new ArrayList<String>(Arrays.asList("*")));
		
		// with iterator
		Iterator<String> it = list2.listIterator();
		
		while (it.hasNext())
			if (it.next().equals("*"))
				it.remove();
		
		// with contains
//		while (list2.contains("*"))
//			list2.remove("*");
		
		// with stream need return
//		ArrayList<String> list3;
//		list3 = (ArrayList<String>)list2.stream()
//				.filter(str -> ! "*".equals(str))
//				.collect(Collectors.toList());
//				
//		System.out.println(list3);
		
		// with stream
	}
	
	private static void capitalizePlural(ArrayList<String> list) {
		
		// list iterator
//		ListIterator<String> it = list.listIterator();
//		
//		while(it.hasNext())
//			if( it.next().endsWith("s")) 
//				list.set(it.previousIndex(), list.get(it.previousIndex()).toUpperCase() );
		
		// loop list
		for (int i = 0; i < list.size(); i++) 
			if (list.get(i).endsWith("s"))
				list.set(i, list.get(i).toUpperCase());
		

	}



}
