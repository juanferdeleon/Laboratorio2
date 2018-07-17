import java.util.Scanner;

public class Laboratorio2 {
    public static void main(String[] args) {

        Boolean wantsToContinue = true;
        Boolean isInArray;
        Nivel[] arrayLevel = new Nivel[10];
        Grado[] arrayGrade = new Grado[13];
        Estudiante[] arrayStudent = new Estudiante[20];

        int levelCount = 0;
        int gradeCount = 0;
        int studentCount = 0;


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

                    isInArray = searchInArrayLevel(arrayLevel, levelName);

                    if (isInArray){
                        Grado gradoInput = new Grado(levelName);
                        arrayGrade[gradeCount] = gradoInput;
                        gradeCount++;
                    }else{
                        System.out.println("El nivel ingresado no existe.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese un nivel: ");
                    Scanner levelInput3 = new Scanner(System.in);
                    String levelName2 = levelInput3.next();

                    isInArray = searchInArrayLevel(arrayLevel, levelName2);

                    if (isInArray){

                        System.out.print("Ingrese un grado: ");
                        Scanner gradeInput = new Scanner(System.in);
                        String gradeName = gradeInput.next();

                        isInArray = searchInArrayGrade(arrayGrade, gradeName);

                        if (isInArray){
                            Estudiante gradoInput = new Estudiante(levelName2, gradeName);
                            arrayStudent[studentCount] = gradoInput;
                            studentCount++;
                        }else{
                            System.out.println("El grado ingresado no existe.");
                        }

                    }else{
                        System.out.println("El nivel ingresado no existe.");
                    }
                    break;
                case 4:
                    System.out.print("Ingrese un nivel: ");
                    Scanner levelInput4 = new Scanner(System.in);
                    String levelName3 = levelInput4.next();

                    isInArray = searchInArrayLevel(arrayLevel, levelName3);

                    if (isInArray){
                        for(int i = 0; i<arrayGrade.length; i++){
                            if (arrayGrade[i] != null){
                                if(arrayGrade[i].getLevelName().equals(levelName3)){
                                    System.out.println("Grado: " + arrayGrade[i].getGrade() + "\n");
                                }
                            }
                        }
                    }else{
                        System.out.println("El nivel ingresado no existe.");
                    }
                    break;
                case 5:
                    System.out.print("Ingrese un grado: ");
                    Scanner gradeInput = new Scanner(System.in);
                    String gradeName = gradeInput.next();

                    isInArray = searchInArrayGrade(arrayGrade, gradeName);

                    if (isInArray){
                        for(int i = 0; i<arrayStudent.length; i++){
                            if (arrayStudent[i] != null){
                                if (arrayStudent[i].getGrade().equals(gradeName)){
                                    System.out.println(arrayStudent[i]);
                                }
                            }
                        }
                    }else{
                        System.out.println("El grado ingresado no existe.");
                    }
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
        return "\nMenu:\n" +
                "\t1. Agregar Nivel\n" +
                "\t2. Agregar Grado\n" +
                "\t3. Agregar Estudiante\n" +
                "\t4. Ver Grados de Nivel\n" +
                "\t5. Ver Asignaciones en un Grado\n" +
                "\t6. Salir\n";
    }

    public static Boolean searchInArrayLevel(Nivel[] arrayLevel, String NivelIngresado){
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

    public static Boolean searchInArrayGrade(Grado[] array, String Ingresado){
        Boolean isInArray = false;

        for (int i=0; i<array.length; i++){
            if (array[i] != null) {
                if (array[i].getGrade().equals(Ingresado)) {
                    isInArray = true;
                }
            }
        }
        return isInArray;
    }
}
