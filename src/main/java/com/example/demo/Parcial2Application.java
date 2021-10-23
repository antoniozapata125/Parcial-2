package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Parcial2Application {

	public static void main(String[] args) {
		SpringApplication.run(Parcial2Application.class, args);
		
		 Employee CEO= new Employee ( "John", " Ceo ", 30000);
		 
	      Employee headSales = new Employee ( "Lucas", " Jefe de Ventas", 9000);
	      Employee salesExecutive1 = new Employee ( "Roberto", " Ventas ", 10000);
	      Employee salesExecutive2 = new Employee ( "Juan", " Ventas ", 10000);
	    
	     
	      Employee headMarketing = new Employee ( "Pedro", " Jefe de Marketing ", 9000);
	      Employee clerk1 = new Employee ( "Laura", " Marketing ", 5000);
	      Employee clerk2 = new Employee ( "Edwin", " Marketing ", 5000);
	   

	      CEO.add (headSales);
	      CEO.add (headMarketing);

	      headSales.add (salesExecutive1);
	      headSales.add (salesExecutive2);
	  
	      headMarketing.add (clerk1);
	      headMarketing.add (clerk2);

	      // Print all the organization's employees System.out.println (CEO); 
	      for (Employee headEmployee: CEO.getSubordinates ()) {
	         System.out.println (headEmployee);
	         for (Employee employee: headEmployee.getSubordinates ()) {
	            System.out.println (employee);
	         }
	      }		
	}
}
