package com.hackerrank.JavaEightFeatures.DateTimeAPI;

import java.time.LocalDate;
import java.time.LocalTime;

/* Date Time ApI under the java.time package in java 8 came with multiple new features
 	LocalDate, LocalTime, LocalDateTime, ZonedDateTime, Period, ChronoUnit
 	Unlike previous version most of the Date TIme Api classes are unmutable making it thread safe
 	
 */
public class DateTimeExample {
	
	public String notifyEmployee(){
		/*
		 * Method to notify employees on an assessment to be taken
		 * after 3 days from event start time
		 */
		String message = "Assessment Finished";
		LocalDate registrationDate = LocalDate.now();
		LocalDate lastDate = registrationDate.plusDays(3);
		if(LocalDate.now().isAfter(lastDate))
			message = "Please finish the assesment";
		return message;
	}
	
	public String notifyEmployeeWhenAssessmentIsOver(){
		/*
		 Notify employee once time is up for the assessment
		 i.e. the assessment should only take an hour
		 */
		String message = "Taking Assessment";
		LocalTime startTime = LocalTime.now();
		LocalTime endTime = startTime.plusHours(1);
		while(true){
			LocalTime currentTime = LocalTime.now();
			int hour = currentTime.getHour();
			int minute = currentTime.getMinute();
			int second = currentTime.getSecond();
			if(endTime.getHour()==hour && endTime.getMinute() == minute && endTime.getSecond()==second){
				message = "Time is Up";
				break; 
			}
		}
		return message;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeExample checkMessage = new DateTimeExample();
		System.out.println(checkMessage.notifyEmployee());
		System.out.println(checkMessage.notifyEmployeeWhenAssessmentIsOver());

	}

}
