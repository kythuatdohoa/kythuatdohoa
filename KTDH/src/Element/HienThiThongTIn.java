
package Element;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import Element.NhapToaDo3D;
import java.awt.Dimension;
/**
 *
 * @author NHOM8
 */
public class HienThiThongTIn extends JFrame {
    public HienThiThongTIn() {
        this.setBounds(600, 200, 300, 415);
	this.setVisible(true);
        this.setResizable(false);		
	this.setFocusable(true);
        this.setAlwaysOnTop(true);
   
        JPanel contentPane = new JPanel();
        this.setContentPane(contentPane);
        this.setTitle("Hiển Thị Thông Tin");
        //////
        JLabel lbl1 = new JLabel("ĐIỂM GỐC : ");
        JTextField txt1 = new JTextField("(   "+NhapToaDo3D.X+" ,"+NhapToaDo3D.Y+" ,"+NhapToaDo3D.Z+"   )");
        
        JLabel lbl2 = new JLabel("ĐIỂM THỨ 2 : ");
        JTextField txt2 = new JTextField("(   "+(NhapToaDo3D.X+NhapToaDo3D.L)+" ,"+NhapToaDo3D.Y+" ,"+NhapToaDo3D.Z+"   )");
        
        JLabel lbl3 = new JLabel("ĐIỂM THỨ 3 : ");
        JTextField txt3 = new JTextField("(   "+(NhapToaDo3D.X+NhapToaDo3D.L)+" ,"+NhapToaDo3D.Y+" ,"+(NhapToaDo3D.Z+NhapToaDo3D.W)+"   )");
        
        JLabel lbl4 = new JLabel("ĐIỂM THỨ 4 : ");
        JTextField txt4 = new JTextField("(   "+NhapToaDo3D.X+" ,"+NhapToaDo3D.Y+" ,"+(NhapToaDo3D.Z+NhapToaDo3D.W)+"   )");
        
        JLabel lbl5 = new JLabel("ĐIỂM THỨ 5 : ");
        JTextField txt5 = new JTextField("(   "+NhapToaDo3D.X+" ,"+(NhapToaDo3D.Y+NhapToaDo3D.H)+" ,"+NhapToaDo3D.Z+"   )");
        
        JLabel lbl6 = new JLabel("ĐIỂM THỨ 6 : ");
        JTextField txt6 = new JTextField("(   "+(NhapToaDo3D.X+NhapToaDo3D.L)+" ,"+(NhapToaDo3D.Y+NhapToaDo3D.H)+" ,"+NhapToaDo3D.Z+"   )");
        
        JLabel lbl7 = new JLabel("ĐIỂM THỨ 7 : ");
        JTextField txt7 = new JTextField("(   "+(NhapToaDo3D.X+NhapToaDo3D.L)+" ,"+(NhapToaDo3D.Y+NhapToaDo3D.H)+" ,"+(NhapToaDo3D.Z+NhapToaDo3D.W)+"   )");
        
        JLabel lbl8 = new JLabel("ĐIỂM THỨ 8 : ");
        JTextField txt8 = new JTextField("(   "+NhapToaDo3D.X+" ,"+(NhapToaDo3D.Y+NhapToaDo3D.H)+" ,"+(NhapToaDo3D.Z+NhapToaDo3D.W)+"   )");
        
        JLabel lblL = new JLabel("CHIỀU DÀI : ");
        JTextField txtL = new JTextField(": "+NhapToaDo3D.L);
        
        JLabel lblW = new JLabel("CHIỀU RỘNG : ");
        JTextField txtW = new JTextField(": "+NhapToaDo3D.W);
        
        JLabel lblH = new JLabel("CHIỀU CAO : ");
        JTextField txtH = new JTextField(": "+NhapToaDo3D.H);
        
        ////////
        //DIEM1
        contentPane.add(lbl1).setPreferredSize(new Dimension(100, 30));
        contentPane.add(txt1).setPreferredSize(new Dimension(120, 30));
        //DIEM2
        contentPane.add(lbl2).setPreferredSize(new Dimension(100, 30));
        contentPane.add(txt2).setPreferredSize(new Dimension(120, 30));
        //DIEM3
        contentPane.add(lbl3).setPreferredSize(new Dimension(100, 30));
        contentPane.add(txt3).setPreferredSize(new Dimension(120, 30));
        //DIEM4
        contentPane.add(lbl4).setPreferredSize(new Dimension(100, 30));
        contentPane.add(txt4).setPreferredSize(new Dimension(120, 30));
        //DIEM5
        contentPane.add(lbl5).setPreferredSize(new Dimension(100, 30));
        contentPane.add(txt5).setPreferredSize(new Dimension(120, 30));
        //DIEM6
        contentPane.add(lbl6).setPreferredSize(new Dimension(100, 30));
        contentPane.add(txt6).setPreferredSize(new Dimension(120, 30));
        //DIEM7
        contentPane.add(lbl7).setPreferredSize(new Dimension(100, 30));
        contentPane.add(txt7).setPreferredSize(new Dimension(120, 30));
        //DIEM8
        contentPane.add(lbl8).setPreferredSize(new Dimension(100, 30));
        contentPane.add(txt8).setPreferredSize(new Dimension(120, 30));
        //L
        contentPane.add(lblL).setPreferredSize(new Dimension(100, 30));
        contentPane.add(txtL).setPreferredSize(new Dimension(120, 30));
        //W
        contentPane.add(lblW).setPreferredSize(new Dimension(100, 30));
        contentPane.add(txtW).setPreferredSize(new Dimension(120, 30));
        //H
        contentPane.add(lblH).setPreferredSize(new Dimension(100, 30));
        contentPane.add(txtH).setPreferredSize(new Dimension(120, 30));
    }
}
