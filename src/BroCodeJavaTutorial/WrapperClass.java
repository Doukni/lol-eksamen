package src.BroCodeJavaTutorial;

public class WrapperClass  {

    public static void main(String[] args) {

        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Adam";

        // det overstående kaldes autoboxing hvliket betyer vi konvatere premitive values til tilsvarende wrapperclass

        // Man kan gøre præcis det samme modsat altså konvatere wrapperclasene til at være prmitive hvilket kaldes unboxing

        if (b=='@') {
            System.out.println("This is true");
        }




    }
}
