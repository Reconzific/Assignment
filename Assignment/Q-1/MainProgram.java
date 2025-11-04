class Student {
    String name;
    int rollNo;
    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
}
class BCAStudent extends Student {
    int semester;
    BCAStudent(String name, int rollNo, int semester) {
        super(name, rollNo);
        this.semester = semester;
    }
}

public class MainProgram {
    public static void main(String[] args) {
        try {
            BCAStudent[] data = new BCAStudent[3];
            data[0] = new BCAStudent("Vaibhav", 101, 5);
            data[1] = new BCAStudent("Vivek", 102, 5);
            data[2] = new BCAStudent("Priyansh", 103, 5);

            for (BCAStudent s : data) {
                System.out.println(s.name + " | Roll: " + s.rollNo + " | Sem: " + s.semester);
            }
            System.out.println(data[5].name);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of range!");
        }
    }
}
