package productiondept;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import connectionn.CreateConnection;

public class pdSalaryEntry extends CreateConnection
{

	Connection c;
	String qry,s1,s2,s3,s9;
	int s4,s5,s6;
	Scanner obb=new Scanner(System.in);
	Scanner ob=new Scanner(System.in);

	public void pdAprSalaryEntry() throws SQLException
	{
		c=getConnection();
		Statement st;
		st=c.createStatement();
		ResultSet rs;
		PreparedStatement ps;
		System.out.println("Enter Emp_Id:");
		s1=obb.nextLine();
		qry="select *from production_dept;";
		rs=st.executeQuery(qry);
		while(rs.next())
		{
			if(s1.equals(rs.getString(1)))
			{
				System.out.println();
				System.out.println("==============================================");
				System.out.println("Name    :   "+rs.getString(2));		
				System.out.println("==============================================");
				System.out.println();
			}
		}
		System.out.println("Type Emp Name to Confirm:");
		s2=obb.nextLine();
		System.out.println("Salary Month :(Type First 3letter Only ... Ex- jan,feb,mar..etc)");
		s3=obb.nextLine();
		System.out.println("No of Present Days:");
		s4=ob.nextInt();
		System.out.println("Per Day Salary:");
		s5=ob.nextInt();
		qry= "insert into production_dept_salary_apr (Emp_Id,Name,Month,no_of_p,per_day_salary) values (?,?,?,?,?);";
		ps=c.prepareStatement(qry);
		ps.setString(1, s1);
		ps.setString(2, s2);
		ps.setString(3, s3);
		ps.setInt(4, s4);
		ps.setInt(5, s5);
		ps.executeUpdate();
		System.out.println("==============================================");
		System.out.println(" ***  Salary Details Inserted Successfully ***");
		System.out.println("==============================================");							
	}
	
	public void pdMaySalaryEntry() throws SQLException
	{
		c=getConnection();
		Statement st;
		st=c.createStatement();
		ResultSet rs;
		PreparedStatement ps;
		System.out.println("Enter Emp_Id:");
		s1=obb.nextLine();
		qry="select *from production_dept;";
		rs=st.executeQuery(qry);
		while(rs.next())
		{
			if(s1.equals(rs.getString(1)))
			{
				System.out.println();
				System.out.println("==============================================");
				System.out.println("Name    :   "+rs.getString(2));		
				System.out.println("==============================================");
				System.out.println();
			}
		}
		System.out.println("Type Emp Name to Confirm:");
		s2=obb.nextLine();
		System.out.println("Salary Month :(Type First 3letter Only ... Ex- jan,feb,mar..etc)");
		s3=obb.nextLine();
		System.out.println("No of Present Days:");
		s4=ob.nextInt();
		System.out.println("Per Day Salary:");
		s5=ob.nextInt();
		qry= "insert into production_dept_salary_may (Emp_Id,Name,Month,no_of_p,per_day_salary) values (?,?,?,?,?);";
		ps=c.prepareStatement(qry);
		ps.setString(1, s1);
		ps.setString(2, s2);
		ps.setString(3, s3);
		ps.setInt(4, s4);
		ps.setInt(5, s5);
		ps.executeUpdate();
		System.out.println("==============================================");
		System.out.println(" ***  Salary Details Inserted Successfully ***");
		System.out.println("==============================================");	
	}

	public void pdJunSalaryEntry() throws SQLException
	{
	c=getConnection();
	Statement st;
	st=c.createStatement();
	ResultSet rs;
	PreparedStatement ps;
	System.out.println("Enter Emp_Id:");
	s1=obb.nextLine();
	qry="select *from production_dept;";
	rs=st.executeQuery(qry);
	while(rs.next())
	{
		if(s1.equals(rs.getString(1)))
		{
			System.out.println();
			System.out.println("==============================================");
			System.out.println("Name    :   "+rs.getString(2));		
			System.out.println("==============================================");
			System.out.println();
		}
	}
	System.out.println("Type Emp Name to Confirm:");
	s2=obb.nextLine();
	System.out.println("Salary Month :(Type First 3letter Only ... Ex- jan,feb,mar..etc)");
	s3=obb.nextLine();
	System.out.println("No of Present Days:");
	s4=ob.nextInt();
	System.out.println("Per Day Salary:");
	s5=ob.nextInt();
	qry= "insert into production_dept_salary_jun (Emp_Id,Name,Month,no_of_p,per_day_salary) values (?,?,?,?,?);";
	ps=c.prepareStatement(qry);
	ps.setString(1, s1);
	ps.setString(2, s2);
	ps.setString(3, s3);
	ps.setInt(4, s4);
	ps.setInt(5, s5);
	ps.executeUpdate();
	System.out.println("==============================================");
	System.out.println(" ***  Salary Details Inserted Successfully ***");
	System.out.println("==============================================");	
}	
}
