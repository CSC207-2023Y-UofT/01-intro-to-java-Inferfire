/**
 *  1. In Java, no code can exist outside a class. Unlike Python which uses
 *    functions, all code in Java uses methods.
 *    For this exercise, all of our code is within the Basics class.
 *    (Relevant reading: 1.1.1. Defining classes)
 */
public class Basics {

    /**
     *  2. In Python, we could have code in a block labelled:
     *        if __name__ == '__main__':
     *            # Code goes in here
     *    However in Java, the equivalent is the main method:
     *        public static void main(final String[] args){
     *            // Code goes in here
     *        }
     *    When you run this file (Basics.java), the code within the main
     *    method is run.
     *    (Relevant reading: 1.1.2. Defining methods)
     */
    public static void main(final String[] args) {
        /* 3. In Python, we could print out code using the print() function.
         *    In Java, we do the same thing by using System.out.println();
         *    In the line below, we print the result of 7 + 5
         *
         *    (Relevant reading: 1.1.3. Printing things)
         */
        System.out.println(7 + 5);


        System.out.println("Hello World!"); // task 1: prints "Hello World!"


        /* 4. In Python, we could declare variables using a simple assignment
         *    statement. For example:
         *        x = 10
         *    In Java, we have to specify the variable's type as well:
         *        int x = 10;
         *    We can also create variables without assigning a value to them
         *    for future use:
         *        int x;
         *
         *    (Relevant reading: 1.2. Variables and Types)
         */

        int my_variable = 100; // task 2: variable assigned val of 100


        /* Do not remove the line below: if you did task 2 correctly, then
         * you should see the message "my_variable's value is 100" if you run
         * this file!
         */
        System.out.println("my_variable's value is " + my_variable);

        /* 5. In Python, we could write a loop that iterates using:
         *        for <variable> in <values>:
         *            # Code goes in here
         *    In Java, the equivalent uses syntax in the form:
         *        for (initialized variable; end condition; increment by) {
         *            // Code goes in here
         *        }
         *    For example, if we wanted a loop from 1 to 10, we would do:
         *        for (int i = 1; i <= 10; i++){
         *            // Code goes in here
         *        }
         *    Where i++ is shorthand for i += 1 (or i = i + 1).
         *
         *    (Relevant reading: 1.8.2. for Loops)
         */

        for (int i = 10; i >= 0; i--) { // task 3: loops from 10 to 0
            System.out.println("Current count: " + i); // prints correct format
        }


    }

    /**
     *  6. Below is a method named split which returns a String,
     *    as indicated by the 'String' part of the header. It takes one
     *    parameter named to_split, whose type is also a String.
     *    This block of code above the method is called the doc comment -- this
     *    is equivalent to docstrings in Python.
     *    Below, we provide descriptions of what the parameters are and details
     *    about what is returned.
     * Create a String named 'ret' and get the first letter of
     * each word inside to_string. to_string is a String containing exactly
     * 7 words, separated by spaces.
     * You may want to use String.split() and String.charAt() methods.
     * See 1.5.2. APIs for their APIs.
     * For example, calling the below method on the string:
     *    "Idol Long Oolong Vertical Europe University Toyota"
     * should return "ILOVEUT"
     * (Relevant readings: 1.4. Strings and 1.4.4. StringBuilder.
     *                     1.8.2. for Loops may be useful too.)
     *
     * @param to_split   A string containing EXACTLY 7 words, separated by
     *                   spaces.
     * @return           The first letter of every word in to_split
     */
    public static String split(String to_split) {

        StringBuilder ret = new StringBuilder();

        String[] words = to_split.split(" "); // task 4: creates array

        for (int j = 0; j < words.length; j++) { // task 4: iterates in array
            ret.append(words[j].charAt(0)); // appends first char of each word
        }

        return ret.toString(); // task 4: returns the final string
    }

    /**
     * 7. Below is a method that takes in an integer array (similar to a list
     *    of integers). The method's name is 'oddSum' and it returns an int
     *    as indicated by the 'int' in the method header.
     * Return the sum of all integers at odd indices in the given array.
     * If there are no items at odd indices (e.g. a list with 0 or 1 elements),
     * return 0.
     * (Relevant readings: 1.6. Arrays and 1.8.2. for Loops)
     *
     * @param arr    An array of integers
     * @return       The sum of all integers at odd indices in arr
     */
    public static int oddSum(int[] arr) {
        int current_sum = 0;

        for (int k = 1; k < arr.length; k += 2) { // task 5: iterates by 2
            current_sum += arr[k];  // task 5: adds odd indexes to the sum
        }

        return current_sum;
    }
}
