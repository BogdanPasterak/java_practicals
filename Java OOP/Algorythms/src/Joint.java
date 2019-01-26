
public class Joint implements Comparable<Joint> {
	public Corner start;
	public Corner end;
	public int cost;
	
	public Joint(Corner start, Corner end, int cost) {
		this.start = start;
		this.end = end;
		this.cost = cost;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "( " + start + " - " + end + " = " + cost + " )" ;
	}

	@Override
	public boolean equals(Object arg0) {
		//System.out.println("Equals Joint");
		// 
		if (arg0 instanceof Corner) {
			Corner temp = (Corner)arg0;
			if (temp.equals(start) || temp.equals(end))
				return true;
		} else if (arg0 instanceof Joint) {
			Joint temp = (Joint)arg0;
			if ( temp.start.equals(start) && temp.end.equals(end) && temp.cost == cost)
				return true;
		} else if (arg0 instanceof String) {
			String s = (String)arg0;
			if (start.name.equals(s) || end.name.equals(s))
				return true;
		}
		return false;
	}

	@Override
	public int compareTo(Joint joint) {
		//System.out.println("Compare Joint");
		
		return cost - joint.cost;
	}

	public Corner conect(Corner curent) {
		// 
		if ( curent.equals(start))
			return end;
		else if ( curent.equals(end))
			return start;
		return null;
	}

}
