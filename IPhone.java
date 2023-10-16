public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    public static void main(String[] args) {
        IPhone meuIphone = new IPhone();
    
        //Testagem dos métodos
        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.selecionarMusica("Imagine - John Lennon");
        meuIphone.ligar("123-456-7890");
        meuIphone.exibirPagina("https://www.google.com");
    }

    //Ações do reprodutor de música//

    @Override
    public void tocar() {
        System.out.println("Tocando a música: ");
    }

    @Override
    public void pausar() {
         System.out.println("Pausando a Música: ");
    }

    @Override
    public void selecionarMusica(String musica) {
         System.out.println("Selecione uma música!");
    }

    //Ações do Aplicativo de Ligações// 

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para...");
    }

    @Override
    public void atender() {
        System.out.println("Você está recebendo uma chamada!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando o Correio de Voz");
    }

    //Ações do Navegador de Internet

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a Página");
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("Uma nova aba foi adicionada!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página");
    }
}