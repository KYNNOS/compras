/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compras;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author hp pc
 */
public class inserirartigos extends vetor{
    Vector<artigo> artigos= new Vector<artigo>();
    public inserirartigos() {
        double soma = 0;
        String x  ;
        double y=0 ;
        artigo artigo1 = new artigo();
        System.out.println("insira o nome para o artigo");
        x = new Scanner(System.in).nextLine();
        artigo1.setnome(x);
        System.out.println("insira o preço para o artigo ");
        y = new Scanner(System.in).nextDouble();
        artigo1.setpreco(y);
        artigos.add(artigo1);

        artigo artigo2 = new artigo();
        System.out.println("insira o nome para o artigo");
        x = new Scanner(System.in).nextLine();
        artigo2.setnome(x);
        System.out.println("insira o preço para o artigo ");
        y = new Scanner(System.in).nextDouble();
        artigo2.setpreco(y);
        artigos.add(artigo2);

        artigo artigo3 = new artigo();
        System.out.println("insira o nome para o artigo");
        x = new Scanner(System.in).nextLine();
        artigo3.setnome(x);
        System.out.println("insira o preço para o artigo ");
        y = new Scanner(System.in).nextDouble();
        artigo3.setpreco(y);
        artigos.add(artigo3);
        
        
        
        for (int i = 0; i < artigos.size(); i++) {
            artigo elementAt = artigos.elementAt(i);
            System.out.println(artigos.elementAt(i).getNome() + " " + artigos.elementAt(i).getPreco()+"\n");
        }
        for (int z = 0; z < artigos.size(); z++) {
            artigo elementAt = artigos.elementAt(z);
            soma += artigos.elementAt(z).getPreco();
        }
       System.out.println("o preço total dos produtos é de "+soma + "€ \n");
}

   
}
