
package javaapp2e;

import java.util.Scanner;

public class JavaApp2E {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Products[] pr = new Products[100];
        
        System.out.print("Enter no. of Products: ");
        int np = sc.nextInt();
        
        for(int i=0; i < np; i++){
            System.out.println("Enter details of product "+(i+1));
            System.out.print("ID: ");
            int id = sc.nextInt();
            System.out.print("Name:  ");
            String name = sc.next();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            System.out.print("Stocks: ");
            int stocks = sc.nextInt();
            System.out.print("Sold: ");
            int sold = sc.nextInt();
            
            pr[i] = new Products();
            pr[i].addProducts(id, name, price, stocks, sold);
        }
        double tpg = 0;
        for(int i=0; i < np; i++){
            tpg = tpg + (pr[i].price * pr[i].sold);
            pr[i].viewProducts();
        }
        
        System.out.println("Total Profits Gained: "+ tpg);
    }
}
