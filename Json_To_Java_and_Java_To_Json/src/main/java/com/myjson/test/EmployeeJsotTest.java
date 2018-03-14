package com.myjson.test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.myjson.dto.Address;
import com.myjson.dto.Employee;
import com.myjson.util.JsonUtil;

public class EmployeeJsotTest {

	public static void main(String[] args) {
		
		Employee employee = createEmployee();
		File file = new File("c:\\Ranjan\\employee.json");
		System.out.println("Java to json coversion");
		String empJson = JsonUtil.convertJavaToJson(file,employee);
		System.out.println(empJson);
		System.out.println();
		System.out.println("*****************formated Json********************");
		empJson = JsonUtil.printJson(employee);
		System.out.println(empJson);
		
		System.out.println("Json To Java Conversion");
		Employee employeeJson = JsonUtil.convertJsonToJava(file, Employee.class);
		System.out.println(employeeJson);
		
		
		
	}
	
	public static Employee createEmployee(){
		
		Employee employee = new Employee();
		Address address = new Address();
		List<String> list = new ArrayList<String>();
		list.add("JAVA");
		list.add("SPRING");
		list.add("HIBERNATE");
		
		address.setLine1("Gurudatt Nagar");
		address.setLine2("pimple gurave");
		address.setCity("Pune");
		address.setCountry("India");
		
		employee.setEmpNo(101);
		employee.setName("Ranjan");
		employee.setSalary(200000);
		employee.setAddress(address);
		employee.setSkills(list);
		
		return employee;
	}

}
