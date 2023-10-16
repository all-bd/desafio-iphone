//Interface que cria a parte do Navegador de Internet 
public interface NavegadorInternet {
    void exibirPagina(String url); //Exibe a página da internet atual
    void adicionarNovaAba(String url);//Adiciona uma nova aba ao navegador
    void atualizarPagina();//Atualiza a página atual
}
