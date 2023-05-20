package custombeanvalidator.validator;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Target({ ElementType.FIELD, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = LoanTypeValidator.class)
public @interface LoanType {
	String message() default "loanType is not valid";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
