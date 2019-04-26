package Task02;

public class Main {
    public static void main(String[] args) {

    }
}
class Problem {
    private static int duration;
    private static long complexity;
    private static boolean MaybeItIsNotAProblem;

    public static int getDuration() {
        return duration;
    }

    public static void setDuration(int duration) {
        Problem.duration = duration;
    }

    public static long getComplexity() {
        return complexity;
    }

    public static void setComplexity(long complexity) {
        Problem.complexity = complexity;
    }

    public static boolean isMaybeItIsNotAProblem() {
        return MaybeItIsNotAProblem;
    }

    public static void setMaybeItIsNotAProblem(boolean maybeItIsNotAProblem) {
        MaybeItIsNotAProblem = maybeItIsNotAProblem;
    }
    public int compare(Problem a, Problem b) {

        if (a.getComplexity() > b.getComplexity())
            return 1;
        else if (a.getComplexity() < b.getComplexity())
            return -1;
        else
            return 0;
    }
}
