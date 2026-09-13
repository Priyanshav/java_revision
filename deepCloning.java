class mobileNumber implements Cloneable{
    String number;
    mobileNumber(String number){
        this.number = number;
    }

    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

class Student implements Cloneable{
    String name;
    mobileNumber number;
    Student(String name, mobileNumber number){
        this.name = name;
        this.number = number;
    }
    protected Object clone() throws CloneNotSupportedException{
        Student clonedStudent = (Student) super.clone();
        clonedStudent.number = (mobileNumber) number.clone(); 
        return clonedStudent;
    }
}


public class deepCloning {
    public static void main(String[] args) throws CloneNotSupportedException{
        mobileNumber number = new mobileNumber("868589749");
        Student s1 = new Student("Priyanshu", number);
        Student s2 = (Student) s1.clone();
        System.out.println("Before Changes");

        System.out.println("Name : " + s1.name + " Number : " + s1.number.number);
        System.out.println("Name : " + s2.name + " Number : " + s2.number.number);

        System.out.println("After Changes");
        s2.name = "Amit";
        s2.number.number = "462562457";
        System.out.println("Name : " + s1.name + " Number : " + s1.number.number);
        System.out.println("Name : " + s2.name + " Number : " + s2.number.number);
    }
}
