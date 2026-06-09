class Student {
    private String id;
    private String name;
    private double marks;

    public Student(String id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public double getMarks() { return marks; }

    public void show() {
        System.out.println("ID: " + id + " | Name: " + name + " | Marks: " + marks);
    }
}
public class GradeSystem {
    private static ArrayList<Student> students = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n--- Student Grade System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Show All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Average Marks");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: addStudent(); break;
                case 2: showAll() break;
                case 3: searchStudent() break;
                case 4:  break;
                case 5: System.out.println("Goodbye!"); break;
                default: System.out.println("Invalid choice!");
            }
        } while (choice != 5);
    }

    private static void addStudent() {
        System.out.print("Enter ID: ");
        String id = sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();
        sc.nextLine();
        students.add(new Student(id, name, marks));
        System.out.println("Student added!");
    }
	 private static void showAll() {
        if (students.isEmpty()) System.out.println("No records.");
        else for (Student s : students) s.show();
    }

    private static void searchStudent() {
        System.out.print("Enter ID: ");
        String id = sc.nextLine();
        for (Student s : students) {
            if (s.getId().equals(id)) {
                s.show();
                return;
            }
        }
        System.out.println("Not found.");
    }
	

}
