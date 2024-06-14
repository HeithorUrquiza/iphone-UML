public class Main {
    public static void main(String[] args) {
        var iphone = new Iphone(
                128.0f,
                8,
                100,
                "15",
                "IOS 17"
        );

        iphone.ligar("62990908776");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.exibirPagina();
        iphone.atualizarPagina();
        iphone.adicionarNovaAba("google.com");
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Somewhere I belong");
    }
}
