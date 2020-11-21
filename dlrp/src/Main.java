
import java.util.Scanner;

//qualifying certificate questioning programing...
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Welcome to my program........");
        
        System.out.println("Enter your name pls : ");
        String name = scn.nextLine();
        System.out.println("Do you have driving experience?(Y or N)");
        String solution_one = scn.nextLine();
        System.out.println("Do you have a motorcycle curiosity?(Y or N");
        String solution_two = scn.nextLine();
        System.out.println("enter your age : ");
        double age = scn.nextDouble();
        if(age>20  && ("y".equals(solution_two)) && ("y".equals(solution_one))){
            System.out.println(name +" recommended driving licenses for you A-A1-A2-B-BE" );
        }
        else if(age>16  || age <20  && ("y".equals(solution_two)) && ("y".equals(solution_one))){
            System.out.println(name +" recommended driving licenses for you A1-A2-B-BE" );
        }
        else if(age>=16   && ("y".equals(solution_two)) && ("y".equals(solution_one))){
            System.out.println(name +" recommended driving licenses for you A1" );
        }
        else if(age >=18  && ("n".equals(solution_two)) && ("y".equals(solution_one))){
            System.out.println(name +" recommended driving licenses for you B-BE" );
        }
        else if(age >20  && ("y".equals(solution_two)) && ("n".equals(solution_one))){
        System.out.println(name +" recommended driving licenses for you A-A1-A2-B-BE" );
        }
        else if(age >16  || age <20  && ("y".equals(solution_two)) && ("n".equals(solution_one))){
        System.out.println(name +" recommended driving licenses for you A1-A2-B-BE" );
        }
        else if(age >20 && ("n".equals(solution_two)) && ("n".equals(solution_one))){
        System.out.println(name +" recommended driving licenses for you B-BE" );
        }
        else if(age <16 && ("n".equals(solution_two)) && ("n".equals(solution_one))){
        System.out.println(name +" There is no driver's license option for you" );
        }else if (age <16 || ("n".equals(solution_two)) || ("n".equals(solution_one))){
        System.out.println(name +" There is no driver's license option for you" );

            
        }



        else{
            System.out.println("incorrect entry");
        }

    }
    
}
