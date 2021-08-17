package proyecto.pkgfinal.messi;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import java.util.Scanner;

/**
 * @author Brigada A
 */

public class ProyectoFinalMessi {
/**
 * @param args argumentos del main
 */
    public static void main(String[] args) {

        Modulos registro = new Modulos();
        for (int i = 0; i < 100; i++) {
            registro.Nombres();
            registro.Materias();
            registro.Direcciones("direcciones.txt");

        }

        Scanner leer3 = new Scanner(System.in);
        int z = 0;
        do {
            System.out.println("|\t\t Bienvenido al sistema escolar FI \t\t| \n "
                    + "1.Desea ver los registros academicos \n "
                    + "2.Desea modificar algun registro academico \n "
                    + "3.Desea ver su numero de inscripcion \n "
                    + "4.Desea ver los registros desde excel \n "
                    + "5.Salir \n "
                    + "(debera responder solo con el numero de lo que desea es decir 1,2,3,4 o 5) ");
            z = leer3.nextInt();
            switch (z) {
                case 1: {
                    System.out.println("Dirijase a la carpeta Proyecto Final y busque "
                            + "el archivo usuario.txt ahi apareceran los registros");
                    break;
                }
                case 2: {
                    registro.Modificador();
                    break;
                }
                case 3: {
                    registro.NumeroIns();
                    break;
                }
                case 4: {
                    registro.Excel();
                    System.out.println("busque en proyecto final el archivo Excel.xls");
                    break;
                }
                case 5: {
                    break;
                }
                default: {
                    System.out.println("No esta esa opcion");
                }
            }
        } while (z != 5);
        System.out.println("Si desea ejecutarlo de nuevo debera borrar los archivos usuario.txt,"
                + " materias.txt y numero.txt en dado caso que haya sido usado");
    }
}