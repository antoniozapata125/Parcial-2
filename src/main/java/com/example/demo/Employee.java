package com.example.demo;

import java.util.ArrayList;
import java.util.List;


public class Employee {
	private String nombre;
	   private String area;
	   private int salario;
	   private List <Employee> subordinates;

	 public Employee (String Nombre, String Área, int Salario) {
	      this.nombre = Nombre;
	      this.area = Área;
	      this.salario = Salario;
	      subordinates = new ArrayList <Employee> ();
	   }

public void add (Employee e) {
	subordinates.add (e);
	   }

	   public void remove (Employee e) {
	      subordinates.remove (e);
	   }

	   public List <Employee> getSubordinates () {
	     return subordinates;
	   }

	   public String toString () {
	      return ( "Employee: [nombre:" + nombre 
	      + ", area:" + area + ", salario:"
	      + salario + "]");
	   }   
	
}
