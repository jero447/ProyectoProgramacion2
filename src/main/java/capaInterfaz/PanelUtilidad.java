/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capaInterfaz;

import capaLogica.Empleado;
import capaLogica.ManejadorEmpleados;
import com.toedter.calendar.JDateChooser;
import java.awt.Component;
import java.awt.Container;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jeron
 */
public class PanelUtilidad {
    
    public static void activarCampos(Container container, boolean enabled){
       Component[] components = container.getComponents();
       for(Component component:components){
           if(component instanceof JTextField || component instanceof JSpinner || component instanceof JDateChooser || component instanceof JComboBox ||component instanceof JRadioButton){
               component.setEnabled(enabled);
           } else if(component instanceof Container){
               activarCampos((Container)component, enabled);
           }
           
       }
    }
    
    public static void desactivarCampos(Container container){
        activarCampos(container, false);
    }
    
    public static void limpiarCampos(Container container){
       Component[] components = container.getComponents();
        for(Component component:components){
            if(component instanceof JTextField){
                ((JTextField) component).setText("");
            }else if(component instanceof  JSpinner){
                ((JSpinner) component).setValue(0);
            }
            else if (component instanceof Container) {
            limpiarCampos((Container) component);
        }
        }
    }
    
    
    public static void armarCabecera(DefaultTableModel modelo, JTable tabla, String[] columnas){ 
        
        for(String col : columnas){
            modelo.addColumn(col);
        }
        tabla.setModel(modelo);
    }
    
    
      
}
