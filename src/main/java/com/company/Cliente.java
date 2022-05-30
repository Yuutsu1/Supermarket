package com.company;

import java.util.ArrayList;

public class Cliente {

    private String cedula;

    public Cliente(){}

    public Cliente(String cedula){
        this.cedula = cedula;

    }

    public void setCedula(String cedula){
        this.cedula = cedula;
    }

    public String getCedula(){
        return cedula;
    }

    public static int convertStringInt(String entrada, int i){
        return Character.getNumericValue(entrada.charAt(i));
    }

    public static boolean rechazarCedula(String numCedula){
        int nImpares=0;
        int nPares=0;
        int comprobante = 0;
        int parImpar [] = new int[2];
        parImpar = cedulaPorCoeficiente(numCedula);


        return verificar10Num(parImpar[0], parImpar[1], comprobante, numCedula);
    }

    public static  int[] cedulaPorCoeficiente(String cedula){
        int parImpar [] = {0,0};
        for(int i=0;i<=8;i++){
            if((i%2)==0){
                if (convertStringInt(cedula,i)*2>9){
                    parImpar[1]=parImpar[1]+(convertStringInt(cedula,i)*2-9);
                }
                else{
                    parImpar[1]=parImpar[1]+ convertStringInt(cedula,i)*2;
                }
            }
            else{
                parImpar[0]= convertStringInt(cedula,i)+parImpar[0];
            }
        }
        return parImpar;

    }

    public static boolean verificar10Num (int par, int impar, int decimoNum, String cedula){
        if(((par+impar)%10)!=0){
            decimoNum=10-((par+impar)%10);
        }
        else
            decimoNum=0;
        return decimoNum== convertStringInt(cedula,9);

    }

    public Object buscarCliente(ArrayList c ,String cedula) {
        for (int i = 0; i < c.size(); i++){
            Cliente cli = (Cliente) c.get(i);
            if (cli.getCedula().equals(cedula)){
                return cli;
            }
        }
        return null;
    }
}
