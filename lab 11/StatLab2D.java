
/**
 * @Laurel Woods 
 * @lab 5 9/9
 */
import java.util.Arrays;
public class StatLab2D
{
    private int[][] pumpkin;
    private int[] ghost;
    
    public StatLab2D(int[][] n){
        pumpkin = n;
        ghost = new int[pumpkin.length * pumpkin[0].length];
    }
    
    public void loadRandom2D() {
        for(int r = 0; r < pumpkin.length; r++) {
            for(int c = 0; c < pumpkin[r].length; c++) {
                pumpkin[r][c] = (int)((Math.random() * 10) + 1);
            }
        }
    }
    
    public void printArray2D(){
        for (int r = 0; r < pumpkin.length; r++) {
            for(int c = 0; c < pumpkin[r].length; c++) {
                System.out.print(pumpkin[r][c] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public void sortArray2D(){
        int i = 0;
        for(int r = 0; r < pumpkin.length; r++) {
            for (int c = 0; c < pumpkin[0].length; c++) {
                ghost[i] = pumpkin[r][c];
                i++;
            }
        }
        Arrays.sort(ghost);
    }
    
    public void printArray(){
        for(int i = 0; i < ghost.length; i++) {
            System.out.print(ghost[i] + "\t");
            if((i + 1) % 5 == 0) {
                System.out.println();
            }
        }
    }
    
    public double getMean2D() {
        int sum = 0;
        for(int r = 0; r < pumpkin.length; r++) {
            for(int c = 0; c < pumpkin[r].length; c++) {
                sum += pumpkin[r][c];
            }
        }
        return ((double)(sum)) /((double)(pumpkin.length * pumpkin[0].length));
    }
    
}
