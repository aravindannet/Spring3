package com.training.springmvc;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class ReservationValidator implements Validator {

	public boolean supports(Class clazz) {
		return Reservation.class.isAssignableFrom(clazz);
	}

	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors,"date","date.required","Date is Mandatory Field" );
		ValidationUtils.rejectIfEmpty(errors, "player.name", "playerName.required", "Player Name is Mandatory");
		//ValidationUtils.

	}

}
