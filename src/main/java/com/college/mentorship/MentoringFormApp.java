package com.college.mentorship;
import java.sql.*;
import java.util.*;
public class MentoringFormApp
{
        public static void Input(String []args)
        {
        Scanner sc=new Scanner(System.in);

        System.out.print("Year of Admission: ");
        String yearOfAdmission = sc.nextLine();

        System.out.print("Type of Admission (First Year/Direct S.E.): ");
        String typeOfAdmission = sc.nextLine();

        System.out.print("Branch: ");
        String branch = sc.nextLine();

        System.out.print("Name of the Student: ");
        String studentName = sc.nextLine();

        System.out.print("Contact No 1: ");
        String contactNo1 = sc.nextLine();
        System.out.print("Contact No 2: ");
        String contactNo2 = sc.nextLine();

        System.out.print("Landline No 1: ");
        String landlineNo1 = sc.nextLine();
        System.out.print("Landline No 2: ");
        String landlineNo2 = sc.nextLine();

        System.out.print("Email ID 1: ");
        String email1 = sc.nextLine();
        System.out.print("Email ID 2: ");
        String email2 = sc.nextLine();

        System.out.print("Date of Birth (YYYY-MM-DD): ");
        String dob = sc.nextLine();

        System.out.print("Current Address: ");
        String currentAddress = sc.nextLine();

        System.out.print("Hostel/Travel: ");
        String hostelTravel = sc.nextLine();

        System.out.print("Hobbies: ");
        String hobbies = sc.nextLine();

        System.out.print("Guardian 1 Name: ");
        String guardian1Name = sc.nextLine();
        System.out.print("Guardian 1 Occupation: ");
        String guardian1Occ = sc.nextLine();
        System.out.print("Guardian 1 Contact: ");
        String guardian1Contact = sc.nextLine();
        System.out.print("Guardian 1 Email: ");
        String guardian1Email = sc.nextLine();

        System.out.print("Guardian 2 Name: ");
        String guardian2Name = sc.nextLine();
        System.out.print("Guardian 2 Occupation: ");
        String guardian2Occ = sc.nextLine();
        System.out.print("Guardian 2 Contact: ");
        String guardian2Contact = sc.nextLine();
        System.out.print("Guardian 2 Email: ");
        String guardian2Email = sc.nextLine();

        System.out.print("Mentor's Name: ");
        String mentorName = sc.nextLine();

        System.out.print("Achievements: ");
        String achievements = sc.nextLine();

        //LINKIGN WITH THE DB 
        String url = "jdbc:mysql://localhost:3306/student";
        String user = "root";
        String password = "password";
        try
        {
            Connection conn = DriverManager.getConnection(url, user, password);
            String sql = "INSERT INTO student (year_of_admission, type_of_admission, branch, name, contact_no1, contact_no2, landline_no1, landline_no2, email1, email2, date_of_birth, current_address, hostel_or_travel, hobbies, mentor_name, achievements) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, yearOfAdmission);
            ps.setString(2, typeOfAdmission);
            ps.setString(3, branch);
            ps.setString(4, studentName);
            ps.setString(5, contactNo1);
            ps.setString(6, contactNo2);
            ps.setString(7, landlineNo1);
            ps.setString(8, landlineNo2);
            ps.setString(9, email1);
            ps.setString(10, email2);
            ps.setDate(11, java.sql.Date.valueOf(dob));
            ps.setString(12, currentAddress);
            ps.setString(13, hostelTravel);
            ps.setString(14, hobbies);
            ps.setString(15, mentorName);
            ps.setString(16, achievements);
            if(ps.executeUpdate()>0)
            {
                System.out.println("Record inserted successfully!");
            }
            conn.close();
        }
        catch(SQLException e)
        {
            System.out.println("Database error: "+e.getMessage());
        }
        sc.close();
    }
}
