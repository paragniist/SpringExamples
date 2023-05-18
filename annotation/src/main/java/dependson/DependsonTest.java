package dependson;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependsonTest {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext("dependson");
	}
}
