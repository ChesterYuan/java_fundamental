public class Java_variables {
    public static void main(String[] args) {

        // Variables in Java
        /* there are two steps:
         * 1. Declare the variable
         * 2. Initialize the variable
         */

        int year = 2025;
        double islandMatcha = 6.99;
        boolean isDelicious = true;
        // String uses double quotes
        String favoriteCafe = "Nooks Cafe";
        // char uses single quotes
        char grade = 'A';
        String favoriteDrink = "Island Matcha";
        boolean isCodingFun = true;
        
        if(isCodingFun) {
            System.out.println("Keep it up!");
        } else {
            System.out.println("You can do it!");
        }

        
        System.out.println("The year is " + year);
        System.out.println("The price of Island Matcha is $" + islandMatcha);
        System.out.println("Is it delicious? " + isDelicious);
        System.out.println("My favorite cafe is " + favoriteCafe);
        System.out.println("My grade is " + grade);
        System.out.println("My favorite cafe is " + favoriteCafe + " and their best beverage is " + favoriteDrink + " at $" + islandMatcha + "~");
    }
}
