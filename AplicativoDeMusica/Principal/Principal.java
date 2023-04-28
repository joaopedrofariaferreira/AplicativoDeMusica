package Principal;

import fichaTecnica.Audio;
import fichaTecnica.Musica;
import fichaTecnica.Podcast;


public class Principal extends Audio {
    public static void main(String[] args) {
       Musica musica = new Musica();
       musica.setNomeDaMusica("Replay");
       musica.setduracaDaMusica(3.06);
       musica.setClassificacao("Pop");
       musica.setCriadorDaMusica("Lady Gaga");
       musica.exibindoFichaTecnica();


        musica.setNomeDaMusica("Cuba");
        musica.setduracaDaMusica(2.50);
        musica.setClassificacao("MPB");
        musica.setCriadorDaMusica("Johnny Hooker");
        musica.exibindoFichaTecnica();

        Podcast podcast = new Podcast();
        podcast.setApresentador("João Pedro");
        podcast.setDescricao("Falaremos hoje sobre o crescimento do aquecimento global e suas complicações");
        podcast.fichaTecnicaPodcast();


        for(int i =0; i < 100 ; i++){
            podcast.getCurtidas();
        }
        for (int i = 0; i < 1444; i++){
            musica.getCurtidas();
        }




    }
}