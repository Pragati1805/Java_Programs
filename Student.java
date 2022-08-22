

public class Student {
	int rno=1;
	String name ="Adesh";
	
	public boolean equals(Object o)
	{
		if(this==o)				//if class student both objects are same i.e student=s2 then it will true
			return true;
		if(o==null)						//if class student object s2 is null then it returns true
			return true;
		if(this.getClass()!=o.getClass())
			return false;
		Student student=(Student) o;
		if(this.rno==student.rno && this.name.equals(student.name))
			return true;
		else
			return false;
	}
}
	
	
	

	

