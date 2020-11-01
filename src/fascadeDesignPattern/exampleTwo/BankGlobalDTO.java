package fascadeDesignPattern.exampleTwo;

import java.util.List;

public class BankGlobalDTO {
	
	private List<BankDTO> region;
	
	private String regionName;

	public List<BankDTO> getRegion() {
		return region;
	}

	public void setRegion(List<BankDTO> region) {
		this.region = region;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}
	
	

}
