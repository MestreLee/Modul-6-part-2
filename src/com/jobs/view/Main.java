package com.jobs.view;

import com.jobs.application.JobsController;
import com.jobs.application.PaymentFactory;

public class Main {

	
	private static JobsController controller=new JobsController();
	
	public static void main(String[] args) throws Exception {
		
		//JobsController controller=new JobsController(); -- �s el mateix
				
		controller.createBoss("Pepe Boss", "Direcci�n molona", "666666666", 10000);
		controller.createJunior("Laura Junior", "Direcci�n molona 3", "625266666", 1100);
		controller.createMid("Pedro Mid", "Direcci�n molona 3", "625266666", 2050.0);
		controller.createSenior("Antoni Senior", "Direcci�n molona 3", "625266666", 3200.0);
		controller.createVolunteer("Juan Volunteer", "Direcci�n molona 4", "614266666", "no cobra");
		controller.createManager("Pepe Manager", "Direcci�n molona 5", "665226891", 4200.0);	
		
		controller.payAllEmployeers();
		
		String allEmployees=controller.getAllEmployees();
		
		System.out.println("EMPLOYEES: \n" + allEmployees + " \n");
		
		
	}

}
