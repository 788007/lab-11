
/**
 * @Laurel Woods
 * @ lab 5 9/9/16
 */
public class StatLab2DRunner
{
    public static void main(String[] args){
        int squash[][] = new int[5][5];
        StatLab2D loop = new StatLab2D(squash);
        loop.loadRandom2D();
        loop.printArray2D();
        loop.sortArray2D();
        loop.printArray();
        System.out.println("\n" + "The mean is " + loop.getMean2D());
    }
}
