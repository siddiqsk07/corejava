package net.konic.corejava.maps;

public class Employees {
	private int id;
	private String name;
	@Override
	public String toString() {
		return "Employees [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	private String dept;
	

}

