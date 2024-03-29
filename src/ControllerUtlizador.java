import java.util.List;
import java.util.Map;

public class ControllerUtlizador {
    private ViewerUtlizador viewerUtlizador;
    private ModelUtlizador modelUtlizador;

    public ControllerUtlizador(ViewerUtlizador viewerUtlizador,ModelUtlizador modelUtlizador)
    {
        this.setModelUtlizador(modelUtlizador);
        this.setViewerUtlizador(viewerUtlizador);

    }

    public Utilizador criaUtlizador(String email,String nome,String morada,String nif)
    {
        return this.modelUtlizador.criaUtlizador(email,nome,morada,nif);
    }

    public Map<String, Utilizador> getListaUtilizadores() {
        return modelUtlizador.getListaUtilizadores();
    }

    public String loadUtilizadores() {
        return this.modelUtlizador.loadUtilizadores();
    }

    public boolean userTemArtigo(String codBarras) {
        return this.modelUtlizador.userTemArtigo(codBarras);
    }

    public void registarArtigoNoUtlizador(Utilizador user, String codBarras) {
        this.modelUtlizador.registarArtigoNoUtlizador(user,codBarras);
    }

    public List<String> percorreUsers() {
        List<String> produtos = this.modelUtlizador.percorreUsers();

        return produtos;
    }
    /*
    public Utilizador getUserByArtigo(Artigo art) {
        return modelUtlizador.getUserByArtigoAVenda(art);
    }
     */

    public Utilizador getUserByEmail(String email) {
        return this.modelUtlizador.getUserByEmail(email);
    }

    public String infoTodosUsers() {
        return this.modelUtlizador.infoTodosUsers();
    }

    public String infoUserByEmail(String email) {
        return this.modelUtlizador.infoUserByEmail(email);
    }

    public void setViewerUtlizador(ViewerUtlizador viewerUtlizador) {
        this.viewerUtlizador = viewerUtlizador;
    }

    public void removeVariosArtigosUser(Utilizador user, List<String> lst) {
        modelUtlizador.removeVariosArtigosUser(user, lst);
    }

    public boolean addArtigoCarrinho(Utilizador utilizador, Artigo art) {
        return modelUtlizador.addArtigoCarrinho(utilizador, art);
    }

    public List<Artigo> getArtigosCarrinho (Utilizador utilizador)
    {
        return modelUtlizador.getArtigosCarrinho(utilizador);
    }

    public String getCodSistemaUtlizador(Utilizador utilizador)
    {
        return modelUtlizador.getCodSistemaUtlizador(utilizador);
    }

    public void retiraArtigoDeVenda(String codBarras,Artigo artigo,String codSistemComprador)
    {
        modelUtlizador.retiraArtigoDeVenda(codBarras,artigo,codSistemComprador);
    }

    public void addCarrinhoToEncomendas(String email, Map<String, Encomenda> lstEnc) {
        modelUtlizador.addCarrinhoToEncomendas(email, lstEnc);
    }

    public String getInfoCarrinho(Utilizador user) {
        return modelUtlizador.getInfoCarrinho(user);
    }

    public void removeArtigoCarrinho(Utilizador user, String codBarras) {
        modelUtlizador.removeArtigoCarrinho(user, codBarras);
    }

    public void limpaCarrinho(Utilizador utlizador)
    {
        modelUtlizador.limparCarrinho(utlizador);
    }

    public String infoTodosArtigosAVenda() {
        return this.modelUtlizador.infoTodosArtigosAVenda();
    }

    public void addEncomendaUser(Utilizador user, Map<String, Artigo> lstArt) {
        this.modelUtlizador.addEncomendaUser(user, lstArt);
    }

    public void setModelUtlizador(ModelUtlizador modelUtlizador) {
        this.modelUtlizador = modelUtlizador;
    }
}
