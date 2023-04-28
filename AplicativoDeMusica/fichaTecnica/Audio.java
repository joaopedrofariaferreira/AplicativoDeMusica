//Classe mãe
package fichaTecnica;

public class Audio {
    private String nomeDaMusica;
    private double duracaDaMusica;
    private int curtidas;
    private String classificacao;
    private String criadorDaMusica;

    public String getCriadorDaMusica() {
        return criadorDaMusica;
    }

    public void setCriadorDaMusica(String criadorDaMusica) {
        this.criadorDaMusica = criadorDaMusica;
    }

    public String getNomeDaMusica() {
        return nomeDaMusica;
    }

    public void setNomeDaMusica(String nomeDaMusica) {
        this.nomeDaMusica = nomeDaMusica;
    }

    public double getduracaDaMusica() {
        return duracaDaMusica;
    }

    public void setduracaDaMusica(double duracaDaMusica) {
        this.duracaDaMusica = duracaDaMusica;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }
}
