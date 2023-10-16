//Interface que cria a parte da Criação de Chamadas
public interface AparelhoTelefonico {
    void ligar(String numero);//Inicializa o bloco de números com o botão chamar
    void atender();//Abre a chamada que está sendo recebida
    void iniciarCorreioVoz();//Inicia o correio de voz de uma chamada que foi perdida
}
