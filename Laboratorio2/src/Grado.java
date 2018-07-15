public class Grado extends Nivel {

    private String gradeName;

    public Grado(String levelName){

        super.setLevelName(levelName);

        System.out.print("Ingrese el nombre del grado: ");

        if (userInput.hasNextLine()){
            this.setGrade(userInput.nextLine());
        }

    }

    public void setGrade(String Grade){
        this.gradeName = Grade;
    }

    public String getGrade(){
        return gradeName;
    }

}
