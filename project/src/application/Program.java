package application;

import model.Cat;
import model.Medicamento;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
        System.out.println("Digite a idade do animal: ");
        Integer age = sc.nextInt();
        System.out.println("Digite o peso do animal: ");
        Double weight = sc.nextDouble();
        Cat cat = new Cat(age, weight);

        System.out.println("Digite o nome do medicamento: ");
        String name = sc.next();
        System.out.println("Digite a unidade do medicamento: ");
        String unity = sc.next();
        System.out.println("Digite a dose por kilograma do medicamento: ");
        Double dosePerKg = sc.nextDouble();
        Medicamento medicamento = new Medicamento(name, dosePerKg, unity);

        System.out.println("O valor da dose do animal é: " + cat.calculateDose(medicamento));
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
