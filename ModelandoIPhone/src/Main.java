public class Main {
    public static void main(String[] args) {

        iPhone iPhone12 = new iPhone();

        iPhone12.ligar("13988678984");
        iPhone12.atender();
        iPhone12.iniciarCorreioVoz();

        iPhone12.adicionarNovaAba();
        iPhone12.exibirPagina("google.com");
        iPhone12.atualizarPagina();

        iPhone12.selecionarMusica("Metallica - Nothing else matters");
        iPhone12.tocar();
        iPhone12.pausar();

    }
}