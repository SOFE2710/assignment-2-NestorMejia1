import java.util.Vector;
import java.util.HashSet;
public class Student extends Person{
	private String id;
	private Vector<Course> courses; // contains all courses the student is registered in
	public String getName()


	{
		return name;
	}

	public String getId()
	{
		return id;
	}

	public Student(String id, String name)
	{
	// initialize name and id. Also initialize the Vector
		this.id = id;
		this.name = name;
		courses = new Vector<>();
	}

	//courses.add(c);
	public void registerFor(Course c)
	{
		if (!courses.contains(c))
		{
			courses.add(c);

			c.classList.add(this);

			c.getDept().registerList.add(this);
		}
	}

	// I need a boolean
	public boolean isRegisteredInCourse(Course c)
	{
		return courses.contains(c);
	}

	public String toString()
	{

		StringBuilder COURSE = new StringBuilder(id).append(" ").append(name).append("\nRegistered courses");

		for (Course c : courses)
		{
			COURSE.append(";  ");
			COURSE.append(c.getCode()).append("  ").append(c.getTitle());

		}
		return COURSE.toString();
	}


}