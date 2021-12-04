public class Person {
   protected String name;

   // constructors
   public Person(String initialName)
   {
      name = initialName;
   }
   public Person(){
   }

   public void setName( String fullName)
   {
      name = fullName;
   }
   public String getName()
   {
      return name;
   }

   public void registerFor(Course course)
   {
      //this is important
   }

   public boolean isRegisteredInCourse(Course course)
   {
      return false;
   }


   public String toString()
   {
      return "Person or People  Class or lasses; Name or names: " + name;
   }

}
