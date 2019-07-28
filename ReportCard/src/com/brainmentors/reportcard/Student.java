package com.brainmentors.reportcard;

public class Student {
	private int id;  

	private String name;

	private String course;
	
	String phone;
	
	int marks[]= new int[3];


public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

   public void setPhone(String phone) {
        this.phone = phone;
    }
	
	public String getPhone() {
         return phone;
	}
	
	public void setMarks(int[] marks) {

		this.marks = marks;

	}

    public int[] getMarks() {
		return marks;
	}

Student(){}


Student (int id, String name){

	this(); 

	this.id = id ;

	this.name = StringUtil.titleCase(name);

}


Student(int id, String name , String phone, int marks[]){

    this(id, name);         

	this.phone = phone;

	this.marks = marks;

}


	public String printReport() {
		String markStr = "";
		for(int mark:marks) {
			markStr+=mark+"\n";
		}
			return 
					"Marks are \n"+markStr+"\n Name is "+name+"\nPhone no is \t"+phone+"\n percentage is \t"+per()+
					"\n total marks are "+total()+"\n grade is "+grade(); 
		}


private int total() {

	int sum = 0;

	for(int mark : marks) {

		sum+=mark;

	}

	return sum;
}
	
	private double per() {

		return total()/marks.length;

	}

	private String grade() {

			double percentage = per();

			if(percentage>=90) {

				return "A Grade";

			}

			else

			if(percentage<90 && percentage>=70) {

				return "B Grade";

			}

			else

			if(percentage<70 && percentage>=60) {	

				return "C Grade";

			}

			else {

				return "D Grade";

			}

}
}
