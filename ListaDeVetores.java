package Números;
import java.util.Scanner;

public class ListaDeVetores 
{
    int num[]=new int[15];

    public static void main(String[] args)
    {
        ListaDeVetores x=new ListaDeVetores();
        int i;
        int cont = 1;
        int z = 1;
        Scanner ler= new Scanner (System.in);
        
        for (i=0; i<15; i=i+1)
        {
            System.out.printf("Digite o %d/15 número: ",cont);
            x.num[i] = ler.nextInt();
            cont=cont+1;
        }
        
        System.out.printf("\n\n");
        
        for(i=0; i<15; i++)
        {
            System.out.printf("%d",z); System.out.println(" ºelemento: "+x.num[i]);
            z=z+1;
        }
        
    }
    
}
