package services.facades;

import domain.entities.DvdPlayer;
import domain.entities.PopcornPopper;
import domain.entities.Projector;

/**
 * Created by Deniel on 15.10.2014.
 */
public class HomeTheaterFacade {

    private DvdPlayer dvdPlayer;
    private Projector projector;
    private PopcornPopper popcornPopper;

    public HomeTheaterFacade(DvdPlayer dvdPlayer,Projector projector,PopcornPopper popcornPopper){
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.popcornPopper = popcornPopper;
    }

    public void watchMovie(){
        System.out.println("Get ready to watch a movie...");
        popcornPopper.on();
        popcornPopper.pop();
        projector.on();
        projector.wideScreen();
        dvdPlayer.on();
        dvdPlayer.play();

    }

    public void endMovie(){
        System.out.println("Shutting the movie theater off...");
        popcornPopper.off();
        projector.off();
        dvdPlayer.off();
    }

}
