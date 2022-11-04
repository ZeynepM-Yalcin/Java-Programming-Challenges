public class calculator {

    private static int addition(int a, int b){
        int answer = a + b;
        return  answer;

    }
    private static int subtraction(int a, int b) {
        int answer = a - b;
        return answer;
    }

    private static int multiplication(int a, int b) {
        int answer = a * b;
        return answer;
    }
    private static int division(int a, int b) {
        int answer = a / b;
        return answer;
    }
    private static int power(int a, int b) {
        int answer = a ** b;
        return answer;
    }
    private static int factorial(int a, int b) {
        int answer = a // b;
        return answer;
    }


    public static void main(String[] args){
        String choice = args[0];
        int firstValue = Integer.parseInt(args[1];
        int secondValue = Integer.parseInt(args[2];

        switch (choice){
            case "addition":
                int answerA = addition(firstValue, secondValue);
                System.out.println(answerA);
                break;

            case "subtraction":
                int answerS = subtraction(firstValue, secondValue);
                System.out.println(answerS);
                break;

            case "multiplication":
                int answerM = multiplication(firstValue, secondValue);
                System.out.println(answerM);
                Break;

            case "division":
                int answerD = division(firstValue, secondValue);
                System.out.println(answerD);
                break;

            case "power":
                int answerP = power(firstValue, secondValue);
                System.out.println(answerP);
                Break;

            case "factorial":
                int answerF = factorial(firstValue, secondValue);
                System.out.println(answerF);
                Break;

        }

    }

}

