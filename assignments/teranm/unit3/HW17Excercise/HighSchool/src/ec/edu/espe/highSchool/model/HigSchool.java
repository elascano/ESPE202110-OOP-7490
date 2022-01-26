package ec.edu.espe.highSchool.model;

/**
 *
 * @author Melanie
 */
public class HigSchool {
    private String name;
    private String education;
    private float students;
    private float teachers;
    private String classSchedule;

    public HigSchool(String name, String education, float students, float teachers, String classSchedule) {
        this.name = name;
        this.education = education;
        this.students = students;
        this.teachers = teachers;
        this.classSchedule = classSchedule;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the education
     */
    public String getEducation() {
        return education;
    }

    /**
     * @param education the education to set
     */
    public void setEducation(String education) {
        this.education = education;
    }

    /**
     * @return the students
     */
    public float getStudents() {
        return students;
    }

    /**
     * @param students the students to set
     */
    public void setStudents(float students) {
        this.students = students;
    }

    /**
     * @return the teachers
     */
    public float getTeachers() {
        return teachers;
    }

    /**
     * @param teachers the teachers to set
     */
    public void setTeachers(float teachers) {
        this.teachers = teachers;
    }

    /**
     * @return the classSchedule
     */
    public String getClassSchedule() {
        return classSchedule;
    }

    /**
     * @param classSchedule the classSchedule to set
     */
    public void setClassSchedule(String classSchedule) {
        this.classSchedule = classSchedule;
    }
}
