package state.state;

import state.gamble.GambleMachine;

public class WinnerState implements State{
    private GambleMachine gambleMachine;
    public WinnerState(GambleMachine gambleMachine) {
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
        if (gambleMachine.getCount() == 0) {
            gambleMachine.setState(gambleMachine.getSoldOutState());
        } else {
            gambleMachine.releaseBall();
            if (gambleMachine.getCount() > 0) {
                gambleMachine.setState(gambleMachine.getNoQuarterState());
            } else {
                System.out.println("Oops, out of gumballs!");
                gambleMachine.setState(gambleMachine.getSoldOutState());
            }
        }
    }
}
