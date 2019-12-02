import javax.swing.*;
/**
 * 이 메소드는 JFrame을 가지고 잇는 클레스 이다.
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
