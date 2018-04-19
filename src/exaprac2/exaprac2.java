package exaprac2;

import javax.swing.JOptionPane;

/**
 *Nombre de la clase:exaprac2
 *Version: 1.0
 *Fecha: 19/04/18
 *CopyRight: Diego Rosa
 *@author Diego Rosa
 */
public class exaprac2 {
    
    public static void main(String[] args) {
        String Nombre[] = new String[100];
        double SPH[] = new double[100];
        int CHT[] = new int[100];
        double res[] = new double[100];
        double sf[]= new double[100];
        double a,b,c;
        int cont2=0;
        int cont3=0;
        int cont4=0;
        double tpd=0;
        int r = 0;
        int cont = 1;
        int aux =0;
        double acum=0.0;
        
    r = Integer.parseInt(JOptionPane.showInputDialog("Biuenvenido al sistema\n1-Registrar Empleados\n2-Listado de empleados registrados\n3-Salir"));
        
        switch(r){
            
            case 1:
                for(int i=0;i<cont; i++){
                Nombre[i]=JOptionPane.showInputDialog("Ingrese nombre del empleado "+i);
                SPH[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el cobro por hora del emplado "+i));
                CHT[i]= Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de horas trabajadas de empleado "+i));
                res[i] = SPH[i]*CHT[i];
                aux = Integer.parseInt(JOptionPane.showInputDialog("¿Desea agregar otro empleado? 1=si 2=no"));
                if(aux==1){
                    cont++;
                }
                else{
                    r = Integer.parseInt(JOptionPane.showInputDialog("Biuenvenido al sistema\n1-Registrar Empleados\n2-Listado de empleados registrados\n3-Salir"));
        
        switch(r){
            
            case 1:
                for(int x=0;x<cont; x++){
                Nombre[x]=JOptionPane.showInputDialog("Ingrese nombre del empleado "+x);
                SPH[x] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el cobro por hora del emplado "+x));
                CHT[x]= Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de horas trabajadas de empleado "+x));
                res[x] = SPH[x]*CHT[x];
                aux = Integer.parseInt(JOptionPane.showInputDialog("¿Desea agregar otro empleado? 1=si 2=no"));
                if(aux==1){
                    cont++;
                }
                else{
                    
                }
                }
                break;
                
            case 2:
                for(int k=0; k<cont; k++){
                if(res[k]>0 && res[k]<350){
                res[k]= res[k]+100;
                sf[k]= res[k]-((res[k]/100)*10);
                cont2++;
                acum=acum+sf[k];
                }
                else if(res[k]>350 && res[k]<700){
                res[k]= res[k]+200;
                sf[k]= res[k]-((res[k]/100)*10);
                cont3++;
                acum=acum+sf[k];
                }
                else if(res[k]>=700){
                res[k]= res[k]+300;
                sf[k]= res[k]-((res[k]/100)*10);
                cont4++;
                acum=acum+sf[k];
                }
                
                }
                tpd= (cont2*100)+(cont3*200)+(cont4*250);
                for(int z=0;z<cont;z++){
                JOptionPane.showMessageDialog(null, "Lista de empleados \n Nombre empleado "+z+" "+Nombre[z]+"\nCobro por hora empleado "+z+" "+SPH[z]+"\n Cantidad horas trabajadas empleado "+z+" "+CHT[z] );
                }
                JOptionPane.showMessageDialog(null, "Total a pagar en bonos : "+tpd+"\nTotal de pagos mas bono menos descuento : "+acum+"\nCantidad de empleados que ganan mas de $700 : "+cont4);
                
                break;
                
            case 3:
                break;
    }
                }
                }
                break;
                
            case 2:
                for(int k=0; k<cont; k++){
                if(res[k]>0 && res[k]<350){
                res[k]= res[k]+100;
                sf[k]= res[k]-((res[k]/100)*10);
                cont2++;
                acum=acum+sf[k];
                }
                else if(res[k]>350 && res[k]<700){
                res[k]= res[k]+200;
                sf[k]= res[k]-((res[k]/100)*10);
                cont3++;
                acum=acum+sf[k];
                }
                else if(res[k]>=700){
                res[k]= res[k]+300;
                sf[k]= res[k]-((res[k]/100)*10);
                cont4++;
                acum=acum+sf[k];
                }
                
                }
                tpd= (cont2*100)+(cont3*200)+(cont4*250);
                for(int z=0;z<cont;z++){
                JOptionPane.showMessageDialog(null, "Lista de empleados \n Nombre empleado "+z+" "+Nombre[z]+"\nCobro por hora empleado "+z+" "+SPH[z]+"\n Cantidad horas trabajadas empleado "+z+" "+CHT[z] );
                }
                JOptionPane.showMessageDialog(null, "Total a pagar en bonos : "+tpd+"\nTotal de pagos mas bono menos descuento : "+acum+"\nCantidad de empleados que ganan mas de $700 : "+cont4);
                
                break;
                
            case 3:
                break;
    }
        
        
    
}
}
