import java.util.Scanner;

class jed {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        char operator;
        Double fnum, snum, result;

        System.out.print("Choose an operator (+, -, *, /): ");
        operator = scan.next().charAt(0);
        System.out.print("");

        System.out.print("Enter your first num: ");
        fnum = scan.nextDouble();

        System.out.print("Enter your second num: ");
        snum = scan.nextDouble();
        System.out.print("");

        switch (operator) {

            case '+':
            result = fnum + snum;
            System.out.print(+fnum+" + "+snum+": "+result);
            break;

            case '-':
            result = fnum - snum;
            System.out.print(+fnum+" - "+snum+": "+result);
            break;

            case '*':
            result = fnum * snum;
            System.out.print(+fnum+" * "+snum+": "+result);
            break;

            case '/':
            result = fnum / snum;
            System.out.print(+fnum+" / "+snum+": "+result);
            break;

            default:
            System.out.print("[!!] INVALID CHARACTER [!!]");
            System.out.println("please make sure u type the right symbol.");
        
        }

    }
}