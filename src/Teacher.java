public class Teacher {
    private String name;
    private int age;
    private String subject;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Teacher(String name, int age, String subject) {
        this.name = name;
        this.age = age;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Subject: " + subject + ", HashCode: " + hashCode();
    }
}

