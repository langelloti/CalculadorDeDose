package application;

import model.Cat;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a idade do animal: ");
        Integer age = sc.nextInt();
        System.out.println("Digite o peso do animal: ");
        Double weight = sc.nextDouble();
        Cat cat = new Cat(age, weight);


    }
}
