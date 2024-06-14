import interfaces.AparelhoTelefone;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefone, NavegadorInternet, ReprodutorMusical {
    private float armazenamento;
    private int memoriaRam;
    private int saudeBateria;
    private String modelo;
    private String sistemaOperaciona;

    public Iphone(float armazenamento, int memoriaRam, int saudeBateria, String modelo, String sistemaOperaciona) {
        this.armazenamento = armazenamento;
        this.memoriaRam = memoriaRam;
        this.saudeBateria = saudeBateria;
        this.modelo = modelo;
        this.sistemaOperaciona = sistemaOperaciona;
    }

    @Override
    public void ligar(String numero) {
        System.out.printf("Ligando para o número %s...\n", numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Ouvindo caixa de mensagens...");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página web...");
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.printf("Abrindo nova página %s...\n", url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música...");
    }

    @Override
    public void selecionarMusica(String nomeMusica) {
        System.out.printf("Selecionando '%s'...\n", nomeMusica);
    }
}
