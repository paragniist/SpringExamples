package annotation.stereotypejvaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//sourcecode
@Component
public class Robot {
	@Autowired
	private Chip chip;

	public void setChip(Chip chip) {
		this.chip = chip;
	}

	@Override
	public String toString() {
		return "Robot [chip=" + chip + "]";
	}

}
