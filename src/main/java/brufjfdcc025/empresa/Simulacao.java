package brufjfdcc025.empresa;

import java.util.ArrayList;
import java.util.Scanner;

/*
    Gabriel Evaristo Carlos
    201965034AB
*/

public class Simulacao {
    static ArrayList<Investimento> investimentos = new ArrayList<>(); 
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        String titulo;
        float valor;
        int ano, mes;
        
        //Considerando que o usuário não irá errar ao preencher os dados
        //Não precisa fazer tratamento de exceção aqui
        
        //lendo renda fixa
        for(int i =1; i<4; i++){
            System.out.println("Lendo "+ i +"o investimento de renda fixa. Os seguintes dados:");
            System.out.println("Titulo:");
            titulo = teclado.nextLine();
            System.out.println("Valor:");
            valor = teclado.nextFloat();
            System.out.println("Data:");
            mes = teclado.nextInt();
            ano = teclado.nextInt();
            teclado.nextLine();
            
            RendaFixa renda = new RendaFixa(titulo, valor, new Data(mes, ano));
            
            investimentos.add(renda);
        }
        
        //lendo renda variável
        for(int i =1; i<3; i++){
            System.out.println("Lendo "+ i +"o investimento de renda variável. Os seguintes dados:");
            System.out.println("Titulo:");
            titulo = teclado.nextLine();
            System.out.println("Valor:");
            valor = teclado.nextFloat();
            System.out.println("Data:");
            mes = teclado.nextInt();
            ano = teclado.nextInt();
            teclado.nextLine();
            
            RendaVariavel renda = new RendaVariavel(titulo, valor, new Data(mes, ano));
            
            investimentos.add(renda);
        }
        System.out.println("Digite a data final da simulacao:");
        mes = teclado.nextInt();
        ano = teclado.nextInt();
        Data datafinal = new Data(mes, ano);
        
        RendimentoAcumulado(datafinal);
    }
    
    //Função 6-b
    public static void RendimentoAcumulado(Data d){
        try{
            float rendimentototal = 0f;
            float rendimento = 0.0f;
            for(Investimento i : investimentos){
                rendimento = i.CalculaRendimento(d);
                if(rendimento != 0.0f){
                    System.out.println("Titulo de investimento: " + i.getTitulo());
                    System.out.println("    Valor investido: " + i.getValor());
                    System.out.println("    Data de contratacao:" + i.getD().getMes() + "/" + i.getD().getAno());
                    System.out.println("    Rendimento acumulado: " + rendimento);
                    rendimentototal += rendimento;
                }
                else
                    System.out.println("Investimento "+ i.getTitulo() + " nao foi iniciado...");

            }
            System.out.println("Total de rendimento = " + rendimentototal);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }
}
