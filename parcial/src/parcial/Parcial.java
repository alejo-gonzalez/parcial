
package parcial;

import java.util.Scanner;


public class Parcial {

   
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("INGRERSE EL TEXTO: ");
        String cadena=sc.nextLine ();
        int a=0,e=0,i=0,o=0,u=0,vocales =0;
        int b=0,c=0,d=0,f=0,g=0,h=0,j=0,k=0,l=0,m=0,n=0,ñ=o,p=0,q=0,r=0,s=0,t=0,v=0,w=0,x=0,y=0,z=0;
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
if (cadena.charAt(I)=='b'||cadena.charAt(I)=='B')
            b++;
            else
            if (cadena.charAt(I)=='c'||cadena.charAt(I)=='C')
            c++;
            else
            if (cadena.charAt(I)=='d'||cadena.charAt(I)=='D')
            d++;
            else
            if (cadena.charAt(I)=='f'||cadena.charAt(I)=='F')
            f++;
            else
            if (cadena.charAt(I)=='g'||cadena.charAt(I)=='G')
            g++;
            else
            if (cadena.charAt(I)=='h'||cadena.charAt(I)=='H')
            h++;
            else
            if (cadena.charAt(I)=='j'||cadena.charAt(I)=='J')
            j++;
            else
            if (cadena.charAt(I)=='k'||cadena.charAt(I)=='K')
            k++;
            else
            if (cadena.charAt(I)=='l'||cadena.charAt(I)=='L')
            l++;
            else
            if (cadena.charAt(I)=='m'||cadena.charAt(I)=='M')
            m++;
            else
            if (cadena.charAt(I)=='n'||cadena.charAt(I)=='N')
            n++;
            else
            if (cadena.charAt(I)=='ñ'||cadena.charAt(I)=='Ñ')
            ñ++;
            else
            if (cadena.charAt(I)=='p'||cadena.charAt(I)=='P')
            p++;
            else
            if (cadena.charAt(I)=='q'||cadena.charAt(I)=='Q')
            q++;
            else
            if (cadena.charAt(I)=='r'||cadena.charAt(I)=='R')
            r++;
            else
            if (cadena.charAt(I)=='s'||cadena.charAt(I)=='S')
            s++;
            else
            if (cadena.charAt(I)=='t'||cadena.charAt(I)=='T')
            t++;
            else
            if (cadena.charAt(I)=='v'||cadena.charAt(I)=='V')
            v++;
            else
            if (cadena.charAt(I)=='w'||cadena.charAt(I)=='W')
            w++;
            else
            if (cadena.charAt(I)=='x'||cadena.charAt(I)=='X')
            x++;
            else
            if (cadena.charAt(I)=='y'||cadena.charAt(I)=='Y')
            y++;
            else
            if (cadena.charAt(I)=='z'||cadena.charAt(I)=='Z')
            z++;
1
          
        }
 
        int suma=a+e+i+o+u;
        int consonantes=b+c+f+g+h+j+k+l+m+n+ñ+p+q+r+s+t+v+w+x+y+z;
System.out.println("a : "+a);
        System.out.println("b : "+b);
        System.out.println("c : "+c);
        System.out.println("d : "+d);
        System.out.println("e : "+e);
        System.out.println("f : "+f);
        System.out.println("g : "+g);
        System.out.println("h : "+h);
        System.out.println("i : "+i);
        System.out.println("j : "+j);
        System.out.println("k : "+k);
        System.out.println("l : "+l);
        System.out.println("m : "+m);
        System.out.println("n : "+n);
        System.out.println("ñ : "+ñ);
        System.out.println("o : "+o);
        System.out.println("p : "+p);
        System.out.println("q : "+q);
        System.out.println("r : "+r);
        System.out.println("s : "+s);
        System.out.println("t : "+t);
        System.out.println("u : "+u);
        System.out.println("v : "+v);
        System.out.println("w : "+w);
        System.out.println("x : "+x);
        System.out.println("y : "+y);
        System.out.println("z : "+z);
        System.out.println("vocales : "+suma);
        System.out.println("consonantes :"+consonantes);
    }

        
  
}
