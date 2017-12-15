package com.lapsa.insurance.validation.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.lapsa.insurance.elements.InsuredExpirienceClass;
import com.lapsa.insurance.validation.ValidInsuranceExpirienceClass;

public class ValidInsuranceExpirienceClassConstraintValidator
	implements ConstraintValidator<ValidInsuranceExpirienceClass, InsuredExpirienceClass> {

    private InsuredExpirienceClass[] invalidTypes;

    @Override
    public void initialize(final ValidInsuranceExpirienceClass constraintAnnotation) {
	invalidTypes = constraintAnnotation.invalidValues();
    }

    @Override
    public boolean isValid(final InsuredExpirienceClass value, final ConstraintValidatorContext context) {
	if (value == null)
	    return true;
	for (final InsuredExpirienceClass i : invalidTypes)
	    if (i.equals(value))
		return false;
	return true;
    }

}