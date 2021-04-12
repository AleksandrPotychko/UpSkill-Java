public class Student {
    private String lastName;
    private String initials;
    private int group;
    private int numberOfGrades = 5;
    private int maximumNumberOfGrades = 5;
    private int[] academicAchievement;

    public Student(String lastName, String initials, int group, int[] academicAchievement) {
        this.lastName = lastName;
        this.initials = initials;
        this.group = group;
        this.academicAchievement = academicAchievement;
    }

    public boolean isTopStudent(int lowerBoundaryOfGrades) {
        for (int i = 0; i < numberOfGrades; i++)
            if (academicAchievement[i] < lowerBoundaryOfGrades) {
                return false;
            }
        return true;
    }

    public static void printTopStudents(Student[] students, int lowerBoundaryOfGrades) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].isTopStudent(lowerBoundaryOfGrades)) {
                students[i].printStudent();
            }
        }
    }

    public void printStudent() {
        System.out.println(lastName + " Group: " + group);
    }
}