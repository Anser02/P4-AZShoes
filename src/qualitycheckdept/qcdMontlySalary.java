package qualitycheckdept;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import connectionn.CreateConnection;

public class qcdMontlySalary extends CreateConnection
{

	int i1;
	String qry,ee,eee;
	Connection c;
	Scanner obb=new Scanner(System.in);
	Scanner ob=new Scanner(System.in);

	public void qcdJan() throws SQLException
	{
		c=getConnection();
		Statement st;
		st=c.createStatement();
		ResultSet rs;
		PreparedStatement ps;
		System.out.println(" *** Press 'a' - All Staff Salary Details       *** ");
		System.out.println(" *** Press 'p' - Particular Staff SalaryDetails *** ");
		//System.out.println(" Press 'Any Key' - to go Main Menu");
		ee=obb.nextLine();
		switch(ee)
		{
		case "a":
		qry="select *from quality_checking_dept_salary_jan;";
		rs=st.executeQuery(qry);
		while(rs.next())
		{
			System.out.println();
			System.out.println("=====================================");
			System.out.println("Emp_Id         :   "+rs.getString(1));
			System.out.println("Name           :   "+rs.getString(2));
			System.out.println("Salary Month   :   "+rs.getString(3));
			System.out.println("Working Days   :   "+rs.getString(4));
			System.out.println("Per Day Salary :   "+rs.getString(5));
			System.out.println("Gross Salary   :   Rs."+rs.getString(6));
			System.out.println("HR Allowance   :   Rs."+rs.getString(7));
			System.out.println("EPF            :   Rs."+rs.getString(8));
			System.out.println("=====================================");
			System.out.println("Net Salary     :   Rs."+rs.getString(9));
			System.out.println("=====================================");
			System.out.println();
		}
		break;
		case "p":
			System.out.println("Enter Emp_Code");
			eee=obb.nextLine();
			qry="select *from quality_checking_dept_salary_jan;";
			rs=st.executeQuery(qry);
			while(rs.next())
			{
				if(eee.equals(rs.getString(1)))
				{
				System.out.println();
				System.out.println("=====================================");
				System.out.println("Emp_Id         :   "+rs.getString(1));
				System.out.println("Name           :   "+rs.getString(2));
				System.out.println("Salary Month   :   "+rs.getString(3));
				System.out.println("Working Days   :   "+rs.getString(4));
				System.out.println("Per Day Salary :   "+rs.getString(5));
				System.out.println("Gross Salary   :   Rs."+rs.getString(6));
				System.out.println("HR Allowance   :   Rs."+rs.getString(7));
				System.out.println("EPF            :   Rs."+rs.getString(8));
				System.out.println("=====================================");
				System.out.println("Net Salary     :   Rs."+rs.getString(9));
				System.out.println("=====================================");
				System.out.println();
				}
			}								
		} // jn month salry
		
	}
	
