package FirstAtiv;

import static FirstAtiv.Lista.*;
import static FirstAtiv.Quant.*;
import static FirstAtiv.Player.*;
import static FirstAtiv.Game.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] v = new int[100];
        int num_player_aux = 0, num_player;

        // Quantos n jogadores terao

        num_player = num(num_player_aux);

        int[] players = new int[num_player];
        int[] validate = new int[num_player];

        // criar e preencher lista com 100 numeros inteiros aleatorios
        list(v);

        /*
         * criar n jogadores{
         * 
         * usuario n digita um numero inteiro
         * 
         * se (1) é vdd, encerra o processo e vai pro prox jogador{
         * 
         * (1)numero inteiro digitado eh verificado se esta na lista ou nao
         * }
         * 
         * }
         */

        players(num_player, players, v, validate);

        System.out.println(Arrays.toString(players));
        System.out.println(Arrays.toString(validate));

        /*
         * {
         * 
         * //printar "Que comecem os jogos"
         * 
         * Repetir 5 vezes por jogador{
         * calcular quantas vezes o numero foi achado na lista
         * perguntar para o usuario quant
         * Dependendo da amplitude entre o imput do usuario e o numero achado na lista
         * Nessa ordem, deve printar "Esta Congelado", "Esta frio", "Esta esquentando",
         * "Esta quente"
         * }
         * }
         */

        game(players, v, validate);

        // printar vencedor

        // colocar escolha de começar outro jogo ou encerrar o sistema
    }

}
