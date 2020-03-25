package algorithms;

    // coefficients list
public class Configuration {

    public static final Integer TABU_LIST_SIZE = 5;

    // for griewank function
    public static final int GRIEWANK_ITERATIONS = 2000;
    public static final int GRIEWANK_SPACE_SIZE = 200;
    public static final int GRIEWANK_NEIGHBOUR_DISTANCE = 1;
    public static  int GRIEWANK_MAX_TIME;

    // for happycat functioon
    public static final int HAPPY_CAT_ITERATIONS = 2000;
    public static final int HAPPY_CAT_SEARCH_SPACE_SIZE = 200;
    public static final int HAPPY_CAT_NEIGHBOUR_DISTANCE = 1;
    public static  int HAPPYCAT_MAX_TIME;

    // CONSTANTS FOR HEURISTICS
    public static final int TSP_MAX_ITERATIONS = 200;
    public static final int PERMUTATIONS_SIZE = 2;
    public static  int TSP_MAX_TIME;

    //
    public static final Integer ROUTE_OPT_MAX_ITERATIONS = 200;
    public static  int ROUTE_OPT_MAX_TIME;

    // should be >1
    public static final float ALPHA_COEFFICIENT = 5F;
    public static final float STARTING_TEMPERATURE = 1F;
    public static final float TAU = 1.2F;



    }
