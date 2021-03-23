import java.math.BigInteger;
import java.util.Scanner;

class Main {

    public static void main(String[] args){
        new Main().solveProblem();
    }

    public void solveProblem(){
        final Scanner scanner = new Scanner(System.in);
        final BigInteger eleven = new BigInteger("11");
        String input;

        input = scanner.next();
        do{
            BigInteger bigInt = new BigInteger(input);
            BigInteger modulo = bigInt.mod(eleven);
            
            if (modulo.equals(BigInteger.ZERO))
                System.out.println(input + " is a multiple of 11.");
            else
                System.out.println(input + " is not a multiple of 11.");
            
            input = scanner.next();
        }
        while (!input.equals("0"));
        scanner.close();
    }
}
// public void testProblem(){
//     BigInteger multiplier = new BigInteger("284792759824058294857");
//     BigInteger eleven = new BigInteger("11");

//     BigInteger bigInt2 = new BigInteger("982735982794729712384792875023957023975715239817394872945");
//     BigInteger bigIntMultOfEleven, modulo;
//     do{
//         bigInt2 = bigInt2.multiply(multiplier);
//         bigIntMultOfEleven = bigInt2.multiply(eleven);
//         System.out.println("bigInteger: " + bigIntMultOfEleven + "\n");
//         modulo = bigIntMultOfEleven.mod(eleven);
//     }
//     while (modulo.signum() == 0);

//     System.out.println(bigInt2 + " var sista som multiplicerades med. Modulo: " + modulo);
// }