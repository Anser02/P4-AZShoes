package designdept;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import connectionn.CreateConnection;

public class StaffDetails extends CreateConnection
{
	Scanner obb=new Scanner (System.in);
	String qry,d,d1,e;
	Connection c;
	
	
	public void StaffDeatilsCorrection() throws SQLException
	{
		c=getConnection();
		Statement st;
		st=c.createStatement();
		ResultSet rs;
		PreparedStatement ps;	
		String d,d1,d2,d3;
		System.out.println("Enter Emp_Id:");
		d=obb.nextLine();
		qry="select *from design_dept;";
		rs=st.executeQuery(qry);
		while(rs.next())
		{
			if(d.equals(rs.getString(1)))
			{
				System.out.println();
				System.out.println("==============================================");

				System.out.println("Emp_Id   :   "+rs.getString(1));
				System.out.println("Name     :   "+rs.getString(2));
				System.out.println("Position :   "+rs.getString(3));
				System.out.println("MobileNo :   "+rs.getString(4));
				System.out.println("Email Id :   "+rs.getString(5));
				System.out.println("Address  :   "+rs.getString(6));
				System.out.println("==============================================");
				System.out.println();
			}
		}
		System.out.println(" *** Press 'e' - Emp Id Correction      *** ");
		System.out.println(" *** Press 'n' - Name Correction        *** ");
		System.out.println(" *** Press 'p' - Position Correction    *** ");
		System.out.println(" *** Press 'm' - Mobile No Correction   *** ");
		System.out.println(" *** Press 'em'- Email-Id Correction    *** ");
		System.out.println(" *** Press 'a' - Address Correction     *** ");
		d2=obb.nextLine();
		switch(d2)
		{
		case "e":
			System.out.println("Enter New Emp_Id:");
			d3=obb.nextLine();
			qry="update design_dept set Emp_Id=? where Emp_Id=?";
			ps=c.prepareStatement(qry);
			ps.setString(1, d3);
			ps.setString(2, d);
			ps.executeUpdate();
			System.out.println("==============================================");
			System.out.println(" ***  Emp_Id Updated Successfully ***");
			System.out.println("==============================================");
			break;
			
		case "n":
			System.out.println("Enter New Name:");
			d3=obb.nextLine();
			qry="update design_dept set Name=? where Emp_Id=?";
			ps=c.prepareStatement(qry);
			ps.setString(1, d3);
			ps.setString(2, d);
			ps.executeUpdate();
			System.out.println("==============================================");
			System.out.println(" ***  Name Updated Successfully ***");
			System.out.println("==============================================");
			
			break;
		case "p":
			System.out.println("Enter New Position:");
			d3=obb.nextLine();
			qry="update design_dept set Position=? where Emp_Id=?";
			ps=c.prepareStatement(qry);
			ps.setString(1, d3);
			ps.setString(2, d);
			ps.executeUpdate();
			System.out.println("==============================================");
			System.out.println(" ***  Position Updated Successfully ***");
			System.out.println("==============================================");
			break;
		case "m":
			System.out.println("Enter New Mobile No:");
			d3=obb.nextLine();
			qry="update design_dept set Mobile_No=? where Emp_Id=?";
			ps=c.prepareStatement(qry);
			ps.setString(1, d3);
			ps.setString(2, d);
			ps.executeUpdate();
			System.out.println("==============================================");
			System.out.println(" ***  Mobile No Updated Successfully ***");
			System.out.println("==============================================");
			break;
			
		case "em":
			System.out.println("Enter New Email Id:");
			d3=obb.nextLine();
			qry="update design_dept set Email_Id=? where Emp_Id=?";
			ps=c.prepareStatement(qry);
			ps.setString(1, d3);
			ps.setString(2, d);
			ps.executeUpdate();
			System.out.println("==============================================");
			System.out.println(" ***  Email-Id Updated Successfully ***");
			System.out.println("==============================================");
			break;
			
		case "a":
			System.out.println("Enter New Address:");
			d3=obb.nextLine();
			qry="update design_dept set Address=? where Emp_Id=?";
			ps=c.prepareStatement(qry);
			ps.setString(1, d3);
			ps.setString(2, d);
			ps.executeUpdate();
			System.out.println("==============================================");
			System.out.println(" ***  Address Updated Successfully ***");
			System.out.println("==============================================");
			break;
			default :
				System.out.println("*** Invalid Input ***");
				System.out.println();
	}
	}
	
	
	public void AddNewStaff() throws SQLException
	{
		c=getConnection();
		Statement st;
		st=c.createStatement();
		ResultSet rs;
		PreparedStatement ps;
		String na,nb,nc,nd,ne,nf;
		System.out.println("Enter Emp_Id:");
		na=obb.nextLine();
		System.out.println("Enter Name :");
		nb=obb.nextLine();
		System.out.println("Enter Position:");
		nc=obb.nextLine();
		System.out.println("Enter Mobile No:");
		nd=obb.nextLine();
		System.out.println("Enter Email Id:");
		ne=obb.nextLine();
		System.out.println("Enter Address:");
		nf=obb.nextLine();
		qry="insert into design_dept values (?,?,?,?,?,?);";
		ps=c.prepareStatement(qry);
		ps.setString(1, na);
		ps.setString(2, nb);
		ps.setString(3, nc);
		ps.setString(4, nd);
		ps.setString(5, ne);
		ps.setString(6, nf);
		ps.executeUpdate();
		System.out.println();
		System.out.println("==============================================");
		System.out.println(" *** New Staff Details Added Successfully ***");
		System.out.println("==============================================");
	}
	
	
	public void ParticularstaffDeatils() throws SQLException
	{
		c=getConnection();
		Statement st;
		st=c.createStatement();
		ResultSet rs;
		System.out.println("Enter Emp_Id:");
		e=obb.nextLine();
		qry="select *from design_dept;";
		rs=st.executeQuery(qry);
		while(rs.next())
		{
			if(e.equals(rs.getString(1)))
			{
				System.out.println("==============================================");
			System.out.println("Emp_Id   :   "+rs.getString(1));
			System.out.println("Name     :   "+rs.getString(2));
			System.out.println("Position :   "+rs.getString(3));
			System.out.println("MobileNo :   "+rs.getString(4));
			System.out.println("Email Id :   "+rs.getString(5));
			System.out.println("Address  :   "+rs.getString(6));
			System.out.println("==============================================");
			System.out.println();
			}
		}
	}
	
	
	public void DeleteStaff() throws SQLException
	{
		c=getConnection();
		Statement st;
		st=c.createStatement();
		ResultSet rs;
		PreparedStatement ps;
		System.out.println("Enter Emp_Id:");
		d=obb.nextLine();
		qry="select *from design_dept;";
		rs=st.executeQuery(qry);
		while(rs.next())
		{
			if(d.equals(rs.getString(1)))
			{
				System.out.println();
				System.out.println("Name    :   "+rs.getString(2));
				System.out.println();
			}
		}
		System.out.println("Are you want to Delete the Details ? (Type 'yes')");
		d1=obb.nextLine();
		switch(d1)
		{
		case "yes":
			qry="delete from design_dept where Emp_Id=?;";
			ps=c.prepareStatement(qry);
			ps.setString(1, d);
			ps.executeUpdate();
			System.out.println();
			System.out.println("==============================================");
			System.out.println(" *** Staff Details Deleted Successfully ***");
			System.out.println("==============================================");
			break;
//		case "no":
//			System.exit(0);
//			break;
//			default :
//				System.out.println("*** Invalid Input ***");		
		}
	}
	
	
	
	
	public void AllStaffs() throws SQLException
	{
		
		c=getConnection();
		Statement st;
		st=c.createStatement();
		ResultSet rs;
		qry="select *from design_dept;";
		rs=st.executeQuery(qry);
		while(rs.next())
		{
			System.out.println("==============================================");
			System.out.println("Emp_Id   :   "+rs.getString(1));
			System.out.println("Name     :   "+rs.getString(2));
			System.out.println("Position :   "+rs.getString(3));
			System.out.println("MobileNo :   "+rs.getString(4));
			System.out.println("Email Id :   "+rs.getString(5));
			System.out.println("Address  :   "+rs.getString(6));
			System.out.println("==============================================");
			System.out.println();
		}
	}
}
