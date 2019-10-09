package kata2;

public class Kata2 {

    public static void main(String[] args) {
        Histogram histogram = new Histogram(3,4,4,2,1,6,-5,-3,-3,2,5,4,3,-3,1);
        new ConsoleHistogramDisplay().show(histogram);
    }
    
}
