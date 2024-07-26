package state.state;

import state.gamble.GambleMachine;

public class NoQuarterState implements State{

    private final GambleMachine gambleMachine;

    public NoQuarterState(GambleMachine gambleMachine) {
        this.gambleMachine = gambleMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gambleMachine.setState(gambleMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned, but there's no quarter");
    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first");
    }

    @Override
    public String toString() {
        return "waiting for quarter";
    }
}
