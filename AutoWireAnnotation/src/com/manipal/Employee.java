package com.manipal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
int eno;
@Autowired
@Qualifier(value="name")

Name ename;

@Autowired
Address address;
public int getEno() {
	return eno;
}
public void setEno(int eno) {
	this.eno = eno;
}
public Name getEname() {
	return ename;
}
public void setEname(Name ename) {
	this.ename = ename;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
@Override
public String toString() {
	return "Employee [eno=" + eno + ", ename=" + ename + ", address=" + address + "]";
}

}
