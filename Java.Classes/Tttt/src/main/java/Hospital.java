public class Hospital {
    public static void listOfDiagnosis(Patient[] patients) {
        println("Рак");
        for (Patient patient : patients) {
            if (patient != null) {
                if (patient.getDiagnosis().equals("Рак"))
                    println(patient);
            }
        }

        println("COVID 19");
        for (Patient patient : patients) {
            if (patient != null) {
                if (patient.getDiagnosis().equals("COVID 19"))
                    System.out.println(patient);
            }
        }

        println("Здоров");
        for (Patient patient : patients) {
            if (patient != null) {
                if (patient.getDiagnosis().equals("Здоров"))
                    println(patient);
            }
        }

    }
    public static void listOfNumberMedicalCard(Patient[] patients) {
        println("от 0 до 124 000");
        for (Patient patient : patients) {
            if (patient != null) {
                if (patient.getNumMedCard() <= 124000)
                    println(patient);
            }
        }

        println("от 456 001 до 500 000");
        for (Patient patient : patients) {
            if (patient != null) {
                if (patient.getNumMedCard() > 456000 && patient.getNumMedCard() <= 500000)
                    println(patient);
            }
        }

    }
    public static void println(Object obj) {
        System.out.println(obj);
    }
}
