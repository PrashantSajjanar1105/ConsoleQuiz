package org.example;

import java.util.Objects;
import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    String[] selection =new String[5];


    public QuestionService() {
        questions[0]=new Question(1,"what is size of int","2","4","6","8","2");
        questions[1]=new Question(2,"what is size of double","2","4","6","8","4");
        questions[2]=new Question(3,"what is size of float","16","4","6","8","1");
        questions[3]=new Question(4,"what is size of char","2","4","6","8","1");
        questions[4]=new Question(5,"what is size of boolean","2","4","1","8","3");
    }

    public void playQuiz(){
        int i =0;
        int score=0;
        for(Question q : questions){
            System.out.println("Question No "+q.getId()+": " + q.getQuestion());
            System.out.println("Option 1 : " + q.getOpt1());
            System.out.println("Option 2 : " + q.getOpt2());
            System.out.println("Option 3 : " + q.getOpt3());
            System.out.println("Option 4 : " + q.getOpt4());
            System.out.println("Please Enter the" +
                    " Option : ");

            Scanner sc =new Scanner(System.in);
            selection[i] = sc.nextLine();


            if(Objects.equals(selection[i], q.getAnswer())){
                score += 1;
                System.out.println("The Answer is right and the score is : " +score);
            }
            else{
                System.out.println("The Answer is incorrect and the correct answer is : " + q.getAnswer());
            }
            i++;
        }
        System.out.println(" The total score is : "+score);
    }
}
