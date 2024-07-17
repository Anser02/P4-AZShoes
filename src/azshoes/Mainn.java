package azshoes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import connectionn.CreateConnection;
import designdept.MontlySalary;
import designdept.SalaryCorrection;
import designdept.SalaryEntry;
import designdept.StaffDetails;
import productiondept.pdMontlySalary;
import productiondept.pdSalaryCorrection;
import productiondept.pdSalaryEntry;
import productiondept.pdStaffDetails;
import qualitycheckdept.qcdMontlySalary;
import qualitycheckdept.qcdSalaryCorrection;
import qualitycheckdept.qcdSalaryEntry;
import qualitycheckdept.qcdStaffDetails;
import salesdept.sdMontlySalary;
import salesdept.sdSalaryCorrection;
import salesdept.sdSalaryEntry;
import salesdept.sdStaffDetails;




public class Mainn {

	public static void main(String[] args) throws SQLException {
		//Scanner ob=new Scanner(System.in);
		String ui,pp;
		Connection c;
		CreateConnection cc=new CreateConnection();
		c=cc.getConnection();
		Statement st=c.createStatement();
		ResultSet rs;
		PreparedStatement ps;
		boolean found = false;
		
		
		Scanner obb=new Scanner(System.in);
		String ii,iii,qry;
		System.out.println(" *** Press 'dd' - Design Department Details          *** ");
		System.out.println(" *** Press 'pd' - Production Department Details      *** ");
		System.out.println(" *** Press 'qcd' - Quality Check Department Details  *** ");
		System.out.println(" *** Press 'sd' - Sales Department Details           *** ");
		iii=obb.nextLine();
		switch(iii)
		{
		case "dd":
			while(true)
			{
			System.out.println("Enter Userid: ");
			ui=obb.nextLine();
			System.out.println("Enter Password:");
			pp=obb.nextLine();
			qry="select *from dd_login;";
			rs=st.executeQuery(qry);
			while(rs.next())
			{
				if(ui.equals(rs.getString(1))&&pp.equals(rs.getString(2)))
				{
					found=true;
					System.out.println("==========================================");
					System.out.println("   *** login Successful ***   ");
					System.out.println("==========================================");
					System.out.println();
						
			
			while(true)
			{
		System.out.println(" *** Press 'a' - All Staff Details             *** ");
		System.out.println(" *** Press 'p' - Particular Staff Details      *** ");
		System.out.println(" *** Press 'an'- Add New Staff Details         *** ");
		System.out.println(" *** Press 'd' - Delete Staff Details          *** ");
		System.out.println(" *** Press 'c' - Staff Details Corrections     *** ");
		System.out.println(" *** Press 's' - All Staff Salary Details      *** ");
		System.out.println(" *** Press 'sc' - Staff Salary Correction      *** ");
		System.out.println(" *** Press 'se'- Salary Entry                  *** ");
		System.out.println(" *** Press 'l'- Logout                         *** ");
		System.out.println();
		
		ii=obb.nextLine();
		StaffDetails s=new StaffDetails();
		switch(ii)
		{
		case "a":
			s.AllStaffs();
			break;
		case "p":
			s.ParticularstaffDeatils();
			break;
		case "an":
			s.AddNewStaff();
			break;
		case "d":s.DeleteStaff();
			break;
		case "c":
			s.StaffDeatilsCorrection();
			break;
		case "s":
			System.out.println(" *** Press '1' - January Month Salary Details         *** ");
			System.out.println(" *** Press '2' - Febraury Month Salary Details        *** ");
			System.out.println(" *** Press '3' - March Month Salary Details           *** ");
			System.out.println(" *** Press '4' - April Month Salary Details        *** ");
			System.out.println(" *** Press '5' - May Month Salary Details        *** ");
			System.out.println(" *** Press '6' - June Month Salary Details        *** ");
			String sss;
			sss=obb.nextLine();
			MontlySalary m=new MontlySalary();
			switch(sss)
			{
			case "1":
				m.Jan();
				break;
			case "2":
				m.feb();
				break;
			case "3":
				m.mar();
				break;
			case "4":m.apr();
			break;
			case "5":
				m.may();
				break;
			case "6":
				m.jun();
				break;
			default :
				System.out.println("*** Invalid Input ***");
			}
		break;
		
		case "sc":
			System.out.println(" *** Press '1' - January Month Salary Details         *** ");
			System.out.println(" *** Press '2' - Febraury Month Salary Details        *** ");
			System.out.println(" *** Press '3' - March Month Salary Details           *** ");
			System.out.println(" *** Press '4' - April Month Salary Details        *** ");
			System.out.println(" *** Press '5' - May Month Salary Details        *** ");
			System.out.println(" *** Press '6' - June Month Salary Details        *** ");
			String ssss;
			ssss=obb.nextLine();
			SalaryCorrection mc=new SalaryCorrection();
			switch(ssss)
			{
			case "1":
				mc.Jan();
				break;
			case "2":
				mc.feb();
				break;
			case "3":
				mc.mar();
				break;
			case "4":
				mc.apr();
			break;
			case "5":
				mc.may();
				break;
			case "6":
				mc.jun();
				break;
			default :
				System.out.println("*** Invalid Input ***");
			}
		break;
		case "se":
			System.out.println(" *** Press '4' - April Month Salary Details        *** ");
			System.out.println(" *** Press '5' - May Month Salary Details          *** ");
			System.out.println(" *** Press '6' - June Month Salary Details         *** ");
			String sssss;
			sssss=obb.nextLine();
			SalaryEntry se=new SalaryEntry();
			switch(sssss)
			{
			case "4":
				se.AprSalaryEntry();
				break;
			case "5":
				se.MaySalaryEntry();
				break;
			case "6":
				se.JunSalaryEntry();
				break;
			}
			break;
		case "l":
			System.out.println("*** Logout Successful ***");
			System.exit(0);
		default :
			System.out.println("*** Invalid Input ***");
		}	
		}
				}
			}
			if(!found)
			{
				System.out.println();
				System.out.println("   *** Invalid login ***   ");
			System.out.println();
			System.out.println(" *** Enter Correct Userid & Password *** ");
		System.out.println();
			}
			}
		//break;
		
			
			
			
			
			
			
		//Production Dept
		case "pd":
			while(true)
			{
			System.out.println("Enter Userid: ");
			ui=obb.nextLine();
			System.out.println("Enter Password:");
			pp=obb.nextLine();
			qry="select *from pd_login;";
			rs=st.executeQuery(qry);
			while(rs.next())
			{
				if(ui.equals(rs.getString(1))&&pp.equals(rs.getString(2)))
				{
					found=true;
					System.out.println("==========================================");
					System.out.println("   *** login Successful ***   ");
					System.out.println("==========================================");
					System.out.println();
				
			
			
			
			
			
			
			
			while(true)
			{
		System.out.println(" *** Press 'a' - All Staff Details             *** ");
		System.out.println(" *** Press 'p' - Particular Staff Details      *** ");
		System.out.println(" *** Press 'an'- Add New Staff Details         *** ");
		System.out.println(" *** Press 'd' - Delete Staff Details          *** ");
		System.out.println(" *** Press 'c' - Staff Details Corrections     *** ");
		System.out.println(" *** Press 's' - All Staff Salary Details      *** ");
		System.out.println(" *** Press 'sc' - Staff Salary Correction      *** ");
		System.out.println(" *** Press 'se'- Salary Entry                  *** ");
		System.out.println(" *** Press 'l'- Logout                         *** ");
		System.out.println();
		
		ii=obb.nextLine();
		pdStaffDetails s=new pdStaffDetails();
		switch(ii)
		{
		case "a":
			s.pdAllStaffs();
			break;
		case "p":
			s.pdParticularstaffDeatils();
			break;
		case "an":
			s.pdAddNewStaff();
			break;
		case "d":s.pdDeleteStaff();
			break;
		case "c":
			s.pdStaffDeatilsCorrection();
			break;
			
		case "s":
			System.out.println(" *** Press '1' - January Month Salary Details         *** ");
			System.out.println(" *** Press '2' - Febraury Month Salary Details        *** ");
			System.out.println(" *** Press '3' - March Month Salary Details           *** ");
			System.out.println(" *** Press '4' - April Month Salary Details        *** ");
			System.out.println(" *** Press '5' - May Month Salary Details        *** ");
			System.out.println(" *** Press '6' - June Month Salary Details        *** ");
			String sss;
			sss=obb.nextLine();
			pdMontlySalary pd=new pdMontlySalary();
			switch(sss)
			{
			case "1":
				pd.pdJan();
				break;
			case "2":
				pd.pdfeb();
				break;
			case "3":
				pd.pdmar();
				break;
			case "4":
				pd.pdapr();
			break;
			case "5":
				pd.pdmay();
				break;
			case "6":
				pd.pdjun();
				break;
			default :
				System.out.println("*** Invalid Input ***");
			}
		break;
		case "sc":
			System.out.println(" *** Press '1' - January Month Salary Details         *** ");
			System.out.println(" *** Press '2' - Febraury Month Salary Details        *** ");
			System.out.println(" *** Press '3' - March Month Salary Details           *** ");
			System.out.println(" *** Press '4' - April Month Salary Details        *** ");
			System.out.println(" *** Press '5' - May Month Salary Details        *** ");
			System.out.println(" *** Press '6' - June Month Salary Details        *** ");
			String ssss;
			ssss=obb.nextLine();
			pdSalaryCorrection p=new pdSalaryCorrection();
			switch(ssss)
			{
			case "1":
				p.pdscJan();
				break;
			case "2":
				p.pdscfeb();
				break;
			case "3":
				p.pdscmar();
				break;
			case "4":
				p.pdscapr();
			break;
			case "5":
				p.pdscmay();
				break;
			case "6":
				p.pdscjun();
				break;
			default :
				System.out.println("*** Invalid Input ***");
			}
			
		break;
		case "se":
			System.out.println(" *** Press '4' - April Month Salary Details        *** ");
			System.out.println(" *** Press '5' - May Month Salary Details          *** ");
			System.out.println(" *** Press '6' - June Month Salary Details         *** ");
			String sssss;
			sssss=obb.nextLine();
			pdSalaryEntry pdsc=new pdSalaryEntry();
			switch(sssss)
			{
			case "4":
				pdsc.pdAprSalaryEntry();
				break;
			case "5":
				pdsc.pdMaySalaryEntry();
				break;
			case "6":
				pdsc.pdJunSalaryEntry();
				break;
			}
			break;
		case "l":
			System.out.println("*** Logout Successful ***");
			System.exit(0);
		default :
			System.out.println("*** Invalid Input ***");
		}	
		}
			
				}
			}
			if(!found)
			{
				System.out.println();
				System.out.println("   *** Invalid login ***   ");
			System.out.println();
			System.out.println(" *** Enter Correct Userid & Password *** ");
		System.out.println();
			}
			}
			//break;
		
			
			
			
			
			//QC Dept
		case "qcd":
			while(true)
			{
			System.out.println("Enter Userid: ");
			ui=obb.nextLine();
			System.out.println("Enter Password:");
			pp=obb.nextLine();
			qry="select *from qcd_login;";
			rs=st.executeQuery(qry);
			while(rs.next())
			{
				if(ui.equals(rs.getString(1))&&pp.equals(rs.getString(2)))
				{
					found=true;
					System.out.println("==========================================");
					System.out.println("   *** login Successful ***   ");
					System.out.println("==========================================");
					System.out.println();
			
					
					
					
			while(true)
			{
		System.out.println(" *** Press 'a' - All Staff Details             *** ");
		System.out.println(" *** Press 'p' - Particular Staff Details      *** ");
		System.out.println(" *** Press 'an'- Add New Staff Details         *** ");
		System.out.println(" *** Press 'd' - Delete Staff Details          *** ");
		System.out.println(" *** Press 'c' - Staff Details Corrections     *** ");
		System.out.println(" *** Press 's' - All Staff Salary Details      *** ");
		System.out.println(" *** Press 'sc' - Staff Salary Correction      *** ");
		System.out.println(" *** Press 'se'- Salary Entry                  *** ");
		System.out.println(" *** Press 'l'- Logout                         *** ");
		System.out.println();
		
		ii=obb.nextLine();
		qcdStaffDetails qs=new qcdStaffDetails();
		switch(ii)
		{
		case "a":
			qs.qcdAllStaffs();
			break;
		case "p":
			qs.qcdParticularstaffDeatils();
			break;
		case "an":
			qs.qcdAddNewStaff();
			break;
		case "d":
			qs.qcdDeleteStaff();
			break;
		case "c":
			qs.qcdStaffDeatilsCorrection();
			break;
			
		case "s":
			System.out.println(" *** Press '1' - January Month Salary Details         *** ");
			System.out.println(" *** Press '2' - Febraury Month Salary Details        *** ");
			System.out.println(" *** Press '3' - March Month Salary Details           *** ");
			System.out.println(" *** Press '4' - April Month Salary Details        *** ");
			System.out.println(" *** Press '5' - May Month Salary Details        *** ");
			System.out.println(" *** Press '6' - June Month Salary Details        *** ");
			String sss;
			sss=obb.nextLine();
			qcdMontlySalary am=new qcdMontlySalary();
			switch(sss)
			{
			case "1":
				am.qcdJan();
				break;
			case "2":
				am.qcdfeb();
				break;
			case "3":
				am.qcdmar();
				break;
			case "4":
				am.qcdapr();
			break;
			case "5":
				am.qcdmay();
				break;
			case "6":
				am.qcdjun();
				break;
			default :
				System.out.println("*** Invalid Input ***");
			}
		break;
		case "sc":
			System.out.println(" *** Press '1' - January Month Salary Details         *** ");
			System.out.println(" *** Press '2' - Febraury Month Salary Details        *** ");
			System.out.println(" *** Press '3' - March Month Salary Details           *** ");
			System.out.println(" *** Press '4' - April Month Salary Details        *** ");
			System.out.println(" *** Press '5' - May Month Salary Details        *** ");
			System.out.println(" *** Press '6' - June Month Salary Details        *** ");
			String ssss;
			ssss=obb.nextLine();
			qcdSalaryCorrection p=new qcdSalaryCorrection();
			switch(ssss)
			{
			case "1":
				p.qcdscJan();
				break;
			case "2":
				p.qcdscfeb();
				break;
			case "3":
				p.qcdscmar();
				break;
			case "4":
				p.qcdscapr();
			break;
			case "5":
				p.qcdscmay();
				break;
			case "6":
				p.qcdscjun();
				break;
			default :
				System.out.println("*** Invalid Input ***");
			}
		break;
		case "se":
			System.out.println(" *** Press '4' - April Month Salary Details        *** ");
			System.out.println(" *** Press '5' - May Month Salary Details          *** ");
			System.out.println(" *** Press '6' - June Month Salary Details         *** ");
			String sssss;
			sssss=obb.nextLine();
			qcdSalaryEntry pdsc=new qcdSalaryEntry();
			switch(sssss)
			{
			case "4":
				pdsc.qcdAprSalaryEntry();
				break;
			case "5":
				pdsc.qcdMaySalaryEntry();
				break;
			case "6":
				pdsc.qcdJunSalaryEntry();
				break;
			}
			break;
		case "l":
			System.out.println("*** Logout Successful ***");
			System.exit(0);
		default :
			System.out.println("*** Invalid Input ***");
		}	
		}
				}
			}
			if(!found)
			{
				System.out.println();
				System.out.println("   *** Invalid login ***   ");
			System.out.println();
			System.out.println(" *** Enter Correct Userid & Password *** ");
		System.out.println();
			}
			}
			//break;
			
			
			
			
			
			//Sales dept
		case "sd":
			while(true)
			{
			System.out.println("Enter Userid: ");
			ui=obb.nextLine();
			System.out.println("Enter Password:");
			pp=obb.nextLine();
			qry="select *from sd_login;";
			rs=st.executeQuery(qry);
			while(rs.next())
			{
				if(ui.equals(rs.getString(1))&&pp.equals(rs.getString(2)))
				{
					found=true;
					System.out.println();
					System.out.println("==========================================");
					System.out.println("   *** login Successful ***   ");
					System.out.println("==========================================");
					System.out.println();
			
			
			
			while(true)
			{
		System.out.println(" *** Press 'a' - All Staff Details             *** ");
		System.out.println(" *** Press 'p' - Particular Staff Details      *** ");
		System.out.println(" *** Press 'an'- Add New Staff Details         *** ");
		System.out.println(" *** Press 'd' - Delete Staff Details          *** ");
		System.out.println(" *** Press 'c' - Staff Details Corrections     *** ");
		System.out.println(" *** Press 's' - All Staff Salary Details      *** ");
		System.out.println(" *** Press 'sc' - Staff Salary Correction      *** ");
		System.out.println(" *** Press 'se'- Salary Entry                  *** ");
		System.out.println(" *** Press 'l'- Logout                         *** ");
		System.out.println();
		
		ii=obb.nextLine();
		sdStaffDetails qs=new sdStaffDetails();
		switch(ii)
		{
		case "a":
			qs.sdAllStaffs();
			break;
		case "p":
			qs.sdParticularstaffDeatils();
			break;
		case "an":
			qs.sdAddNewStaff();
			break;
		case "d":
			qs.sdDeleteStaff();
			break;
		case "c":
			qs.sdStaffDeatilsCorrection();
			break;
			
		case "s":
			System.out.println(" *** Press '1' - January Month Salary Details         *** ");
			System.out.println(" *** Press '2' - Febraury Month Salary Details        *** ");
			System.out.println(" *** Press '3' - March Month Salary Details           *** ");
			System.out.println(" *** Press '4' - April Month Salary Details           *** ");
			System.out.println(" *** Press '5' - May Month Salary Details             *** ");
			System.out.println(" *** Press '6' - June Month Salary Details            *** ");
			String sss;
			sss=obb.nextLine();
			sdMontlySalary am=new sdMontlySalary();
			switch(sss)
			{
			case "1":
				am.sdJan();
				break;
			case "2":
				am.sdfeb();
				break;
			case "3":
				am.sdmar();
				break;
			case "4":
				am.sdapr();
			break;
			case "5":
				am.sdmay();
				break;
			case "6":
				am.sdjun();
				break;
			default :
				System.out.println("*** Invalid Input ***");
			}
		break;
		case "sc":
			System.out.println(" *** Press '1' - January Month Salary Details         *** ");
			System.out.println(" *** Press '2' - Febraury Month Salary Details        *** ");
			System.out.println(" *** Press '3' - March Month Salary Details           *** ");
			System.out.println(" *** Press '4' - April Month Salary Details           *** ");
			System.out.println(" *** Press '5' - May Month Salary Details             *** ");
			System.out.println(" *** Press '6' - June Month Salary Details            *** ");
			String ssss;
			ssss=obb.nextLine();
			sdSalaryCorrection p=new sdSalaryCorrection();
			switch(ssss)
			{
			case "1":
				p.sdscJan();
				break;
			case "2":
				p.sdscfeb();
				break;
			case "3":
				p.sdscmar();
				break;
			case "4":
				p.sdscapr();
			break;
			case "5":
				p.sdscmay();
				break;
			case "6":
				p.sdscjun();
				break;
			default :
				System.out.println("*** Invalid Input ***");
			}
		break;
		case "se":
			System.out.println(" *** Press '4' - April Month Salary Details        *** ");
			System.out.println(" *** Press '5' - May Month Salary Details          *** ");
			System.out.println(" *** Press '6' - June Month Salary Details         *** ");
			String sssss;
			sssss=obb.nextLine();
			sdSalaryEntry pdsc=new sdSalaryEntry();
			switch(sssss)
			{
			case "4":
				pdsc.sdAprSalaryEntry();
				break;
			case "5":
				pdsc.sdMaySalaryEntry();
				break;
			case "6":
				pdsc.sdJunSalaryEntry();
				break;
			}
			break;
		case "l":
			System.out.println("*** Logout Successful ***");
			System.exit(0);
		default :
			System.out.println("*** Invalid Input ***");
		}	
		}
		}
	}
	if(!found)
	{
		System.out.println();
		System.out.println("   *** Invalid login ***   ");
	System.out.println();
	System.out.println(" *** Enter Correct Userid & Password *** ");
System.out.println();
	}
	}	
			
			
			
			//break;
		default :
			System.out.println("*** Invalid Input ***");
		}
	}
}
