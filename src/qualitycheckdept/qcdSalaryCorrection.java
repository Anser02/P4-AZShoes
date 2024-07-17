package qualitycheckdept;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import connectionn.CreateConnection;

public class qcdSalaryCorrection extends CreateConnection
{

	Connection c;
	String qry,ee,eee;
	Scanner obb=new Scanner(System.in);
	Scanner ob=new Scanner(System.in);
	
	public void qcdscJan() throws SQLException
	{
		c=getConnection();
		Statement st;
		st=c.createStatement();
		ResultSet rs;
		PreparedStatement ps;
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
			System.out.println(" Press '1' - to change No_of_Present");
			System.out.println(" Press '2' - to change Per_Day_Salary");
			//System.out.println(" Press 'Any Key' - to go Main Menu");
			String z1;
			z1=obb.nextLine();
			switch(z1)
			{
			case "1":
				int pr;
				System.out.println("Enter New No_of_Present:");
				pr=ob.nextInt();
				qry="update quality_checking_dept_salary_jan set no_of_p=? where Emp_Id=?;";
				ps=c.prepareStatement(qry);
				ps.setInt(1,pr);
				ps.setString(2, eee);
				ps.executeUpdate();
				System.out.println();
				System.out.println("=====================================");
				System.out.println(" *** Updated Successfully ***");
				System.out.println("=====================================");	
				break;
			case "2":
				System.out.println("Enter New Per_Day_Salary:");
				pr=ob.nextInt();
				qry="update quality_checking_dept_salary_jan set per_day_salary=? where Emp_Id=? ;";
				ps=c.prepareStatement(qry);
				ps.setInt(1,pr);
				ps.setString(2, eee);
				ps.executeUpdate();
				System.out.println();
				System.out.println("=====================================");
				System.out.println(" *** Updated Successfully ***");
				System.out.println("=====================================");
				break;
//				default :
//					System.out.println("*** Invalid Input ***");
			}
	}
	
	public void qcdscfeb() throws SQLException
	{
		c=getConnection();
		Statement st;
		st=c.createStatement();
		ResultSet rs;
		PreparedStatement ps;
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
			System.out.println(" Press '1' - to change No_of_Present");
			System.out.println(" Press '2' - to change Per_Day_Salary");
			//System.out.println(" Press 'Any Key' - to go Main Menu");
			String z1;
			z1=obb.nextLine();
			switch(z1)
			{
			case "1":
				int pr;
				System.out.println("Enter New No_of_Present:");
				pr=ob.nextInt();
				qry="update quality_checking_dept_salary_feb set no_of_p=? where Emp_Id=?;";
				ps=c.prepareStatement(qry);
				ps.setInt(1,pr);
				ps.setString(2, eee);
				ps.executeUpdate();
				System.out.println();
				System.out.println("=====================================");
				System.out.println(" *** Updated Successfully ***");
				System.out.println("=====================================");	
				break;
			case "2":
				System.out.println("Enter New Per_Day_Salary:");
				pr=ob.nextInt();
				qry="update quality_checking_dept_salary_feb set per_day_salary=? where Emp_Id=? ;";
				ps=c.prepareStatement(qry);
				ps.setInt(1,pr);
				ps.setString(2, eee);
				ps.executeUpdate();
				System.out.println();
				System.out.println("=====================================");
				System.out.println(" *** Updated Successfully ***");
				System.out.println("=====================================");
				break;
//				default :
//					System.out.println("*** Invalid Input ***");
			}
	}

