package Nov_28;

/**
 * Created by zachhorton on 11/28/16.
 */
public class DemoHorses extends RaceHorse{

    public static void main(String[] args) {
        RaceHorse raceHorse = new RaceHorse();
        raceHorse.setColor("Nutmeg");
        raceHorse.setName("Thunder");
        raceHorse.setYear(2005);
        raceHorse.setRacesWon(13);
        Horse aHorse = new Horse();
        aHorse.setColor("Jet Black");
        aHorse.setName("Champion");
        aHorse.setYear(2009);
        System.out.println("The horse "+raceHorse.getName()+" has won "+raceHorse.getRacesWon()+
                " races.  He has a nice "+raceHorse.getColor()+" coat, and was born in "+raceHorse.getYear());
        System.out.println("The horse "+aHorse.getName()+" has a nice "+aHorse.getColor()+" coat, " +
                "and was born in "+aHorse.getYear());
    }
}
