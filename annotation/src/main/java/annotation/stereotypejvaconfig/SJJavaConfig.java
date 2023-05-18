package annotation.stereotypejvaconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:annotation/stereotypejvaconfig/sjavaconfigvalues.properties")
@ComponentScan(basePackages = "annotation.stereotypejvaconfig")
public class SJJavaConfig {
	@Bean
	public Chip chip(@Value("${chipType}") String chipType) {
		Chip chip=new Chip();
		chip.setChipType(chipType);
		return chip;
		
	}
}
