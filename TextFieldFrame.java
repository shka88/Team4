import javax.swing.*;
/**
 * 여기에 TextFieldFrame 클래스 설명을 작성하십시오.
 * 
 * @author (2018315031 박성현, 2018210059 송주호, 2018315030 이가영) 
 * @version (20191202)
 */
public class TextFieldFrame extends JFrame
{
    private TextFieldPanel mp;
    public TextFieldFrame(){
        this.setTitle("실습_4");
        this.setSize(250,350);
        
        mp = new TextFieldPanel();
        this.add(mp);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
