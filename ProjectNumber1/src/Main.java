
public class Main {
    //Code your solution to problem number one here
    public static int problemOne(String s){
        int answer = 0;
        //your code here


        for (int i = 0; i <= s.length(); i ++) {
            // loop the if statement through every single character in the string.

            if (i == s.length()) {
                // stops the code when 'i' reaches the end of a string.
                break;
            }
            if (s.substring(i, i + 1).equals("a")) {
                answer = answer + 1;
                // test if the current character equals to "a", if true, answer (variable) +1.
            }

            if (s.substring(i, i + 1).equals("e")) {
                answer = answer + 1;
                // test if the current character equals to "e", if true, answer (variable) +1.
            }

            if (s.substring(i, i + 1).equals("i")) {
                answer = answer + 1;
                // test if the current character equals to "i", if true, answer (variable) +1.
            }

            if (s.substring(i, i + 1).equals("o")) {
                answer = answer + 1;
                // test if the current character equals to "o", if true, answer (variable) +1.
            }

            if (s.substring(i, i + 1).equals("u")) {
                answer = answer + 1;
                // test if the current character equals to "u", if true, answer (variable) +1.
            }

        }

        return answer;
        // return the result.
    }


    //Code you problem number two here
    static int problemTwo(String s) {
        int answer = 0;
        //your code here

        for (int i = 0; i <= s.length(); i++) {
            // loop the if statement through every single character in the string.

            if (i == s.length() - 2) {
                break;
                // to prevent "StringIndexOutOfBound" error.
            }
            if (s.substring(i, i + 3).equals("bob")) {
                answer++;
                // test if "bob" occurs, if true, answer + 1
            }
        }

        return answer;
        // return the result.

    }

    //Code your solution to problem number 3 here
    static String problemThree(String s) {
        //your code here

        String result = "";
        char last;
        String test;

        for (int t = 0; t < s.length(); t++) {
            // loop the statement to test several times.
            String subStr = s.substring(t);
            // change the string 'subStr' to s.substring(t) to test every single characters in string 's'.
            test = "";
            last = 0;
            // resets both variables at the beginning of every loop.

            for (int i = 0; i < subStr.length(); i++) {
                char check = subStr.charAt(i);
                // change 'check' to subStr.charAt(1), (whatever character in subStr.substring(i), char check = that character)

                if (last <= check) {
                    // when 'char' is compared with operators that is designed for integers, 'char' will turn that character into numbers.
                    last = check;
                    //reset 'last' to 'check', in order to check if the substring is in alphabetical order.
                    test = test.concat(Character.toString(check));
                    // insert the current character of 'check' into the string 'test'.
                }

                else {
                    break;
                    // break to test for next substring in alphabetical order.
                }

            }

            if (test.length() > result.length()) {
                result = test;
                // changes the result everytime the method runs to get the longest outcome, because the 'result.length()' will be greater than 'test.length()' when it meets the longest outcome.
            }

        }

        return result;
        // return the result.
    }


    public static void main(String[] args) {
        /*
        Set s to a string and run your method using s as the parameter
        Run your method in a println statement to determine what the output was
        Once you think you have it working try running the tests.
        The tests will put your method through several different Strings to test
        all possible cases.  If you have 100% success then there is no bugs in your methods.
         */
       String s = "done";
       System.out.println(s);


    }

}

