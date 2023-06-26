package hostel_registration;                                                    //package name
import java.awt.*;                                                              //import all in java.awt library
import java.awt.event.*;                                                        //import all in java.awt.event library
import javax.swing.*;                                                           //import all in javax.swing library

public class Hostel_Registration {                                              //class name
    Frame f;                                                                    //Frame object
    MenuBar m;                                                                  //MenuBar object
    Menu menu,menu2;                                                            //Menu object
    MenuItem mi1,mi2,mi3,mi4,mi5,mi6;                                           //MenuItem object
    Label lb1,lb2,lb3,lb4,lb5,lb6,lb7,lb8;                                      //Label object
    TextField txt1,txt2;                                                        //TextField object
    TextArea txa1,txa2;                                                         //TextArea object
    Checkbox cb1,cb2,cb3,cb4,select;                                            //Checkbox object
    CheckboxGroup cbg;                                                          //CheckboxGroup object
    Choice co;                                                                  //Choice object
    Button btn1,btn2;                                                           //Button object
    Panel p;                                                                    //Panel object
    String name,id,add,gend,block,from,output,country_origin[] = {"--Select--", //String variable
        "Johor","Kedah","Kelantan","Melaka","Negeri Sembilan","Pahang",
        "Pulau Pinang","Perak","Perlis","Sabah",
        "Sarawak","Selangor","Terengganu"};
    int user=0;                                                                 //int variable
    Color color = new Color(227, 222, 222);
        
    
    Hostel_Registration(){                                                      //method
        f = new Frame();                                                        //new object for frame
        f.setSize(830,600);                                                     //set frame size
        f.setVisible(true);                                                     //Set frame visible to user 
        f.setLayout(null);                                                      //Set frame Layout to null
        
        m = new MenuBar();                                                      //new object for MenuBar
        f.setMenuBar(m);                                                        //set MenuBar on f
        
        menu = new Menu("File");                                                //new object for Menu
        m.add(menu);                                                            //add menu in m
        
        mi1 = new MenuItem("New File");                                         //new object for MenuItem
        menu.add(mi1);                                                          //add mi1 in menu
        
        mi2 = new MenuItem("Load File");                                        //new object for MenuItem
        menu.add(mi2);                                                          //add mi2 in menu
        
        mi3 = new MenuItem("Save");                                             //new object for MenuItem
        menu.add(mi3);                                                          //add mi3 in menu
        
        mi4 = new MenuItem("Save as");                                          //new object for MenuItem
        menu.add(mi4);                                                          //add mi4 in menu
        
        menu2 = new Menu("Application");                                        //new object for Menu
        menu.add(menu2);                                                        //add menu2 in m
        
        mi5 = new MenuItem("Hide");                                             //new object for MenuItem
        menu2.add(mi5);                                                         //add mi5 in menu2
        
        mi6 = new MenuItem("Exit");                                             //new object for MenuItem
        menu2.add(mi6);                                                         //add mi6 in menu2
        
        lb1 = new Label("Hostel Registration");                                 //new object for Label
        lb1.setBounds(30,40,200,50);                                            //set position and size
        lb1.setFont(new Font("Arial", Font.BOLD,20));                           //set Font style
        f.add(lb1);                                                             //add lb1 to f
        
        lb2 = new Label("Name");                                                //new object for Label
        lb2.setBounds(30,120,70,30);                                            //set position and size
        f.add(lb2);                                                             //add lb2 to f
        
        txt1 = new TextField();                                                 //new object for TextField
        txt1.setBounds(110,124,220,20);                                         //set position and size
        f.add(txt1);                                                            //add txt1 to f
        
        lb3 = new Label("Name only can be inserted Alphabetic ONLY");           //new object for Label
        lb3.setBounds(110,150,210,20);                                          //set position and size
        lb3.setFont(new Font("Arial",Font.ITALIC,10));                          //set Font style
        lb3.setForeground(Color.red);                                           //set font color
        lb3.setVisible(false);                                                  //hide the lb3
        f.add(lb3);                                                             //add lb3 to f
        
        lb4 = new Label("ID Matric");                                           //new object for Label
        lb4.setBounds(30,180,70,30);                                            //set position and size
        f.add(lb4);                                                             //add lb4 to f
        
        txt2 = new TextField();                                                 //new object for TextField
        txt2.setBounds(110,183,220,20);                                         //set position and size
        f.add(txt2);                                                            //add txt2 to f
        
        lb5 = new Label("What is ID Matric");                                   //new object for Label
        lb5.setBounds(110,204,210,20);                                          //set position and size
        lb5.setFont(new Font("Arial",Font.BOLD,10));                            //set Font style
        lb5.setForeground(Color.blue);                                          //set font color
        f.add(lb5);                                                             //add lb5 to f
        
        lb6 = new Label("Address");                                             //new object for Label
        lb6.setBounds(30,240,70,30);                                            //set position and size
        f.add(lb6);                                                             //add lb6 to f
        
        txa1 = new TextArea();                                                  //new object for TextArea
        txa1.setBounds(110,235,220,100);                                        //set position and size
        f.add(txa1);                                                            //add txa1 to f
        
        lb7 = new Label("Gender");                                              //new object for Label
        lb7.setBounds(30,350,70,30);                                            //set position and size
        f.add(lb7);                                                             //add lb7 to f
        
        cbg = new CheckboxGroup();                                              //new object for CheckboxGroup
        
        cb1 = new Checkbox("Male",cbg,false);                                   //new object for Checkbox
        cb1.setBounds(110,350,70,30);                                           //set position and size
        f.add(cb1);                                                             //add cb1 to f
        
        cb2 = new Checkbox("Female",cbg,false);                                 //new object for Checkbox
        cb2.setBounds(180,350,70,30);                                           //set position and size
        f.add(cb2);                                                             //add cb2 to f
        
        lb8 = new Label("Hostel Block");                                        //new object for Label
        lb8.setBounds(30,380,70,30);                                            //set position and size
        f.add(lb8);                                                             //add lb8 to f
        
        cb3 = new Checkbox("Gemilang",false);                                   //new object for Checkbox
        cb3.setBounds(32,405,70,30);                                            //set position and size
        cb3.setEnabled(false);                                                  //set disable to edit
        f.add(cb3);                                                             //add cb3 to f
        
        cb4 = new Checkbox("Madani",false);                                     //new object for Checkbox
        cb4.setBounds(110,405,70,30);                                           //set position and size
        cb4.setEnabled(false);                                                  //set disable to edit
        f.add(cb4);                                                             //add cb4 to f
        
        lb8 = new Label("Country of origin");                                   //new object for Label
        lb8.setBounds(30,435,100,30);                                           //set position and size
        f.add(lb8);                                                             //add lb8 to f
        
        co = new Choice();                                                      //new object for Choice
        co.setBounds(130,438,200,20);                                           //set position and size
        f.add(co);                                                              //add co to f
        
        for(int i=0; i<country_origin.length;i++){                              //for loop to count country_origin.length
            co.add(country_origin[i]);                                          //add country_origin to co
        }
        
        btn1 = new Button("Clear");                                             //new object for Button
        btn1.setBounds(120,480,70,30);                                          //set position and size
        btn1.setBackground(color);                                              //set the background color
        f.add(btn1);                                                            //add btn1 to f
        
        btn2 = new Button("Submit");                                            //new object for Button
        btn2.setBounds(230,480,70,30);                                          //set position and size
        btn2.setBackground(color);                                              //set the background color
        f.add(btn2);                                                            //add btn2 to f
        
        p = new Panel();                                                        //new object for Panel
        p.setBounds(400,120,400,400);                                           //set position and size
        p.setLayout(null);                                                      //Set panel Layout to null
        p.setBackground(Color.GRAY);                                            //set the background color
        f.add(p);                                                               //add p to f
        
        txa2 = new TextArea();                                                  //new object for TextArea
        txa2.setBounds(5,5,390,390);                                            //set position and size
        txa2.setEnabled(false);                                                 //set disable to edit
        p.add(txa2);                                                            //add txa2 to p
        
        txt1.addKeyListener(new KeyAdapter(){                                   //add KeyListener TO txt1
            public void keyTyped(KeyEvent j)                                    //use Key typed
            {
                char va = j.getKeyChar();                                       //char variable to get KeyChar
                if(!Character.isAlphabetic(va))                                 //if not an Alphabetic , do
                {
                    if(va !='\b' && va !=' ' && va !='\n' && va !='\r' )        //if nor \b , '' , \n , \r  
                   {
                        j.consume();                                            //Method call consumes input data
                        lb3.setVisible(true);                                   //show lb3
                    }
                }
                else                                                            //if not above , do
                {
                    lb3.setVisible(false);                                      //Hide lb3
                }
            }
        });
        
        lb5.addMouseListener(new MouseListener(){                               //add MouseListener to lb5
            @Override
            public void mouseEntered(MouseEvent e) {                            //use mouseEntered
                lb5.setText("Matric ID was your identity number from "          //set text to lb5
                        + "\nyour campus, your matric ID should start "
                        + "\nwith 10DDTXXXXXX");
            }

            @Override
            public void mouseExited(MouseEvent e) {                             //use mouseExited
                lb5.setText("What is ID Matric");                               //set text to lb5
            }

            @Override
            public void mouseClicked(MouseEvent e) {                            //mouseClicked
            }

            @Override
            public void mousePressed(MouseEvent e) {                            //mousePressed
            }

            @Override
            public void mouseReleased(MouseEvent e) {                           //mouseReleased
            }
        });
        
        cb1.addItemListener(new ItemListener() {                                //add ItemListenet to cb1
            @Override
            public void itemStateChanged(ItemEvent e) {                         //use itemStateChanged
                if (cb1.getState() && e.getItemSelectable() == cb1) {           //if cb1 chacked , do
                    cb3.setState(true);                                         //set cb3 chacked
                    cb4.setState(false);                                        //set cb4 dischaked
                    block=cb3.getLabel();                                       //set block to label in cb3
                }
            }
        });

        cb2.addItemListener(new ItemListener() {                                //add ItemListenet to cb2
            @Override
            public void itemStateChanged(ItemEvent e) {                         //use itemStateChanged
                if (cb2.getState() && e.getItemSelectable() == cb2) {           //if cb2 chacked , do
                    cb4.setState(true);                                         //set cb4 chacked
                    cb3.setState(false);                                        //set cb3 dischaked
                    block=cb4.getLabel();                                       //set block to label in cb4
                }
            }
        });
        
        mi6.addActionListener(new ActionListener(){                             //add ActionListener to mi6
            @Override
            public void actionPerformed(ActionEvent e) {                        //use actionPerformed() method
               f.dispose();                                                     //close f
            }
        });
        
        btn1.addActionListener(new ActionListener(){                             //add ActionListener to btn1
            @Override
            public void actionPerformed(ActionEvent e) {                        //use actionPerformed() method
                txt1.setText("");                                               //set text to txt1
                txt2.setText("");                                               //set text to txt2
                txa1.setText("");                                               //set text to txa1
                txa2.setText("");                                               //set text to txa2
                cbg.setSelectedCheckbox(null);                                  //set selected Checkbox om cbg to null
                cb3.setState(false);                                            //set cb3 dischaked
                cb4.setState(false);                                            //set cb4 dischaked
                co.select(0);                                                   //select choice 0
            }
        });
        
        mi1.addActionListener(new ActionListener(){                             //add ActionListener to mi1
            @Override
            public void actionPerformed(ActionEvent e) {                        //use actionPerformed() method
                txt1.setText("");                                               //set text to txt1
                txt2.setText("");                                               //set text to txt2
                txa1.setText("");                                               //set text to txa1
                txa2.setText("");                                               //set text to txa2
                cbg.setSelectedCheckbox(null);                                  //set selected Checkbox om cbg to null
                cb3.setState(false);                                            //set cb3 dischaked
                cb4.setState(false);                                            //set cb4 dischaked
                co.select(0);                                                   //select choice 0
            }
        });
        
        btn2.addActionListener(new ActionListener(){                             //add ActionListener to btn2
            @Override
            public void actionPerformed(ActionEvent e) {                        //use actionPerformed() method
                name=txt1.getText();                                            //set name to get Text form txt1
                id=txt2.getText();                                              //set id to get Text form txt2
                add=txa1.getText();                                             //set add to get Text form txa1
                select=cbg.getSelectedCheckbox();                               //set select to get Selected from cbg 
                from=co.getSelectedItem();                                      //set from to get Selected Item from co
                
                if(name.equals("")||id.equals("")||add.equals("")               //if user not Insert full form , do
                        ||select==(null)||from.equals("--Select--")){
                    JOptionPane.showMessageDialog(null,"Please Insert All "     //popup message dialog use JOptionPane
                            + "Your Data");
                }
                else{                                                           //if user Insert full form , do
                    user=+1;                                                    //count user = user + 1
                    gend=select.getLabel();                                     //set gend get label from select
                    output="Your hostel registration:"                          //set text for string output
                            + "\nName : "+name+"\nId Martic : "+id
                            +"\nAddress : "+add+"\nGender : "+gend
                            +"\nBlock : "+block+"\nFrom Country : "+from+"\n"
                            +"-------------------------------------------------"
                            +"\n";

                    for (int c=0;c<user;c++){                                   //for loop to count user
                        txa2.append(output);                                    //append output in txa2
                    }
                }
            }
        });
        
    }
   
    public static void main(String[] args) {                                    //main method
        Hostel_Registration shw = new Hostel_Registration();                    //call method
    }
    
}