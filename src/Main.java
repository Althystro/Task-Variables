public class Main {
    public static void main(String[] args) {

        String firstName = "Abdulwahab";
        String lastName = "Alawadhi";
        int age = 25;
        int amount = 193;


        System.out.println(firstName + "\n" + lastName + "\n" + age + "\n" + amount);

        boolean married = false;
        double amount2 = 20;
        String deposit = "Deposit";
        String withdraw = "Withdraw";
        System.out.println("The amount is " + amount2 + "KD\n" +
                "Would you like to " + deposit + " or " + withdraw + " the amount?\n");


        int amount3 = 5;
        int total = amount3 + amount3;
        System.out.println(amount3 + " plus " + amount3 + " equals " + total);

        String fullName = "John doe";
        String nameOnly[] = fullName.split(" ", 2);
        String myName = nameOnly[0].toUpperCase();
        String myLastName = nameOnly[1];

        System.out.println("My name is " + myName + " and my last name length is " + myLastName.length());
        System.out.println(myLastName.startsWith("d"));
    }


}