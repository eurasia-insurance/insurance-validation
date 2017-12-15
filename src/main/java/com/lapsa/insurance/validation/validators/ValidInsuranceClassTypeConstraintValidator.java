package com.lapsa.insurance.validation.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.lapsa.insurance.elements.InsuranceClassType;
import com.lapsa.insurance.validation.ValidInsuranceClassType;

public class ValidInsuranceClassTypeConstraintValidator
	implements ConstraintValidator<ValidInsuranceClassType, InsuranceClassType> {

    @Override
    public void initialize(final ValidInsuranceClassType constraintAnnotation) {
    }

    @Override
    public boolean isValid(final InsuranceClassType value, final ConstraintValidatorContext context) {
	// no invalid values
	return true;
    }

}