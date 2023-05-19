package br.com.lojadecamisa.servlet.model;

public class Produto {

    private  String Id;

    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    private String anoCamisa;
    private String nomeCamisa;
    private String valorProduto;
    private String quantidade;
    private String tamanho;

    public Produto(String id, String anoCamisa, String nomeCamisa,String tamanho ,String valorProduto, String quantidade, String image) {
        this.Id = id;
        this.anoCamisa = anoCamisa;
        this.nomeCamisa = nomeCamisa;
        this.tamanho= tamanho;
        this.valorProduto = valorProduto;
        this.quantidade = quantidade;
        this.image = image;
    }


    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getAnoCamisa() {
        return anoCamisa;
    }

    public void setAnoCamisa(String anoCamisa) {
        this.anoCamisa = anoCamisa;
    }

    public String getNomeCamisa() {
        return nomeCamisa;
    }

    public void setNomeCamisa(String nomeCamisa) {
        this.nomeCamisa = nomeCamisa;
    }

    public String getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(String valorProduto) {
        this.valorProduto = valorProduto;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
}
