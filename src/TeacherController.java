import java.util.List;

public class TeacherController {
    private TeacherService teacherService;
    private TeacherView teacherView;
    private TeacherRepository teacherRepository;

    public TeacherController(TeacherService teacherService, TeacherView teacherView, TeacherRepository teacherRepository) {
        this.teacherService = teacherService;
        this.teacherView = teacherView;
        this.teacherRepository = teacherRepository;
    }

    public void createTeacher(String name, int age, String subject) {
        Teacher teacher = new Teacher(name, age, subject);
        if (teacherService.validateTeacher(teacher)) {
            teacherRepository.addTeacher(teacher);
            teacherView.displayTeacher(teacher);
        } else {
            System.out.println("Invalid teacher data");
        }
    }

    public void editTeacher(Teacher teacher, String newName, int newAge, String newSubject) {
        teacher.setName(newName);
        teacher.setAge(newAge);
        teacher.setSubject(newSubject);
        teacherView.displayTeacher(teacher);
    }

    public void displayTeachers() {
        List<Teacher> teachers = teacherRepository.getTeachers();
        teacherView.displayTeachers(teachers);
    }
}