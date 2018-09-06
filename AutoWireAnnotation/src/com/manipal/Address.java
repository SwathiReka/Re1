package com.manipal;

public class Address {
int dno;
String city,state;
public int getDno() {
	return dno;
}
public void setDno(int dno) {
	this.dno = dno;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
@Override
public String toString() {
	return "Address [dno=" + dno + ", city=" + city + ", state=" + state + "]";
}

}
