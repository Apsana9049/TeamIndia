package com.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class teamIndia {
   int srno;
   String name;
   int run;
   int age;
   int salary;
   int century;
   String city;
   
   @Id
public int getSrno() {
	return srno;
}
public void setSrno(int srno) {
	this.srno = srno;
}
@Column
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Column
public int getRun() {
	return run;
}
public void setRun(int run) {
	this.run = run;
}
@Column
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Column
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
@Column
public int getCentury() {
	return century;
}
public void setCentury(int century) {
	this.century = century;
}
@Column
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "teamIndia [srno=" + srno + ", name=" + name + ", run=" + run + ", age=" + age + ", salary=" + salary
			+ ", century=" + century + ", city=" + city + "]";
}
}
