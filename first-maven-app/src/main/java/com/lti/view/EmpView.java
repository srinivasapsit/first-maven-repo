package com.lti.view;

import com.lti.model.Employee;

public class EmpView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee emp=new Employee();
emp.setEmpName("Mark");
emp.setEmpId(102);
System.out.println("EmpName: "+emp.getEmpName());
System.out.println("EmpId: "+emp.getEmpId());
	}

}
