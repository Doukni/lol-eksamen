package src.BogOpgaver;

public class CopenhagenMarathonMethod {

    String name;
    int number;
    char group;

    void runner(String name,int number, char group) {
        System.out.println("Dear " + name + "!\n" +
                "We are happy to recive your registration.\n"  +
                "Your start number is: " + number +
                "\nPlease check in 10 minutes before start.\n");
    }
}
