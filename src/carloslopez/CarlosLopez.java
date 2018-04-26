/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carloslopez;

import javax.swing.JOptionPane;

/**Nombre de la clase: CarlosLopez
 *version: 1.0 beta
 * fecha 26-04-2018
 * copyright: no
 * @author Carlos Lopez
 */
public class CarlosLopez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i=0;
        int n=1000;
        String opcion="";
        String[] nombres = new String[n];
        int[] horasTrabajadas = new int[n];
        double[] precioHora = new double[n];
        double[] salarioTotal = new double[n];
        int sueldoMayor=0;
        
        double aux=0.0;
        double totalSueldos=0.0;
        String acumulador="Datos de Empleados. \n";
        
        do{
            opcion=JOptionPane.showInputDialog(null, "Que accion desea realizar: \n"
                    + "1) Agregar empleado. \n"
                    + "2) Calcular planilla. \n"
                    + "3) Salir.");
            
           switch(opcion){
               case "1":
                   nombres[i]=JOptionPane.showInputDialog(null, "Ingrese su nombre:");
                   acumulador += "Nombre: "+nombres[i] +" \n";
                   precioHora[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Precio por hora:"));
                   horasTrabajadas[i] =  Integer.parseInt(JOptionPane.showInputDialog(null, "Horas trabajadas:"));
                   salarioTotal[i] = (precioHora[i]*horasTrabajadas[i])-(0.10*(precioHora[i]*horasTrabajadas[i]));
                   totalSueldos += salarioTotal[i];
                   acumulador += "Salario: $"+salarioTotal[i] + " \n\n";
                   if(salarioTotal[i]>aux)
                   {
                       aux=salarioTotal[i];
                       sueldoMayor++;
                   }
                   /*acumulador += "\nSueldo mayor a 800: "+sueldoMayor + " \n";
                   acumulador += "Sueldo mayor de planilla: "+aux+" \n";
                   acumulador += "Total salarios: $"+totalSueldos + "\n";*/
                   i++;
                   break;
               case "2":
                   JOptionPane.showMessageDialog(null, acumulador+
                           "Sueldos mayores a 800: ss"+ sueldoMayor+
                           "\n Sueldo mayor de planilla: $"+aux+
                           "\n Total de planilla: "+totalSueldos);
                   break;
               case "3":
                   opcion="3";
                   break;
               default:
                  JOptionPane.showMessageDialog(null,"Seleccion invalida");
                   break;
           }
        }while(opcion!="3");
    }
    
}
