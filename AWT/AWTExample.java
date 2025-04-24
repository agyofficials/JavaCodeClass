import java.awt.*;
public class AWTExample extends Frame{
    AWTExample(){
        // Frame f = new Frame();
        //Line 1
        Label fn = new Label("First Name:");
        Label ln = new Label("Last Name : ");

        // Line 2
        Label email = new Label("Email : ");
        Label phone = new Label("Phone : ");

        TextField fne = new TextField();
        TextField lne = new TextField();

        //Text Feild Line 2
        TextField emailip = new TextField();
        TextField phoneip = new TextField();

        
        Button b = new Button("Submit");

        fn.setBounds(100,100,80,30);
        fne.setBounds(200,100,80,30);
        ln.setBounds(300,100,80,30);
        lne.setBounds(400,100,80,30);
        
        email.setBounds(100,150,80,30);
        emailip.setBounds(200,150,80,30);
        phone.setBounds(300,150,80,30);
        phoneip.setBounds(400,150,80,30);
        
        b.setBounds(400,200,80,30);

        add(fn);
        add(ln);
        add(fne);
        add(lne);
        add(b);

        add(email);
        add(emailip);
        add(phone);
        add(phoneip);

        setSize(1280,500); //Size of the frame 

        setTitle("Form"); //title of the Frame and Window

        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        AWTExample fst = new AWTExample();
    }
}