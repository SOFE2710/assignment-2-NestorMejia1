import java.util.Vector;


public class Department {

    private String name; // the name of school “Dept of Computing and Info Science.”

    private String id; // short name for courses “SOFE”, “ELEE”, “STAT”, etc

    Vector<Course> courseList; // all courses offered by the department

    Vector<Student> registerList; // all students taking courses in the department.


    public String getName()
    {
        return name;
    }

    public String getId()
    {
        return id;
    }

    public Department(String name, String id)
    {
    // also initialize the vectors
        this.name = name;
        this.id = id;
        courseList = new Vector<>();
        registerList = new Vector<>();
    }

    public void offerCourse(Course course) {
        courseList.add(course);

    }



    public void printCoursesOffered() {
        //toString()
        for (Course c : courseList)
        {
            System.out.println(c.toString());
        }
    }


    public void printStudentsByName()
    {
        for (Student s: registerList)
        {
            System.out.println(s.toString());
        }
    }


    //boolean
    public boolean isStudentRegistered(Student student)
    {
        return registerList.contains(student);
    }

    //Vector<Students>
    public Vector<Student> studentsRegisteredInCourse(int code)
    {
        for (Course n : courseList)
        {
            if (n.getNumber() ==code)
                return n.classList;
        }

        return null;
    }

    public void printStudentsRegisteredInCourse(int n)
    {

        if (studentsRegisteredInCourse(n).isEmpty())
        {
            System.out.println("nothing");
            return;
        }

        for (Student s : studentsRegisteredInCourse(n))
        {
            System.out.println(s.getId() + ", " + s.getName());
        }
    }

    public Course largestCourse()
    {

       double value = 0;

        Course large = new Course();
        for (Course course : courseList)
        {
            if (course.classList.size() >  value) {

                value = course.classList.size();
                large = course;
            }
        }
        return large;
    }

    public String toString() {
    // returns a string representation of department name, number
    // of courses offered and number of students registered in the
    // department. Use the format:
    // ECSE: 53 courses, 460 students
        return id + ": " +
                String.valueOf(courseList.size()) +
                " COURSES:, " +
                String.valueOf(registerList.size()) +
                " STUDENTS:";

    }

    public void registerStudentCourseInDepartment(Student student, Course course) {
    }
}
