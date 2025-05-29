package BuilderPattern;

public class Director {

    StudentBuilder studentBuilder;

    Director(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent() {
        if ( studentBuilder instanceof EngineeringStudentBuilder ) {
            return createEngineeringStudent();
        } else if ( studentBuilder instanceof MBAStudentBuilder ) {
            return createMBAStudent();
        }
        return null;
    }

    // Director directs how objects get created
    // Calls StudentBuilder methods in a specific manner - Line 24, 28

    private Student createEngineeringStudent() {
        return studentBuilder.setRollNumber(1).setAge(22).setName("sj").setSubjects().build();
    }

    private Student createMBAStudent() {
        return studentBuilder.setRollNumber(2).setAge(24).setName("sj").setFatherName("MyFatherName").setMotherName("MyMotherName").setSubjects().build();
    }

}
