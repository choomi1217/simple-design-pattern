package proxy.gamble;

import org.junit.jupiter.api.Test;
import proxy.remote.gamble.GambleMachine;
import proxy.remote.monitor.GambleMonitor;

class GambleMachineTest {

    @Test
    void test() {
        int count = 0;

        GambleMachine gambleMachine = new GambleMachine(10, "Seoul", count);
        GambleMonitor gambleMonitor = new GambleMonitor(gambleMachine);

        gambleMachine.insertQuarter();
        gambleMachine.turnCrank();

        gambleMonitor.report();
    }

}