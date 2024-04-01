package obj;

public class PersonsVO {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String city;

    public PersonsVO(){    }
    public PersonsVO(int id, String firstname , String lastname, int age, String city){
        this.id = id;
        this.firstName = firstname;
        this.lastName = lastname;
        this.age = age;
        this.city = city;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getAge() {
        return age;
    }
    public String getCity() {
        return city;
    }
    public String getFirstName() {
        return firstName;
    }
    public int getId() {
        return id;
    }
    public String getLastName() {
        return lastName;
    }
    @Override
    public String toString(){
        return String.format("ID: %d, First Name: %s, Last Name: %s, Age: %d, City: %s", getId(), getFirstName(), getLastName(), getAge(), getCity());

    }
}
