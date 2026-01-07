package net.konic.corejava.maps;

import java.util.Objects;

public class EmployeeLinkedHashMap2 {
	int id;
	String name;
	
	public EmployeeLinkedHashMap2(int id ,String name) {
		this.id=id;
		this.name=name;
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeLinkedHashMap2 other = (EmployeeLinkedHashMap2) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "EmployeeLinkedHashMap2 [id=" + id + ", name=" + name + "]";
	}
	

}
