package com.company;
import java.util.Scanner;
class ArabToRim {
    int arab;
    String rim;
    int dec;
    void metodArRim() {
         dec = arab / 10;
        rim = "";
        switch (dec) {
            case 0:
                break;
            case 1:
                rim += 'X';
                break;
            case 2:
                rim += "XX";
                break;
            case 3:
                rim += "XXX";
                break;
            case 4:
                rim += "XL";
                break;
            case 5:
                rim += "L";
                break;
            case 6:
                rim += "LX";
                break;
            case 7:
                rim += "LXX";
                break;
            case 8:
                rim += "LXXX";
                break;
            case 9:
                rim += "XC";
                break;
            case 10:
                rim += "C";
                break;
        }
        //System.out.printf(this.rim);
        //System.out.print(this.dec);
        dec = arab % 10;
        switch (dec) {
            case 0:
                break;
            case 1:
                rim += 'I';
                break;
            case 2:
                rim += "II";
                break;
            case 3:
                rim += "III";
                break;
            case 4:
                rim += "IV";
                break;
            case 5:
                rim += "V";
                break;
            case 6:
                rim += "VI";
                break;
            case 7:
                rim += "VII";
                break;
            case 8:
                rim += "VIII";
                break;
            case 9:
                rim += "IX";
                break;

        }

    }
}


public class Main {
    static int isNotRim(String strn) {
        char b;
        b = strn.charAt(0);
        if (b == 'I' || b == 'V' || b == 'X' || b == 'L' || b == 'C') return 0;
        return 1;
    }

    static int toInt(String key) {
        switch (key) {
            case "1":
            case "I":
                return 1;
            case "2":
            case "II":
                return 2;
            case "III":
            case "3":
                return 3;
            case "IV":
            case "4":
                return 4;
            case "V":
            case "5":
                return 5;
            case "VI":
            case "6":
                return 6;
            case "VII":
            case "7":
                return 7;
            case "VIII":
            case "8":
                return 8;
            case "IX":
            case "9":
                return 9;
            case "X":
            case "10":
                return 10;

            default:
                System.out.printf("Error! Enter correct number");
                return 0;
        }
    }

    public static void main(String[] args) {
        String strnum1;
        String strnum2;
        int num1, num2, ans;
        // write your code here
        System.out.println("hello");
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter two numbers ");
        System.out.print("\nEnter an operator (+, -, *, /): ");
        strnum1 = reader.next();
        strnum2 = reader.next();
        char op = reader.next().charAt(0);
        num1 = toInt(strnum1);
        num2 = toInt(strnum2);
        if (num1 * num2 == 0) return;
        if (1 == isNotRim(strnum1) + isNotRim(strnum2)) {
            System.out.printf("Error! Ont number is Rim ,another - Arab");
            return;
        }
        switch (op) {
            case '+':
                ans = num1 + num2;
                break;
            case '-':
                ans = num1 - num2;
                break;
            case '*':
                ans = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {System.out.printf("Divide by 0"); return;}ans = num1 / num2;
                break;
            default:
                System.out.printf("Error! Enter correct operator");
                return;
        }
        if (0 != isNotRim(strnum1) * isNotRim(strnum2)) {
            System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
            return;
        }
        if (ans <= 0) return;
        ArabToRim ans1 = new ArabToRim();
        ans1.arab = ans;
        ans1.metodArRim();
        System.out.printf(strnum1 + " " + op + " " + strnum2 + " = " + ans1.rim);
        return;

    }
}

