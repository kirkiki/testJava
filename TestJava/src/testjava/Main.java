package testjava;

/**
 * Created by ronan on 21/03/2016.
 */
public class Main {
    public static void main(String[] args){
        //System.out.print(new  TimeDuration(732).toString());
        String bike1="bike1";
        int timeBike1=800;
        RaceResults race = new RaceResults(bike1,timeBike1);
        race.printResults();
    }
}
