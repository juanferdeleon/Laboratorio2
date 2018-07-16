public class Estudiante extends Grado{

    private String studentName;
    private String studentId;

    public Estudiante(){}

    public Estudiante(String levelName, String gradeName){

        this.setLevelName(levelName);
        this.setGrade(gradeName);

        System.out.print("Ingrese el nombre del estudiante: ");

        if (userInput.hasNextLine()){
            this.setStudentName(userInput.nextLine());
        }

        System.out.print("Ingrese el ID del estudiante: ");

        if (userInput.hasNextLine()){
            this.setStudentId(userInput.nextLine());
        }
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}