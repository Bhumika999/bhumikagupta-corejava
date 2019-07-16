package com.brainmentors.reportcard;

public class StringUtil {
	

	private StringUtil(){                //why we use constructor(and private cons) here?
		
	}
	
	public static String titleCase(String str) {

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



	