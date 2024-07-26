package state.gamble;

import org.junit.jupiter.api.Test;

class GambleMachineTest {

    @Test
    void gameStart() {
        GambleMachine gambleMachine = new GambleMachine(5);

        System.out.println(gambleMachine);

        gambleMachine.insertQuarter();
        gambleMachine.turnCrank();

        System.out.println(gambleMachine);

        gambleMachine.insertQuarter();
        gambleMachine.turnCrank();
        gambleMachine.insertQuarter();
        gambleMachine.turnCrank();
        gambleMachine.insertQuarter();
        gambleMachine.turnCrank();
        gambleMachine.insertQuarter();
        gambleMachine.turnCrank();
        gambleMachine.insertQuarter();
        gambleMachine.turnCrank();
        gambleMachine.insertQuarter();
        gambleMachine.turnCrank();
        gambleMachine.insertQuarter();
        gambleMachine.turnCrank();
        gambleMachine.insertQuarter();
        gambleMachine.turnCrank();

        System.out.println(gambleMachine);

    }

}