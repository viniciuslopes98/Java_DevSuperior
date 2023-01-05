package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Departament;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program2 {

	public static void main(String[] args) throws ParseException {

		Scanner leia = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Enter departament's name: ");
		String departamentName = leia.nextLine();

		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String workerName = leia.nextLine();
		System.out.print("Level: ");
		String workerLevel = leia.nextLine();
		System.out.print("Base salary: ");
		double baseSalary = leia.nextDouble();
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary,
				new Departament(departamentName));

		System.out.println("How many contracts to this worker? ");
		int n = leia.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Enter contract #" + i + " data: ");
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(leia.next());
			System.out.print("Value per hour: ");
			double valuePerHour = leia.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = leia.nextInt();
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);
		}

		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = leia.next();

		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Name: " + worker.getName());
		System.out.println("Departament: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

		leia.close();
	}

}