	public void qcdfeb() throws SQLException
	{
		c=getConnection();
		Statement st;
		st=c.createStatement();
		ResultSet rs;
		PreparedStatement ps;
		System.out.println(" *** Press 'a' - All Staff Salary Details       *** ");
		System.out.println(" *** Press 'p' - Particular Staff SalaryDetails *** ");
		ee=obb.nextLine();
		switch(ee)
		{
		case "a":
		qry="select *from quality_checking_dept_salary_feb;";
		rs=st.executeQuery(qry);
		while(rs.next())
		{
			System.out.println();
			System.out.println("=====================================");
			System.out.println("Emp_Id         :   "+rs.getString(1));
			System.out.println("Name           :   "+rs.getString(2));
			System.out.println("Salary Month   :   "+rs.getString(3));
			System.out.println("Working Days   :   "+rs.getString(4));
			System.out.println("Per Day Salary :   "+rs.getString(5));
			System.out.println("Gross Salary   :   Rs."+rs.getString(6));
			System.out.println("HR Allowance   :   Rs."+rs.getString(7));
			System.out.println("EPF            :   Rs."+rs.getString(8));
			System.out.println("=====================================");
			System.out.println("Net Salary     :   Rs."+rs.getString(9));
			System.out.println("=====================================");
			System.out.println();
		}
		break;
		case "p":
			System.out.println("Enter Emp_Code");
			eee=obb.nextLine();
			qry="select *from quality_checking_dept_salary_feb;";
			rs=st.executeQuery(qry);
			while(rs.next())
			{
				if(eee.equals(rs.getString(1)))
				{
				System.out.println();
				System.out.println("=====================================");
				System.out.println("Emp_Id         :   "+rs.getString(1));
				System.out.println("Name           :   "+rs.getString(2));
				System.out.println("Salary Month   :   "+rs.getString(3));
				System.out.println("Working Days   :   "+rs.getString(4));
				System.out.println("Per Day Salary :   "+rs.getString(5));
				System.out.println("Gross Salary   :   Rs."+rs.getString(6));
				System.out.println("HR Allowance   :   Rs."+rs.getString(7));
				System.out.println("EPF            :   Rs."+rs.getString(8));
				System.out.println("=====================================");
				System.out.println("Net Salary     :   Rs."+rs.getString(9));
				System.out.println("=====================================");
				System.out.println();
				}
	}
		}
	}
	public void qcdmar() throws SQLException
	{
		c=getConnection();
		Statement st;
		st=c.createStatement();
		ResultSet rs;
		PreparedStatement ps;
		System.out.println(" *** Press 'a' - All Staff Salary Details       *** ");
		System.out.println(" *** Press 'p' - Particular Staff SalaryDetails *** ");
		ee=obb.nextLine();
		switch(ee)
		{
		case "a":
		qry="select *from quality_checking_dept_salary_mar;";
		rs=st.executeQuery(qry);
		while(rs.next())
		{
			System.out.println();
			System.out.println("=====================================");
			System.out.println("Emp_Id         :   "+rs.getString(1));
			System.out.println("Name           :   "+rs.getString(2));
			System.out.println("Salary Month   :   "+rs.getString(3));
			System.out.println("Working Days   :   "+rs.getString(4));
			System.out.println("Per Day Salary :   "+rs.getString(5));
			System.out.println("Gross Salary   :   Rs."+rs.getString(6));
			System.out.println("HR Allowance   :   Rs."+rs.getString(7));
			System.out.println("EPF            :   Rs."+rs.getString(8));
			System.out.println("=====================================");
			System.out.println("Net Salary     :   Rs."+rs.getString(9));
			System.out.println("=====================================");
			System.out.println();
		}
		break;
		case "p":
			System.out.println("Enter Emp_Code");
			eee=obb.nextLine();
			qry="select *from quality_checking_dept_salary_mar;";
			rs=st.executeQuery(qry);
			while(rs.next())
			{
				if(eee.equals(rs.getString(1)))
				{
				System.out.println();
				System.out.println("=====================================");
				System.out.println("Emp_Id         :   "+rs.getString(1));
				System.out.println("Name           :   "+rs.getString(2));
				System.out.println("Salary Month   :   "+rs.getString(3));
				System.out.println("Working Days   :   "+rs.getString(4));
				System.out.println("Per Day Salary :   "+rs.getString(5));
				System.out.println("Gross Salary   :   Rs."+rs.getString(6));
				System.out.println("HR Allowance   :   Rs."+rs.getString(7));
				System.out.println("EPF            :   Rs."+rs.getString(8));
				System.out.println("=====================================");
				System.out.println("Net Salary     :   Rs."+rs.getString(9));
				System.out.println("=====================================");
				System.out.println();
				}
	}
		}
	}
	public void qcdapr() throws SQLException
	{
		c=getConnection();
		Statement st;
		st=c.createStatement();
		ResultSet rs;
		PreparedStatement ps;
		System.out.println(" *** Press 'a' - All Staff Salary Details       *** ");
		System.out.println(" *** Press 'p' - Particular Staff SalaryDetails *** ");
		ee=obb.nextLine();
		switch(ee)
		{
		case "a":
		qry="select *from quality_checking_dept_salary_apr;";
		rs=st.executeQuery(qry);
		while(rs.next())
		{
			System.out.println();
			System.out.println("=====================================");
			System.out.println("Emp_Id         :   "+rs.getString(1));
			System.out.println("Name           :   "+rs.getString(2));
			System.out.println("Salary Month   :   "+rs.getString(3));
			System.out.println("Working Days   :   "+rs.getString(4));
			System.out.println("Per Day Salary :   "+rs.getString(5));
			System.out.println("Gross Salary   :   Rs."+rs.getString(6));
			System.out.println("HR Allowance   :   Rs."+rs.getString(7));
			System.out.println("EPF            :   Rs."+rs.getString(8));
			System.out.println("=====================================");
			System.out.println("Net Salary     :   Rs."+rs.getString(9));
			System.out.println("=====================================");
			System.out.println();
		}
		break;
		case "p":
			System.out.println("Enter Emp_Code");
			eee=obb.nextLine();
			qry="select *from quality_checking_dept_salary_apr;";
			rs=st.executeQuery(qry);
			while(rs.next())
			{
				if(eee.equals(rs.getString(1)))
				{
				System.out.println();
				System.out.println("=====================================");
				System.out.println("Emp_Id         :   "+rs.getString(1));
				System.out.println("Name           :   "+rs.getString(2));
				System.out.println("Salary Month   :   "+rs.getString(3));
				System.out.println("Working Days   :   "+rs.getString(4));
				System.out.println("Per Day Salary :   "+rs.getString(5));
				System.out.println("Gross Salary   :   Rs."+rs.getString(6));
				System.out.println("HR Allowance   :   Rs."+rs.getString(7));
				System.out.println("EPF            :   Rs."+rs.getString(8));
				System.out.println("=====================================");
				System.out.println("Net Salary     :   Rs."+rs.getString(9));
				System.out.println("=====================================");
				System.out.println();
				}
	}
		}
	}
	
