package curpandrfc;

import java.util.Scanner;

public class Curpandrfc
{
    public static void main(String[] args)
    {
        Personas persona = new Personas();
        Scanner sc = new Scanner(System.in);
        String apep,apem,nom,est,ano,sexo="M";
        int x,de,dia,mes1,mes0=0;
       
        
        System.out.println("Que deceas tener?\n1-.Curp\n2-.Rfc\n0-.Los 2");
        de=sc.nextInt();
        sc.nextLine();
       do
       {
            System.out.println("Ingresa apeido paterno: ");
            apep = sc.nextLine();
            if(apep.length()<2)
                System.out.println("Porfavor se necesita 2 o mas letras de apeido, si no tiene escriba (xx)");
       }while(apep.length()<2);
       
        do
        {
            System.out.println("Ingresa apeido materno: ");
            apem = sc.nextLine();
            if(apem.length()<2)
                System.out.println("Porfavor se necesita 2 o mas letras de apeido, si no tiene escriba (xx)");
        }while(apem.length()<2);
        
        System.out.println("Ingresa nombre: ");
        nom = sc.nextLine();
        
        do
        {
            System.out.println("Ingresa sexo (1 para hombre, 0 para mujer): ");
            x=sc.nextInt();
            sc.nextLine();
            if(x==1)
                sexo="H";
            else
                if(x==0)
                    sexo="M";
                else
                    System.out.println("Porfavor ingrese valores entre 1 y 0");
        }while(x!=1&&x!=0);
        
        do
        {
            System.out.println("Ingresa tu estado:\nAguascalientes (AS)\nBaja California (BC)\nBaja California Sur (BS)\nCampeche (CC)\nChiapas (CS)\nChihuahua (CH)\nCiudad de México (DF)\nCoahuila (CL)\nColima (CM)\nDurango (DG)\nGuanajuato (GT)\nGuerrero (GR)\nHidalgo (HG)\nJalisco (JC)\nMéxico (MC)\nMichoacán (MN)\nMorelos (MS)\nNayarit (NT)\nNuevo León (NL)\nOaxaca (OC)\nPuebla (PL)\nQuerétaro (QO)\nQuintana Roo (QR)\nSan Luis Potosí (SP)\nSinaloa (SL)\nSonora (SR)\nTabasco (TC)\nTamaulipas (TS)\nTlaxcala (TL)\nVeracruz (VZ)\nYucatán (YN)\nZacatecas (ZS)");
            est=sc.nextLine();
            x=est.length();
            if(x!=2)
                System.out.println("Porfavor ingrese las 2 letras de su estado\n");
        }while(x!=2);
        
        do
        {
        System.out.println("Ingresa tu dia: ");
        dia = sc.nextInt();
        if(dia<1||dia>31)
                System.out.println("Porfavor valores entre 1 y 31");
        }while(dia<1||dia>31);
                
        do
        {
        System.out.println("Ingresa tu mes (numerico): ");
        mes1 = sc.nextInt();
        sc.nextLine();
        if(mes1>10)
            mes0=1;
        if(mes1>12||mes1<1)
                System.out.println("Solo numeros del 1 al 12 porfavor");
        }while(mes1>12||mes1<1);
        do
        {
        System.out.println("Ingresa tu año: ");
        ano = sc.nextLine();
        if(ano.length()<=3||ano.length()>=5)
            System.out.println("Porfavor ingrese su año con al menos 1000 años y menos de 10000");
        }while(ano.length()!=4);
        est=est.toUpperCase();
        apep=apep.toUpperCase();
        apem=apem.toUpperCase();
        nom=nom.toUpperCase();
        
        if(de==1)
        persona.gen(apep, apem, nom, dia, mes0, mes1, ano, sexo, est, 1);
        if(de==2)
        persona.gen(apep, apem, nom, dia, mes0, mes1, ano, sexo, est, 2);
        if(de==0)
        persona.gen(apep, apem, nom, dia, mes0, mes1, ano, sexo, est, 0);
    }
}