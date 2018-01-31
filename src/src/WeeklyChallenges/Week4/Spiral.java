package WeeklyChallenges.Week4;

import java.util.ArrayList;
import java.util.Scanner;

public class Spiral {
    Scanner scanner;
    public static Integer[][] spiral;
    static int num = 0;
    static int loop;
    public static int x,y;
    static int spiralLength;


    private Spiral() {
        scanner = new Scanner(System.in);
        System.out.println("Please choose length of spiral: ");
        spiralLength = Integer.parseInt(scanner.next());
        spiral = new Integer[spiralLength][spiralLength];
        loop = spiralLength +0;
        x = 0;
        y = 0;
        makeSpiral();
        printSpiral();

    }


    private void printSpiral() {
        for (int i = 0; i < spiralLength; i++) {
            for (int j = 0; j < spiralLength; j++) {
                System.out.print(spiral[i][j]+"\t" );
            }
            System.out.println();
        }
    }

    private void makeSpiral() {
        for (int i = 0; i < loop; i++) {
            num++;
            spiral[x][y] = num;
            if(y+1<loop)y++;
        }

        loop--;
        while (num< spiralLength*spiralLength) {
            DOWN(loop);
            LEFT(loop);
            loop--;
            UP(loop);
            RIGHT(loop);
            loop--;
        }
    }


    private void DOWN(int loops) {

        for (int i = 0; i < loops; i++) {
            num++;
            x++;
            spiral[x][y] = num;
        }
    }

    private void LEFT(int loops) {
        for (int i = 0; i < loops; i++) {
            num++;
            y--;
            spiral[x][y] = num;
        }
    }

    private void UP(int loops) {
        for (int i = 0; i < loops; i++) {
            num++;
            x--;
            spiral[x][y] = num;
        }
    }
    private void RIGHT(int loops) {
        for (int i = 0; i < loops; i++) {
            num++;
            y++;
            spiral[x][y] = num;
        }
    }


    public static void main(String[] args) {
        new Spiral();
    }
}
