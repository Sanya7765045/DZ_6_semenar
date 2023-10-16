import java.util.List;

public interface TeacherRepository {
    void addTeacher(Teacher teacher);
    List<Teacher> getTeachers();
}