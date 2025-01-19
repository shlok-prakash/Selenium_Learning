package Encapsulation;

public class Student {

    public String fName;
    public int rollNo;
    private String email;

//    public int getRollNo() {
//        return rollNo;
//    }
//
//    public void setRollNo(int rollNo) {
//        this.rollNo = rollNo;
//    }
//
//    public String getfName() {
//        return fName;
//    }
//
//    public void setfName(String fName) {
//        this.fName = fName;
//    }

    public void setEmail(String email){
        if(email.endsWith("@gmail.com")){
            this.email = email;
        }else{
            System.out.println("Enter a valid Email Id");
        }
    }

    public String getEmail(){
        if (this.email != null) {
            return this.email;
        }else{
            return "hey you have not provided valid email";
        }
    }

    public Student(String fName, int rollNo) {
        this.fName = fName;
        this.rollNo = rollNo;
//        this.email = email;
    }
}
