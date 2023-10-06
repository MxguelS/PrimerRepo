/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programabasic;

import javax.swing.JOptionPane;

/**
 *
 * @author an976
 */
public class ProgramaBasic {

    public static void main(String[] args) {
 
        
        String nombre = "";
        boolean nombreValido = false;
        
    
        while (!nombreValido) {
            
            nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
            
            // Validar el nombre utilizando una expresión regular
            if (nombre.matches("^[a-zA-Z\\s]+$")) {
                nombreValido = true;
                
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un nombre válido sin números ni caracteres especiales.");
            }
        }
        
        int suma = 0;
        
         for (int i = 1 ; i <= 3 ; i++) {
             
             boolean entradaValida = false;
             
             while (!entradaValida) {
                 
                 try {
                     
                     String entrada = JOptionPane.showInputDialog("Ingrese tres numero" +i+":");
                     int numero= Integer.parseInt(entrada);
                     
                     if (numero >=0 && numero==(int)numero) {
                         suma+=numero;
                         entradaValida=true;        
                     } else{
                         
                         JOptionPane.showMessageDialog(null,"porfavor ingresa solo numeros enteros");
                     
                     }
                     
                     
                 } catch (NumberFormatException e) {
                     JOptionPane.showMessageDialog(null,"ingrese numeros validos" );
                 }
                 
             }
             
            
        }
         
         JOptionPane.showMessageDialog(null, "Hola que tal, "+nombre+ "\nSuma de los números es: " + suma);
    

    }
    
}

    


    

