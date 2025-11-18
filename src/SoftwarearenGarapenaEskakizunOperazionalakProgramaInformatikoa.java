import java.util.Scanner;
public class SoftwarearenGarapenaEskakizunOperazionalakProgramaInformatikoa {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Aukeratu bat:");
      System.out.println("(1)Programa informatikoa");
      System.out.println("(2)Eskakizun operazionalak");
      int aukera = sc.nextInt();

      if(aukera == 1){
        System.out.println("Programa informatikoa:");
        System.out.println("Hasiera batean programatzeko modua oso desberdina zen");
        System.out.println("kode binarioak erabiltzen ziren programatzeko");
        System.out.println("geroago tarteko lengoail bat erabiltzen hasi ziren");
        System.out.println("Azkenik gaur egun erabiltzen dugun lengoila asmatu zuten.");
      }else if(aukera == 2){
        System.out.println("Eskakizun operazionalak:");
        System.out.println("Fidagarritasuna: bertan zihurtatzen gara gure web-a fidagarria dela.");
        System.out.println("Irisgarritasuna: Sortutako web-a erabiltzaile guztiei edozein momentuetan irisgarria egin behar zaio (24/7)");
        System.out.println("Erabilgarritasuna: web-a erraza izan behar du erabiltzeko.");
        System.out.println("Segurtasuna: errabiltzaile gustientzako web seguru bat diseñatu behar da biruz edo delakorrik gabekoa.");
        System.out.println("Eskalagarritasuna: sortutako web-ak prestatuta egon behar du sartuko diren bezero guztiekin funtzionatzen jarraitzeko");
      }else{
        System.out.println("Sartutako zenbakia 1 edo 2 izan behar du.");
      }
    sc.close();
    }
}
