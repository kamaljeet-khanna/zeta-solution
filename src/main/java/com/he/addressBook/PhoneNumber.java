package com.he.addressBook;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
	
	
    private String label;
    private String phoneNumber;

    public PhoneNumber(String label, String phoneNumber) throws Exception {
        // TODO
    	this.label=label;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    

    public String validLabel()
    {
    	Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = pattern.matcher(label);
    	if(!label.isEmpty() && matcher.matches() && label.matches("[0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]"))
    	{
    		return label;
    	}
		return "Format of Label is not correct";
    }
    
    public String validPhoneNumber()
    {
    	Pattern pattern = Pattern.compile("\\\\d{10}");
    	Matcher matcher = pattern.matcher(phoneNumber);
    	if(!phoneNumber.isEmpty() && matcher.matches())
    	{
    		return phoneNumber;
    	}
    	return "Format of PhoneNumber is not correct";
    }
    
}
