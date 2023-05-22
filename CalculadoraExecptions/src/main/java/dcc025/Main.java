package dcc025;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static final Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        double num = 0;

            System.out.println("Digite um numero para iniciar:");
            num = leDouble();

            int option;
        do{
            System.out.println("Digite a operacao:");
            printMenu();
            teclado.nextLine();
            try{
                option = teclado.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Erro: Valor Invalido");
                option = 0 ;
            }

            switch (option){
                case 0:
                    break;
                case 1:
                    num = adding(num);
                    System.out.println("Resultado da Soma:" + num);
                    break;
                case 2:
                    num = minus(num);
                    System.out.println("Resultado da Subtracao:" + num);
                    break;
                case 3:
                    num = multiply(num);
                    System.out.println("Resultado da Multiplicacao:" + num);
                    break;
                case 4:
                    num = division(num);
                    System.out.println("Resultado da Divisao:" + num);
                    break;
                case 5:
                    System.exit(0);
                default:
                    option = 5;
            }
        }while (option != 5);

    }
    public static void printMenu(){
        System.out.println("1) Soma");
        System.out.println("2) Subtracao");
        System.out.println("3) Multiplicacao");
        System.out.println("4) Divisao");
        System.out.println("5) Sair");
    }
    public static double adding(double value){
        System.out.println("Insira o valor para somar");
        double somador = leDouble();
        return value + somador;
    }

    public static double minus(double value){
        System.out.println("Insira o valor para subtrair");
        double minus = leDouble();
        return value - minus;
    }

    public static double multiply(double value){
        System.out.println("Insira o valor para multiplicar");
        double multiplyer = leDouble();
        return value * multiplyer;
    }
    public static double division(double value){
        System.out.println("Insira o divisor");
        try{
            double divisor = leDouble();
            checkDivisionByZero(divisor);
            return value / divisor;
        }catch (DivisionByZero e) {
            System.out.println("Erro: Divisao Por Zero");;
        }
        return value;
    }
    // teste
    public static void checkDivisionByZero(double divisor) throws DivisionByZero {
        if(divisor == 0){
            throw new DivisionByZero(" ");
        }
    }
    public static double leDouble() {
        double valor;
        try {
            valor = teclado.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Erro: Valor Invalido");
            valor = leDouble();
        }
        return valor;
    }
}
