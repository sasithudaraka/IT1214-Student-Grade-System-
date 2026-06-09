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