package ui.console;

import domain.entities.DvdPlayer;
import domain.entities.PopcornPopper;
import domain.entities.Projector;
import services.facades.HomeTheaterFacade;

/**
 * Created by Deniel on 15.10.2014.
 */
public class HomeTheaterClient {

    public static void main(String[] args){

        DvdPlayer dvdPlayer = new DvdPlayer();
        PopcornPopper popcornPopper = new PopcornPopper();
        Projector projector = new Projector();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvdPlayer,projector,popcornPopper);

        homeTheater.watchMovie();
        homeTheater.endMovie();
    }

}
