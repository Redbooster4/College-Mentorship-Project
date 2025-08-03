package com.college.mentorship;
import java.util.Scanner;
public class Home
{
    public static void main(String[] args) throws InterruptedException
    {
        showSplashScreen();
        showMenu();
    }
    public static void showSplashScreen() throws InterruptedException
    {
        System.out.println("******************************************");
        System.out.println("*        Welcome to Mentoring App        *");
        System.out.println("******************************************");
        System.out.print("Loading - ");
        for (int i = 0; i < 10; i++)
        {
            System.out.print("#");
            Thread.sleep(200);
        }
        System.out.println("\n");
    }
    public static void showMenu() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("====== Main Menu ======");
            System.out.println("1. Enter Student Mentoring Record");
            System.out.println("2. View Student Records");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("Input your Student mentoring record.");
                    MentoringFormApp.Input(new String[]{}); //Thus calling a static function
                    break;
                case "2":
                    System.out.println("You chose to view student records.");
                    break;
                case "3":
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option, try again !!");
            }
        }
    }
}

