package testjava;

import java.util.*;
import java.util.stream.IntStream;

/**
 * Created by ronan on 21/03/2016.
 */
public class RaceResults {
    private List<String> results=new ArrayList<>();

    public RaceResults(String tag, int time){
        results.add(tag+" "+time);
    }
    public void onNewResult(String tagNumber, TimeDuration resultTime){


    }
    public void printResults(){
        IntStream.rangeClosed(0,results.size()-1)
                .forEach(x->System.out.println(results.get(x)));
    }
}
