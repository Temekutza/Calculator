import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер нужного вам перевода:");
        System.out.println("1.Перевод из 10-тичной сс в 16-ричную и 2-ичную систему счистелния ");
        System.out.println("2.Перевод из 2-ичной сс в 10 ричную систему счистелния ");
        int meaning = in.nextInt();
        switch (meaning) {
            case (1):

                System.out.println("Введите число в 10-ричной системе счисления");
                // перевод в 16-ричную сс
                String strOut = "";
                int firstNum = in.nextInt();
                int result;
                int num2 = firstNum;
                int num16 = firstNum;
                do {
                    result = num16 / 16;
                    strOut = strOut + translation(num16 - 16 * result);
                    num16 = result;
                } while ((result / 16) != 0);
                strOut = strOut + translation(result);

                if (strOut.endsWith("0")) {
                    strOut = strOut.substring(0, strOut.length() - 1);
                    System.out.println(reverse(strOut));
                } else {
                    System.out.println(reverse(strOut));
                }
                // перевод в 2-ичнкю сс
                strOut = "";
                do {
                    result = num2 / 2;
                    strOut = strOut + translation(num2 - 2 * result);
                    num2 = result;
                } while ((result / 2) != 0);
                strOut = strOut + translation(result);
                System.out.println(reverse(strOut));
                break;
            case (2):
                System.out.println("Введите число в 2-ичной системе счисления");
                int secondNumb = in.nextInt();
                double sum10 = 0;
                String secondOut = String.valueOf(secondNumb);


                for (int i=secondOut.length()-1 ; i >= 0 ;i--){
                    int sim = secondOut.charAt(secondOut.length()-i-1);
                    if(sim ==49 || sim ==48) {
                        if (sim == 49) {
                            sum10 = sum10 + Math.pow(2, i);

                        }
                    }else {
                        System.out.println("Некоректный ввод числа");
                    }
                }
                System.out.println(sum10);

                break;

            default:
                System.out.println("Некоректный пункт");

        }

    }

    //перевод цифр в вид букв и строк
    public static String translation(int a){
        String num;
        switch (a){
            case (10): num = "A";
                break;
            case (11): num = "B";
                break;
            case (12): num = "C";
                break;
            case (13): num = "D";
                break;
            case (14): num = "E";
                break;
            case (15) : num ="F";
                break;
            default: num = String.valueOf(a);
        }

        return num;
    }
    // развернуть строчку
    public static String reverse(String str){
        return new StringBuilder(str).reverse().toString();
    }

}
