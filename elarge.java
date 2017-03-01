/**
 * Created by test on 02-Mar-17.
 */
public class elarge {
//class for the extra large tables with occupancy of 12 people.
int peep;
int time;
String pname;

    public void setPeep(int peep) {
        this.peep = peep;
    }

    public int getPeep() {
        return peep;
    }

    public int getTime() {
        return time;
    }

    public String getPname() {
        return pname;
    }

    elarge(int peep , int time, String pname){
        this.peep=peep;
        this.time=time;
        this.pname=pname;
    }

}
