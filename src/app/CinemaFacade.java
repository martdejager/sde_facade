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
        popcornPopper.on();
        popcornPopper.pop();
        theaterLights.dim(4);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amplifier.on();
        amplifier.setDvd("Interstellar");
        amplifier.setSurroundSound();
        amplifier.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play("Interstellar");
    }

    public static void stopCinema(){
        popcornPopper.off();
        theaterLights.on();
        screen.up();
        projector.off();
        amplifier.off();
        dvdPlayer.stop();
        dvdPlayer.eject();
        dvdPlayer.off();
    }

    public static void listenToMusic(){
        theaterLights.on();
        amplifier.on();
        amplifier.setVolume(5);
        amplifier.setCd("Let's Rock");
        amplifier.setStereoSound();
        cdPlayer.on();
        cdPlayer.play("Let's Rock");
    }

    public static void stopListenToMusic(){
        amplifier.off();
        cdPlayer.eject();
        cdPlayer.off();
    }

    public static void listenToRadio(){
        tuner.on();
        tuner.setFm();
        tuner.setFrequency(541);
        amplifier.on();
        amplifier.setVolume(5);
        amplifier.setTuner(541);
    }

    public static void stopListenToRadio(){
        tuner.off();
        amplifier.off();
    }
}
