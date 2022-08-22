
 class StudentClass {
	 
	int rno;
	 String name;
 
	
	 void sDisplay()
	{
		 System.out.println(+rno);
		 System.out.println(name);
		}
	public static void main(String [] args)
	{
		Student student=new Student();
		Student s2=new Student();
		System.out.println(student.rno);
		System.out.println(student.name);
		student.rno=2;
		student.name="Pragati";
		
		System.out.println(s2.rno);
		System.out.println(s2.name);
		s2.rno=2;
		s2.name="Pragati";
		
		System.out.println(student.equals(s2));

		
	
	
	}
 }

 