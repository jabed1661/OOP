import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {

    public static void main(String[] args) {



        int adminuser =0;
        int godeep=0;
        int godeep_2 =0;

        Cycle_Management c1 = new Cycle_Management ();
        Cycle_Renting  cr = new Cycle_Renting ();

        Scanner input = new Scanner (System.in);

        while (adminuser !=3) {

            try {
                System.out.println("\n                -------------------------------");
                System.out.println("                         Welcome To");
                System.out.println("                   Cycle Management System");
                System.out.println("                --------------------------------");
                System.out.println("\n\n                Press Enter To Operate -->");
                System.out.println("                ----------------------------");
                System.out.println("                |    1. Admin Panel        |");
                System.out.println("                |    2.User Panel          |");
                System.out.println("                ----------------------------");
                System.out.println("Press the value: ");

                // String enter = input.nextLine ();

                adminuser = input.nextInt ();
                input.nextLine ();

                if (adminuser == 1) {

                    System.out.println("Write The  Password To Enter To Admin Panel");
                    String passtoadmin = input.nextLine ();

                    if (passtoadmin.equals (c1.getpassword ()) ) {



                        godeep = 0;

                        while (godeep !=6) {

                            System.out.println("\n         1.Add Cycle To Store");
                            System.out.println("         2.Remove Cycle From Store");
                            System.out.println("         3.Display All Cycles");
                            System.out.println("         4.Display Available And Un-Available Cycles");
                            System.out.println("         5.Display Transaction of Cycles");
                            // System.out.println("         6.Start oF Today");
                            // System.out.println("         7.End oF Today");
                            System.out.println("         6.Exit");
                            System.out.println("Press the value: ");

                            godeep = input.nextInt();
                            input.nextLine ();


                            switch (godeep){

                                case 1 :

                                    c1.add_cycle ();
                                    break;



                                case 2 :
                                    c1.remove_cycle ();
                                    break;


                                case 3 :
                                    c1.display_cycle ();
                                    break;


                                case 4 :
                                    c1.display_available_cycle();
                                    break;


                                case 5 :
                                    cr.display_renting_details();
                                    break;


	/*	case 6 :
			cr.Start_Today_work();
			break;
			*/

	/*	case 7 :
			cr.End_Today_work();
			break;
			*/

                                case 6 :
                                    System.out.println("Exited . Thank You");
                                    break;


                                default :
                                    System.out.println("Invalid Option. Please Choose Any Valid Option");

                            }



                        }

                    } // if to check password

                    else
                    {
                        System.out.println("      Password is Incorrect ");
                    }

                }


                else if (adminuser ==2) {

                    godeep_2 = 0;

                    while (godeep_2 !=4) {




                        System.out.println("\n          ---------------------------");
                        System.out.println("          | Welcome to user Panel   |");
                        System.out.println("          ---------------------------\n");
                        System.out.println("             1.Display Available Cycles ");
                        System.out.println("             2.Rent A Cycle      ");
                        System.out.println("             3.Return Cycle");
                        System.out.println("             4.Exit Option   ");

                        godeep_2 = input.nextInt();
                        input.nextLine ();

                        switch (godeep_2) {

                            case 1 :
                                cr.display_available_cycle();

                                break;

                            case 2 :
                                cr.take_cycle_Rent();
                                break;


                            case 3 :
                                cr.return_cycle();
                                break;


                            case 4 :
                                System.out.println("Exited");
                                break;


                            default :
                                System.out.println("Invalid Input");







                        } // swith-case 2

                    }

                } // else if

                else if (adminuser ==3) {
                    System.out.println("Exited From Management");
                }


                else {
                    System.out.println("Invalid input");
                }


            }


            catch (InputMismatchException e ) {
                System.out.println("Your Input Giving is Wrong. Maybe u have typed String when");
                System.out.println("going to admin or user panel instead of int value. " +e);
                input.nextLine();
            }

            catch (Exception e ) {
                System.out.println("There is a problem . " +e);
            }


        } // Main - While


        input.close ();


    }
}
