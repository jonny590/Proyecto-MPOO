package proyecto.pkgfinal.messi;

import java.io.*;
import java.util.*;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.formula.functions.Column;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
/**
 * 
 * @author Brigada A
 */
public class Modulos {
    //modulo nombres

    public void Nombres() {
        //nombres
        int y = (int) (Math.random() * 10);
        String[] nombresA = new String[100];
        String[] nombres = {"Sofia", "Valentina", "Regina", "Maria Jose", "Ximena",
            "Camila", "Maria Fernanda", "Valeria", "Victoria", "Renata", "Santiago",
            "Mateo", "Sebastian", "Leonardo", "Matias", "Emiliano", "Diego", "Daniel",
            "Miguel Angel", "Alexander"};
        String[] apellidos = {"Hernandez", "Garcia", "Martinez", "Lopez", "Gonzalez",
            "Perez", "Rodriguez", "Sanchez", "Ramirez", "Cruz", "Flores", "Gomez", "Alonso",
            "Salinas", "Santarosa", "Meza", "Reyes", "Segura", "Vicente", "Alvarado"};
        for (int i = 0; i < 100; i++) {
            nombresA[i] = nombres[(int) (Math.floor(Math.random() * ((nombres.length - 1))))]
                    + " " + apellidos[(int) (Math.floor(Math.random() * ((apellidos.length - 1))))] + " "
                    + apellidos[(int) (Math.floor(Math.random() * ((apellidos.length - 1) - 1)))];
        }
        //carreras

        //pasar a txt
        File archivo;
        FileWriter escribir;
        PrintWriter linea;
        String nombre = "", carrera = "";
        archivo = new File("usuario.txt");
        if (!archivo.exists()) {
            try {
                archivo.createNewFile();

                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);

                linea.println("_____________________________________________________________________________");
                linea.println("\t" + "-" + nombresA[y] + "-");
                linea.println("´");
                linea.close();
                escribir.close();
            } catch (IOException ex) {
                System.out.println("Error al crear o cerrar el archivo");
            }
        } else {
            try {
                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);

                linea.println("_____________________________________________________________________________");
                linea.println("\t" + "-" + nombresA[y] + "-");
                linea.println("´");
                linea.close();
                escribir.close();
            } catch (IOException ex) {
                System.out.println("Error al crear o cerrar el archivo");
            }
        }
        archivo = new File("materias.txt");
        if (!archivo.exists()) {
            try {
                archivo.createNewFile();

                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);

                linea.println(nombresA[y]);

                linea.close();
                escribir.close();
            } catch (IOException ex) {
                System.out.println("Error al crear o cerrar el archivo");
            }
        } else {
            try {
                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);

                linea.println(nombresA[y]);

                linea.close();
                escribir.close();
            } catch (IOException ex) {
                System.out.println("Error al crear o cerrar el archivo");
            }
        }

    }
    //modulo carreras

    public void Materias() {
        //  Si quiere materias random int x = (int)(Math.random()*n+5);
        //donde n es el numero máximo de materias a tener
        // si quiere un numero especifico de materias por alumno n=cte     
        int x = (int) (Math.random() * 20 + 5);
        int i = 0;
        String arreglo[] = new String[x];

        String[] nombres = {"algebra ,8 Cred", "algebra lineal ,8 Cred",
            "calculo y geometria, 12 Cred", "MPOO, 6 Cred", "mecanica, 12 Cred",
            "Termodinamica ,10 Cred", "ASYS,10 Cred", "EDA, 10 Cred",
            "Electricidad y Magnetismo, 10 Cred", "Cultura y Comunicacion ,2 Cred",
            "Redaccion y Expoxicion de temas de ingeneria ,6 Cred",
            "Fundamentos de Progamacion ,10 Cred", "Calculo Integral ,8 Cred",
            "Calculo Vectorial, 8 Cred", "Ecuaciones diferenciales, 8 Cred",
            "OCP, 6 Cred", "OPH, 6 Cred", "Probabilidad,8 Cred",
            "Analisis Numerico,8 Cred", "Costos y Evaluacion de Proyetos,6 Cred",
            "Estadistica, 4 Cred", "Acustica y Optica,10 Cred", "Dinamica de Sistemas,8 Cred",
            "Analisis de circuitos electricos, 10 Cred", "Semiconductores,8 Cred",
            "Energia e impacto ambiental, 8 Cred", "Economia,8 Cred",
            "Teoria electromagnetica,10 Cred", "Fundamentos de control,10 Cred",
            "Dispositivos y Circuitos Electronicos,10 Cred", "Maquinas Electricas, 10 Cred",
            "Mediciones e Intrumentcion,8 Cred", "Diseño Digital,10 Cred", "SCE,10 Cred",
            "Amplificaciones Electronicos,10 Cred", "Sistemas electricos de potencia,10 Cred",
            "Automatizacion,10 Cred", "Microcondensadores y Microcontroladores,10 Cred",
            "Procesamiento digital de señales,8 Cred", "instalaciones electricas, 8 Cred",
            "Circuitos integrados analogos,10 Cred", "ACP,8 Cred", "ACP, 8 Cred", "ACP, 8 Cred",
            "ACP, 8 Cred", "ACP, 8 Cred", "ACP, 8 Cred", "Subestaciones electricas, 8 Cred",
            "Electronica de potencia, 8 Cred", "Etica profesional, 6 Cred",
            "Recursos y Necesidades de Mexico, 8 Cred"};

        arreglo[i] = nombres[(int) (Math.floor(Math.random() * ((nombres.length - 1) - 0 + 1) + 0))];
        for (i = 1; i < x; i++) {
            arreglo[i] = nombres[(int) (Math.floor(Math.random() * ((nombres.length - 1) - 0 + 1) + 0))];
            for (int j = 0; j < i; j++) {
                if (arreglo[i] == arreglo[j]) {
                    i--;
                }
            }
        }
        //pasar a txt
        File archivo;
        FileWriter escribir;
        PrintWriter linea;
        String nombre = "", carrera = "";
        archivo = new File("usuario.txt");
        if (!archivo.exists()) {
            try {
                archivo.createNewFile();

                // nombre=JOptionPane.showInputDialog(null,"ingrese carrera"+3);
                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);
                linea.println("´");
                linea.println("\t Materias \t");

                for (int k = 0; k < x; k++) {
                    linea.println("*" + arreglo[k] + "\t");
                }
                linea.println("´");

                linea.close();
                escribir.close();
            } catch (IOException ex) {
                System.out.println("Error al crear o cerrar el archivo");
            }
        } else {
            try {
                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);
                linea.println("´");
                linea.println("\t Materias \t");

                for (int k = 0; k < x; k++) {
                    linea.println("*" + arreglo[k] + "\t");
                }
                linea.println("´");

                linea.close();
                escribir.close();
            } catch (IOException ex) {
                System.out.println("Error al crear o cerrar el archivo");
            }
        }

        //pasar a otro txt
        float Ie = 0;
        float promedio = 0;
        int velocidad = 1;
        int escolaridad = 1;
        int y;
        archivo = new File("materias.txt");
        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);

                for (int k = 0; k < x; k++) {
                    y = (int) (Math.random() * (11 - 5) + 5);

                    promedio = promedio + y;
                }
                promedio = promedio / x;
                Ie = promedio * escolaridad * velocidad;
                linea.println("-" + Ie + "-");

                linea.close();
                escribir.close();
            } catch (IOException ex) {
                System.out.println("Error al crear o cerrar el archivo");
            }
        } else {
            try {
                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);

                for (int k = 0; k < x; k++) {
                    y = (int) (Math.random() * (6 + 1)) + 5;

                    promedio = promedio + y;
                }
                promedio = promedio / x;
                Ie = promedio * escolaridad * velocidad;
                linea.println("-" + Ie + "-");

                linea.close();
                escribir.close();
            } catch (IOException ex) {
                System.out.println("Error al crear o cerrar el archivo");
            }
        }
    }
    //modulo direcciones

    public void Direcciones(String direccion) {
        String texto = "";
        try {
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String temp = "";
            String bfRead;
            while ((bfRead = bf.readLine()) != null) {
                temp = temp + bfRead;
            }
            texto = temp;
        } catch (Exception e) {
            System.out.println("no archvio");
        }

        int edad = (int) (Math.floor(Math.random() * (28 - 18) + 18));
        int y = (int) (Math.random() * 10);
        String[] nombresA = new String[100];
        String direcciones[] = texto.split("-");
        for (int i = 0; i < 100; i++) {
            nombresA[i] = direcciones[(int) (Math.floor(Math.random() * ((direcciones.length - 1))))];
        }
        File archivo;
        FileWriter escribir;
        PrintWriter linea;
        String nombre = "", carrera = "";
        archivo = new File("usuario.txt");
        if (!archivo.exists()) {
            try {
                archivo.createNewFile();

                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);

                linea.println("Edad  " + edad);
                linea.println("Direccion" + nombresA[y]);

                linea.close();
                escribir.close();
            } catch (IOException ex) {
                System.out.println("Error al crear o cerrar el archivo");
            }
        } else {
            try {
                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);

                linea.println("Edad  " + edad);
                linea.println("Direccion;     " + nombresA[y]);

                linea.close();
                escribir.close();
            } catch (IOException ex) {
                System.out.println("Error al crear o cerrar el archivo");
            }
        }
    }

    //Modulo que mand a excel
    public void Excel() {
        String texto = "";
        try {
            BufferedReader bf = new BufferedReader(new FileReader("usuario.txt"));
            String temp = "";
            String bfRead;
            while ((bfRead = bf.readLine()) != null) {
                temp = temp + bfRead;
            }
            texto = temp;
        } catch (Exception e) {
            System.out.println("no archvio");
        }
        String registro[] = texto.split("_____________________________________________________________________________");
        Workbook book = new HSSFWorkbook();
        Sheet sheet = book.createSheet("Hola Java");
        Row row = sheet.createRow(0);
        for (int i = 1; i < 100; i++) {
            row.createCell(i).setCellValue(registro[i]);
        }
        try {
            FileOutputStream fileout = new FileOutputStream("Excel.xls");
            book.write(fileout);
            fileout.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Error al crear o cerrar el archivo");
        } catch (IOException ex) {
            System.out.println("Error al crear o cerrar el archivo");
        }
    }

    //Modulo que modifica los registros
    public void Modificador() {
        String texto = "";
        try {
            BufferedReader bf = new BufferedReader(new FileReader("usuario.txt"));
            String temp = "";
            String bfRead;
            while ((bfRead = bf.readLine()) != null) {
                temp = temp + bfRead;
            }
            texto = temp;
        } catch (Exception e) {
            System.out.println("no archvio");
        }

        int y = 0, k = 0;
        int g = 0;
        int n = 0;
        String x = "";

        do {
            Scanner leer2 = new Scanner(System.in);
            System.out.println("Bienvenido al modificador \n Cual es el nombre completo del alumno empezando por los nombres");
            x = leer2.nextLine();

            String nombres[] = texto.split("-");
            for (int i = 0; i < nombres.length; i++) {
                if (nombres[i].equals(x)) {
                    n = i;
                    break;

                } else {
                }
            }
            if (n == 0) {
                System.out.println("Ese nombre no existe verifique bien los archivos");
                Scanner leer10 = new Scanner(System.in);
                System.out.println("Desea volver a intentarlo \n 1.Si \n 2.No \n (responder 1 o 2 )");
                g = leer10.nextInt();
                if (g == 2) {
                    k = 1;
                }
            } else {
                g = 2;

            }

        } while (g == 1);
        if (k == 1) {
            System.out.println("no se modifico nada");
        } else {

            System.out.println("El alumno fue encontrado con exito");

            //System.out.println(n);
            int In = (n + 1) / 2;
            int Im = (In * 3) - 1;

            String datos[] = texto.split("´");
            // System.out.println(datos[Im]);
            String registro[] = texto.split("_____________________________________________________________________________");
            Scanner leer3 = new Scanner(System.in);
            System.out.println("Que desea modificar \n 1.Datos personales \n 2.Darse de baja \n 3.Darse de alta");
            int z = leer3.nextInt();
            switch (z) {
                case 1: {
                    Scanner leer7 = new Scanner(System.in);
                    System.out.println("Su nombre si es correcto? \n 1.Si \n 2.No \n (solo escriba el numero 1 o 2");
                    int nombre = leer7.nextInt();
                    if (nombre == 2) {
                        Scanner leer6 = new Scanner(System.in);
                        System.out.println("nombre:");
                        x = leer6.nextLine();
                    } else {
                        System.out.println("Entendido ahora ingresara sus datos personales correctos");
                    }

                    Scanner leer4 = new Scanner(System.in);
                    System.out.println("Indique su edad en nuemro solo el numero \n Edad:");
                    int edad = leer4.nextInt();

                    Scanner leer5 = new Scanner(System.in);
                    System.out.println("Direccion:");
                    String direccion = leer5.nextLine();

                    registro[In] = "_____________________________________________________________________________\n"
                            + "	-" + x + "-\n"
                            + "Edad  " + edad + "\n"
                            + "Direccion; " + direccion + "\n"
                            + "\n"
                            + datos[Im];
                    System.out.println("Su registro correcto es" + registro[In]);
                    break;
                }
                case 2: {
                    Scanner leer8 = new Scanner(System.in);
                    System.out.println("Esta seguro en darse de baja? \n escriba 1 para confirmar y escriba cual quier cosa si desea cancelar");
                    int res = leer8.nextInt();
                    if (res == 1) {
                        registro[In] = "Alumno dado de baja";
                    } else {
                        System.out.println("El alumno sigue inscrito a facultad de ingeneria");
                    }

                    break;
                }
                case 3: {
                    System.out.println("Ingrese los datos");
                    Scanner leer7 = new Scanner(System.in);
                    System.out.println("Escriba su nombre");

                    Scanner leer6 = new Scanner(System.in);
                    System.out.println("nombre");
                    x = leer6.nextLine();

                    Scanner leer4 = new Scanner(System.in);
                    System.out.println("Edad:");
                    int edad = leer4.nextInt();

                    Scanner leer5 = new Scanner(System.in);
                    System.out.println("Direccion:");
                    String direccion = leer5.nextLine();

                    registro[In] = "_____________________________________________________________________________\n"
                            + "	-" + x + "-\n"
                            + "Edad  " + edad + "\n"
                            + "Direccion; " + direccion + "\n"
                            + "\n Materias \n *Algebra, 8 Cred \n Calculo y Geometria analitica, 12 Cred \n Quimica ,10 Cred \n Redaccion y exposicion de temas de ingeneria, 6 Cred \n Fundamentos de progamacion,10-Cred  ";

                    System.out.println("Ya esta dado de alta bienvenido a la Fi \n" + registro[In]);
                }
                default: {
                    System.out.println("No esta esa opcion");
                }
            }
        }
    }
    // elimina un archivo

    public void Eliminar(String ruta) {
        try {
            File archivo = new File(ruta);
            if (!archivo.exists()) {
                System.out.println("no existe el archivo");
            } else {
                archivo.delete();
            }
        } catch (Exception e) {
        }
    }
