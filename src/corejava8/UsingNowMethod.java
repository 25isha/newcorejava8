package corejava8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

 class Time{
	
}

public class UsingNowMethod {

	public static void main(String[] args) {
		LocalTime lt= LocalTime.now();
		System.out.println(lt);
		
		LocalDate ld=LocalDate.now();
		System.out.println(ld);
		
		LocalDateTime ldt= LocalDateTime.now();
		System.out.println(ldt);
		
		LocalDate firstDay_2023=LocalDate.of(2023, Month.JUNE, 1);
		System.out.println("Specific Date="+firstDay_2023);
		
		
		
	
		
		

	}

}
