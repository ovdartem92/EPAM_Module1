package market;

class Customer {

    private static int idGenerator = 0;
    private int id;
    private String name;
    private String secondName;
    private String thirdName;
    private String address;
    private int creditCardId;
    private int bankNumberCard;
    {
        idGenerator++;
    }

    Customer(String name, String secondName, String thirdName, String address, int creditCardId, int bankNumberCard) {
        ++idGenerator;
        this.id = idGenerator;
        this.name = name;
        this.secondName = secondName;
        this.thirdName = thirdName;
        this.address = address;
        this.creditCardId = creditCardId;
        this.bankNumberCard = bankNumberCard;
//        idGenerator++;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getThirdName() {
        return thirdName;
    }

    public String getAddress() {
        return address;
    }

    public int getCreditCardId() {
        return creditCardId;
    }

    public int getBankNumberCard() {
        return bankNumberCard;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", thirdName='" + thirdName + '\'' +
                ", address='" + address + '\'' +
                ", creditCardId=" + creditCardId +
                ", bankNumberCard=" + bankNumberCard +
                '}';
    }
}