/*O Prof. Yoshi está ensinando economia doméstica para um dos estagiários que trabalha com ele, orientando-o a guardar uma cédula de dinheiro por mês em um cofrinho, durante o período de um ano.
Seu estagiário achou que seria ótimo fazer uma aplicação para ajudar a controlar esse valor.
Mas ele ficou com algumas dúvidas de como criar esse programa.

Como você é um excelente programador(a), ajude-o criando uma classe Java que:

a) Seja executável

b) Pergunte ao usuário seu primeiro nome

c) Pergunte 12 vezes o valor do depósito realizado com uma frase como esta: "Valor depositado no Xº mês:", onde X vai de 1 a 12.

d) Ao receber o valor de cada depósito, apenas aceite valores de 2,00; 5,00; 10,00; 20,00; 50,00; 100,00, afinal são as únicas cédulas que temos.
Ignore qualquer outro valor, considerando que foi depositado nada.

e) Após os 12 depósitos, exiba uma frase com esta: "Ao final de 12 meses, X guardou R$Y".
Onde X é o nome recebido no item b) e Y é a soma de todos os depósitos válidos.
Use a técnica da interpolação e arredonde os valores monetários exibidos para 2 casas decimais.



O Prof. Yoshi está ensinando economia doméstica para um dos estagiários que trabalha com ele, orientando-o a guardar uma cédula de dinheiro por mês em um cofrinho, durante o período de um ano.
Seu estagiário achou que seria ótimo fazer uma aplicação para ajudar a controlar esse valor.
Mas ele ficou com algumas dúvidas de como criar esse programa.

Como você é um excelente programador(a), ajude-o criando uma classe Java que:

a) Seja executável

b) Pergunte ao usuário seu primeiro nome

c) Pergunte 12 vezes o valor do depósito realizado com uma frase como esta: "Valor depositado no Xº mês:", onde X vai de 1 a 12.

d) Ao receber o valor de cada depósito, apenas aceite valores de 2,00; 5,00; 10,00; 20,00; 50,00; 100,00, afinal são as únicas cédulas que temos.
Ignore qualquer outro valor, considerando que foi depositado nada.

e) Após os 12 depósitos, exiba uma frase com esta: "Ao final de 12 meses, X guardou R$Y".
Onde X é o nome recebido no item b) e Y é a soma de todos os depósitos válidos.
Use a técnica da interpolação e arredonde os valores monetários exibidos para 2 casas decimais.*/



Scanner leitorS = new Scanner(System.in);
        Scanner leitor = new Scanner(System.in);
        
        String nome;
        Integer numero,soma;
        
        System.out.println("Digite o seu nome: ");
        nome = leitorS.nextLine();
        
        
        soma = 0;
        for (Integer i = 1; i <= 12; i++) {
            System.out.println("Valor depositado no "+ i +"º mês:");
            numero = leitor.nextInt();
            soma += numero;
            }
        
        System.out.println("Ao final de 12 meses, "+ nome + " guardou R$"+ soma);
        
    }     

WELLINGTON


   /*public static void main(String[] args) {
       
        Scanner leitor = new Scanner(System.in);
        
        Double ValorDeposito;
        
        Integer Vezes = 0;
        
        Double soma = 0.0;
        
        System.out.println("Digite seu nome:");
        String Nome = leitor.nextLine();
        
        System.out.println("Digite o valor do depósito do dia:");
            ValorDeposito = leitor.nextDouble();
            
         while(Vezes <= 6){   
        if(ValorDeposito <= 1.0 || ValorDeposito >= 0.1){
            System.out.println("Digite o valor do depósito do dia:");
            ValorDeposito = leitor.nextDouble();
            soma += ValorDeposito;
            Vezes++;
            }
         } if (Vezes == 7){
             System.out.println("Ao final de 7 dias, " + Nome + " guardou R$" + soma);
         }
    }*/