	public void qcdscmar() throws SQLException
	{
		c=getConnection();
		Statement st;
		st=c.createStatement();
		ResultSet rs;
		PreparedStatement ps;
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
			System.out.println(" Press '1' - to change No_of_Present");
			System.out.println(" Press '2' - to change Per_Day_Salary");
			//System.out.println(" Press 'Any Key' - to go Main Menu");
			String z1;
			z1=obb.nextLine();
			switch(z1)
			{
			case "1":
				int pr;
				System.out.println("Enter New No_of_Present:");
				pr=ob.nextInt();
				qry="update quality_checking_dept_salary_mar set no_of_p=? where Emp_Id=?;";
				ps=c.prepareStatement(qry);
				ps.setInt(1,pr);
				ps.setString(2, eee);
				ps.executeUpdate();
				System.out.println();
				System.out.println("=====================================");
				System.out.println(" *** Updated Successfully ***");
				System.out.println("=====================================");	
				break;
			case "2":
				System.out.println("Enter New Per_Day_Salary:");
				pr=ob.nextInt();
				qry="update quality_checking_dept_salary_mar set per_day_salary=? where Emp_Id=? ;";
				ps=c.prepareStatement(qry);
				ps.setInt(1,pr);
				ps.setString(2, eee);
				ps.executeUpdate();
				System.out.println();
				System.out.println("=====================================");
				System.out.println(" *** Updated Successfully ***");
				System.out.println("=====================================");
				break;
//				default :
//					System.out.println("*** Invalid Input ***");
			}
	}
	public void qcdscapr() throws SQLException
	{
		c=getConnection();
		Statement st;
		st=c.createStatement();
		ResultSet rs;
		PreparedStatement ps;
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
			System.out.println(" Press '1' - to change No_of_Present");
			System.out.println(" Press '2' - to change Per_Day_Salary");
			//System.out.println(" Press 'Any Key' - to go Main Menu");
			String z1;
			z1=obb.nextLine();
			switch(z1)
			{
			case "1":
				int pr;
				System.out.println("Enter New No_of_Present:");
				pr=ob.nextInt();
				qry="update quality_checking_dept_salary_apr set no_of_p=? where Emp_Id=?;";
				ps=c.prepareStatement(qry);
				ps.setInt(1,pr);
				ps.setString(2, eee);
				ps.executeUpdate();
				System.out.println();
				System.out.println("=====================================");
				System.out.println(" *** Updated Successfully ***");
				System.out.println("=====================================");	
				break;
			case "2":
				System.out.println("Enter New Per_Day_Salary:");
				pr=ob.nextInt();
				qry="update quality_checking_dept_salary_apr set per_day_salary=? where Emp_Id=? ;";
				ps=c.prepareStatement(qry);
				ps.setInt(1,pr);
				ps.setString(2, eee);
				ps.executeUpdate();
				System.out.println();
				System.out.println("=====================================");
				System.out.println(" *** Updated Successfully ***");
				System.out.println("=====================================");
				break;
//				default :
//					System.out.println("*** Invalid Input ***");
			}
	}
	public void qcdscmay() throws SQLException
	{
		c=getConnection();
		Statement st;
		st=c.createStatement();
		ResultSet rs;
		PreparedStatement ps;
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
			System.out.println(" Press '1' - to change No_of_Present");
			System.out.println(" Press '2' - to change Per_Day_Salary");
			//System.out.println(" Press 'Any Key' - to go Main Menu");
			String z1;
			z1=obb.nextLine();
			switch(z1)
			{
			case "1":
				int pr;
				System.out.println("Enter New No_of_Present:");
				pr=ob.nextInt();
				qry="update quality_checking_dept_salary_may set no_of_p=? where Emp_Id=?;";
				ps=c.prepareStatement(qry);
				ps.setInt(1,pr);
				ps.setString(2, eee);
				ps.executeUpdate();
				System.out.println();
				System.out.println("=====================================");
				System.out.println(" *** Updated Successfully ***");
				System.out.println("=====================================");	
				break;
			case "2":
				System.out.println("Enter New Per_Day_Salary:");
				pr=ob.nextInt();
				qry="update quality_checking_dept_salary_may set per_day_salary=? where Emp_Id=? ;";
				ps=c.prepareStatement(qry);
				ps.setInt(1,pr);
				ps.setString(2, eee);
				ps.executeUpdate();
				System.out.println();
				System.out.println("=====================================");
				System.out.println(" *** Updated Successfully ***");
				System.out.println("=====================================");
				break;
//				default :
//					System.out.println("*** Invalid Input ***");
			}
	}
	public void qcdscjun() throws SQLException
	{
		c=getConnection();
		Statement st;
		st=c.createStatement();
		ResultSet rs;
		PreparedStatement ps;
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
			System.out.println(" Press '1' - to change No_of_Present");
			System.out.println(" Press '2' - to change Per_Day_Salary");
			//System.out.println(" Press 'Any Key' - to go Main Menu");
			String z1;
			z1=obb.nextLine();
			switch(z1)
			{
			case "1":
				int pr;
				System.out.println("Enter New No_of_Present:");
				pr=ob.nextInt();
				qry="update quality_checking_dept_salary_jun set no_of_p=? where Emp_Id=?;";
				ps=c.prepareStatement(qry);
				ps.setInt(1,pr);
				ps.setString(2, eee);
				ps.executeUpdate();
				System.out.println();
				System.out.println("=====================================");
				System.out.println(" *** Updated Successfully ***");
				System.out.println("=====================================");	
				break;
			case "2":
				System.out.println("Enter New Per_Day_Salary:");
				pr=ob.nextInt();
				qry="update quality_checking_dept_salary_jun set per_day_salary=? where Emp_Id=? ;";
				ps=c.prepareStatement(qry);
				ps.setInt(1,pr);
				ps.setString(2, eee);
				ps.executeUpdate();
				System.out.println();
				System.out.println("=====================================");
				System.out.println(" *** Updated Successfully ***");
				System.out.println("=====================================");
				break;
//				default :
//					System.out.println("*** Invalid Input ***");
			}
	}

}
