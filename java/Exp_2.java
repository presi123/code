//java comparator using io
import java.util.*;
import java.io.*;
class student{
	int rollno;
	String name;
	float fees;
	String branch;
	int year;
	int sem;
	int age;
	static String clg;
	public student(int rollno,String name,float fees,String branch,int year,int sem,int age) {
	this.rollno=rollno;
	this.name=name;
	this.fees=fees;
	this.branch=branch;
	this.year=year;
	this.sem=sem;
	this.age=age;
	clg="Presidency University";
	}
	public String toString() {
		return rollno+" "+name+" "+fees+" "+branch+" "+year+" "+sem+" "+age+" "+clg+"\n";
	}
}
class AgeComparator implements Comparator{

		@Override
		public int compare(Object o1, Object o2) {
			student s1=(student)o1;
			student s2=(student)o2;
			if(s1.age==s2.age)
				return 0;
			else if(s1.age>s2.age)
				return 1;
			else
				return -1;
		}
}
class NameComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		student s1=(student)o1;
		student s2=(student)o2;
		return s1.name.compareTo(s2.name);
	}
	
}
class FeesComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		student s1=(student)o1;
		student s2=(student)o2;
		if(s1.fees==s2.fees)
			return 0;
		else if(s1.fees>s2.fees)
			return 1;
		else
			return -1;
	}
	
}
public class Exp_2 {

	public static void main(String[] args) {
		ArrayList s1=new ArrayList();
		s1.add(new student(1,"uday",225000.00f,"cse",1,1,18));
		s1.add(new student(2,"mahaboob",100000.00f,"civil",1,2,20));
		s1.add(new student(3,"Bheema",100000.00f,"ece",1,1,19));
		System.out.println("******---- SORTING BY NAME ----******");
		System.out.println("-------------------------------------");
		Collections.sort(s1,new NameComparator());
		Iterator itr=s1.iterator();
		while(itr.hasNext()) {
			student st=(student)itr.next();
			System.out.println(st.rollno+" "+st.name+" "+st.fees+" "+st.branch+" "+st.year+" "+st.sem+" "+st.age+" "+student.clg);
		}
       System.out.println("sorting by age");
       System.out.println("______________");
       Collections.sort(s1,new AgeComparator());
       Iterator itr2=s1.iterator();
       while(itr2.hasNext()) {
    	   student st=(student)itr2.next();
    	   System.out.println(st.rollno+" "+st.name+" "+st.fees+" "+st.branch+" "+st.year+" "+st.sem+" "+st.age+" "+student.clg);
       }
       System.out.println("Sorting by fees");
       System.out.println("_______________");
       Collections.sort(s1,new FeesComparator());
       Iterator itr3=s1.iterator();
       while(itr3.hasNext()) {
    	   student st=(student)itr3.next();
    	   System.out.println(st.rollno+" "+st.name+" "+st.fees+" "+st.branch+" "+st.year+" "+st.sem+" "+st.age+" "+student.clg);
       }
    }
}
