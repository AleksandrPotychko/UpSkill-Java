public class Student {
    private final String lastName;
    private final String initials;
    private final int group;
    private int numberOfGrades;
    private final int maximumNumberOfGrades = 5;
    private final int[] academicAchievement;

    public Student(String lastNameStudent, String initialsStudent, int groupStudent){
        lastName = lastNameStudent;
        initials = initialsStudent;
        group = groupStudent;
        numberOfGrades = 0;
        academicAchievement = new int[maximumNumberOfGrades];
    }
    public boolean addGrade(int grade) {
        if (numberOfGrades >= maximumNumberOfGrades) {
            return false;
        }
        academicAchievement[numberOfGrades] = grade;
        numberOfGrades++;
        return true;
    }
    public boolean isTopStudent(int firstGradeBorder, int lastGradeBorder) {
        for (int i = 0; i < numberOfGrades; ++i)
            if (academicAchievement[i] >= firstGradeBorder && academicAchievement[i] <= lastGradeBorder) {
                return true;
            }
        return false;
    }
    public void printTopStudent() {
        System.out.println(lastName + " Group: " + group);
    }
}
