public class Student {
    int age;
    String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }

        Student student = (Student) o;
        if (this.age != student.age) {
            return false;
        }
        return this.name != null ? this.name.equals(student.name) : student == null;
    }

    @Override

    public int hashCode() {
        int result = this.age;
        result = result * 31 + (this.name != null ? this.name.hashCode() : 0);
        return result;
    }
}
