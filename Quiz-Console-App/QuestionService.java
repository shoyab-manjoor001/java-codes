import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[5];
    String responses[] = new String[5];
    int score=0;  
    
    public QuestionService() {
        questions[0] = new Question(1, "Size of Byte", "1 byte", "2 byte", "3  byte", "4 byte", "1");
        questions[1] = new Question(2, "Size of double", "3 byte", "8 byte", "2  byte", "4 byte", "4");
        questions[2] = new Question(3, "Size of short", "1 byte", "2 byte", "3  byte", "4 byte", "2");
        questions[3] = new Question(4, "Size of int", "1 byte", "8 byte", "3  byte", "4 byte", "4");
        questions[4] = new Question(5, "Size of char", "4 byte", "1 byte", "3  byte", "4 byte", "1");       
    }


    public void  playQuiz()
    {
        Scanner sc = new Scanner(System.in);
        int i=0;
        for(Question q: questions)
        {
            System.out.println("\nQuestion no : "+q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            System.out.println("Input your answer");
            responses[i++] = sc.nextLine();
        }

        System.out.println("\nResponse of the user:");
        for(String s:responses)
        {
            System.out.println(s);
        }
    }

    public void getScore()
    {
        for(int i=0;i<5;i++)
        {
            if(responses[i].equals(questions[i].getAnswer()))
            {
                score+=1;
            }
        }
        System.out.println("\nYour Score in quiz: "+score);
    }
    
}
