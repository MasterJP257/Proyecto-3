package curpandrfc;

import java.util.Random;

public class Personas
{
    public void gen(String apep, String apem, String nom,int dia, int mes0, int mes1, String ano, String sexo, String est,int de)
    {
        Random rnd = new Random();
        String curp = new String();
        String rfc = new String();
        int c=0,x=-1;

        curp+=apep.charAt(0);
        do
        {
            x++;
            if(apep.charAt(x)=='A'||apep.charAt(x)=='E'||apep.charAt(x)=='I'||apep.charAt(x)=='O'||apep.charAt(x)=='U')
            {
                curp+=apep.charAt(x);
                x=1000;
            }
            if(x==apep.length()-1)
            {
             c=100; //Ya se que se podria pulir pero estube muy atareado con las tareas y esto lo estoy haciendo a la 1 de la mañana jaja.
             x=1000;
            }
        }while(x!=1000);
        if(c==100)
            curp+='X';
        curp+=apem.charAt(0);
        curp+=nom.charAt(0);
        curp+=ano.charAt(2);
        curp+=ano.charAt(3);
        if(mes0==0)
            curp+=mes0;
        curp+=mes1;
        curp+=dia;
        curp+=sexo.charAt(0);
        curp+=est;
        rfc=curp;
        for(x=0;x<2;x++)
        {
            curp+=(char)(Math.random()*(90-65+1)+65);
            rfc+=(char)(Math.random()*(90-65+1)+65);
        }
        rfc+=(char)(Math.random()*(90-65+1)+65);
        /*if(mes0==0)
            System.out.println(apep.charAt(0)+""+apep.charAt(1)+""+apem.charAt(0)+""+nom.charAt(0)+""+ano.charAt(2)+""+ano.charAt(3)+""+mes0+""+mes1+""+dia+""+sexo.charAt(0)+est);
        else
            System.out.println(apep.charAt(0)+""+apep.charAt(1)+""+apem.charAt(0)+""+nom.charAt(0)+""+ano.charAt(2)+""+ano.charAt(3)+""+mes1+""+dia+""+sexo.charAt(0)+est);*/
        if(de==0)
            System.out.println("Tu Curp es: "+curp);
            System.out.println("Tu Rfc es: "+rfc);
        if(de==1)
            System.out.println("Tu Curp es: "+curp);
        if(de==2)
            System.out.println("Tu Rfc es: "+rfc);
    }
}