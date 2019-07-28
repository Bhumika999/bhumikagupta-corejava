package com.brainmentors.salaryslip;

public class StringUtil {
	

private StringUtil(){                //why we use constructor(and private cons) here?
		                              // we made private cons to stop object creation 
	}
	
	public static String titleCase(String str) {          //we don't make object of stringutil to call the method titlecase so we prevent our user to make object so we make the stringutil static 

		String fullName ="";

		if(str!=null && str.trim().length()>0) {

			String strArr [] = str.split(" ");
			for(String st : strArr) {

				fullName += String.valueOf(st.charAt(0)).toUpperCase()

				+ st.substring(1).toLowerCase()+" ";

//				char ch = st.charAt(0);

//				String ch2 = String.valueOf(ch);

//				ch2  = ch2.toUpperCase();

//				String subString = st.substring(1);

//				subString = subString.toLowerCase();

//				fullName += ch2 + subString+ " ";

			}

		}

		return fullName;

	}

}



	