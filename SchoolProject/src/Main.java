// this class used to run the program.
public class Main extends School {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            students.add(new Student());
            // add new elements to arraylist 'students'
            Student.sCount = Student.sCount + 2;
            // increases 'sCount' by 2 whenever 'i' increases by 1
        }

        System.out.println("==Students=======================================================================================================================================");
        for (int i = 0; i < students.size(); i++) {
            System.out.println("Student Name: " + students.get(i).getStudentFirstname() + students.get(i).getStudentLastname() + " ||  Grade: " + students.get(i).getGrade());
            // prints firstname + last + grade of every elements in the arraylist 'students'
        }

        System.out.println(" ");


        for (int i = 0; i < 5; i++) {
            teachers.add(new Teacher());
            // add new elements to arraylist 'teachers'
            Teacher.tCount = Teacher.tCount + 2;
            // increases 'tCount' by 2 whenever 'i' increases by 1
            Teacher.cCount++;
            //cCount increases, to assign subjects to teachers
            if (Teacher.tCount > Teacher.teacherNameList.length) {
                Teacher.tCount = 0;
                break;
            }
            // makes sure that 'tCount' won't exceed the maximum capacity of NameList.


        }

        System.out.println("==Teachers======================================================================================================================================");

        for (int i = 0; i < teachers.size(); i++) {
            System.out.println("Teacher Name: " + teachers.get(i).getTeacherFirstname() + teachers.get(i).getTeacherLastname() + " ||  Subject: " + teachers.get(i).getSubject());
            // prints firstname + last + grade of every elements in the arraylist 'teachers'

        }

        System.out.println("================================================================================================================================================");



        // add 10 new students ↓↓↓



        for (int r = 0; r < 10; r++) {
            students.add(new Student());
            // add 10 new elements to arraylist 'students'
            Student.sCount = Student.sCount + 2;
        }

        System.out.println("\n");
        System.out.println("10 New Students have signed up for this school.");
        System.out.println("\n");



        // add 3 new teachers ↓↓↓



        for (int r = 0; r < 3; r++) {
            teachers.add(new Teacher());
            // add 3 new elements to arraylist 'teachers'
            Teacher.tCount = Teacher.tCount + 2;
            Teacher.cCount++;
            //increases 'cCount' to assign subjects to our new teachers
        }

        System.out.println("\n");
        System.out.println("3 New Teachers have signed up for this school.");
        System.out.println("\n");



        // Show both lists ↓↓↓



        System.out.println("==Students== [ Added 10 new students ] =========================================================================================================");
        for (int i = 0; i < students.size(); i++) {
            System.out.println("Student Name: " + students.get(i).getStudentFirstname() + students.get(i).getStudentLastname() + " ||  Grade: " + students.get(i).getGrade());
            // prints firstname + last + grade of every elements in the arraylist 'students'

        }

        System.out.println(" ");


        System.out.println("==Teachers== [ Added 3 new teachers } ==========================================================================================================");

        for (int i = 0; i < teachers.size(); i++) {
            System.out.println("Teacher Name: " + teachers.get(i).getTeacherFirstname() + teachers.get(i).getTeacherLastname() + " ||  Subject: " + teachers.get(i).getSubject());// prints firstname + last + grade of every elements in the arraylist 'teachers'
            // prints firstname + last + grade of every elements in the arraylist 'teachers'
        }



        // remove 2 students ↓↓↓



        for (int i = 0; i < 2;i ++) {
            students.remove(i);
            // remove elements on index of 'i' (2)
        }

        System.out.println("\n");
        System.out.println("2 Students have been removed from this school.");
        System.out.println("\n");



        // remove 1 teachers ↓↓↓



        for (int i = 0; i < 2;i ++) {
            teachers.remove(i);
            // remove elements on index of 'i' (1)
        }
        System.out.println("\n");
        System.out.println("1 Teacher have been removed from this school.");
        System.out.println("\n");



        // Show both lists ↓↓↓



        System.out.println("==Students== [ Removed 2 students ] ============================================================================================================");
        for (int i = 0; i < students.size(); i++) {
            System.out.println("Student Name: " + students.get(i).getStudentFirstname() + students.get(i).getStudentLastname() + " ||  Grade: " + students.get(i).getGrade());
            // prints firstname + last + grade of every elements in the arraylist 'students'
        }

        System.out.println(" ");


        System.out.println("==Teachers== [ Removed 1 teacher ] =============================================================================================================");

        for (int i = 0; i < teachers.size(); i++) {
            System.out.println("Teacher Name: " + teachers.get(i).getTeacherFirstname() + teachers.get(i).getTeacherLastname() + " ||  Subject: " + teachers.get(i).getSubject());
            // prints firstname + last + grade of every elements in the arraylist 'teachers'
        }
    }
}