
package parcial;

import java.util.Scanner;


public class Parcial {

   
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("INGRERSE EL TEXTO: ");
        String cadena=sc.nextLine ();
        int a=0,e=0,i=0,o=0,u=0,vocales =0;
        int b=0,c=0,d=0,f=0,g=0,h=0,j=0,k=0,l=0,m=0,n=0,ñ=o,p=0,q=0,r=0,s=0,t=0,v=0,w=0,x=0,y=0,z=0,consonantes=0;
        int I,J;
        for (I=0;I<cadena.length();I++){
            if (cadena.charAt(I)=='a'||cadena.charAt(I)=='A')
                a++;
            else
               if (cadena.charAt(I)=='e'||cadena.charAt(I)=='E')
                e++;
            else
               if (cadena.charAt(I)=='i'||cadena.charAt(I)=='I')
                i++;
            else
               if (cadena.charAt(I)=='o'||cadena.charAt(I)=='O')
                o++; 
            else
               if (cadena.charAt(I)=='u'||cadena.charAt(I)=='U')
                u++;
            else
                if(cadena.charAt(I)!=' ')
                consonantes++;
        }
        int suma=a+e+i+o+u;
        System.out.println("vocales : "+suma);
        System.out.println("consonantes :"+consonantes);
    }

        
  
}