	public void qcdmay() throws SQLException
	{
		c=getConnection();
		Statement st;
		st=c.createStatement();
		ResultSet rs;
		PreparedStatement ps;
		System.out.println(" *** Press 'a' - All Staff Salary Details       *** ");
		System.out.println(" *** Press 'p' - Particular Staff SalaryDetails *** ");
		ee=obb.nextLine();
		switch(ee)
		{
		case "a":
		qry="select *from quality_checking_dept_salary_may;";
		rs=st.executeQuery(qry);
		while(rs.next())
		{
			System.out.println();
			System.out.println("=====================================");
			System.out.println("Emp_Id         :   "+rs.getString(1));
			System.out.println("Name           :   "+rs.getString(2));
			System.out.println("Salary Month   :   "+rs.getString(3));
			System.out.println("Working Days   :   "+rs.getString(4));
			System.out.println("Per Day Salary :   "+rs.getString(5));
			System.out.println("Gross Salary   :   Rs."+rs.getString(6));
			System.out.println("HR Allowance   :   Rs."+rs.getString(7));
			System.out.println("EPF            :   Rs."+rs.getString(8));
			System.out.println("=====================================");
			System.out.println("Net Salary     :   Rs."+rs.getString(9));
			System.out.println("=====================================");
			System.out.println();
		}
		break;
		case "p":
			System.out.println("Enter Emp_Code");
			eee=obb.nextLine();
			qry="select *from quality_checking_dept_salary_may;";
			rs=st.executeQuery(qry);
			while(rs.next())
			{
				if(eee.equals(rs.getString(1)))
				{
				System.out.println();
				System.out.println("=====================================");
				System.out.println("Emp_Id         :   "+rs.getString(1));
				System.out.println("Name           :   "+rs.getString(2));
				System.out.println("Salary Month   :   "+rs.getString(3));
				System.out.println("Working Days   :   "+rs.getString(4));
				System.out.println("Per Day Salary :   "+rs.getString(5));
				System.out.println("Gross Salary   :   Rs."+rs.getString(6));
				System.out.println("HR Allowance   :   Rs."+rs.getString(7));
				System.out.println("EPF            :   Rs."+rs.getString(8));
				System.out.println("=====================================");
				System.out.println("Net Salary     :   Rs."+rs.getString(9));
				System.out.println("=====================================");
				System.out.println();
				}
	}
		}
	}
	public void qcdjun() throws SQLException
	{
		c=getConnection();
		Statement st;
		st=c.createStatement();
		ResultSet rs;
		PreparedStatement ps;
		System.out.println(" *** Press 'a' - All Staff Salary Details       *** ");
		System.out.println(" *** Press 'p' - Particular Staff SalaryDetails *** ");
		ee=obb.nextLine();
		switch(ee)
		{
		case "a":
		qry="select *from quality_checking_dept_salary_jun;";
		rs=st.executeQuery(qry);
		while(rs.next())
		{
			System.out.println();
			System.out.println("=====================================");
			System.out.println("Emp_Id         :   "+rs.getString(1));
			System.out.println("Name           :   "+rs.getString(2));
			System.out.println("Salary Month   :   "+rs.getString(3));
			System.out.println("Working Days   :   "+rs.getString(4));
			System.out.println("Per Day Salary :   "+rs.getString(5));
			System.out.println("Gross Salary   :   Rs."+rs.getString(6));
			System.out.println("HR Allowance   :   Rs."+rs.getString(7));
			System.out.println("EPF            :   Rs."+rs.getString(8));
			System.out.println("=====================================");
			System.out.println("Net Salary     :   Rs."+rs.getString(9));
			System.out.println("=====================================");
			System.out.println();
		}
		break;
		case "p":
			System.out.println("Enter Emp_Code");
			eee=obb.nextLine();
			qry="select *from quality_checking_dept_salary_jun;";
			rs=st.executeQuery(qry);
			while(rs.next())
			{
				if(eee.equals(rs.getString(1)))
				{
				System.out.println();
				System.out.println("=====================================");
				System.out.println("Emp_Id         :   "+rs.getString(1));
				System.out.println("Name           :   "+rs.getString(2));
				System.out.println("Salary Month   :   "+rs.getString(3));
				System.out.println("Working Days   :   "+rs.getString(4));
				System.out.println("Per Day Salary :   "+rs.getString(5));
				System.out.println("Gross Salary   :   Rs."+rs.getString(6));
				System.out.println("HR Allowance   :   Rs."+rs.getString(7));
				System.out.println("EPF            :   Rs."+rs.getString(8));
				System.out.println("=====================================");
				System.out.println("Net Salary     :   Rs."+rs.getString(9));
				System.out.println("=====================================");
				System.out.println();
				}
	}
		}
	}


}
