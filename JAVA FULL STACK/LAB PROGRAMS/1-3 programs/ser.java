package comparator;

import java.io.*;
import java.util.*;
class Employee implements Serializable {
private String name;
private int eno;
private float salary;
private int age;
private Date doj;
@SuppressWarnings("deprecation")
public Employee( ) {
name="";
eno=100;
salary=0.0f;
age = 0;
doj = new Date(2023,01,01);
}
public Employee(int eno,String name,float salary,int age,Date doj) {
this.eno = eno;
this.name = name;
this.salary = salary;
this.age = age;
this.doj = doj;
}
public String getName() {
return name;
}
public int getEno() {
return eno;
}
public void setEno(int eno) {
this.eno = eno;
}
public void setName(String name ) {
this.name=name;
}
public void setSalary(float salary) {
this.salary = salary;
}
public float getSalary() {
return salary;
}
public void setAge(int age) {
this.age = age;
}
public int getAge() {
return age;
}
public void setDate(Date doj) {
this.doj = doj;
}
public Date getDate( ) {
return doj;
}
@Override
public String toString() {
return getEno() + " "+getName() + " " + getSalary() + " " + getAge() + " " + getDate() + "\n";
}
}
public class ser {
@SuppressWarnings("deprecation")
public static void main(String[] args) {
// TODO Auto-generated method stub
Employee e1 = new Employee(1,"God",100000.00f,45,new Date(1970,8,15));
try {
FileOutputStream fos = new FileOutputStream("d:\\x.txt");
ObjectOutputStream oos = new ObjectOutputStream(fos);
oos.writeObject(e1);
fos.close();
oos.close();
}catch(Exception e) {
}
try {
FileInputStream fis = new FileInputStream("d:\\x.txt");
ObjectInputStream ois = new ObjectInputStream(fis);
e1=(Employee)ois.readObject();
System.out.println(e1);
fis.close();
ois.close();
}catch(Exception e) {
}
}
}
