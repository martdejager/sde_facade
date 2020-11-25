package app;

public class CinemaFacade {

    private static final Amplifier amplifier = new Amplifier("Top-O-Line Amplifier");
    private static final CdPlayer cdPlayer = new CdPlayer("Top-O-Line CD Player", amplifier);
    private static final DvdPlayer dvdPlayer = new DvdPlayer("Top-O-Line DVD Player", amplifier);
    private static final PopcornPopper popcornPopper = new PopcornPopper("Popcorn Popper");
    private static final Projector projector = new Projector("Top-O-Line Projector", dvdPlayer);
    private static final Screen screen = new Screen("Theater Screen");
    private static final TheaterLights theaterLights = new TheaterLights("Theater Ceiling Lights");
    private static final Tuner tuner = new Tuner("Top-O-Line AM/FM Tuner", amplifier);

    public static void startCinema() {
        amplifier.on();
        cdPlayer.on();
        dvdPlayer.on();
        popcornPopper.on();
        projector.on();
        screen.down();
        theaterLights.on();
        tuner.on();
    }

    public static void stopCinema(){
        amplifier.off();
        cdPlayer.off();
        dvdPlayer.off();
        popcornPopper.off();
        projector.off();
        screen.up();
        theaterLights.off();
        tuner.off();
    }
}
