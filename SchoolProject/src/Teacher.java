// this class is to build up the arraylist of 'teachers'



public class Teacher {
private String teacherFirstname;
private String teacherLastname;
private String subject;
public static int tCount = 0;
// to separate and build up firstnames and lastnames
public static int cCount = 0;
// to build up courses


    public static String[] teacherNameList = {
            // this string array is used to define the variables used in my arraylist 'teachers'
            "Ian", " Parisians",
            "Connor", " Omen",
            "Adam", " Ranch",
            "Leo", " Wilson",
            "Casey", " Luong",
            "Irene", " Milverton",
            "Daniel", " Brown",
            "Emma", " Watson",
    };

    public static String[] coursesList = {
            // this string array is used to define the variables used in my arraylist 'courses'
            "Math",
            "Science",
            "English",
            "Computer Studies",
            "Social Studies",
            "Physical Education",
            "French",
            "Visual Art",
            "choir",
    };

Teacher () {
    // constructor
    teacherFirstname = "";
    teacherLastname = "";
    subject = "";
    // initiate with blank

    teacherFirstname = (teacherNameList[tCount]);
    teacherLastname = (teacherNameList[tCount+1]);
    // makes sure that they are selecting the correct strings. (check the methods in schools)
    subject = (coursesList[cCount]);
    // subject is assigned to every single teachers as 'cCount' repeats to ++


    }

// setters and getters

    public String getTeacherFirstname() {

    return teacherFirstname;
    }

    public void setTeacherFirstname(String teacherFirstname) {

    this.teacherFirstname = teacherFirstname;
    }

    public String getTeacherLastname() {

    return teacherLastname;
    }

    public void setTeacherLastname(String teacherLastname) {

    this.teacherLastname = teacherLastname;
    }

    public String getSubject() {

    return subject;
    }

    public void setSubject(String subject) {

    this.subject = subject;
    }

}
