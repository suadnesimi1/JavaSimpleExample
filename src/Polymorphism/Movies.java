package Polymorphism;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Movies {
    //throws keyword is used to declare an exception.
    //exception is an event, which occurs during the execution of a program.
    //when an error occurs within a method, the method creates an object and hands it off to the runtime system
    public static void main(String[] args) throws Exception{
        BufferedReader gender = new BufferedReader(new InputStreamReader(System.in)); //used to read text from a character-based input stream. It can be used to read data line by line by readLine() method.
        System.out.println("Enter the gender of the movies \n" + " 1: Action\n 2: History\n 3: Horror\n 4: Thriller\n 5: Serials");
        int number = Integer.parseInt(gender.readLine());
        Gender bloggender = null;
        switch (number) {
            case 1:
                bloggender = new Gender.Action();
                break;
            case 2:
                bloggender = new Gender.History();
                break;
            case 3:
                bloggender = new Gender.Horror();
                break;
            case 4:
                bloggender = new Gender.Thriller();
                break;
            case 5:
                bloggender = new Gender.Serials();
                break;
            default:
                System.out.println("You type something wrong");
                break;


        }
        if(bloggender!=null) {
        bloggender.readFromGender();

        }
    }


    static class Gender {


        public void readFromGender() {
        }
        static class Action extends Gender {
            public void readFromGender() {
                System.out.println("Action Movies");
            }
        }

        static class History extends Gender {
            public void readFromGender() {
                System.out.println("History Movies");
            }
        }

        static class Horror extends Gender {
            public void readFromGender() {
                System.out.println("Horror Movies");
            }
        }

        static class Thriller extends Gender {
            public void readFromGender() {
                System.out.println("Thriller Movies");
            }
        }

        static class Serials extends Gender {
            public void readFromGender() {
                System.out.println("Serials");
            }
        }
    }
}