// Modulo numero de inscripcion 

    public void NumeroIns() {
        int g = 0, n = 0, k = 0;
        String x = "";
        String texto = "";
        try {
            BufferedReader bf = new BufferedReader(new FileReader("materias.txt"));
            String temp = "";
            String bfRead;
            while ((bfRead = bf.readLine()) != null) {
                temp = temp + bfRead;
            }
            texto = temp;
        } catch (Exception e) {
            System.out.println("no archivo");

        }
        String mats[] = texto.split("-");
        do {
            Scanner leer2 = new Scanner(System.in);
            System.out.println("\n Introduzca el nombre completo del alumno empezando por los nombres");
            x = leer2.nextLine();

            String nombres[] = texto.split("-");
            //System.out.println(x);
            for (int i = 0; i < mats.length; i++) {
                if (mats[i].equals(x)) {
                    n = i + 1;
                    break;

                } else {
                }
            }

            if (n == 0) {
                System.out.println("Ese nombre no existe verifique bien los archivos");
                Scanner leer10 = new Scanner(System.in);
                System.out.println("Desea volver a intentarlo \n 1.Si \n 2.No \n (responder 1 o 2 )");
                g = leer10.nextInt();
                if (g == 2) {
                    k = 1;
                }
            } else {
                g = 2;

            }

        } while (g == 1);
        if (k == 1) {
            System.out.println("no se modifico nada");
        } else {

            System.out.println("El alumno fue encontrado con exito");

            float nuevo[] = new float[200];
            float aux;

            for (int i = 1; i < 200; i = i + 2) {
                nuevo[i - 1] = Float.parseFloat(mats[i]);

            }

            for (int i = 0; i < 200; i = i + 2) {
                for (int j = i + 2; j < 200; j = j + 2) {
                    if (nuevo[i] < nuevo[j]) {
                        aux = nuevo[i];
                        nuevo[i] = nuevo[j];
                        nuevo[j] = aux;
                    }
                }
            }
            /*  for (int i = 0; i < 20; i = i + 2) {
            System.out.println(nuevo[i]);
        } */
            File archivo;
            FileWriter escribir;
            PrintWriter linea;
            String nombre = "", carrera = "";
            archivo = new File("numero.txt");
            if (!archivo.exists()) {
                try {
                    archivo.createNewFile();

                    escribir = new FileWriter(archivo, true);
                    linea = new PrintWriter(escribir);
                    for (int i = 0; i < nuevo.length; i = i + 2) {
                        linea.println("- " + nuevo[i]);
                    }

                    linea.close();
                    escribir.close();
                } catch (IOException ex) {
                    System.out.println("Error al crear o cerrar el archivo");
                }
            } else {
                try {
                    escribir = new FileWriter(archivo, true);
                    linea = new PrintWriter(escribir);

                    for (int i = 0; i < nuevo.length; i = i + 2) {
                        linea.println("- " + nuevo[i]);
                    }

                    linea.close();
                    escribir.close();
                } catch (IOException ex) {
                    System.out.println("Error al crear o cerrar el archivo");
                }
            }

            int indicador = n;
            String texto1 = "";
            try {
                BufferedReader bf = new BufferedReader(new FileReader("numero.txt"));
                String temp = "";
                String bfRead;
                while ((bfRead = bf.readLine()) != null) {
                    temp = temp + bfRead;
                }
                texto1 = temp;
            } catch (Exception e) {
                System.out.println("no archvio");
            }
            String num[] = texto1.split("- ");
            int n1 = 0;
            for (int i = 0; i < num.length; i++) {
                if (num[i].equals(mats[indicador])) {
                    break;

                } else {
                    n1++;
                }
            }
            System.out.println("tu numero es \t" + n1);
        }
    }
}
