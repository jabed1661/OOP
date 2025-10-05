import java.io.BufferedReader;
import  java.io.FileWriter;
import java.io.File;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

import java.time.format.DateTimeFormatter;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.Duration;



public class Cycle_Renting  extends Cycle_Management {

    File myfile_3 = new File ("Cycle Rent Details.txt");



    @Override
    public void display_available_cycle () {


        try {

            System.out.println("Viewing From User Panel :");
            Scanner sc = new Scanner (myfile_2);
            while (sc.hasNextLine ()) {
                String x = sc.nextLine ();
                System.out.println(x);
            }
            sc.close ();
        }


        catch (Exception e ) {
            System.out.println("There is an error to viewing the cycle list . Reason : "+e);
        }
    }





    public void take_cycle_Rent () {



        System.out.println("Only Choose Available Cycles");

        System.out.println("Enter The Id of the cycle u Want for rent ?");

        try {

            Scanner input = new Scanner (System.in);


            long rentid = input.nextLong();
            input.nextLine ();

            String check_rentid_length = Long.toString (rentid);

            if (check_rentid_length .length () > 12 ) {

                System.out.println("The Cycle's ID  arenot longer than 12 digits .");
                return ;
            }




            //	try {

            myfile_3.createNewFile();

            int available_modify_key = 0;

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern ("HH:mm:ss");

            //myfile_3.createNewFile();

            FileWriter filewriter3 = new FileWriter ("Cycle Rent Details.txt" , true);





            BufferedReader reader2 = new BufferedReader (new FileReader (myfile_2));

            String line2;
            boolean found2 = false;




            while ((line2 = reader2.readLine()) != null) {


                //if (line2 .contains ("Id - " +rentid)  && line2.contains ("@Available")) {
                if (line2.contains ("Id - "+rentid+   "   @Available")) {

                    found2 = true;


                    System.out.println("Yes The Cycle is Available");
                    System.out.println("Do u Confirm to take rent the Cycle with Id : " +rentid);
                    System.out.println("\n         1. Yes             2.No");

                    int confirm_rent = input.nextInt ();
                    input.nextLine ();

                    if  ( confirm_rent == 1 ) {

                        System.out.println("Enter Your Name : . [ Max 45 Character ] ");
                        String name_renter = input.nextLine ();


                        if (name_renter.length() > 45) {
                            System.out.println("Error: The  Name cannot be longer than 45 characters.");
                            return ;
                        }



                        System.out.println("Enter Your Code : ");
                        long code_renter = input.nextLong ();
                        input.nextLine ();



                        String temp2 = Long.toString (code_renter);

                        if (temp2.length () > 12) {
                            System.out.println("Error: The  Code cannot be longer than 12 characters.");
                            return;
                        }




                        LocalDate date = LocalDate .now ();
                        LocalTime time = LocalTime.now ();


                        //filewriter3.write("\n------\nRenter Name : " + name_renter + ".   Code : " + code_renter + ".\nRenting Time : " + date + "    : " + time.format(formatter) + "\n" + line2 + " : Has Been Rented To him/her.\n------\n");




                        filewriter3.write(
                                "\n----------\n" +
                                        "Renter Name : " + name_renter + "   Code : " + code_renter + "\n" +
                                        "Renting Time : " + date + "    : " + time.format(formatter) + "\n" +
                                        line2 + " : Has Been Rented To him/her.\n" +
                                        "----------\n"
                        );




                        filewriter3.close ();


                        System.out.println("\nCycle Rented Successfully .");
                        System.out.println("Details  : " + line2);
                        System.out.println("Rented Date : "+date+ "   Rented Time : "+time.format(formatter));



                        //line2 = line2.replace("@Available", "##Unavailable");
                        available_modify_key ++ ;

                        break;

                    }


                    else if (confirm_rent == 2 ) {
                        System.out.println(" Canceled Cycle Renting . ");
                        break;
                    }





                    else  {
                        System.out.println("Wrong Selecion in Yes or No . To Confirm Cycle Renting");
                        break;
                    }






                }

            }// while

            reader2.close ();

            if (available_modify_key!=0) {

                StringBuilder filecontent2 = new StringBuilder ();


                BufferedReader readertemp = new BufferedReader (new FileReader (myfile_2));
                String linetemp;

                while ((linetemp = readertemp.readLine()) != null     ) {




                    if (linetemp.contains ("Id - "+rentid+   "   @Available")) {

                        linetemp = linetemp.replace("@Available", "##Unavailable");


                    }


                    filecontent2.append (linetemp).append("\n");
                }


                FileWriter filewriter2 = new FileWriter ("Available Cycles.txt");

                filewriter2.write(filecontent2.toString ());

                filewriter2.close ();

                readertemp.close ();



            }












            if  (!found2) {
                System.out.println("The Given Id oF the Cycle is Wrong or The Cycle is not Available");

            }









        }




        catch (InputMismatchException e) {
            System.out.println("There is a Problem While Giving Inputs .\n Remember The Cycle's ID aren't longer than 12 Digits .  " +e);

        }


        //filewriter3.close ();


        catch (Exception e ) {
            System.out.println("There is an Exception . Which is : " +e);

        }



    } // cycle renting method




