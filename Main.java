package expression;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(
                new Add(
                        new Subtract(
                                new Multiply(
                                        new Variable("x"),
                                        new Variable("x")
                                ),
                                new Multiply(
                                        new Const(3),
                                        new Variable("x")

                                )),
                        new Const(1)
                )
        );
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите аргумент");
        int i = scanner.nextInt();
        System.out.println(new Add(
                new Subtract(
                        new Multiply(
                                new Variable("x"),
                                new Variable("x")
                        ),
                        new Multiply(
                                new Const(3),
                                new Variable("x")

                        )),
                new Const(1)
        ).evaluate(i));

        System.out.println(
                new Subtract(
                        new Multiply(
                                new Const(2),
                                new Variable("x")
                        ),
                        new Const(3)
                ));
        System.out.println(new Multiply(
                new Const(2),
                new Variable("x"))
                .equals(new Multiply(
                        new Const(2),
                        new Variable("x"))));


    }

//    public ArrayList<Object> fromStringToList(String str) {
//        ArrayList<Object> result = new ArrayList<>();
//
//        return result;
//    }

//    public Object circle(String str) {
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == '(') {
//                for (int j = i; j < str.length(); j++) {
//                    if (str.charAt(j) == ')') {
//                        circle(str.substring(i, j));
//                    }
//                }
//
//            }
//
//        }
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i))
//        }
//
//    }

}