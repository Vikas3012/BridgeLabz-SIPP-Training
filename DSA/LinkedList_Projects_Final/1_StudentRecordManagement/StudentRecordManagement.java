
class StudentNode {
    int rollNo;
    String name;
    int age;
    char grade;
    StudentNode next;

    StudentNode(int rollNo, String name, int age, char grade) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

public class StudentRecordManagement {
    private StudentNode head;

    public void addAtBeginning(int rollNo, String name, int age, char grade) {
        StudentNode newNode = new StudentNode(rollNo, name, age, grade);
        newNode.next = head;
        head = newNode;
    }

    public void addAtEnd(int rollNo, String name, int age, char grade) {
        StudentNode newNode = new StudentNode(rollNo, name, age, grade);
        if (head == null) {
            head = newNode;
            return;
        }
        StudentNode temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
    }

    public void deleteByRollNo(int rollNo) {
        if (head == null) return;
        if (head.rollNo == rollNo) {
            head = head.next;
            return;
        }
        StudentNode curr = head;
        while (curr.next != null && curr.next.rollNo != rollNo) {
            curr = curr.next;
        }
        if (curr.next != null) curr.next = curr.next.next;
    }

    public StudentNode searchByRollNo(int rollNo) {
        StudentNode temp = head;
        while (temp != null) {
            if (temp.rollNo == rollNo) return temp;
            temp = temp.next;
        }
        return null;
    }

    public void updateGrade(int rollNo, char newGrade) {
        StudentNode student = searchByRollNo(rollNo);
        if (student != null) student.grade = newGrade;
    }

    public void display() {
        StudentNode temp = head;
        while (temp != null) {
            System.out.println("Roll: " + temp.rollNo + ", Name: " + temp.name + ", Age: " + temp.age + ", Grade: " + temp.grade);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        StudentRecordManagement list = new StudentRecordManagement();
        list.addAtBeginning(1, "Alice", 20, 'A');
        list.addAtEnd(2, "Bob", 21, 'B');
        list.display();
    }
}
