public class Main {

    public static void main(String[] args) {
        Patient[] patient = Patient.addPatients();

        Hospital.println("Сортировка по диагнозу:");
        System.out.println();
        Hospital.listOfDiagnosis(patient);

        Hospital.println("");

        Hospital.println("Сортировка по номеру медицинской карты:");
        Hospital.listOfNumberMedicalCard(patient);
    }
}