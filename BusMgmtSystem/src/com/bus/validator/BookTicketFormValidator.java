package com.bus.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.bus.form.BookTicketForm;

public class BookTicketFormValidator implements Validator {

	@Override
	public boolean supports(Class<?> classType) {
		return classType.isAssignableFrom(BookTicketForm.class);
	}

	@Override
	public void validate(Object object, Errors errors) {
		BookTicketForm form = null;

		form = (BookTicketForm) object;

		if (form.getFirstName() == null
				|| form.getFirstName().trim().length() == 0) {
			errors.rejectValue("firstName", "firstNm.blank");
		}
		if (form.getLastName() == null
				|| form.getLastName().trim().length() == 0) {
			errors.rejectValue("lastName", "lastNm.blank");
		}
	}
}
