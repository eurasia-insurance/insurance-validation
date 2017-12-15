package com.lapsa.insurance.validation.validators;

import java.util.Calendar;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.lapsa.insurance.validation.ValidVehicleYearOfIssue;

public class ValidVehicleYearOfIssueConstraintValidator
	implements ConstraintValidator<ValidVehicleYearOfIssue, Integer> {

    private int minValue;

    @Override
    public void initialize(final ValidVehicleYearOfIssue constraintAnnotation) {
	minValue = constraintAnnotation.minValue();
    }

    @Override
    public boolean isValid(final Integer value, final ConstraintValidatorContext context) {
	if (value == null)
	    return true;
	if (value < minValue)
	    return false;
	final Calendar now = Calendar.getInstance();
	if (value > now.get(Calendar.YEAR))
	    return false;
	return true;
    }
}
