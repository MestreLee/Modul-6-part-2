package com.jobs.domain;

public class Volunteer extends AbsStaffMember {
	
	private String description;

	public Volunteer(String name, String address, String phone, String description) throws Exception {
		super(name, address, phone);
		if(description.equals("")) throw new Exception();	
		
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Voluntari [nom=" + name  + ", adre�a=" + address + ", tel�fon=" + phone + ", descripci�=" + description + ", sou total=" + totalPaid + "] \n";
	}

	
	@Override
	public void pay() {	
		totalPaid= 0;	
	}

}
