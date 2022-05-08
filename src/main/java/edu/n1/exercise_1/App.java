package edu.n1.exercise_1;

import java.util.*;

public class App {

	public static void main(String[] args) {
		
		ArrayList<Month> monthList=new ArrayList<Month>();
		
		Month january=new Month("January");
		Month february=new Month("February");
		Month march=new Month("March");
		Month april=new Month("April");
		Month may=new Month("May");
		Month june=new Month("June");
		Month july=new Month("July");
		Month august=new Month("August");
		Month september=new Month("September");
		Month october=new Month("October");
		Month november=new Month("November");
		Month december=new Month("December");
		
		monthList.add(january);
		monthList.add(february);
		monthList.add(march);
		monthList.add(april);
		monthList.add(may);
		monthList.add(june);
		monthList.add(july);
		monthList.add(september);
		monthList.add(october);
		monthList.add(november);
		monthList.add(december);
		
		System.out.println("MonthList: " + monthList); 
		monthList.add(7, august);
		System.out.println("Afegim agost:");
		System.out.println("MonthList: " + monthList); 
		
		HashSet<Month> monthSet=new HashSet<>(monthList);
		System.out.println("MonthSet: " + monthSet);
		
		Month duplicate=new Month("January");
		Month duplicate2=new Month("February");
		Month duplicate3=new Month("August");
		Month duplicate4=new Month("November");
		Month duplicate5=new Month("December");
		monthSet.add(duplicate);
		monthSet.add(duplicate2);
		monthSet.add(duplicate3);
		monthSet.add(duplicate4);
		monthSet.add(duplicate5);
		
		System.out.println("Els mesos amb el nom repetit no s'afegeixen al HashSet.");
		System.out.println("Grandària del HashSet: " + monthSet.size());
		System.out.println("MonthSet: " + monthSet);
		System.out.println("Recorrem l'ArrayList amb el bucle for:");
		
		for(int i=0; i<monthList.size(); i++) {
			System.out.print("Mes " + (i + 1)  + "-" + monthList.get(i).getName() + ". ");
		}
		
		System.out.print("\n");	
		System.out.println("Recorrem l'ArrayList amb un Iterator:");	
		Iterator<Month> iterator=monthList.iterator();	
		int i=1;
		
		while (iterator.hasNext()) {
			System.out.print("Mes " + i + "-" + iterator.next().getName() + ". ");
			i++;
		}
		
		System.out.print("\n");		
	}
}
