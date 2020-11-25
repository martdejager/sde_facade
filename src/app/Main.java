package app;

public class Main {

    public static void main(String[] args) {
        CinemaFacade.startCinema();
        CinemaFacade.stopCinema();
        CinemaFacade.listenToMusic();
        CinemaFacade.stopListenToMusic();
        CinemaFacade.listenToRadio();
        CinemaFacade.stopListenToRadio();
    }
}
