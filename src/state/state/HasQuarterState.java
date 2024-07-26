package state.state;

import state.gamble.GambleMachine;

import java.util.Random;

public class HasQuarterState implements State{
    Random randomWinner = new Random(System.currentTimeMillis());
    private GambleMachine gambleMachine;
    public HasQuarterState(GambleMachine gambleMachine) {
        this.gambleMachine = gambleMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gambleMachine.setState(gambleMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned...");
        int winner = randomWinner.nextInt(10);
        if ((winner == 0) && (gambleMachine.getCount() > 1)) {
            gambleMachine.setState(gambleMachine.getWinnerState());
        } else {
            gambleMachine.setState(gambleMachine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    @Override
    public String toString() {
        return "waiting for turn of crank";
    }
}
