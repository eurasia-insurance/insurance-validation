package com.lapsa.insurance.validation.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.lapsa.insurance.elements.InsuredAgeClass;
import com.lapsa.insurance.validation.ValidInsuranceAgeClass;

public class ValidInsuranceAgeClassConstraintValidator
	implements ConstraintValidator<ValidInsuranceAgeClass, InsuredAgeClass> {

    private InsuredAgeClass[] invalidTypes;

    @Override
    public void initialize(final ValidInsuranceAgeClass constraintAnnotation) {
	invalidTypes = constraintAnnotation.invalidValues();
    }

    @Override
    public boolean isValid(final InsuredAgeClass value, final ConstraintValidatorContext context) {
	if (value == null)
	    return true;
	for (final InsuredAgeClass i : invalidTypes)
	    if (i.equals(value))
		return false;
	return true;
    }

}