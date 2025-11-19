import java.util.*;//Scanner,Random,Date,Calender
import java.text.SimpleDateFormat;//to show time in readable format
import java.io.*; //for reading an writing files
import java.net.*;//Http request for chatgpt API
public class Sarah {
    static Scanner sc=new Scanner(System.in);

    //================GREETING USER======================
    public static void greetUser(){
        int hour=Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        if(hour<12){
            System.out.println("Sarah:Good Morning..!");     
           }
        else if(hour<18){
             System.out.println("Sarah:Good Afternoon..!");     
        }   
        else{
             System.out.println("Sarah:Good evening..!");     
        }

    }
    //====================TIME======================
    public static void getTime(){
        SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");
         System.out.println("Sarah: Current time is "+sdf.format(new Date()));//new Date() is a constructor which we used  here to create object from date class in java.util.*
         }
    //====================CALCULATOR=================
    public static void Calculator(){
         System.out.println("Enter first number.:");
         double a=sc.nextDouble();
         System.out.println("Enter second number:");     
         double b=sc.nextDouble();
         System.out.println("Enter operand:");
         String op=sc.nextLine();

         switch(op){
            case"+":
            System.out.println("Addition:"+(a+b));
            break;
            case"-":
            System.out.println("Subtraction:"+(a-b));
            break;
            case"*":
            System.out.println("Multiplication:"+(a*b));
            break;
            case"/":
            System.out.println("Division:"+(a/b));
            break;
            case"%":
            System.out.println("Modulus:"+(a%b));
            break;
            case"^":
            System.out.println("Power:"+Math.pow(a,b));
            break;
            default:
            System.out.println("Invalid Operation");
        }
    }
    //===================NOTES MAKER====================
    public static void takeNotes(){
        try{
            System.out.println("Sarah: Write your note:");
            String notes=sc.nextLine();
            FileWriter fw=new FileWriter("notes.txt",true);
            fw.write(notes+"\n");
            fw.close();
            System.out.println("Sarah:Notes saved successfully...!");
        }
        catch(IOException e){
            System.out.println("Sarah:Error occured");

        }
    }
    public static void telljokes(){
        String [] jokes={
            "Can you tell why java developers use spectacles????\n ...Because they can't C.",
            "What did the left eye say to the right eye? Between us, something smells!",
            "What did one math book say to the other? “I've got so many problems.”"
        };
        Random r=new Random();
        System.out.println("Sarah:"+jokes[r.nextInt(jokes.length)]);

    }

    public static void motivation(){
        String [] quotes={
            "Believe in your self.",
            "Everyday is a new Opportunity.",
            "Stay positive,Work hard,and mak it possible."
        };
        Random r=new Random();
        System.out.println("Sarah:"+quotes[r.nextInt(quotes.length)]);
    }

    public static void playYouTube(String query){/*(1)public → can be called from anywhere.

                                                   (2)static → can be called without creation of the object.

                                                   (3)void → No return value.

                                                   (4)String query → input given by user*/
        try{
            String url="https://www.youtube.com/results?search_query=" + query.replace(" ", "+");
            Runtime.getRuntime().exec(new String[]{"cmd","/c","start",url});
            System.out.println("Sarah: Playing"+query+"on YouTube....");
        } catch(IOException e){
            System.out.println("Error Opening YouTube...");
        }
    }

    //cmd=command prompt open karta hai
    // /c= runs command and close CMD
    //start <url>=open url in open browser
    //Runtime.getRuntime()= helps java to interact with operating system
    //exec()=run commands in system
    public static void openWebsite(String site){
        try{
        String url="https://www."+ site;
        Runtime.getRuntime().exec(new String[]{"cmd","/c","start",url});
        System.out.println("Sarah:Opening"+site+"on browser");
        }
        catch(IOException e){
            System.out.println("Error opening browser...");
        }
    }

//==================== MAIN MENU =====================
    public static void menu() {
        while (true) {
            System.out.println("\n===== Sarah Assistant Menu =====");
            System.out.println("1. Greet Me");
            System.out.println("2. Show Time");
            System.out.println("3. Calculator");
            System.out.println("4. Take Notes");
            System.out.println("5. Tell a Joke");
            System.out.println("6. Motivation");
            System.out.println("7. Play on YouTube");
            System.out.println("8. Open Website");
            System.out.println("9. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    greetUser();
                    break;

                case 2:
                    getTime();
                    break;

                case 3:
                    Calculator();
                    break;

                case 4:
                    takeNotes();
                    break;

                case 5:
                    telljokes();
                    break;

                case 6:
                    motivation();
                    break;

                case 7:
                    sc.nextLine(); // clear buffer
                    System.out.print("Enter what you want to play: ");
                    String q = sc.nextLine();
                    playYouTube(q);
                    break;

                case 8:
                    sc.nextLine();
                    System.out.print("Enter website name (example: google.com): ");
                    String s = sc.nextLine();
                    openWebsite(s);
                    break;

                case 9:
                    System.out.println("Sarah: Goodbye!");
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }    
    public static void main (String[] args){
        menu();
    
  }
}

  