package myarraylist;
import java.util.Scanner;
public class Myarraylist {

    
    public static void main(String[] args) {
        // TODO code application logic here
        myarray<student> array = new myarray<>();
        
        //we will use a loop to return the menu
        while(true){
            System.out.println("Welcome to the student system menu , choose what you want to do");
            System.out.println("1: Add student");
            System.out.println("2: update student");
            System.out.println("3: delete student");
            System.out.println("4: display student");
            System.out.println("5: exit");
            Scanner in = new Scanner(System.in);
            String line = in.nextLine();
            
            
            switch (line){
                case "1":
                    System.out.println("Add student: ");
                    addstudent(array);   
                    break;
                case "2":
                    System.out.println("update student: ");
                    updatestudent(array);
                    break;
                case "3":
                    System.out.println("delete student: ");
                    deletestudent(array);
                    break;
                case "4":
                    System.out.println("display the students: ");
                    displaystudent(array);
                    break;
                case "5":
                    System.out.println("Thank you");
                    System.exit(0); //function to exit the loop
                default:
                    System.out.println("please choose a number from the menu");
                    break;
                    
            }
        }
      
    }
    public static boolean isUsed(myarray<student>array, int sid){
        //to see if the student id is taken or not
        boolean flag = false;  //3ndy flag 3ltol b false
        for(int i = 0; i <array.size();i++){    // loop htlf 3la kol index mwgod fl array
           student s = array.get(i);            // object s hsawy b kol index hget byanato
           if(s.getSid()==(sid)){               // hget l ID bs w hsawy bl student id l bk4f 3leh
               flag = true;                     // lw mwgod l flag htt8yr htkon b true , else false zy mna
               break;  
           }
        } 
        return flag;                           // true or false 7sb l fo2
    }
    public static void addstudent(myarray<student>array){
        Scanner in = new Scanner(System.in);
        while(true){                          //loop 34an lw l id fe error
            System.out.println("Enter student ID");
             
            int Sid = in.nextInt();
            boolean f = isUsed(array,Sid);  //b4of lw l id da already mwgod wla l2a
            if(f == false){                 // lw isUsed bfalse , ha5od byanat l student
                System.out.println("***************");
                String x = in.nextLine();          // de 7attha 34an by3ml skip l awl input m3rf4 leh wallahy :(
                System.out.println("Enter name");
                String name = in.nextLine();
                System.out.println("Enter group number");
                String GroupNumber = in.nextLine();
                System.out.println("Enter Level");
                String Level = in.nextLine();
                System.out.println("Enter course name");
                String course_name = in.nextLine();
                student s1 = new student();         // b3d lma a5od input mn l user h3ml object gded asmo s1
                s1.setName(name);                   // h3ml set l kol 7aga ana5dtha input f mknha
                s1.setSid(Sid);
                s1.setLevel(Level);
                s1.setGroupNumber(GroupNumber);
                s1.setName_course(course_name);
                array.add(s1);                        //object l s1 h3mlo add to the array
                System.out.println("Successfully added student");  
                break;
            }else{
                System.out.println("The id is taken, re-enter");          // lw isUsed bTrue , hy5o4 hna , hy2oly ano 8lt w y3ed l loop
            }
           
        }
    }
    
    public static void displaystudent(myarray<student>array){
        if(array.size()==0){                // fl awl lw l size =0 hy2ol mfe4 7aga mwgoda
            System.out.println("Nothing Available , please add students first");
            return;
        }
        System.out.println("Studentid\tname\tLevel\tGroupNumber\tCourseName");  // else hytl3 kol byanat l student
        myarray.insertsort(array);                                              // InsertSort 34an artb 7sb l id before printing them
        for(int i = 0;i<array.size();i++){                                      // loop htlf 3la kol index mwgod fl array
            student s = array.get(i);                                           //hget i , w atb3 id,name etc..
            System.out.println(s.getSid()+"\t\t"+s.getName()+"\t"+s.getLevel()+"\t"+s.getGroupNumber()+"\t\t"+s.getName_course());
        }
        
    }
    
    public static void deletestudent(myarray<student>array){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the id of the student you want to delete");
        int sid = in.nextInt();
        int index = -1;
        for(int i =0; i <array.size();i++){ // loop htlf 3la kol index mwgod fl array
            student s =array.get(i);    // ba5od object mn student w b get ID bta3 student , 34an b3den akarno bl id l ana md5lo
            if(s.getSid()==(sid)){      // lw l id l ana gbto bysawy l id l ana b3ml search 3leh 34an a4elo
                index = i;              // h5ly l index btsawy l i (index bta3 kol 7aga mt3lka bl student da) , 34an a8yr kemt l index 34an tt8yr fl if condetion
                break;
            }
        }
        if (index == -1){               // lw l index zy ma howa , m4 hy43l 7aga
            System.out.println("There is no information, please re-enter");
            
        }else{
            array.remove(index);       // lw kemt index at8yrt , hy4el l index bta30 fa bl taly l student da hyt4al
            System.out.println("Student has been deleted Successfuly");
        }
        
    }
    
    public static void updatestudent(myarray<student>array){
        Scanner in = new Scanner(System.in);
        while(true){            
        System.out.println("Enter the student id you want to update: ");
        int sid = in.nextInt();          
        int index =-1;         
        //to see before modifying the student if it actually exist
        for(int i = 0;i<array.size();i++){        //h3ml loop blf 3la 3nasr l array
        student Student = array.get(i);           //object asmo Student bsawy b element elemnt gowa l array
        if(Student.getSid()==(sid)){              //lw l id l d5lto already mwgod , h8yr kemt l index 34an fl condition l t7t 22olo l This ID is taken
            index = i;
            break;
        }
    }
        if(index == -1){
            System.out.println("Student info does not exist, please re-enter");   
        }
        else{
            //update the student
        System.out.println("Enter the name of the student to be updated: ");
        String o =in.nextLine();                 //7attha 34an by3ml skip l awl 7aga m3rf4 leh
        String name = in.nextLine();             //
        System.out.println("Enter the group number to be updated:");
        String GroupNumber = in.nextLine();
        System.out.println("Enter the student id you want to be updated: ");
        int updatesid = in.nextInt();
        System.out.println("Enter the Level to be updated:");
        String n =in.nextLine();                //7attha 34an by3ml skip l awl 7aga m3rf4 leh
        String Level = in.nextLine();
        System.out.println("Enter course name");
        String course_name = in.nextLine();
        
        student s = new student();
        s.setName(name);
        s.setGroupNumber(GroupNumber);
        s.setSid(updatesid);
        s.setLevel(Level);
        s.setName_course(course_name);
        array.set(index,s);
        System.out.println("modify student info is successfull");
        break;
        }
      }
    }
  }