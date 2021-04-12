public class ArrayInitializer {
    final static int STUDENT_POPULATION = 10;

    public static Student[] createStudent() {
        Student[] students = new Student[STUDENT_POPULATION];
        students[0] = new Student("Potychko", "A.A.", 1, new int[] {10, 9, 9, 10, 9});
        students[1] = new Student("Sietova", "D.E.", 1, new int[] {10, 9, 8, 10, 9});
        students[2] = new Student("Ivanov", "A.S..", 1, academicAchievement(5));
        students[3] = new Student("Malfoy", "R.T.", 2, academicAchievement(5));
        students[4] = new Student("Silkina", "U.M.", 2, academicAchievement(5));
        students[5] = new Student("Drobysh", "A.M.", 3, academicAchievement(5));
        students[6] = new Student("Kvaigon", "D.D.", 3, academicAchievement(5));
        students[7] = new Student("Skywoker", "L.D.", 4, academicAchievement(5));
        students[8] = new Student("Organa", "L.T.", 5, academicAchievement(5));
        students[9] = new Student("Poter", "G.S.", 5, academicAchievement(5));
        return students;
    }

    public static int[] academicAchievement(int max) {
        int[] academicAchievement = new int[max];
        for(int i = 0; i < academicAchievement.length; i++) {
            academicAchievement[i] = (int) (Math.random() * 10);
        }
        return academicAchievement;
    }

    public static Train[] createTrains() {
        Train[] trains = new Train[5];
        trains[0] = new Train("Minsk", 15, "02:22");
        trains[1] = new Train("Orha", 1, "12:15");
        trains[2] = new Train("Vitebsk", 7, "19:51");
        trains[3] = new Train("Minsk", 907, "23:00");
        trains[4] = new Train("Minsk", 55, "05:05");
        return trains;
    }
}