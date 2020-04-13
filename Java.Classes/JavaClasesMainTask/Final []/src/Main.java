import static jdk.nashorn.internal.objects.Global.println;

class Main {
    public static void main(String[] args) {
        Patient[] patient = Patient.addPatients();

        Hospital.println("Сортировка по диагнозу:");
        Hospital.listOfDiagnosis(patient);

        Hospital.println("");

        Hospital.println("Сортировка по номеру медицинской карты:");
        Hospital.listOfNumberMedicalCard(patient);
    }
}