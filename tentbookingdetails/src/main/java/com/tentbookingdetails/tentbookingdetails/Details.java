package com.tentbookingdetails.tentbookingdetails;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Details {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="customerid")
	private int customerid;
	@Column(name="customername")
	private String customername;
	@Column(name="numberofchairs")
	private int numberofchairs;
	@Column(name="numberoftables")
	private int numberoftables;
	@Column(name="numberoffoldings")
	private int numberoffoldings;
	@Column(name="numberofcoffeemachines")
	private int numberofcoffeemachines;
	@Column(name="numberofmaharajachairs")
	private int numberofmaharajachairs;
	@Column(name="bookeddate")
	private String bookeddate;
	@Column(name="totalammount")
	private int totalammount;
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public int getNumberofchairs() {
		return numberofchairs;
	}
	public void setNumberofchairs(int numberofchairs) {
		this.numberofchairs = numberofchairs;
	}
	public int getNumberoftables() {
		return numberoftables;
	}
	public void setNumberoftables(int numberoftables) {
		this.numberoftables = numberoftables;
	}
	public int getNumberoffoldings() {
		return numberoffoldings;
	}
	public void setNumberoffoldings(int numberoffoldings) {
		this.numberoffoldings = numberoffoldings;
	}
	public int getNumberofcoffeemachines() {
		return numberofcoffeemachines;
	}
	public void setNumberofcoffeemachines(int numberofcoffeemachines) {
		this.numberofcoffeemachines = numberofcoffeemachines;
	}
	public int getNumberofmaharajachairs() {
		return numberofmaharajachairs;
	}
	public void setNumberofmaharajachairs(int numberofmaharajachairs) {
		this.numberofmaharajachairs = numberofmaharajachairs;
	}
	public String getBookeddate() {
		return bookeddate;
	}
	public void setBookeddate(String bookeddate) {
		this.bookeddate = bookeddate;
	}
	public int getTotalammount() {
		return totalammount;
	}
	public void setTotalammount(int totalammount) {
		this.totalammount = totalammount;
	}
	
	
}
