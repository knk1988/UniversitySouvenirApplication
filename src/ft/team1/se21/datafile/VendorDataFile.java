package ft.team1.se21.datafile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import ft.team1.se21.constants.Constants;
import ft.team1.se21.model.Member;
import ft.team1.se21.model.Vendor;

public class VendorDataFile extends DataFile {
	
	List<Vendor> vendorList;
	
	public List<Vendor> readVendors(String path) throws IOException{
		List<String> readVendorList = super.readFromFile(path);
		for (String item : readVendorList) {
			String[] vendorData = item.split(Constants.COMMA);
			Vendor vendor = new Vendor();
			vendor.setVendorName(vendorData[0]);
			vendor.setVendorDescription(vendorData[1]);
			vendorList.add(vendor);
			
		}
		return vendorList;
		
	}
	
	public void writeVendors(String path) throws IOException {
		List<String> items = new ArrayList<>();
		StringBuilder buildVendor = new StringBuilder();
		for (Vendor vendor : vendorList) {
			buildVendor.append(vendor.getVendorName());
			buildVendor.append(Constants.COMMA);
			buildVendor.append(vendor.getVendorDescription());		
			buildVendor.append(Constants.NEWLINE);
			items.add(buildVendor.toString());
		}
		super.writeToFile(path, items);
	}

	
	

}
