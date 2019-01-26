
public class Corner {
	public String name;
	public boolean visited;
	
	public Corner(String name) {
		this.name = name;
		visited = false;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	@Override
	public boolean equals(Object arg0) {
		//System.out.println("Equals Corner" + arg0);
		if (arg0 instanceof Corner) {
			if (((Corner)arg0).name == name)
				return true;
		}  else if (arg0 instanceof Joint) {
			Joint temp = (Joint)arg0;
			if (temp.start.name == name || temp.end.name == name)
				return true;
		} else if (arg0 instanceof String) {
			String s = (String)arg0;
			if (name.equals(s))
				return true;
		}
		return false;
	}
}
