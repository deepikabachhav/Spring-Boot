package com.cg.mongo.SpringDataMongoDb.entity;

import org.apache.tomcat.jni.Address;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
	
	@Document
	public class Employee {
		@Id
		private int empId;
		private String empName;
		private double salary;
		private Address address;

		public Employee() {
			super();
		}

		public Employee(int empId, String empName, double salary, Address address) {
			this.empId = empId;
			this.empName = empName;
			this.salary = salary;
			this.address = address;
		}

		public int getEmpId() {
			return empId;
		}

		public void setEmpId(int empId) {
			this.empId = empId;
		}

		public String getEmpName() {
			return empName;
		}

		public void setEmpName(String empName) {
			this.empName = empName;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		public Address getAddress() {
			return address;
		}

		public void setAddress(Address address) {
			this.address = address;
		}

		@Override
		public String toString() {
			return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", address=" + address
					+ "]";
		}
	}

