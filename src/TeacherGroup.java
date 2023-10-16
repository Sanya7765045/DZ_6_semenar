import java.util.ArrayList;
import java.util.List;

public class TeacherGroup implements TeacherRepository {
    private List<Teacher> teachers;

    public TeacherGroup() {
        teachers = new ArrayList<>();
    }

    @Override
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    @Override
    public List<Teacher> getTeachers() {
        return teachers;
    }
}