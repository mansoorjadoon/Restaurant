
import java.util.Scanner;
import java.util.LinkedList;

public class main {

    public static void main(String[] args) { // main fucntion beings execution

        LinkedList ElargeTable = new LinkedList();  // creating linked lists for all the table types.
        LinkedList LargeTable = new LinkedList();
        LinkedList MediumTable = new LinkedList();
        LinkedList SmallTable = new LinkedList();

        System.out.print("Welcome to the Restaurant!\n Please Enter 1 for reservation\n Enter 2 for admin login.\n");
        Scanner reader = new Scanner(System.in);
        int choice = reader.nextInt();  // Taking input from users.

        while (true) {
            if (choice == 1) { //taking the input of users to select if they want to print or make reservation.
                System.out.print("You want to reserve a table for how many people?\n");
                int peep = reader.nextInt();
                System.out.print("What time?\n");
                int time = reader.nextInt();
                System.out.print("What name to reserve for?\n");
                String name = reader.next();
                check c= new check();

                if (peep > 0 && peep <= 2) { //check if the table is to be reserved for how many people.

                    boolean reet= c.checksm(time,SmallTable);
                    if (reet==true){
                    small smallTable = new small(peep, time, name);
                    SmallTable.add(smallTable);}

                } else if (peep > 2 && peep <= 4) {
                    boolean reet = c.checkmed(time,MediumTable);
                    if (reet==true){
                    med medium = new med(peep, time, name);
                    MediumTable.add(medium);}

                } else if (peep > 4 && peep <= 6) {
                    boolean reet = c.checklr(time, LargeTable);
                    if (reet==true) {
                        large largeTable = new large(peep, time, name);
                        LargeTable.add(largeTable);
                    }

                } else if (peep > 6 && peep <= 12) {
                    boolean reet= c.checkel(time,ElargeTable);
                    if (reet==true) {
                        elarge elargeTable = new elarge(peep, time, name);
                        ElargeTable.add(elargeTable);
                    }
                }
            }


            if (choice == 2) {  // option to print all the resrevations of the tables
                int i=0;
                System.out.print("Here are all the reservations\n");
                while(i<SmallTable.size()) {

                    if (SmallTable.peekFirst() != null) {
                        small s = (small) SmallTable.get(i);
                        System.out.print("Small Table: Reserved by : ");

                        System.out.print(s.getPname() + " at time "+ s.getTime()+"\n");
                    } else {
                        System.out.print("No Reservation");
                    }
                    i++;
                }
                i=0;
                while(i<MediumTable.size()) {

                    if (MediumTable.peekFirst() != null) {
                        med m = (med) MediumTable.get(i);
                        System.out.print("Medium Table:");
                        System.out.print(m.getPname() + " at time "+ m.getTime()+"\n");
                        System.out.print(m.getPname() + "\n");
                    } else {
                        System.out.print("No Reservation");
                    }
                    i++;
                }

                i=0;
                while(i<LargeTable.size()) {
                    if (LargeTable.peekFirst() != null) {
                        large l = (large) LargeTable.get(i);
                        System.out.print("Large Table:");
                        System.out.print(l.getPname() + " at time "+ l.getTime()+"\n");
                    } else {
                        System.out.print("No Reservation");
                    }
                    i++;
                }

                    i=0;
                while(i<ElargeTable.size()) {
                    if (ElargeTable.peekFirst() != null) {
                        elarge e = (elarge) ElargeTable.get(i);
                        System.out.print("Extra Large Table:");
                        System.out.print(e.getPname() + " at time "+ e.getTime()+"\n");
                    } else {
                        System.out.print("No Reservation");
                    }
                i++;
                }

            }
            choice = reader.nextInt();
        }
    }


}


