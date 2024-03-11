package Patterns.ClassworkLaba;

import com.sun.xml.bind.api.Bridge;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterrators {
    public static void main(String[] args) {

        int[][] graph = {
                {0, 1, 1, 0},
                {1, 0, 1, 1},
                {1, 1, 0, 1},
                {0, 1, 1, 0}
        };

        if (isEulerianCycleExist(graph)) {
            System.out.println("Можно пройти все мосты дважды!");
        } else {
            System.out.println("Невозможно пройти все мосты дважды!");
        }
    }

    public static boolean isEulerianCycleExist(int[][] graph) {
        int[] degree = new int[graph.length];

        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                if (graph[i][j] == 1) {
                    degree[i]++;
                }
            }
        }

        for (int d : degree) {
            if (d % 2 != 0) {
                return false;
            }
        }

        return true;
    }
    public static List<BridgeToRiver> createBridge (){
        List<BridgeToRiver> bridges = new ArrayList<>();
        bridges.add(new BridgeToRiver(1));
        bridges.add(new BridgeToRiver(2));
        bridges.add(new BridgeToRiver(3));
        bridges.add(new BridgeToRiver(4));
        bridges.add(new BridgeToRiver(5));
        bridges.add(new BridgeToRiver(6));
        bridges.add(new BridgeToRiver(7));

        return bridges;
    }
}
interface IterratorTop {
    boolean hasnext();
    int sizes ();
    BridgeToRiver getNext();

}
class IterratorGraf implements IterratorTop {

    @Override
    public boolean hasnext() {
        return false;
    }

    @Override
    public int sizes() {
        return 0;
    }

    @Override
    public BridgeToRiver getNext() {
        return null;
    }
}
class BridgeToRiver {
    public int number;
    public BridgeToRiver (int number){
        this.number=number;
    }

}

