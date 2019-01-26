import java.util.ArrayList;
import java.util.Stack;

public class Main {
	


	public static void main(String[] args) {
		// Corner Lists
		
		ArrayList<Corner> listC = new ArrayList<>();;
		String[] corners = {"A","B","C","D","E"};
		for (String s : corners) {
			listC.add(new Corner(s));
		}
		
		// Joint List
		
		ArrayList<Joint> listJ = new ArrayList<>();
		listJ.add(new Joint(listC.get(0), listC.get(1), 5));
		listJ.add(new Joint(listC.get(2), listC.get(0), 7));
		listJ.add(new Joint(listC.get(1), listC.get(2), 4));
		listJ.add(new Joint(listC.get(1), listC.get(3), 12));
		
		listJ.add(new Joint(listC.get(1), listC.get(4), 3));
		listJ.add(new Joint(listC.get(3), listC.get(4), 2));
		listJ.add(new Joint(listC.get(3), listC.get(2), 1));
		

				
		/*
		System.out.println(listC);
		System.out.println(listJ);
		listJ.sort(null);
		System.out.println(listJ);
		*/
		ArrayList<Joint> min = new ArrayList<>();
		listJ.sort(null);
		int nr = 0;
		while ( min.size() < listC.size() - 1 ) {
			Joint curent = listJ.get(nr ++);
			for (Corner corner : listC) {
				corner.visited = false;
			}
			if ( ! dfs(curent.start, curent.end, min) ) {
				min.add(curent);
			}
		}
		
		System.out.println(min);

		
		
		
		//System.out.println("Conected " + dfs(listC.get(0), listC.get(4), listJ) );


	}

	private static boolean dfs(Corner start, Corner target, ArrayList<Joint> listJ) {
		// TODO Auto-generated method stub
		Stack<Corner> stack = new Stack<>();
		stack.push(start);
		
		System.out.print("--DFS-- from " + start + "   to " + target +" --->  ");
		
		while( ! stack.isEmpty() ) {
			Corner curent = stack.pop();
			
			if ( ! curent.visited ) {
				System.out.print( curent.name + ", ");
				curent.visited = true;
			}

			if (curent.equals(target)) {
				System.out.println("  conect");
				return true;
			}

			for (Joint joint : listJ) {
				//if (joint.equals(curent)) {
					Corner conect = joint.conect(curent);
					if ( conect != null && ! conect.visited )
						stack.push(conect);
				//}
			}
		}
		System.out.println("  Not conect");
		
		return false;
	}

}
