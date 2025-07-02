import java.util.*;

class Student {
    private String name;
    private double gpa;

    public Student(String n, double m) {
        this.name = n;
        this.gpa = m;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }
}


class MyComparator implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
       
        return Double.compare(b.getGpa(), a.getGpa());
    }
}

public class Main {
    public static void main(String[] args) {
        List<Student> arr = new ArrayList<>();
        arr.add(new Student("boob", 3.0));
        arr.add(new Student("alice", 3.5));
        arr.add(new Student("charli", 3.8));
        arr.add(new Student("abhi", 3.4));
        arr.add(new Student("shrey", 3.9));

        arr.sort(new MyComparator());  // Sorting by GPA in ascending order

        for (Student s : arr) {
            System.out.println(s.getName() + "   " + s.getGpa());
        }
    }
}
