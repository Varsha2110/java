public class Student{
    private int rollno ;
    private String name;
    private String location;
    public Student(int rollno, String name, String location){
        this.rollno=rollno;
        this.name=name;
        this.location=location;
    }
    public int getrollno(){
        return rollno;
    }
    public String getname(){
        return name;
    }
    public String getlocation(){
        return location;
    }
    public void setname(){
    }
    public void display(){
        System.out.println("Name:"+this.name);
        System.out.println("Reg:"+this.rollno);
        System.out.println("Location:"+this.location);
    }
    public static void main(String[] args){
        Student s1=new Student(1,"Varsha","TPT");
        s1.display(); 
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
}