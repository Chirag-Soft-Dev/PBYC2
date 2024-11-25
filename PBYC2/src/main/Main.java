package main;
import employee.Employee;
import manager.Manager;
public class Main {
	public static void main(String[] args){
		Employee employee =new Employee();
		System.out.println(employee.calSal(12000));
		
		Manager manager = new Manager();
		System.out.println(manager.calSal(1200, 12));
	}
}
