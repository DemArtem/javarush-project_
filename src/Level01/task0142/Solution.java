package Level01.task0142;

/* 
Амиго очень умный
*/


import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        String militaryCommissar = ", явитесь в военкомат";
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        String name = "Amigo";
        if (age > 18 && age < 25) System.out.println(name + militaryCommissar);

    }
}