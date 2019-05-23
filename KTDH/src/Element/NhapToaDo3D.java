
package Element;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import ktdh.Hinh3D;

/**
 *
 * @author NHOM8
 */
public class NhapToaDo3D extends JFrame {
    private JPanel contentPane;
    private JTextField txtL, txtW, txtH, txtX, txtY, txtZ;
    public static int X, Y, Z, T, L, W, H;
    public JButton btnDraw;

    public  NhapToaDo3D(Color choosecolor) {
        this.setBounds(600, 200, 300, 290);
	this.setVisible(true);
        this.setResizable(false);		
	this.setFocusable(true);
        this.setAlwaysOnTop(true);
   
        contentPane = new JPanel();
        this.setContentPane(contentPane);
        btnDraw = new JButton("XONG !");
        
        JLabel lblX = new JLabel("Nhập toạ độ X : ");
        txtX = new JTextField();
        
        txtX.addKeyListener(new KeyAdapter() {
//            public void keyTyped(KeyEvent e) {
//                if (!Character.isDigit(e.getKeyChar()) || txtX.getText().length() >= 3)
//                    e.consume();
//                }
            
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode()==KeyEvent.VK_ENTER){
                    if(txtX.getText().length() == 0){
                        txtX.requestFocus();
                    }
                    else if(txtY.getText().length() == 0){
                            txtY.requestFocus();
                    }
                    else if(txtZ.getText().length() == 0){
                            txtZ.requestFocus();
                    }
                    else if(txtL.getText().length() == 0){
                        txtL.requestFocus();
                    }
                    else if(txtH.getText().length() == 0){
                            txtH.requestFocus();
                    }
//                    else if(txtW.getText().length() == 0){
//                            txtW.requestFocus();
//                    }
                }                     
            }
        });
        //=====txt Y=====//
        JLabel lblY = new JLabel("Nhập toạ độ Y : ");
        txtY = new JTextField();
        
        txtY.addKeyListener(new KeyAdapter() {
//            public void keyTyped(KeyEvent e) {
//                if (!Character.isDigit(e.getKeyChar()) || txtY.getText().length() >= 3)
//                    e.consume();
//                }
            
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode()==KeyEvent.VK_ENTER){
                    if(txtX.getText().length() == 0){
                        txtX.requestFocus();
                    }
                    else if(txtY.getText().length() == 0){
                            txtY.requestFocus();
                    }
                    else if(txtZ.getText().length() == 0){
                            txtZ.requestFocus();
                    }
                    else if(txtL.getText().length() == 0){
                        txtL.requestFocus();
                    }
                    else if(txtH.getText().length() == 0){
                            txtH.requestFocus();
                    }
//                    else if(txtW.getText().length() == 0){
//                            txtW.requestFocus();
//                    }
                }                     
            }
        });
        //=====txt Y=====//
        JLabel lblZ = new JLabel("Nhập toạ độ Z : ");
        txtZ = new JTextField();
        
        txtZ.addKeyListener(new KeyAdapter() {
//            public void keyTyped(KeyEvent e) {
//                if (!Character.isDigit(e.getKeyChar()) || txtZ.getText().length() >= 3)
//                    e.consume();
//                }
            
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode()==KeyEvent.VK_ENTER){
                    if(txtX.getText().length() == 0){
                        txtX.requestFocus();
                    }
                    else if(txtY.getText().length() == 0){
                            txtY.requestFocus();
                    }
                    else if(txtZ.getText().length() == 0){
                            txtZ.requestFocus();
                    }
                    else if(txtL.getText().length() == 0){
                        txtL.requestFocus();
                    }
                    else if(txtH.getText().length() == 0){
                            txtH.requestFocus();
                    }
//                    else if(txtW.getText().length() == 0){
//                            txtW.requestFocus();
//                    }
                }                     
            }
        });
        //=====txtL=====//
        JLabel lblL = new JLabel("Chiều dài/ Bán kính  : ");
        txtL = new JTextField();
        
        txtL.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (!Character.isDigit(e.getKeyChar()) || txtL.getText().length() >= 3)
                    e.consume();
                }
            
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode()==KeyEvent.VK_ENTER){
                    if(txtX.getText().length() == 0){
                        txtX.requestFocus();
                    }
                    else if(txtY.getText().length() == 0){
                            txtY.requestFocus();
                    }
                    else if(txtZ.getText().length() == 0){
                            txtZ.requestFocus();
                    }       
                    else if(txtL.getText().length() == 0){
                        txtL.requestFocus();
                    }
//                    else if(txtW.getText().length() == 0){
//                            txtW.requestFocus();
//                    }
                    else if(txtH.getText().length() == 0){
                            txtH.requestFocus();
                    } 
                }                     
            }
        });
        
        //=====txtW=====//
        JLabel lblW = new JLabel("Chiều rộng (đ/v hình hộp)   : ");
        txtW = new JTextField();
        
        txtW.addKeyListener(new KeyAdapter() {

            public void keyTyped(KeyEvent e) {
                if (!Character.isDigit(e.getKeyChar()) || txtW.getText().length() >= 3)
                    e.consume();
                }
 
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode()==KeyEvent.VK_ENTER){
                    if(txtX.getText().length() == 0){
                        txtX.requestFocus();
                    }
                    else if(txtY.getText().length() == 0){
                            txtY.requestFocus();
                    }
                    else if(txtZ.getText().length() == 0){
                            txtZ.requestFocus();
                    }       
                    else if(txtL.getText().length() == 0){
                        txtL.requestFocus();
                    }
//                    else if(txtW.getText().length() == 0){
//                            txtW.requestFocus();
//                    }
                    else if(txtH.getText().length() == 0){
                            txtH.requestFocus();
                    } 
                }                     
            }
        });
        
        //=====txtH=====//
        JLabel lblH = new JLabel("Chiều cao H   : ");
        txtH = new JTextField();
        
        txtH.addKeyListener(new KeyAdapter() {
  
            public void keyTyped(KeyEvent e) {
                if (!Character.isDigit(e.getKeyChar()) || txtH.getText().length() >= 3)
                    e.consume();
                }

            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode()==KeyEvent.VK_ENTER){
                    if(txtX.getText().length() == 0){
                        txtX.requestFocus();
                    }
                    else if(txtY.getText().length() == 0){
                            txtY.requestFocus();
                    }
                    else if(txtZ.getText().length() == 0){
                            txtZ.requestFocus();
                    }       
                    else if(txtL.getText().length() == 0){
                        txtL.requestFocus();
                    }
//                    else if(txtW.getText().length() == 0){
//                            txtW.requestFocus();
//                    }
                    else if(txtH.getText().length() == 0){
                            txtH.requestFocus();
                    }
                    
                }                     
            }
        });
        
        //====thêm các chức năng vào Panel======//
        contentPane.add(lblX).setPreferredSize(new Dimension(150, 30));
        contentPane.add(txtX).setPreferredSize(new Dimension(70, 30));
        
        contentPane.add(lblY).setPreferredSize(new Dimension(150, 30));
        contentPane.add(txtY).setPreferredSize(new Dimension(70, 30));
        
        contentPane.add(lblZ).setPreferredSize(new Dimension(150, 30));
        contentPane.add(txtZ).setPreferredSize(new Dimension(70, 30));
        
        contentPane.add(lblL).setPreferredSize(new Dimension(150, 30));
        contentPane.add(txtL).setPreferredSize(new Dimension(70, 30));
        
        contentPane.add(lblW).setPreferredSize(new Dimension(150, 30));
        contentPane.add(txtW).setPreferredSize(new Dimension(70, 30));
        
        contentPane.add(lblH).setPreferredSize(new Dimension(150, 30));
        contentPane.add(txtH).setPreferredSize(new Dimension(70, 30));
        
        contentPane.add(btnDraw).setPreferredSize(new Dimension(100, 30));  
        
        //====BUTTON===//
        btnDraw.addActionListener(new ActionListener() {

	    public void actionPerformed(ActionEvent arg0) {
		if(txtX.getText().length() == 0){
                    txtX.requestFocus();
                }
                else if(txtY.getText().length() == 0){
                    txtY.requestFocus();
                }
                else if(txtZ.getText().length() == 0){
                    txtZ.requestFocus();
                }       
                else if(txtL.getText().length() == 0){
                    txtL.requestFocus();
                }
//                else if(txtW.getText().length() == 0){
//                    txtW.requestFocus();
//                }
                else if(txtH.getText().length() == 0){
                    txtH.requestFocus();
                }
                else{
                    X =  Integer.parseInt(txtX.getText());
                    Y = Integer.parseInt(txtY.getText());
                    Z = Integer.parseInt(txtZ.getText());
                    L = Integer.parseInt(txtL.getText());
                    if(txtW.getText().length() == 0){
                        W=0;
                    }else{
                         W = Integer.parseInt(txtW.getText());
                    }
                   
                    H = Integer.parseInt(txtH.getText());  
                    new DrawCube(choosecolor, X, Y, Z, L, W, H);
                    new DrawPyramid(choosecolor, X, Y, Z, L, W, H);
                    new DrawCylinder(choosecolor, X, Y, Z, L, W, H);
                    dispose();
                }
            }                               
	});
        this.validate();
    }

}
