import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
/**
 * 여기에 TextFieldPanel 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class TextFieldPanel extends JPanel
{
    JTextField mtfName,mtfDept,mtfAddress;
    JLabel mlName, mlDept, mlAddress;
    JComboBox mlSchoolYear;
    public TextFieldPanel(){
        mlName = new JLabel("이름");
        this.add(mlName);
        mtfName = new JTextField(" ",20);
        this.add(mtfName);
        
        mlDept = new JLabel("학과");
        this.add(mlDept);
        mtfDept = new JTextField("글로벌소프트웨어",20);
        this.add(mtfDept);
        
        mlAddress = new JLabel("주소");
        this.add(mlAddress);
        mtfAddress = new JTextField("서울시...",20);
        this.add(mtfAddress);
        
        // mlSchoolYear = new JComboBox();
        // this.add(mlSchoolYear);
    }
}
