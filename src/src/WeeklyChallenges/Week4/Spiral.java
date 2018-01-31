package WeeklyChallenges.Week4;

import java.util.ArrayList;
import java.util.Scanner;

public class Spiral {
    Scanner scanner;
    public static Integer[][] spiral;
    ArrayList numbers;
    static int num = 1;
    public static int x,y;
    static int spiralLength;


    private Spiral() {
        scanner = new Scanner(System.in);
        System.out.println("Please choose length of spiral: ");
        spiralLength = Integer.parseInt(scanner.next());
        spiral = new Integer[spiralLength][spiralLength];
        x = 0;
        y = 0;
        makeSpiral();
        printSpiral();

    }


    private void printSpiral() {
        for (int i = 0; i < spiralLength; i++) {
            for (int j = 0; j < spiralLength; j++) {
                System.out.print(spiral[i][j]);
            }
            System.out.println();
        }
    }

    private void makeSpiral() {
        numbers = new ArrayList();
        //while (num<(spiralLength*spiralLength-1)) {
            RIGHT();
            DOWN();
            LEFT();
            UP();

        //}
    }

    private void RIGHT() {
        System.out.println(x + " " + y);
        while (y < spiralLength) {
            if (spiral[x][y] != null) {
                y++;
            } else if (spiral[x][y] == null) {
                spiral[x][y] = num;
                numbers.add(num);
                num++;
                y++;
            } else {
                break;
            }
        }
    y--;
    }

    private void DOWN() {
        System.out.println(x + " " + y);

        while(x < spiralLength){
            if(spiral[x][y] == null){
                spiral[x][y] = num;
                numbers.add(num);
                num++;
                x++;
            }else if(spiral[x][y] != null){
                x++;
            }else{
                break;
            }
        }
        x--;
    }

    private void LEFT() {
        System.out.println(x + " " + y);

        while (y >=0 ) {
            if (spiral[x][y] != null) {
                y--;
            } else if (spiral[x][y] == null) {
                spiral[x][y] = num;
                numbers.add(num);
                num++;
                y--;
            } else {
                break;
            }
        }
        y--;
    }

    private void UP() {
        System.out.println(x + " UP " + y);

        while(x >=0){
            if(spiral[x][y] == null){
                spiral[x][y] = num;
                numbers.add(num);
                num++;
                x--;
            }else if(spiral[x][y] != null){
                x--;
            }else{
                break;
            }
        }
        x++;
    }


    public static void main(String[] args) {
        new Spiral();
    }
}
