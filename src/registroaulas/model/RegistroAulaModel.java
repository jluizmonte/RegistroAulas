package registroaulas.model;

import java.util.ArrayList;

/**
 *
 * @author joseluiz
 */
public class RegistroAulaModel {

    private String tema;
    private String textoBase;
    private String numeroOrdem;
    private String dinamicaUtilizada;
    private String data;
    private String status;
    private String rendimento;
    private String observacoesGerais;
    private ArrayList<String> listaRegistroModel = new ArrayList<>();

    public RegistroAulaModel() {
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getTextoBase() {
        return textoBase;
    }

    public void setTextoBase(String textoBase) {
        this.textoBase = textoBase;
    }

    public String getNumeroOrdem() {
        return numeroOrdem;
    }

    public void setNumeroOrdem(String numeroOrdem) {
        this.numeroOrdem = numeroOrdem;
    }

    public String getDinamicaUtilizada() {
        return dinamicaUtilizada;
    }

    public void setDinamicaUtilizada(String dinamicaUtilizada) {
        this.dinamicaUtilizada = dinamicaUtilizada;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRendimento() {
        return rendimento;
    }

    public void setRendimento(String rendimento) {
        this.rendimento = rendimento;
    }

    public String getObservacoesGerais() {
        return observacoesGerais;
    }

    public void setObservacoesGerais(String observacoesGerais) {
        this.observacoesGerais = observacoesGerais;
    }

    public ArrayList<String> getListaRegistroModel() {
        return listaRegistroModel;
    }

    public void setListaRegistroModel(ArrayList<String> listaRegistroModel) {
        this.listaRegistroModel = listaRegistroModel;
    }

    @Override
    public String toString() {
        return "RegistroAulaModel{" + "tema=" + tema + ", textoBase=" + textoBase + ", numeroOrdem=" + numeroOrdem + ", dinamicaUtilizada=" + dinamicaUtilizada + ", data=" + data + ", status=" + status + ", rendimento=" + rendimento + ", observacoesGerais=" + observacoesGerais + ", listaRegistroModel=" + listaRegistroModel + '}';
    }

}
