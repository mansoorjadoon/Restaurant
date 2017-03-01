import java.util.LinkedList;
// class to check the availability of the tables in the restaurant.
/**
 * Created by test on 02-Mar-17.
 */
public class check {
boolean checksm(int time, LinkedList l){
    int i=0;
    int count=0;
    while(i<l.size()){
        small s =(small) l.get(i);
        if (s.getTime()==time){
            count++;
        }
        i++;

    }
    if (count>=4){ // if the number of tables reserved excceds the given number of tables n teh restaurant then give them an error.
        System.out.print("Sorry Reservations are full for this table. ");
        return false;
    }
    return true;
}

    boolean checkmed(int time, LinkedList l){
        int i=0;
        int count=0;
        while(i<l.size()){
            med s =(med) l.get(i);
            if (s.getTime()==time){
                count++;
            }
            i++;

        }
        if (count>=8){
            System.out.print("Sorry Reservations are full for this table. ");
            return false;
        }
        return true;
    }

    boolean checklr(int time, LinkedList l){
        int i=0;
        int count=0;
        while(i<l.size()){
            large s =(large) l.get(i);
            if (s.getTime()==time){
               count++;
            }
            i++;

        }
        if (count>=3){
            System.out.print("Sorry Reservations are full for this table. ");
            return false;
        }
        return true;
    }

    boolean checkel(int time, LinkedList l){
        int i=0;
        int count=0;
        while(i<l.size()){
            elarge s =(elarge) l.get(i);
            if (s.getTime()==time){
                count++;
            }
            i++;

        }
        if (count>=1){
            System.out.print("Sorry Reservations are full for this table. ");
            return false;
        }
        return true;
    }


}

