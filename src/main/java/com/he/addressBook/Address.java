package com.he.addressBook;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Address {

	private String label;
	private String address;
	
	public Address(String label, String address) throws Exception {
		// TODO
	}
	
	public String getLabel() {
		return this.label;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	 public String validAddressLabel()
	  {
		 Pattern pattern = Pattern.compile("[a-zA-Z]+");
	        Matcher matcher = pattern.matcher(label);
	    	if(!label.isEmpty() && matcher.matches() && label.matches("[0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]"))
	    	{
	    		return label;
	    	}
			return "Format of Label is not correct";	
	    }
}
