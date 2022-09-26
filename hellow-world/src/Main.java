
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Arrays;
import java.util.Locale;
import java.time.LocalDate;


public class Main {
    public static void main(String[] args){
        String nome;
        nome = "Alexandre"; // Atribui Alexandre ao valor de nome
        nome = "valente";   // Atribui Valente ao valor de nome
        nome = "Osovski";   // Atribui Osovski ao valor de nome e o resto foi descartado
        
        System.out.println(nome);

        //Variaveis do tipo numérico

        int a = 2;
        int b = 3;
        int soma = a + b;

        System.out.println(soma);

        int c;
        int d;
        c = 5;
        d = 10;
        int multiplicacao = c * d;

        System.out.println(multiplicacao);

        int multiplicar = 5;

        for (int i = 0; i <= 10; i++) {
            System.out.println(i * multiplicar);
        }

        /*Números quebrados, devem ser representados sempre com float*/

        float x;
        float y;
        x=5;
        y=67;
        float divisao = x / y;

        //podemos fazer assim também

        int g = 4;
        int h = 5;

        float divisao2 = (float) g / h; //operação de "cast"

        System.out.println("o resultado da divisão é :" +  divisao +  "  esse é o valor da segunda divisão :" + divisao2);

        //imc
        float peso;
        float altura;
        float altura2;

        peso = 70;
        altura = (float) 1.70;
        altura2 = altura * altura;

        float imc = peso / altura2;

        if (imc < 19 ) {
            System.out.println("você está abaixo do peso");
        } if( imc <= 25){
            System.out.println("Você está com peso ideal");
        } else {
            System.out.println("Você está acima do peso");
        }


        boolean estaFazendoSol = true;
        boolean fimDeSemana  = true;

        boolean vamosAPraia = estaFazendoSol && fimDeSemana;

        System.out.println(vamosAPraia); //o resultado só vai dar true se todos os termos forem verdadeiros

        boolean euTenhoNome = true;
        boolean souHomen = false;
        boolean souAlexandre = euTenhoNome || souHomen;

        System.out.println(souAlexandre + "\n"); //o resultado sempre vai ser true até que todos os termos sejam false


        String mensagem = fimDeSemana ? "é fim de semana" : "não é fim de semana";
        // se for fim de semana (?) se não for fim de semana (:)

        System.out.println(mensagem );

        int nota1 = 10;
        int nota2 = 3;
        int nota3 = 3;

        float media = (float) (nota1 + nota2 + nota3) / 3;

        if(media < 7){
            System.out.println("você reprovou, que pena");
        } else {
            System.out.println("você passou, parabens");
        }

        int notaGeral = 90;
        String graduacao;

        // A > 80, B = 70, C = 60, D <= 50

        if(notaGeral > 80){
            graduacao = "Sua nota é maior que 80";
        } else if( notaGeral < 80 && notaGeral >= 70){
            graduacao = "Sua nota é 70";
        } else if (notaGeral < 70 && notaGeral >= 60) {
            graduacao = "sua nota é 60";
        } else {
            graduacao = "";
        }

    switch (graduacao){
        case "Sua nota é maior que 80":
        case "Sua nota é 70":
            System.out.println("Aluno aprovado");
            break;
        case "sua nota é 60":
        case "Sua nota é menor que 50":
            System.out.println("Aluno reprovado");
            break;
        default:
            System.out.println("nota muito baixa");
    }

        String meuNome = "Alexandre";

        Locale brasil = new Locale("pt", "BR");
        LocalDate hoje = LocalDate.now();
        LocalDateTime agora = LocalDateTime.now() ;
        String diaDaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        String saudacao;
                if(agora.getHour() >= 0 && agora.getHour() < 12){
                    saudacao = "bom dia";
                }else if(agora.getHour() >= 12 && agora.getHour() < 18 ){
                    saudacao = "boa tarde";
                } else {
                    saudacao = "boa noite";
                }

        System.out.println("olá " + meuNome + " hoje é " + diaDaSemana + ", " + saudacao.toLowerCase());
                //Resultado => olá Alexandre hoje é sexta-feira, boa noite


        int[] numeros = new int[3];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;

        for (int i = 0; i < numeros.length ; i++) {
            System.out.println(numeros[i]);
        }

        String[] letras = new String[2];
        letras[0] = "a";
        letras[1] = "b";



        for (int i = 0; i < letras.length ; i++) {
            System.out.println(letras[i]);
        }

        int[] numeros2 = {1, 2, 3, 4, 50};

        for (int i = 0; i < numeros2.length ; i++) {
            System.out.println(numeros2[i]);
        }

        System.out.println(Arrays.toString( numeros2));


        int[] numeros3 = {1, 2, 3, 4};

        int maior;
        int menor;
        int mediaTodos;

        maior = numeros3[0];
        menor = numeros[0];

        for (int i = 0; i < numeros3.length ; i++) {
            if(numeros3[i] > maior){
                maior = numeros3[i];
            }
            if(numeros3[i] < menor){
                menor = numeros3[i];
            }
            media += numeros3[i] / numeros3.length;
        }

        System.out.println(maior);
        System.out.println(menor);
        System.out.println(media);

        
        
        
        int resultado = soma (2,3);
        System.out.println(resultado);
    }

    public static int soma (int a, int b){
        return a + b;

    }
}
