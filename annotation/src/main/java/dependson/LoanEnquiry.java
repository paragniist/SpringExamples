package dependson;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component

public class LoanEnquiry {
	public LoanEnquiry() {
		System.out.println("LoanEnquiry()");
	}
}
