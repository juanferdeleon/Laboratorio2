import java.util.Scanner;

public class Laboratorio2 {
    public static void main(String[] args) {

        Boolean wantsToContinue = true;
        Nivel[] arrayLevel = new Nivel[10];
        Grado[] arrayGrado = new Grado[13];

        int levelCount = 0;
        int gradeCount = 0;


        do {

            System.out.println(getMenu());

            System.out.print("Ingrese una opcion: ");
            Scanner input = new Scanner(System.in);
            int option = input.nextInt();

            switch (option){
                case 1:
                    Nivel levelInput1 = new Nivel();
                    arrayLevel[levelCount] = levelInput1;
                    levelCount++;
                    break;
                case 2:
                    System.out.print("Ingrese un nivel: ");
                    Scanner levelInput2 = new Scanner(System.in);
                    String levelName = levelInput2.next();

                    Boolean isInArray = searchInArray(arrayLevel, levelName);

                    if (isInArray){
                        Grado gradoInput = new Grado(levelName);
                        arrayGrado[gradeCount] = gradoInput;
                        gradeCount++;
                    }else{
                        System.out.println("El nivel ingresado no existe.");
                    }
                    break;
                case 3:

                    break;
                case 4:
                    for (int i=0; i<arrayLevel.length; i++){
                        if (arrayLevel[i] != null){
                            System.out.println("Nombre de Nivel: " + arrayLevel[i].getLevelName()  + "\n");
                        }
                    }
                    break;
                case 5:

                    break;
                case 6:
                    wantsToContinue = false;
                    break;
                default:
                    System.out.println("Esta opcion no es valida");
                    break;
            }

        }while(wantsToContinue);
    }

    public static String getMenu(){
        return "Menu:\n" +
                "\t1. Agregar Nivel\n" +
                "\t2. Agregar Grado\n" +
                "\t3. Agregar Estudiante\n" +
                "\t4. Ver Grados de Nivel\n" +
                "\t5. Ver Asignaciones en un Grado\n" +
                "\t6. Salir\n";
    }

    public static Boolean searchInArray(Nivel[] arrayLevel, String NivelIngresado){
        Boolean isInArray = false;

        for (int i=0; i<arrayLevel.length; i++){
            if (arrayLevel[i] != null) {
                if (arrayLevel[i].getLevelName().equals(NivelIngresado)) {
                    isInArray = true;
                }
            }
        }
        return isInArray;
    }
}
