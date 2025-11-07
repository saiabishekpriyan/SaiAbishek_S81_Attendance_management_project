public Student registerStudent(String name, String gradeLevel)
public Teacher registerTeacher(String name, String subject)
public Staff registerStaff(String name, String role)
public Course createCourse(String courseName)

public List<Student> getStudents()
public List<Teacher> getTeachers()
public List<Staff> getStaffMembers()
public List<Course> getCourses()

public Student findStudentById(int id)
public Course findCourseById(int id)
public List<Person> getAllPeople() // for polymorphic display

public void saveAllRegistrations() // saves students.txt, teachers.txt, staff.txt, courses.txt
