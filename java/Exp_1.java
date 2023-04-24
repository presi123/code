//serialization technique with i/o handling
import java.util.*;
import java.io.*;
class employee implements Serializable{
	private String name;
	private int eno;
	private float salary;
	private int age;
	private Date doj;
	public employee(){
		name="";
		eno=100;
		salary=0.0f;
		age=0;
		doj=new Date(2023,01,01);
	}
	public employee(int eno,String name,float salary,int age,Date doj) {
		this.eno=eno;
		this.name=name;
		this.salary=salary;
		this.age=age;
		this.doj=doj;
	}
	public String getName() {
		return name;
	}
	public int geteno() {
		return eno;
	}
	public void seteno(int eno) {
		this.eno=eno;
	}
	public void setname(String name) {
		this.name=name;
	}
	public void setsalary(float salary) {
		this.salary=salary;
	}
	public float getsalary() {
		return salary;
	}
	public void setage(int age) {
		this.age=age;
	}
    public int getage() {
    	return age;
    }
    public void setdate(Date doj) {
    	this.doj=doj;
    }
    public Date getdate() {
    	return doj;
    }
    public String toString() {
    	return geteno()+" "+getName()+" "+getsalary()+" "+getage()+" "+getdate()+"\n";
    }
}
public class Exp_1 {
	public static void main(String[] args) {
		employee e1=new employee(121,"uday",100000.00f,25,new Date(2018,8,15));
		try {
			FileOutputStream fos=new FileOutputStream("d:\\x.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(e1);
			fos.close();
			oos.close();
		}catch(Exception e) {
            System.out.println("Exception : "+e);			
		}
		try {
			FileInputStream fis=new FileInputStream("d:\\x.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			e1=(employee)ois.readObject();
			System.out.println(e1);
			fis.close();
			ois.close();
		}catch(Exception e) {}
	}

}
