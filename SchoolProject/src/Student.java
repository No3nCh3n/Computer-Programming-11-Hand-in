// this class is to build up the arraylist of 'students'

public class Student {
    private String studentFirstname;
    private String studentLastname;
    private int grade;
    private int studentNumber;
    // assigned as integers in order to do calculations
    public static int sCount = 0;
    // to separate and build up firstnames and lastnames


    public static String[] studentNameList = {
            // this string array is used to define the variables used in my arraylist 'students'
            "Miya"," Yao",
            "Tyson"," Einstein",
            "Alex"," Citrus",
            "Hazel"," Ernest",
            "Richard"," Iyer",
            "Saya"," Sunshine",
            "Tessa"," Uzbekistan",
            "Paul"," Iannelli",
            "Dylan"," An",
            "Sophia"," Ankle",
            "Franklyn"," Ihlenfeldt",
            "Seraphine"," Hyperman",
            "Issac", "Frank",
            "York", "Ori",
            "Urban", "Cannibal",
            "Anna", " Newark",


    };



    Student () {
        // constructor
        studentFirstname = "";
        studentLastname = "";
        // initiate with blank
        grade = ((int) (Math.random() * 5) + 8);
        // gives random number between 8 - 12
        studentNumber = ((int) (Math.random() * 899999) + 100000);
        // creates very unique student numbers
        studentFirstname = (studentNameList[sCount]);
        studentLastname = (studentNameList[sCount + 1]);
        // makes sure that they are selecting the correct strings. (check the methods in schools)

    }



//setters and getters

    public String getStudentFirstname() {
        return studentFirstname;
    }

    public void setStudentFirstname(String studentFirstname) {
        this.studentFirstname = studentFirstname;
    }

    public String getStudentLastname() {
        return studentLastname;
    }

    public void setStudentLastname(String studentLastname) {
        this.studentLastname = studentLastname;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }
}

