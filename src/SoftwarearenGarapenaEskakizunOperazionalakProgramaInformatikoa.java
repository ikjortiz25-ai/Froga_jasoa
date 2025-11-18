import java.util.Scanner;

public class SoftwarearenGarapenaEskakizunOperazionalakProgramaInformatikoa {
    /*
     * Debugerra erabiltzeko Breakpointak erabili behar dira honela debug zuk
     * autatutako lekuan egingo duelako gainera debugerrak beste funzionaliteta
     * batzuk ditu hala nola estep in/out zure funtzioaren barrua edo kanpora
     * joateko eta ere estep over deitutako botoia dago pausuak haurrera egiteko
     * banan banan(behean beste komentario batzuk gehitu ditut ikusteko paso
     * bakoitzean emadako erantzuna)
     */
    /*
     * Birfaktorizazioa:
     * Programa hau errex birfaktorizatu daiteke
     * 20-24 linetako kodean metodo bat sortuko nuen (aukeraPrint)
     * 27-33 linetako kodean beste metodo bat(lehenAukera)
     * 35-44 linetako kodean beste metodo bat(bigarrenAukera)
     */
    public static void main(String[] args) { // args = String[0]@9
        Scanner sc = new Scanner(System.in);// sc = Scanner@16
        /** Ikusi nahi dena aukeratzeko eskatzen du. */
        System.out.println("Aukeratu bat:");
        System.out.println("(1)Programa informatikoa");
        System.out.println("(2)Eskakizun operazionalak");
        /** Aukera irakurtzen duen scannerra */
        int aukera = sc.nextInt();// aukera = 1, sc = scanner@16
        /** Aukera 1 aukeratuz gero: */
        if (aukera == 1) { // aukera = 1
            System.out.println("Programa informatikoa:");
            System.out.println("Hasiera batean programatzeko modua oso desberdina zen");
            System.out.println("kode binarioak erabiltzen ziren programatzeko");
            System.out.println("geroago tarteko lengoail bat erabiltzen hasi ziren");
            System.out.println("Azkenik gaur egun erabiltzen dugun lengoila asmatu zuten.");
            /** Aukera 2 aukeratuz gero: */
        } else if (aukera == 2) {
            System.out.println("Eskakizun operazionalak:");
            System.out.println("Fidagarritasuna: bertan zihurtatzen gara gure web-a fidagarria dela.");
            System.out.println(
                    "Irisgarritasuna: Sortutako web-a erabiltzaile guztiei edozein momentuetan irisgarria egin behar zaio (24/7)");
            System.out.println("Erabilgarritasuna: web-a erraza izan behar du erabiltzeko.");
            System.out.println(
                    "Segurtasuna: errabiltzaile gustientzako web seguru bat diseñatu behar da biruz edo delakorrik gabekoa.");
            System.out.println(
                    "Eskalagarritasuna: sortutako web-ak prestatuta egon behar du sartuko diren bezero guztiekin funtzionatzen jarraitzeko");
            /** Aukera 1 edo 2 ez aukeratuz gero: */
        } else {
            System.out.println("Sartutako zenbakia 1 edo 2 izan behar du.");
        }
        sc.close();
    }
}
