package fichaTecnica;

//A classe Audio precisa conter as informações necessárias que devem conter na musica, como Nome da musica
//o dono da musica, seu tempo de duração e seu gênero

public class Musica extends Audio {


    public void exibindoFichaTecnica() {
        System.out.println("=====================================================");
        System.out.println("o nome da música é: " + getNomeDaMusica());
        System.out.println("Quem canta a musica é: " + getCriadorDaMusica());
        System.out.println("Tempo de duração: " + getduracaDaMusica());
        System.out.println("Genero: " + getClassificacao());
        System.out.println("=====================================================");
//        System.out.println();
//        System.out.println();
    }





}
