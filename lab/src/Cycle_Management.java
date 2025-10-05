import java.util.Scanner;
import java.io.*;


public class Cycle_Management {

    private String password = "oop" ;

    public String getpassword () {
        return password;
    }

    File myfile = new File ("Cycles.txt");
    File myfile_2 = new File ("Available Cycles.txt");

    Scanner input = new Scanner (System.in);



    //ADD Cycle Programme.
    public void add_cycle () {

        try {

            myfile.createNewFile ();
            myfile_2.createNewFile();

            System.out.println("Write The Cycle's Company Name. [ Max 45 Character ]");
            String cyclecompany = input.nextLine ();

            if (cyclecompany.length() > 45) {
                System.out.println("Error: The cycle name cannot be longer than 45 characters.");
                return ;
            }

            System.out.println("Enter An Id For This Cycle [ Max 12 Digit ] ");



            long cycleid = input.nextLong();

            input.nextLine();

            String temp1 = Long.toString (cycleid);

            if (temp1.length () > 12) {
                System.out.println("Error: The cycle Id cannot be longer than 12 characters.");
                return;
            }




            Scanner sc = new Scanner (myfile);

            while (sc.hasNextLine ()) {

                String checkid_ifalready_exist = sc.nextLine ();

                if (checkid_ifalready_exist.contains ("Id - " + cycleid + " .")) {

                    System.out.println("Error : This Id Already Exist.");
                    return ;

                }

            }
            sc.close ();


            //myfile.createNewFile ();
            //myfile_2.createNewFile();



            FileWriter filewriter = new FileWriter ("Cycles.txt", true);
            FileWriter filewriter2 = new FileWriter ("Available Cycles.txt",true);


            filewriter.write  ("-Cycle Name - "+cyclecompany+ "   Id - " +cycleid+ " .\n");
            filewriter2.write   ("-Cycle Name - "+cyclecompany+ "   Id - " +cycleid+ "   @Available\n");

            filewriter.close ();
            filewriter2.close ();

            System.out.println("Cycle Added Successfully.");

        }


        catch (Exception e ) {
            System.out.println("There  might be a problem in Giving input. Check the requirments and Give correct input.");
            System.out.println("Or There Might be some Other Problem . The Problem is : " +e);
            input.nextLine ();
        }



    }


    //Remove Cycle Programme.
    public void remove_cycle () {

        try {


            System.out.println("Enter The Cycle Id To Remove : ");
            int removeid = input.nextInt();
            input.nextLine ();




            BufferedReader reader = new BufferedReader (new FileReader (myfile));
            BufferedReader reader2 = new BufferedReader (new FileReader (myfile_2));
            //Splited part of Bufferreader line.
            //FileReader fileReader = new FileReader(myfile);  // Step 1: Create FileReader
            //BufferedReader reader = new BufferedReader(fileReader);  // Step 2: Wrap in BufferedReader



            StringBuilder filecontent = new StringBuilder ();
            StringBuilder filecontent2 = new StringBuilder ();

            String line;
            String line2;
            boolean found = false;
            boolean found2 = false;

            while ((line = reader.readLine()) != null) {


                if (line.contains ("Id - " +removeid)) {

                    found = true;
                    continue;
                }

                filecontent.append (line).append("\n");
            }

            reader.close ();






            //Traversing 2nd file

            while ((line2 = reader2.readLine()) != null) {


                if (line2.contains ("Id - " +removeid)) {

                    found2 = true;
                    continue;
                }

                filecontent2.append (line2).append("\n");
            }






            if (!found) {
                System.out.println("Cycle with Id - " +removeid+ " is not found");
            }




            else if (!found2) {
                System.out.println("Cycle with Id - " +removeid+ " is not found");
            }






            else {

                FileWriter filewriter = new FileWriter (myfile);
                FileWriter filewriter2 = new FileWriter ("Available Cycles.txt");


                filewriter.write(filecontent.toString());
                filewriter2.write(filecontent2.toString ());

                filewriter.close ();
                filewriter2.close ();

                System.out.println("Cycle With ID " +removeid+ " has been removed" );
                System.out.println("Cycle Removed Successfully.");



            }





        }

        catch (Exception e) {
            System.out.println("There is an error while removing the cycle . Reason "+e);
            input.nextLine ();
        }


    }



    public void display_cycle () {


        try {
            Scanner sc = new Scanner (myfile);
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




    public void display_available_cycle () {

        try {
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



}
