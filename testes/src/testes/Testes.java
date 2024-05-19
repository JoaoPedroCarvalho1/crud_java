/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testes;

import java.util.Scanner;

/**
 *
 * @author jpcar
 */
public class Testes {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = new String[7];
        names[0] = "Jarvis";
        names[1] = "Jarvis";
        names[2] = "Ório";
        names[3] = "Sarah";
        names[4] = "Arqueiro";
        names[5] = "Math";
        names[6] = "Esfinge";
        if (names[4] != "Arqueiro") {
            System.out.printf("%s: Que espada diferentes.\n", names[0]);
            System.out.printf("%s: Pelo visto cada tipo de ataque tem uma base numérica.\n", names[0]);
            System.out.printf("%s: Nessa aula de matemática eu não faltei.\n", names[0]);
        } else {
            System.out.printf("%s: Que flechas diferentes.\n", names[0]);
            System.out.printf("%s: Pelo visto cada tipo de flecha tem uma base numérica.\n", names[0]);
            System.out.printf("%s: Nessa aula de matemática eu não faltei.\n", names[0]);
        }
        System.out.printf("%s: Sue barulho é esse?\n", names[0]);
        System.out.printf("%s Se vira e olha para as árvores ao fundo.\n", names[0]);
        System.out.printf("%s: Que droga de criatura é essa?\n", names[0]);
        System.out.printf("A criatura se aproxima correndo, e %s percebe que é um golem\nEle tenta atacar ela.\n", names[0]);
        System.out.printf("%s:Meus ataques não surtem efeito nessa coisa, deve ter algum truque por trás disso!\n", names[0]);
        if ("Arqueiro".equals(names[4])) {
            System.out.printf("%s: Minhas flechas de base hexadecimal não estão causando dano,\nvou testar com outro tipo de flechas!\n", names[0]);
        } else {
            System.out.printf("%s: Meus golpes de base hexadecimal não estão surtindo efeito,\nvou testar com outro tipo de base\n", names[0]);
        }
    }
}