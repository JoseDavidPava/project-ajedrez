
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author JOSE PAVA
 */

public class TableroAjedrez extends JDialog {

    public TableroAjedrez() {
        Confventana();
        ConfComponente();
    }
    
  private void Confventana(){
    this.setTitle("Tablero Ajedrez");
    this.setSize(500, 500);
    this.setResizable(false);
    this.setLocationRelativeTo(null);
    this.setLayout(null);
    GridLayout gl = new GridLayout(8,8);
    this.setLayout(gl);
    }   

 private void ConfComponente(){
    
    for(int i=0; i<=71; i++){
        JButton button = new JButton(""+i);
        if(i%2==0){
            button.setBackground(Color.black);
            button.setActionCommand("Black");            
        }else{
            button.setBackground(Color.white);
            button.setActionCommand("White"); 
        } 
        Escuchador escuchador = new Escuchador();
        button.addActionListener(escuchador);
        this.add(button);
    }

 }  
 public static void main (String[] args){
    TableroAjedrez tablero = new TableroAjedrez();
    tablero.setVisible(true);
 }   
 
    private class Escuchador implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String actionCommad = e.getActionCommand();
            JButton boton = (JButton) e.getSource();
            switch(actionCommad){
                case "Black":
                    JOptionPane.showMessageDialog(null,"El Boton es Negro y su posicion es "+boton.getText()+"");
                    break;
                case "White":
                    JOptionPane.showMessageDialog(null,"El Boton es Blanco y su posicion es "+boton.getText()+"");
                    break;
                default: 
                    JOptionPane.showMessageDialog(null,"El Boton es desconocido.");
                
            }
            
        }
 
    }
}
