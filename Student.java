package JavaProgram_no_4_12_7_2021;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Student {

    private int roll;
    private String name = null;
    private String semester;
    private Address address;
    private static HashMap<Integer, String> registeredStudents = new HashMap<>();

    public void showRegisteredStudents() {

        System.out.println("The below students are registered : ");
        for (Map.Entry<Integer, String> set : registeredStudents.entrySet()) {
            System.out.println("Name is : " + set.getValue() + " And roll number is : " + set.getKey());

        }

    }

    public HashMap<Integer,String> getRegisteredStudents()
    {
        return registeredStudents;
    }

    public Student() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your roll number : ");
        this.roll = scan.nextInt();

        System.out.print("Enter your name  : ");
        scan.nextLine();
        this.name = scan.nextLine();

        System.out.print("Enter semester in which you are enrolled : ");
        this.semester = scan.nextLine();

        String countryName, cityName, streetName, zipCode;
        int houseNumber;
        System.out.print("Enter country name : ");
        countryName = scan.nextLine();
        System.out.print("Enter city name : ");
        cityName = scan.nextLine();
        System.out.print("Enter street name : ");
        streetName = scan.nextLine();
        System.out.print("Enter zip code : ");
        zipCode = scan.nextLine();
        System.out.print("Enter house number : ");
        houseNumber = scan.nextInt();


        Student.registeredStudents.put(roll, name);
        this.address = new Address(countryName, cityName, streetName, zipCode, houseNumber);

    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
