package com.collections;

public class StudentNamesInsertionOrder implements Comparable<StudentNamesInsertionOrder> {
	private String name;

	public String getName() {
		return name;
	}

	public StudentNamesInsertionOrder(String name) {
		super();
		this.name=name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public StudentNamesInsertionOrder() {
		super();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		StudentNamesInsertionOrder other = (StudentNamesInsertionOrder) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(StudentNamesInsertionOrder arg0) {
		return name.compareTo(arg0.name);
	}

	@Override
	public String toString() {
		return "StudentNamesInsertionOrder [name=" + name + "]";
	}

}
