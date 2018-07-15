import java.util.Scanner;

public class Nivel{

    private String levelName;

    static Scanner userInput = new Scanner(System.in);


    public Nivel(){

        System.out.print("Ingrese el nombre del nivel: ");

        if (userInput.hasNextLine()){
            this.setLevelName(userInput.nextLine());
        }

    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

}
