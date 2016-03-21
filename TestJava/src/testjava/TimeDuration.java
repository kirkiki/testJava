package testjava;


/**
 * Created by ronan on 21/03/2016.
 */
public class TimeDuration {
    private int temps;

    public TimeDuration(int temps) {
        if (temps < 0) {
            System.out.println("badValueExeptions");
        } else {
            this.temps = temps;
        }
    }

    public String toString() {
        int heure = 0;
        int minute = 0;
        int seconde = 0;
        while (this.temps - 3600 > 0) {
            this.temps -= 3600;
            heure++;
        }
        while (this.temps - 60 > 0) {
            this.temps -= 60;
            minute++;
        }
        seconde = this.temps;
        return (heure + "h " + minute + "m " + seconde + "s");
    }
}

