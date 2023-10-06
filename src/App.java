import components.Iphone;

public class App {
    public static void main(String[] args) throws Exception {
        
          Iphone novoIphone = new Iphone();

        System.out.println(" Chamando ");
        novoIphone.ligar();
        novoIphone.atender();
        novoIphone.iniciarCorreioDeVoz();

        System.out.println(" Navegando para");
        novoIphone.selecionarMusica();
        novoIphone.tocar();
        novoIphone.pausar();

        System.out.println(" Reproduzir a Música");
        novoIphone.adicionarNovaAba();
        novoIphone.exibirPagina();
        novoIphone.atualizarPagina();
    }
    
}
