/**
 * Created by test on 02-Mar-17.
 */
//class for large table with more than 6 people.
public class large {
    int peep;
    int time;
    String pname;

    public int getPeep() {
        return peep;
    }

    public int getTime() {
        return time;
    }

    public String getPname() {
        return pname;
    }

    large(int peep , int time, String pname){
        this.peep=peep;

        this.time=time;
        this.pname=pname;
    }
}
