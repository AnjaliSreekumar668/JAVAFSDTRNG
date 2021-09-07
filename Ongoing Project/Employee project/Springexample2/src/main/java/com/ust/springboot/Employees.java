package com.ust.springboot;

import java.util.List;

public class Employees {
	List<Empp> emp;

	public Employees(List<Empp> emp) {
		super();
		this.emp = emp;
	}

	public List<Empp> getemp() {
		return emp;
	}

	public Employees() {
		super();
	}

	public void setemp(List<Empp> emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "emprs [emp=" + emp + "]";
	}
	

}
