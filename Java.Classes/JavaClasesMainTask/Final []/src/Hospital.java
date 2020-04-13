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
            println("From 0 to 124 000");
            for (Patient patient : patients) {
                if (patient != null) {
                    if (patient.getNumMedCard() <= 124_000)
                        println(patient);
                }
            }

            println("From 456 001 to 500 000");
            for (Patient patient : patients) {
                if (patient != null) {
                    if (patient.getNumMedCard() > 456_000 && patient.getNumMedCard() <= 500_000)
                        println(patient);
                }
            }

        }
        public static void println(Object obj) {
            System.out.println(obj);
        }
}
