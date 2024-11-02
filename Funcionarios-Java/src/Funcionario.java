

import java.util.Scanner;

public class Funcionario {

    Scanner s = new Scanner(System.in);

    private String nome;
    private double salario;

    //Tornando nossos dados mais seguros com o private
    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    void Perguntas(){ //Perguntas feitas para os usuários
        Scanner s  = new Scanner(System.in);

        System.out.println("Nome: ");
        String name = s.nextLine(); //Interação com o usuário

        System.out.println("Salario: ");
        double slr = s.nextDouble(); //Interação com o usuário
        s.nextLine(); //Necessário para o salto de linha


        setNome(name);
        setSalario(slr);
    }


    public void Status(){
        //Criando o metodo apenas para puxar nas classes Dev e Gerente
    }
}








