package test.MVC;
/** 
* Created Petrolti, 2019
* Build programm calculate characters from patern Model-View-Controler
* This class Controler - input / output command User
*/
import java.util.Scanner;
import java.util.Set;
import static test.MVC.View.print;

public class Command {
    public Command() {
        print("Введите слово для анализа");		//Print to system console input message
        Scanner sc = new Scanner(System.in);	//Initialise class Scanner for input users word
        String s = sc.next();					//Write users word to s (input data)
        sc.close();								//Close Scanner
        Model e = new Model(s);					//Call logic module with input data
        Set set = e.keySet();					//reception list keys from map
        print("Веденное Вами слово содержит:");
        for (Object me : set) {					//Print to system console output message - result calculate
            print("символ " + me + ": " + e.get(me) + " шт.");
        }
    }
}
