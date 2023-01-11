package vcanus.programmingtest.q3;

import java.util.Scanner;

public class Factorial {
    // 재귀함수로 factorial(4) 값 출력
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int a = sc.nextInt();
    	
        System.out.println("result: " + fact(a));
        
        sc.close();
    }
	
    public static int fact(int a) {
    	
        if (a == 0) {
            return 1;
        }else {
            return a * fact(a - 1);
        }
 
    }
}
