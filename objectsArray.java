import java.util.*;

class Students{
    int rollNo;
    String name;
    int marks;

    Students(int rollNo, String name, int marks){
        this.rollNo = rollNo;
        this.name= name;
        this.marks = marks;
    }
}

class objectsArray{
    public static void main(String[] args){
        Students s1 = new Students(7, "Priyanshu", 95);
        Students s2 = new Students(8, "Gaurav", 97);
        Students s3 = new Students(9, "Lavesh", 99);

        Students[] student = new Students[3];
        student[0] = s1;
        student[1] = s2;
        student[2] = s3;

//        for(int i = 0; i < 3; i++){
//            System.out.println(student[i].name + " " + student[i].marks);
//        }
        for(Students s : student) System.out.println(s.name + " : " + s.marks);
    }
}