    public void display_renting_details () {

        try {

            Scanner sc = new Scanner (myfile_3);

            while (sc.hasNextLine ()) {

                String x = sc.nextLine ();
                System.out.println(x);
            }

            sc.close ();
        }




        catch (Exception e) {
            System.out.println("There is a problem . Which is : " +e);
        }




    }




    public void return_cycle () {



        System.out.println("Enter The Id oF The Cycle U are Returning");


        try {

            int return_id = input.nextInt();
            input.nextLine ();

            int flag = 0 ;
            boolean found2 = false ;





            Scanner sc = new Scanner (myfile_2);

            while (sc.hasNextLine ()) {


                String x = sc.nextLine ();

                if (x.contains ("Id - "+return_id+   "   ##Unavailable")) {


                    flag ++;
                    //System.out.println("YYYYEESSS");

                }

            }


            sc.close ();






            if (flag >0 ) {


                System.out.println("Yes . You can Return the Cycle now .");
                System.out.println("Are you  Confirm to return it .");
                System.out.println("\n        1.YES           2.NO");

                int confirm_return = input.nextInt ();
                input.nextLine ();


                if (confirm_return == 1) {


                    BufferedReader reader2 = new BufferedReader (new FileReader (myfile_2));

                    String line2;

                    StringBuilder filecontent2 = new StringBuilder ();






                    while ((line2 = reader2.readLine ()) != null ) {

                        if (line2.contains ("Id - "+return_id+   "   ##Unavailable")) {



                            line2 = line2.replace("##Unavailable", "@Available");

                            found2 = true;


                        }




                        filecontent2 .append(line2).append("\n");

                    }


                    FileWriter filewriter2 = new FileWriter (myfile_2);

                    filewriter2.write(filecontent2.toString ());
                    filewriter2.close ();


                    reader2.close ();




                    DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern ("HH:mm:ss");

                    LocalDate date2 = LocalDate .now ();
                    LocalTime time2 = LocalTime.now ();



                    BufferedReader reader3 = new BufferedReader (new FileReader (myfile_3));

                    String line3;

                    StringBuilder filecontent3 = new StringBuilder ();



                    while  ((line3 = reader3.readLine ()) != null ) {



                        if (line3.contains("Id - " + return_id + "   @Available : Has Been Rented To him/her.")) {


                            filecontent3.append(line3).append("\n").append("<> <> <> It Has Been Returned  . Return Time : "+date2+ "   : " + time2.format(formatter2) + "\n");

                            continue;

                        }





                        filecontent3 .append(line3).append("\n");

                    }


                    FileWriter filewritertemp = new FileWriter (myfile_3);

                    filewritertemp.write(filecontent3.toString());


                    filewritertemp.close ();
                    reader3.close ();


                    System.out.println("\n   Cycle Returned Successfully .\n     Return Time : "+ date2 + "     " + time2.format(formatter2));

                }





                else if (confirm_return ==2) {

                    System.out.println("Canceled Cycle Returning");
                    return ;
                }


                else {

                    System.out.println("Invalid Input while confirming cycle return . ");
                    return ;
                }










            } // if with flag==true . main if






            else {

                System.out.println("Cycle With Id : " + return_id + " is not in  the rented list. ");
            }









        }






        catch (Exception e) {
            System.out.println("There is a problem . Which is : " +e);
            input.nextLine ();
        }









    }








/*
public void Start_Today_work () {


	try {

		LocalDate date2 = LocalDate.now ();
		FileWriter filewriter3 = new FileWriter ("Cycle Rent Details.txt", true);
		filewriter3.write("\n---------------------------------------------\n          "+date2+"  's "
				+ "Transaction\n---------------------------------------------\n");

		filewriter3.close ();
		System.out.println("It is basically taking present, That today there would be some Transaction");
		System.out.println("           NEXT -->");
	}



	catch (Exception e ) {

		System.out.println("There is a problem . Which is : " +e);
	}



}

*/

/*

public void End_Today_work () {


	try {

		//LocalDate date2 = LocalDate.now ();
		FileWriter filewriter3 = new FileWriter ("Cycle Rent Details.txt", true);
		filewriter3.write("\n---------------------------------------------\n          "
				+ "END\n---------------------------------------------\n");

		filewriter3.close ();
		System.out.println("It is basically Taking present, That today there would be No More Transaction");
		System.out.println("           NEXT -->");

	}



	catch (Exception e ) {

		System.out.println("There is a problem . Which is : " +e);
	}

}
*/



}
