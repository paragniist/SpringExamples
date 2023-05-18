package dependson;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn("loanEnquiry")
public class ChacheManager {
	public ChacheManager() {
		System.out.println("CacheManager()");
	}
}
