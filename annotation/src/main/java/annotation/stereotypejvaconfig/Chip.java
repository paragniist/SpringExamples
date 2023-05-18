package annotation.stereotypejvaconfig;
//no sourcecode
public class Chip {
	private String chipType;

	public void setChipType(String chipType) {
		this.chipType = chipType;
	}

	@Override
	public String toString() {
		return "Chip [chipType=" + chipType + "]";
	}
	
}
