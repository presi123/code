import java.sql.*; 
import java.util.*;
public class exp3 {
public static void main(String[] args) 
{ 
	try
	{ 
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee?cha racterEncoding=latin1","root","");
	Statement stmt=con.createStatement();
	int ans=1;
	do {
		System.out.println("1. Insert a record "); 
		System.out.println("2. Delete a record "); 
		System.out.println("3. Modify/Edit a record ");
		System.out.println("4. Display list of records "); 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice:");
		int ch = sc.nextInt();
		String ename;
		int eno,age;
		String query="";
		switch(ch) {
		case 1:
			System.out.println("Enter employee number:"); eno = sc.nextInt();
			System.out.println("Enter employee name:"); ename = sc.next();
			System.out.println("Enter employee age:"); age = sc.nextInt();
			query = "INSERT INTO empty " + "VALUES (" + eno+ ",'" + ename+"',"+ age+")";
			stmt.executeUpdate(query);
			break;
		case 2:
			System.out.println("Enter employee number:"); eno = sc.nextInt();
			query = "delete from empty where eno='"+eno+"'";	
			stmt.executeUpdate(query);
			System.out.println("Record is deleted from the table successfully.................."); break;
		case 3:
			PreparedStatement ps = null;
			query = "update empty set ename=? where eno=? ";
			ps = con.prepareStatement(query); System.out.println("Enter employee number:"); eno = sc.nextInt();
			System.out.println("Enter employee name:"); ename = sc.next();
			ps.setString(1, ename);
			ps.setInt(2, eno);
			ps.executeUpdate();
			System.out.println("Record is updated successfully......"); break;
		case 4:
			ResultSet rs=stmt.executeQuery("select * from empty");
			while(rs.next())
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)); }
			System.out.println("Enter another(1/0)");	
			ans = sc.nextInt();
	}while(ans==1);
	con.close();
	}
	catch(Exception e){ System.out.println(e);}
}
}