package state.state;

import state.gamble.GambleMachine;

public class SoldOutState implements State{

    private GambleMachine gambleMachine;
    public SoldOutState(GambleMachine gambleMachine) {
        this.gambleMachine = gambleMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Sorry, the machine is sold out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, the machine is sold out");
    }

    @Override
    public void turnCrank() {
        System.out.println("Sorry, the machine is sold out");
    }

    @Override
    public void dispense() {
        System.out.println("Sorry, the machine is sold out");
    }

    @Override
    public String toString() {
        return "sold out";
    }
}
