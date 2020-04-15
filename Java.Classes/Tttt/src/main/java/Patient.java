public class Patient {

    private static int idGenerator = 0;
    private int id = idGenerator;
    private String surname;
    private String name;
    private String middleName;
    private String address;
    private int phoneNumber;
    private int numMedCard;
    static Patient [] patient = new Patient[10];

    public int getNumMedCard() {
        return numMedCard;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    private String diagnosis;
    {
        idGenerator++;
    }
    public Patient(String surname, String name, String middleName, String address, int phoneNumber, int numMedCard, String diagnosis){
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.numMedCard = numMedCard;
        this.diagnosis = diagnosis;
    }
    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", numMedCard=" + numMedCard +
                ", diagnosis='" + diagnosis + '\'' +
                '}';
    }

    public static Patient[] addPatients() {
        patient[0] = new Patient("Овдиенко", "Артем", "Анатольевич", "Гомель", 3088701, 123777, "Здоров");
        patient[1] = new Patient("Петров", "Сергей", "Петрович", "Гомель", 7073214, 456564, "COVID 19");
        patient[2] = new Patient("Иванов", "Сергей", "Витальевич", "Гомель", 8544114, 123654, "COVID 19");
        patient[3] = new Patient("Путов", "Андрей", "Андреевич", "Гомель", 5642132, 456789, "Рак");
        patient[4] = new Patient("Кротов", "Поликарп", "Генадбевич", "Гомель", 7332254, 456111, "Рак");
        patient[5] = new Patient("Ничаев", "Виктор", "Степанович", "Гомель", 6728451, 123666, "Здоров");
        return patient;
    }
}