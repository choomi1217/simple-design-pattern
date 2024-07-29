package proxy.remote.state;

import proxy.remote.gamble.GambleMachine;

public class SoldState implements State {
    private GambleMachine gambleMachine;
    public SoldState(GambleMachine gambleMachine) {
        this.gambleMachine = gambleMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball!");
    }

    @Override
    public void dispense() {
        gambleMachine.releaseBall();
        if (gambleMachine.getCount() > 0) {
            gambleMachine.setState(gambleMachine.getNoQuarterState());
        } else {
            gambleMachine.refill();
            System.out.println("refill the machine");
        }
    }

    @Override
    public String toString() {
        return "dispensing a gumball";
    }
}
