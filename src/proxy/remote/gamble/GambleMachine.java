package proxy.remote.gamble;

import proxy.remote.state.*;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GambleMachine extends UnicastRemoteObject implements GambleMachineRemote {

    private static final long serialVersionUID = 2L;

    private State soldOutState;
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State winnerState;

    private String location;

    private State state;
    private int count = 0;

    public GambleMachine(int nuberGambleBalls, String location, int count) throws RemoteException {
        this.soldOutState = new SoldOutState(this);
        this.noQuarterState = new NoQuarterState(this);
        this.hasQuarterState = new HasQuarterState(this);
        this.soldState = new SoldState(this);
        this.winnerState = new WinnerState(this);

        this.count = nuberGambleBalls;
        if (nuberGambleBalls > 0) {
            state = noQuarterState;
        } else {
            state = soldOutState;
        }

        this.location = location;
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
        }
    }

    public State getHasQuarterState() {
        return new HasQuarterState(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getNoQuarterState() {
        return new NoQuarterState(this);
    }

    public State getSoldState() {
        return new SoldState(this);
    }

    public State getSoldOutState() {
        return new SoldOutState(this);
    }

    public int getCount() {
        return count;
    }

    public State getWinnerState() {
        return new WinnerState(this);
    }

    @Override
    public String toString() {
        return """ 
                주식회사 왕뽑기
                자바로 돌아가는 2024년형 뽑기 기계
                남은 개수: %d개
                현재 상태: %s
                """.formatted(count, state);
    }

    public void refill() {
        if (count == 0) {
            count = 10;
            state = noQuarterState;
        }
    }

    public String getLocation() {
        return location;
    }

    public String getState() {
        return state.toString();
    }
}
