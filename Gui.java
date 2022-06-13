package myarraylist;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class GUI implements ActionListener{
    static JButton homeButton,addButton;
    static JTextField choiceText,subjectText,idText,nameText,levelText,groupText;
    static JLabel choiceLabel;

 
    public static void main(String[]args) {
        
        // Welcome message 3abeta 
        String User = JOptionPane.showInputDialog("Please Enter Your Name: ");
        JOptionPane.showMessageDialog(null," Hello " + User + ", Welcome to our system!");
        // main page
        homePage();
        // el mfrod el exit hta5od parameter eh hoa m3rfosh, w yt3mlha call hna b3d el home page, w n3ml loop n3ed feha el homepage tany
        // w bs kda ana m3aya el fekra wel tanfez  0
    }
    
     private static void homePage(){
        JLabel addLabel = new JLabel("1: add student ");
        JLabel updateLabel = new JLabel("2: update student ");
        JLabel deleteLabel = new JLabel("3: delete student ");
        JLabel displayLabel = new JLabel("4: display student ");
        JLabel exitLabel = new JLabel("5: exit ");
        choiceLabel = new JLabel("select a number from the list above ");
        JPanel panel =new JPanel();
        JFrame frame=new JFrame();
        
        //da goz2 el frame
        frame.setSize(350,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);
        
        //da goz2 el label el hoa mktob feeh el menu w en el user y5tar
        addLabel.setBounds(10,20,105,25);
        updateLabel.setBounds(10,30,105,45);
        deleteLabel.setBounds(10,40,105,65);
        displayLabel.setBounds(10,50,105,85);
        exitLabel.setBounds(10,60,40,105);
        choiceLabel.setBounds(10,70,210,125);
        panel.add(addLabel);
        panel.add(updateLabel);
        panel.add(deleteLabel);
        panel.add(displayLabel);
        panel.add(exitLabel);
        panel.add(choiceLabel);
        
        // hna el user hyktb el rakam el hoa 3aizo
        choiceText = new JTextField(20);
        choiceText.setBounds(220,123,40,20);
        panel.add(choiceText);
        // ok button
        homeButton= new JButton("ok");
        homeButton.setBounds(280,123,60,20);
        panel.add(homeButton);
        homeButton.addActionListener(new GUI());
        
        frame.setVisible(true);
     }
     private static void addStudentForm(){
        JFrame frame=new JFrame();
        JPanel addpanel =new JPanel();
        idText = new JTextField(20);
        nameText= new JTextField(20);
        levelText= new JTextField(20);
        groupText= new JTextField(20);
        subjectText= new JTextField(20);
        
        frame.setSize(350,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(addpanel);
        addpanel.setLayout(null);
        frame.add(addpanel);
        
        JLabel idLbael = new JLabel("enter the student ID ");
        JLabel nameLabel = new JLabel("enter the student Name");
        JLabel levelLabel = new JLabel("enter the student level");
        JLabel groupLabel = new JLabel("enter the student Group");
        JLabel subjectLabel = new JLabel("enter the subject");
        
        idLbael.setBounds(10,20,250,25);
        idText.setBounds(220,20,200,20);
        
        nameLabel.setBounds(10,50,250,45);
        nameText.setBounds(220,65,200,20);
        
        levelLabel.setBounds(10,80,250,65);
        levelText.setBounds(220,105,200,20);
        
        groupLabel.setBounds(10,110,250,85);
        groupText.setBounds(220,145,200,20);
        
        subjectLabel.setBounds(10,140,250,105);
        subjectText.setBounds(220,185,200,20);
        
        addpanel.add(idLbael);
        addpanel.add(idText);
        
        addpanel.add(nameLabel);
        addpanel.add(nameText);
        
        addpanel.add(levelLabel);
        addpanel.add(levelText);
        
        addpanel.add(groupLabel);
        addpanel.add(groupText);
        
        addpanel.add(subjectLabel);
        addpanel.add(subjectText);
        
        addButton= new JButton("add student");
        addButton.setBounds(220,220,200,20);
        addpanel.add(addButton);
        addButton.addActionListener(new GUI());
        
        frame.setVisible(true);
     }
     private static void updateStudentForm(){
         
     }
     private static void deleteStudentForm(myarray<student>array){ // msh 3arf fe eh hna bs btgeb error anyway
         //htla3 dialog by2ol delete success w arga3 el hoome pageeee
         //w hatsheel el student bkol hagto mn el list
         
     }
     private static void displayStudentForm(myarray<student>array){ // literally copied the main one '' msh sa7 bs msh 3arf ''
         if(array.size()==0){
            System.out.println("Nothing Available , please add students first");
            return;
     }
          System.out.println("Studentid\tname\tLevel\tGroupNumber\tCourseName");
        myarray.insertsort(array);
        for(int i = 0;i<array.size();i++){
            student s = array.get(i);
            System.out.println(s.getSid()+"\t\t"+s.getName()+"\t"+s.getLevel()+"\t"+s.getGroupNumber()+"\t\t"+s.getName_course());
        }
     }
     private static void exitForm(){
         //exit form and show dialog
         //h3ml search 3ala javax dialog
     }
     

//method el action performed ha3ml condition lkol button law el text bta3o fady hynwr a7mr 
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==homeButton){
            homeListener();
        }
        //else if(e.getSource()==addButton){
            //ht3ml search ezay lma tdos 3la el button y5aze elhaga fl list w yrga3ak ll home page
       // }
       // else if(e.getSource()==updateButton){
            
        //}
        //else if(e.getSource()==deleteButton){
            
        //}
    }
   
    
    private void homeListener(){
        //bageb el haga el gwa eltext field
        String s = choiceText.getText().toString();
            if(s==null || s.length()==0){
                choiceLabel.setForeground(Color.red);
            }
            else if(s.equals("1")){
                addStudentForm();
            }
            else if(s.equals("2")){
                
            }
            else if(s.equals("3")){
                
            }
            else if(s.equals("4")){
                
            }
            else if(s.equals("5")){
                
            }
            else{
                choiceLabel.setForeground(Color.red);
                choiceLabel.setText("invalid choice");
            }
    }
    
    
    
   /*( private void jButtonActionPerformed(java.awt.event.ActionEvent evt){
        JOptionPane.showMessageDialog(this, "Clicked Event performed"); // kont b7awl a3ml method mo3ena bs 5las btgeb error
    } */
}

    
    

