import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;
import java.nio.file.WatchEvent;

public class AWTCounter extends Frame {
    private Label lblCount;
    private TextField tfCount;
    private Button btnCount;
    private int count=0;
    public AWTCounter(){
        setLayout(new FlowLayout());
          //"super" Frame, which is a container, sets its layout to FlowLayout to arrange
          //the components from left-to-right, and flow to next row from top-to-bottom.

        lblCount=new Label("Counter");
        add(lblCount);

        tfCount=new TextField(count + "",10);
        tfCount.setEditable(false);//sets to read only
        add(tfCount);

        btnCount=new Button("Count");
        add(btnCount);

        BtnCountListener listener = new BtnCountListener();
        btnCount.addActionListener(listener);

        //addWindowListener(new MyWindowListener);
        //"btnCount" is the source object that fires an ActionEvent when clicked.
        //The source object adds an instance of BtnCountListener as an ActionEvent listener.
        //Clicking "count" button calls back actionPerformed().

        setTitle("AWT Counter");
        setSize(300,100);

        // For inspecting the Container/components object
        //System.out.println(this);
        //System.out.println(lblCount);
        //System.out.println(tfCount);
        //System.out.println(btnCount);

        setVisible(true);
        //System.out.println(this);
        // System.out.println(lblCount);
        // System.out.println(tfCount);
        // System.out.println(btnCount);


    }
    private class BtnCountListener implements ActionListener{
        //ActionEvent handler - called back upon button-click.
        @Override
        public void actionPerformed(ActionEvent even){
            ++count;//increase count value
            //Display count value on the TextField tfCount
            tfCount.setText(count + "");//Convert int to String
        }
    }
//    private class MyWindowListener implements WindowListener{
//        @Override
//        public void windowClosing(WatchEvent e){
//            System.exit(0);
//        }
//    }

    public static void main(String[] args) {
        AWTCounter myApp = new AWTCounter();
    }
}
