

import java.util.Scanner;
//Extendendo a classe Funcionario para a classe Gerente herdar suas propriedades
public class Gerente extends Funcionario {


    Funcionario gen = new Funcionario();


    @Override //Para sobrepor o metodo(sem isso estariamos criando um metodo do zero)
    public void Status(){ //Puxando a função
        Perguntas(); //Puxando as perguntas da classe Funcionario para cá
        System.out.println("Nome: "+getNome().toUpperCase()); //UpperCase para tranformar tudo em maiusculo
        System.out.println("Sálario: "+getSalario());

        if (getSalario() < 5000){ //Vamos levar em consideração que 5000 é o piso sálarial
            System.out.println("Você é um gerente, mas recebe menos que um gerente: "+getSalario());
        } else {
            System.out.println("Você é um gerente e ganha como um gerente: "+getSalario());
        }
    }


}
