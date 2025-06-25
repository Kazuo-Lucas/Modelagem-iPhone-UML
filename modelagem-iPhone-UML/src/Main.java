public class Main {
    public static void main(String[] args) {
        IPhone meuIphone = new IPhone("iPhone 14");

        meuIphone.selecionarMusica("Imagine - John Lennon");
        meuIphone.tocar();
        meuIphone.pausar();

        meuIphone.ligar("1234-5678");
        meuIphone.atender();

        meuIphone.exibirPagina("https://www.apple.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
