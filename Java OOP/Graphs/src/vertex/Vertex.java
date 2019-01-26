package vertex;

import java.util.ArrayList;
import java.util.List;

public class Vertex<T> implements Comparable<Vertex> {
	public String label;
	public double cost;
	public boolean visited;
	public Vertex parent;
	
	private int index;
	
	private static Integer counter = 0;
	private static List<Vertex> listAll = new ArrayList<>();
	
	public Vertex (T t) {
		if (t instanceof String || t instanceof Integer || t instanceof Character) {
			label = t.toString();
		} else {
			label = counter.toString();
			System.out.println("Unallowable type for label");
			System.out.println("Create a vertex " + counter);
		}
		parent = null;
		visited = false;
		cost = -1;
		
		index = counter;
		counter++;
		listAll.add(this);
	}

	public int getIndex() {
		return index;
	}
	
	public static Vertex getVertexIndex(int index) {
		if (index >= 0 && index < listAll.size())
			return listAll.get(index);
		System.out.println("There is no such Vertex");
		return null;
	}
	
	public static Vertex getVertex(String s) {
//		if (index >= 0 && index < listAll.size())
//			return listAll.get(index);
		System.out.println("There is no such Vertex");
		return null;
	}
	
	public static void setCostAll(double newCost) {
		
		for(Vertex<?> v : listAll)
			v.cost = newCost;
	}

	public static void setAllUnvisited() {
		
		for(Vertex<?> v : listAll)
			v.visited = false;
	}

	public static int getNumber() {
		
		return listAll.size();
	}

	public static void printAll() {
		
		System.out.print("Vertices [ ");
		for(int i = 0; i < listAll.size(); i++) {
			if (i > 0)
				System.out.print(", ");
			System.out.print(listAll.get(i).label);
		}
		System.out.println(" ]");
	}

	@Override
	public String toString() {
		
		return "Vertex " + label;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if ( ! (obj instanceof Vertex))
			return false;
		if ( ((Vertex<?>)obj).getIndex() != index )
			return false;
		
		return true;
	}

	@Override
	public int compareTo(Vertex v) {
		double dif = cost - v.cost;
		
		if (dif > 0)
			return 1;
		if (dif < 0)
			return -1;
		return 0;
	}
	
}
