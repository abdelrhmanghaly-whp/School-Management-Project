
package myarraylist;

public class student {
    private String name;
    private int Sid;
    private int code;
    private int grade;
    private String GroupNumber;
    private String Level; 
    private String name_course;
    
    public student(){
    }
    
    public student(String name,int Sid,int code, int grade,String GroupNumber,String Level,String name_course){
        this.name=name;
        this.Sid=Sid;
        this.code=code;
        this.grade=grade;
        this.GroupNumber=GroupNumber;
        this.Level=Level;
        this.name_course=name_course;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName_course() {
        return name_course;
    }

    public void setName_course(String name_coursee) {
        this.name_course = name_coursee;
    }
    public String getName(){
        return name;
    }
    
    public int getSid() {
		return Sid;
    }
    public void setSid(int Sid) {
		this.Sid = Sid;
    }
        
    public void setCode(int code) {
        this.code = code;
    }
    public int getCode(){
        return code;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    public int getGrade(){
        return grade;
    }

    public void setGroupNumber(String GroupNumber) {
        this.GroupNumber = GroupNumber;
    }
    public String getGroupNumber(){
        return GroupNumber;
    }

    public void setLevel(String Level) {
        this.Level = Level;
    }
    public String getLevel(){
        return Level;
    }

    
}
