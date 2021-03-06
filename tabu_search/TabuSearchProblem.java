package algorithms.implemented.tabu_search;

import java.util.LinkedList;
import java.util.Set;

public interface TabuSearchProblem<T> {
    T generateInitialSolution();
    boolean getStopCondition();
    LinkedList<T> getNeighbourhood(T solution);
    T getBestCandidate(Set<T> list);
    float eval(T candidate);
    void iterate(T solution, Integer timer);
    T substitute(T value1, T value2);
}
