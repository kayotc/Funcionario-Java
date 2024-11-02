
import java.util.Scanner;
//Extendendo a classe Funcionario para a classe Dev herdar suas propriedades
public class Dev extends Funcionario {


    Funcionario dev = new Funcionario();


    @Override //Para sobrepor o metodo(sem isso estariamos criando um metodo do zero)
    public void Status(){ //Puxando a função
        Perguntas(); //Puxando as perguntas da classe Funcionario para cá
        System.out.println("Nome: "+getNome().toUpperCase()); //UpperCase para tranformar tudo em maiusculo
        System.out.println("Sálario: "+getSalario());

        if (getSalario() < 3000){ //Vamos levar em consideração que 3000 é o piso sálarial
            System.out.println("Você é um desenvolvedor, mas recebe menos que um desenvolvedor: "+getSalario());
        } else {
            System.out.println("Você é um desenvolvedor e ganha como um desenvolvedor: "+getSalario());
        }
    }
}
