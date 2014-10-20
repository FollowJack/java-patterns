package service;

import domain.entities.*;

/**
 * Created by Deniel on 16.10.2014.
 */
public class GumballMachine {

    private IState soldOutState;
    private IState noQuarterState;
    private IState hasQuarterState;
    private IState soldState;
    private IState winnerState;

    private String location;

    IState state = soldOutState;
    int count = 0;

    public GumballMachine(String location, int count){

        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);

        this.location = location;
        this.count = count;
        if(count > 0)
            state = noQuarterState;
    }

    public void insertQuarter(){
        state.insertQuarter();
    }

    public void ejectQuarter(){
        state.ejectQuarter();
    }

    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }

    public void releaseBall(){
        System.out.println("A gumball comes rolling out the slot...");
        if(count != 0)
            count = count-1;
    }

    public IState getSoldOutState() {
        state.turnCrank();
        return soldOutState;
    }
    public IState getNoQuarterState() {
        return noQuarterState;
    }
    public IState getSoldState() {
        return soldState;
    }


    //SETTER AND GETTER
    public void setState(IState state){
        this.state = state;
    }
    public int getCount() {
        return count;
    }

    public IState getWinnerState() {
        return winnerState;
    }

    public IState getHasQuarterState() {
        return hasQuarterState;
    }

    @Override
    public String toString(){
        return "Gumball machine has "+count+" balls.";
    }

    public String getLocation() {
        return location;
    }

    public IState getState() {
        return state;
    }
}
