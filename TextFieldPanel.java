import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
/**
 * 이 메소드는 JPanel을 보유하고 있으며 ActionListener을 실행하는 클레스이다.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class TextFieldPanel extends JPanel implements ActionListener
{
    JTextField mtfName,mtfDept,mtfAddress;
    JLabel mlName, mlDept, mlAddress, mlSchoolYear;
    JComboBox cbSchoolYear;
    JTextArea ta;
    JButton btn1,btn2;
    public TextFieldPanel(){
        mlName = new JLabel("이름");
        this.add(mlName);
        mtfName = new JTextField(" ",17);
        this.add(mtfName);
        
        mlDept = new JLabel("학과");
        this.add(mlDept);
        mtfDept = new JTextField("글로벌소프트웨어",17);
        this.add(mtfDept);
        
        mlAddress = new JLabel("주소");
        this.add(mlAddress);
        mtfAddress = new JTextField("서울시...",17);
        this.add(mtfAddress);
        
        mlSchoolYear = new JLabel("학번");
        this.add(mlSchoolYear);
        
        String [] grade = {"1학년", "2학년", "3학년","4학년"};
        JComboBox<String> cbSchoolYear = new JComboBox<String>(grade);
        this.add(cbSchoolYear);
        
        
        JButton btn1 = new JButton("추가");
        JButton btn2 = new JButton("Clear");
        this.add(btn1);
        this.add(btn2);
        
        ta = new JTextArea(10, 24);
        this.add(ta);
        
        btn1.addActionListener(this);
        
    }
    
    public void actionPerformed(ActionEvent e){
        JButton btn1 = (JButton)e.getSource();
        
        ta.append(mlName.getText() + " : ");
        ta.append(mtfName.getText() + " \n ");
        ta.append(mlDept.getText() + " : ");
        ta.append(mtfDept.getText() + " \n ");
        ta.append(mlSchoolYear.getText() + " : ");
        ta.append(cbSchoolYear.getList() + " \n ");
        ta.append(mlAddress.getText() + " : ");
        ta.append(mtfAddress.getText() + " \n ");
        ta.append("-------------------------- ");
        
        
        JButton btn2 = (JButton)e.getSource();
        mlName.setText("");
        mtfName.setText("");
        mlDept.setText("");
        mtfDept.setText("");
        mlSchoolYear.setText("");
        mlAddress.setText("");
        mtfAddress.setText("");
        
    }
    
    
}
