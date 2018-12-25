package com.collections;

public class StudentMap implements Comparable<StudentMap>{
	private String name,fruits;

	public String getFruits() {
		return fruits;
	}

	public void setFruits(String fruits) {
		this.fruits = fruits;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public StudentMap(String name, String fruits) {
		super();
		this.name = name;
		this.fruits = fruits;
	}

	public StudentMap() {
		super();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fruits == null) ? 0 : fruits.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentMap other = (StudentMap) obj;
		if (fruits == null) {
			if (other.fruits != null)
				return false;
		} else if (!fruits.equals(other.fruits))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(StudentMap arg0) {
		return name.compareTo(arg0.name);
	}
	
	
}
