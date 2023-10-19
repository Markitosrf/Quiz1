/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz1;

import javax.swing.JOptionPane;

/**
 *
 * @author Marco
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int empleados,i=0;
        String lectura;
        double pago,salario,seguro,total=0;
        lectura = JOptionPane.showInputDialog("Ingrese la cantidad de empleados");
        empleados= Integer.parseInt(lectura);
        while (i<empleados) {
            i++;
            lectura = JOptionPane.showInputDialog("Ingrese su salario");
            salario= Double.parseDouble(lectura);
            seguro= (salario*0.0925)+(salario*0.0508);
            total= total+seguro;
            
        }
        System.out.println("La empresa debera pagar el monto de: "+total+" por concepto de SEM y IVM");
    }
    
}
