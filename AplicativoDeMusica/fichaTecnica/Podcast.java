package fichaTecnica;

public class Podcast extends Audio {
    private String apresentador;
    private String descricao;

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void fichaTecnicaPodcast(){
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Apresentador por: " + getApresentador());
        System.out.println("Assuntoi do momento: "+ getDescricao());
        System.out.println("Quantidade de curtidas: " + getCurtidas());
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");

    }
//    public int getCurtidas() {
//        if (this.getCurtidas() > 300) {
//            return 10;
//        }else {
//            return 8;
//        }
//    }

}
