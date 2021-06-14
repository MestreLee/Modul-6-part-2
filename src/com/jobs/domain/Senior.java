package com.jobs.domain;

public class Senior extends Employee{
	
	public Senior(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate) throws Exception {
		super(name, address, phone, salaryPerMonth, paymentRate);		
				
		this.salaryPerMonth=salaryPerMonth;
		this.paymentRate=paymentRate;
	}
	
	@Override
	public String toString() {
		return "Senior [nom=" + name  + ", adre�a=" + address + ", tel�fon=" + phone + ", sou mensual=" + salaryPerMonth + ", sou total=" + totalPaid + "] \n";
	}



	@Override
	public void pay() throws Exception{
		totalPaid=paymentRate.pay(salaryPerMonth);
		if(totalPaid < 2700) {
			throw new Exception("El Senior cobra menys del que li toca\n");
		} else if (totalPaid > 4000) {
			throw new Exception("El Senior cobra m�s del que li toca\n");
		}
	}

}
