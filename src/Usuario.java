public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTV smartTv = new SmartTV();

        System.out.println("Minha smartTv está " + smartTv.ligada);
        System.out.println("O canal da minha smartTv está " + smartTv.canal);
        System.out.println("E o volume da minha smartTv está " + smartTv.volume);

        smartTv.ligar(); // Chamada da função em outra class principal
        System.out.println("Novo Status - TV ligada " + smartTv.ligada); // Manipulando o estado das variáveis dentro de uma public void em outra class principal.

        smartTv.abaixarCanal();
        System.out.println("Novo Status - Canal foi diminuido " + smartTv.canal);


    }
}