
package universitywsapp;

import java.util.Iterator;
import java.util.List;

public class UniversityWSApp {

    public static void main(String[] args) {
        int aux=UniversityWSApp.numerOfUniversity("Andalucía");
        
        System.out.println("-------------------------------------------------------");
        System.out.println("Numero de universidades en Andalucía:" + aux );
        List<String> auxi=UniversityWSApp.insertarCA("Andalucía");
        
        System.out.println("-------------------------------------------------------");
        System.out.println("Universidades de Andalucía:");
        for(int i=0;i<auxi.size();i++) System.out.println(auxi.get(i));
        
        System.out.println("-------------------------------------------------------");
        List<String> allCA=UniversityWSApp.allComunidadA();
        for(int i=0;i<allCA.size();i++) System.out.println(allCA.get(i));
        
        System.out.println("-------------------------------------------------------");
        List<String> alluni=UniversityWSApp.allUniversity();
        for(int i=0;i<alluni.size();i++) System.out.println(alluni.get(i));
    }

    private static int numerOfUniversity(java.lang.String ca) {
        universityws.UniversityWS_Service service = new universityws.UniversityWS_Service();
        universityws.UniversityWS port = service.getUniversityWSPort();
        return port.numerOfUniversity(ca);
    }

    private static java.util.List<java.lang.String> insertarCA(java.lang.String comunidadAutonoma) {
        universityws.UniversityWS_Service service = new universityws.UniversityWS_Service();
        universityws.UniversityWS port = service.getUniversityWSPort();
        return port.insertarCA(comunidadAutonoma);
    }

    private static int allNumberOfUniversity() {
        universityws.UniversityWS_Service service = new universityws.UniversityWS_Service();
        universityws.UniversityWS port = service.getUniversityWSPort();
        return port.allNumberOfUniversity();
    }

    private static java.util.List<java.lang.String> allComunidadA() {
        universityws.UniversityWS_Service service = new universityws.UniversityWS_Service();
        universityws.UniversityWS port = service.getUniversityWSPort();
        return port.allComunidadA();
    }

    private static java.util.List<java.lang.String> allUniversity() {
        universityws.UniversityWS_Service service = new universityws.UniversityWS_Service();
        universityws.UniversityWS port = service.getUniversityWSPort();
        return port.allUniversity();
    }


    
}
