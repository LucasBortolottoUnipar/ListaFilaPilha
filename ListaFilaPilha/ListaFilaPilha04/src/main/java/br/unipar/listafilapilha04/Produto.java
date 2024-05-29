package br.unipar.listafilapilha04;

public class Produto {
    private int codProduto;
    private String descricao;
    private String dataEntrada;
    private String ufOrigem;
    private String ufDestino;

    public Produto(int codProduto, String descricao, String dataEntrada, String ufOrigem, String ufDestino) {
        this.codProduto = codProduto;
        this.descricao = descricao;
        this.dataEntrada = dataEntrada;
        this.ufOrigem = ufOrigem;
        this.ufDestino = ufDestino;
    }

    public int getCodProduto() {
        return codProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public String getUfOrigem() {
        return ufOrigem;
    }

    public String getUfDestino() {
        return ufDestino;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codProduto=" + codProduto +
                ", descricao='" + descricao + '\'' +
                ", dataEntrada='" + dataEntrada + '\'' +
                ", ufOrigem='" + ufOrigem + '\'' +
                ", ufDestino='" + ufDestino + '\'' +
                '}';
    }
}
