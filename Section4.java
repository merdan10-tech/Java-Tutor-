package GroupProject;

//Import librarys
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import javax.swing.*;
import java.net.URI;
import java.awt.*;
import java.awt.event.*;

public class Section4 {
    //Menu creator
    public static void menuCreator(){
        //Create quiz label
        JLabel quizLabel = new JLabel(); //Create label for quiz
        quizLabel.setText("<html> <body width='650'> <center> Please press the button below to start the quiz! </html>"); //Set label text

        //Create button for initializing quiz function with action listener
        JButton quizLaunch = new JButton("Start");
        quizLaunch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { 
                Section4.quiz();
            }
        });

        //Create panel to hold quiz label and button
        JPanel buttonPanel = new JPanel(); //Create panel
        buttonPanel.add(quizLabel); //Add label
        buttonPanel.add(quizLaunch);//Add button

        //Create JFrame to contain the entire menu
        JFrame menu = new JFrame("Section 4"); //Initialize JFrame

        //Create tabbed pane to organize function panes
        JTabbedPane menuTabs = new JTabbedPane(); //Initialize tabbedpane
        menuTabs.setFont(new Font("Verdana", Font.ITALIC, 14));//sets the font used for the text in the progrem
        menuTabs.setBackground(Color.CYAN.darker());//sets the color of the background
        menuTabs.setForeground(Color.WHITE);// sets the color of the forground
        menuTabs.addTab("Intro", intro()); //Call Intro function
        menuTabs.addTab("Key Concepts", keyConcepts());// calls key concepts function
        menuTabs.addTab("Code Templates", codeTemplates());// calls code templates function
        menuTabs.addTab("Troubleshooting", troubleshooting()); //Calls troubleshooting function
        menuTabs.addTab("Advanced Applications", advancedApplications());// calls advanced applications function.
        menuTabs.addTab("Quiz", buttonPanel); //Add button panel for calling quiz function
        menuTabs.addTab("Hands-on Exercises", handsOn());// calls hands-on exercises function
        menuTabs.addTab("Resources", resources()); //Call resources funcion
        menu.add(menuTabs); //Add menuTabs to the JFrame
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//allows you to close the program with the click of a button
        menu.setSize(700,500); //Set window size
        menu.setResizable(false); //Do not allow resizing
        menu.setVisible(true); //Set visible
    }

    //Intro
    static JPanel intro(){
        //Declare objects
        JPanel tab = new JPanel();
        JLabel label1 = new JLabel();

        //Set label text
        label1.setText("<html> <body width='600'> This program is designed to provide users with basic knowledge of Enums and Arrays (also including ArrayList). This program will include key concepts, code templates, a troubleshooting guide, advanced applications, a quiz, and hands-on-exercises. By the end of this program, we expect users to have a basic understanding on ENUMS and Arrays (including ArrayList) and be able to utilize and apply this information when they are coding. <br> <br>"+
        "Emums can be best used when you need some prededefined constants, Arrays are best for when you need a sequence of elements that you don't want to change, and ArrayList can be useful when you might need a dynamically growing sequence of elements. </html>");
        
        //Add label to tab
        tab.add(label1);

        return tab;
    }

    //Key concepts
    static JTabbedPane keyConcepts(){
        //Declare objects
        JTabbedPane keyConc = new JTabbedPane();
        JPanel tab1 = new JPanel();
        JPanel tab2 = new JPanel();
        JLabel label1 = new JLabel();
        JLabel label2 = new JLabel();

        //set label texts
        label1.setText("<html> <body width='600'> An enum type is a special data class type that enables for a variable to be a set of predefined constants. Also, enums are implicitly final, which means they cannot be subclassed. Since extending is a form of subclassing, one enum cannot extend another enum. Enum constants in Java are implicitly declared a Final Static. <br> <br> To create an enum, use the enum keyword, and separate the constants with a comma. For example: <br> enum Level { LOW, MEDIUM, HIGH } <br> <br> And you can access enum constants with the DOT syntax: <br> Level myVar = Level.MEDIUM;, An enum cannot be used to extend another enum. To access all the values of enum use values() method </html>");
        label2.setText("<html> <body width='600'> An array is a data structure that can store a fixed-size sequence of elements (cannot be modified) of the same data type. To create an array you use [] after a type like String, int or even a class. For example: <br> String[] cars; <br> String[] cars = {BMW, Mercedes, Toyota, Honda}; <br> To access an array element refer to to the index number: <br> System.out.println(cars[0]); <br> outputs BMW <br> <br>"+
        "An Array List is used to store a dynamically sized collection of elements. Index starts at 0. The method that allows to copy one array into another is called System.arraycopy(). Elements can be modified (added and removed from an ArrayList. Before creating an ArrayList the ArrayList class should be imported. It will look like this: <br> import java.util.ArrayList; <br> ArrayList<String> cars = new ArrayList<String>(); <br> <br> To add elements to the ArrayList, use the 'add()' method. For example: <br> cars.add(\"Porsche\"); <br> cars.add(\"Lamborgini\");, you can also use the remove() method if you need to remove something specific from your arraylist as well. </html>"+
        "An interesting quirk of array indexes are that the starting number is 0 not 1. You can use .length if you need to find the size of an array.  You use clear when you need an Arraylist cleaned entirely. A String wrapper class can be held inside of an arraylist. In Java, length is a property of arrays, representing the size of the array, and it is not a method. On the other hand, length() is a method specifically used with strings to obtain their length</html>");
    
        //Add label to tabs
        tab1.add(label1);
        tab2.add(label2);
        
        //Add tabs to tabbedpane
        keyConc.add("Enum", tab1);
        keyConc.add("Array", tab2);

        return keyConc;
    }

    //Code templates
    static JTabbedPane codeTemplates(){
        //Declare objects
        JTabbedPane codeTemps = new JTabbedPane();
        JPanel tab1 = new JPanel();
        JPanel tab2 = new JPanel();
        JLabel label1 = new JLabel();
        JLabel label2 = new JLabel();

        // Examples
        //Set label text
        label1.setText("<html> <body width='600'> enum Days { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY } <br> Days today = Days.WEDNESDAY; <br> <br> public enum Level{ <br> &nbsp&nbsp&nbsp&nbsp&nbsp LOW(5), <br> &nbsp&nbsp&nbsp&nbsp&nbsp MEDIUM(10), <br> &nbsp&nbsp&nbsp&nbsp&nbsp HIGH(15); <br> <br> &nbsp&nbsp&nbsp&nbsp&nbsp public int value; <br> <br> &nbsp&nbsp&nbsp&nbsp&nbsp Level(int value){ <br> &nbsp&nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp&nbsp this.value = value; <br> &nbsp&nbsp&nbsp&nbsp&nbsp } <br> } </html>");
        label2.setText("<html> <body width='600'> int[] numbers = {0, 1, 2, 3, 4}; <br> int arrayLength = numbers.length;, int[][] integers ={ <br> &nbsp&nbsp&nbsp&nbsp&nbsp {1, 2, 3, 4, 5}, <br> &nbsp&nbsp&nbsp&nbsp&nbsp {6, 7, 8, 9}, <br> &nbsp&nbsp&nbsp&nbsp&nbsp {10, 11, 12, 13, 14, 15} }; <br> <br>"+
        "<html> <body width='600'> ArrayList<String> names = new ArrayList<>(); <br> names.add(\"Alice\"); <br> names.add(\"Bob\"); <br> names.add(\"Charlie\"); <br> names.remove(0); </html>");
        
        //adds labels to tab
        tab1.add(label1);
        tab2.add(label2);

        //gives names to the tabs
        codeTemps.add("Enum", tab1);
        codeTemps.add("Array", tab2);

        return codeTemps;
    }

    //Troubleshooting
    static JTabbedPane troubleshooting(){
        //Declare objects
        JTabbedPane troubleShoot = new JTabbedPane();
        JPanel tab1 = new JPanel();
        JPanel tab2 = new JPanel();
        JLabel label1 = new JLabel();
        JLabel label2 = new JLabel();

        //sets labels
        //Set label text
        label1.setText("<html> <body width='600'> Common errors with arrays: Declaring 1 as the first index in an array. When using an array, you start with 0 as your first index. <br> <br>"+
        "ArrayIndexOutOfBoundsException: This error appears when an array is accessed by a negative index or more than the size of the array. In order to avoid this error, check and make sure your bounds are within the size of the array. <br> <br>"+
        "ArrayStoreException: This occurs when when attempting to store the incorrect type of object into an array of objects. Example: Trying to store an Integer in an array of type String. You can avoid this by using the proper data type or casting the object to the correct type can help avoid the exception. </html>");
        label2.setText("<html> <body width='600'> Common errors with enums: Declaring enums as a class, when creating an enum you sohuld use the keyword 'enum' rather than using the keyword 'class' <br> <br>"+
        "Not declaring value for constructor before calling constructor: When using a constructor with an enum you must declare the constructed value before the constructor is defined or the vaules will not be initilaized properly. <br> <br>"+
        "Not calling the value of an enum constant: When trying to reference the actual value of an enum constant rather the constant name you must use the proper .value modifier. </html>");
        
        //adds labels to tabs
        //Add label to tab
        tab1.add(label1);
        tab2.add(label2);

        //gives names to the tabs
        //Add tabs to tabbedpane
        troubleShoot.add("Array", tab1);
        troubleShoot.add("Enum", tab2);

        return troubleShoot;
    }

    //Advanced applications
    static JTabbedPane advancedApplications(){
        //Declare objects
        JTabbedPane aaTab = new JTabbedPane();
        JPanel tab1 = new JPanel();
        JPanel tab2 = new JPanel();
        JLabel label1 = new JLabel();
        JLabel label2 = new JLabel();

        //Example of two dimensional arrays
        //Set label text
        label1.setText("<html> <body width='600'> One advanced application of arrays is to create multidimensional data structures. This can be done by placing array objects into an array, thereby creating an array of arrays. For example: <br> int[][] arrInt = <br> &nbsp&nbsp&nbsp&nbsp&nbsp {{1, 2, 3, 4, 5} <br> &nbsp&nbsp&nbsp&nbsp&nbsp {2, 4, 6, 8, 10} <br> &nbsp&nbsp&nbsp&nbsp&nbsp {3, 6, 9, 12, 15} <br> &nbsp&nbsp&nbsp&nbsp&nbsp {4, 8, 12, 16, 20} <br> &nbsp&nbsp&nbsp&nbsp&nbsp {5, 10, 15, 20, 25}}; <br> <br> Here we have intialized a 5 by 5 data structure that can be searched through using index positions. An example of this is: <br> int exampleNum = arrInt[1][2]; <br> System.out.print(exampleNum); <br> //Output example: output = 6 <br> <br> In this example we searched though our 2d data structure by index and assigned our variable equal to that index position. <br> NOTE: It is important to remember that the index for both arrays starts at 0 so in the example we accessed the second array and the third element in that array, thus resulting in our output of 6. An advantage of using an array over a list is the faster speeds the array gives you. </html>");
        label2.setText("<html> <body width='600'> One advanced application of enums is creating an enumlist by listing enum followed by your title, followed by curly brackets with your options inside. <br> <br> Another advanced application of enums is the implementation of a constructor to add specific values to the constants. An example of this is: <br> public enum Range{ <br> &nbsp&nbsp&nbsp&nbsp&nbsp Final LOW(1), <br> &nbsp&nbsp&nbsp&nbsp&nbsp Final MEDIUM(20), <br> &nbsp&nbsp&nbsp&nbsp&nbsp Final HIGH(50); <br> <br> &nbsp&nbsp&nbsp&nbsp&nbsp public int amount; <br> <br> &nbsp&nbsp&nbsp&nbsp&nbsp Range(int amount){ <br> &nbsp&nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp&nbsp this.amount = amount; <br> &nbsp&nbsp&nbsp&nbsp&nbsp } <br> } <br> <br> In this example we create an enum of three constants and then we intialized a value to use in our constructor. Once we create this variable we can write the code for our constructor the same way we would for a normal class. The reason a constructor is helpful when creating enums is that it gives us the ability to specify the amount for each constant rather than having predetermined values.</html>");

        //adds labels to tabs
        //Add label to tab
        tab1.add(label1);
        tab2.add(label2);

        //gives names to the tabs
        //Add tab to tabbedpane
        aaTab.add("Array", tab1);
        aaTab.add("Enum", tab2);

        return aaTab;
    }

    //Quiz
    public static void quiz(){
        //Declare variables
        String placeholder = "null";
        String answer;
        int wrong = 0, right = 0, numQuestions;
        File questionList = new File("questions.txt");
        File answerList = new File("answers.txt");
        Scanner qSC = new Scanner(placeholder);
        Scanner aSC = new Scanner(placeholder);
        ArrayList<String> questions = new ArrayList<>();
        ArrayList<String> answers = new ArrayList<>();
        ArrayList<Integer> index = new ArrayList<>();
        
        //Try/Catch blocks for opening the files that contain the questions and their answers
        try {
            qSC.close();
            qSC = new Scanner(questionList);
        } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        try {
            aSC.close();
            aSC = new Scanner(answerList);
        } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //Read files into arraylists for randomizing
        while(qSC.hasNextLine()){
            questions.add(qSC.nextLine());
        }

        while(aSC.hasNextLine()){
            answers.add(aSC.nextLine());
        }

        //Fill index list
        for(int i = 0; i < questions.size(); i++){
            index.add(i);
        }

        //Shuffle index
        Collections.shuffle(index);
        Collections.shuffle(index);

        //Ask how many questions the user would like to answer
        Object[] numOptions = {5, 10, 15, 20};
        numQuestions = (int)JOptionPane.showInputDialog(
                      null,
                      "Please enter how many questions you would like the quiz to be.",
                      "Choose quiz length",
                      JOptionPane.PLAIN_MESSAGE,
                      null,
                      numOptions,
                      5);

        //Print quiz start message
        JOptionPane.showMessageDialog(null, 
        "<html> This will be a quiz going over all of the material you have learned in the this section.<br> <center> Good luck! </html>");

        //Start quiz loop and present first question
        int i = 0;
        while(!((wrong+right) == numQuestions)){
            String[] currentQuestion = questions.get(index.get(i)).toString().split("['?]+");

            Object[] possibilities = {"A", "B", "C", "D"};
            answer = (String)JOptionPane.showInputDialog(
                    null,
                    "<html>"+(wrong+right+1)+": "+currentQuestion[0]+"<br>"+
                    "A) "+currentQuestion[1]+"<br>"+
                    "B) "+currentQuestion[2]+"<br>"+
                    "C) "+currentQuestion[3]+"<br>"+
                    "D) "+currentQuestion[4]+"</html>",
                    "Question #"+(wrong+right+1),
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    possibilities,
                    "A");

            //Check user answer and add to right/wrong tally
            if(answer == null){
                JOptionPane.showMessageDialog(null, "You have exited the quiz!");
                break;
            }
            
            else{
                if(answer.equals(answers.get(index.get(i)))){
                    right++;
                }
                else{
                    wrong++;
                }
            }

            i++;
        }

        //Print score and determine pass/fail
        JOptionPane.showMessageDialog(null, "You got "+right+"/"+numQuestions+" questions right.");
        if(right>=numQuestions-3){
            JOptionPane.showMessageDialog(null, "Congratulations you have passed the test! You have mastered this section!");
        }
        else{
            JOptionPane.showMessageDialog(null, "You have not mastered this section yet, go back through the section and study some more!");
        }

        //Close Scanners
        qSC.close();
        aSC.close();
    }

    //Hands-on exercise
    static JPanel handsOn(){
        JPanel tab = new JPanel();
        JLabel label1 = new JLabel();

        // Series of exercises
        //Set label text
        label1.setText("<html> <body width='600'> Exercise #1: Use enum to create a set full of the months of the year <br>"+
        "Exercise #2: Create an array that takes all even numbers up to 100 and print how many numbers there are <br>"+
        "Exercise #3: Create an arraylist of names that can be added onto via user input <br>"+
        "Exercise #4: Write a program where you create an ArrayList to represent a shopping list. Allow the user to add remove items from the list <br>"+
        "Exercise #5: Define an enum for the 4 seasons. Write a program that takes a month as input and outputs the corresponding month <br>"+
        "Exercise #6: Create an array of integers and then print out the max value in the array <br>"+
        "Exercise #7: Build a program to manage student grades. Use enum to represent letter grades (A, B, C, D, F) and ArrayList to store student names & grades <br>"+
        "Exercise #8: Create a calander to keep track of upcoming game releases. Use array list to keep track of titles and release dates. <br>"+
        "Exercise #9: Use enum to put holidays and birthdays into the months of the year. <br>"+
        "Exercise #10: Create an array of scores to aggregate reviews for a product. <br>"+
        "Exercise #11: Use an array list to keep track of people and their home addresses. <br>"+
        "Exercise #12: define five hotels in an enum and write a program that says how many people stayed in those hotels. </html>");
    
        //Add label to tab
        tab.add(label1);

        return tab;
    }

    //Resources
    static JPanel resources(){
        //Declare objects
        JPanel tab = new JPanel();
        JLabel label1 = new JLabel();
        JLabel label2 = new JLabel();
        JLabel label3 = new JLabel();
        JLabel label4 = new JLabel();
        JLabel label5 = new JLabel();
        JLabel label6 = new JLabel();
        JLabel label7 = new JLabel();
        JLabel label8 = new JLabel();
        JLabel label9 = new JLabel();
        JLabel label10 = new JLabel();
        JLabel label11 = new JLabel();
        JLabel label12 = new JLabel();
        JLabel label13 = new JLabel();

        //Create button objects with action listeners and call linkButton function on button press
        JButton button2 = new JButton("GO");
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { 
               linkButton("https://www.freecodecamp.org/news/how-to-create-an-array-in-java/#:~:text=In%20Java%2C%20an%20array%20is,a%20value%20from%20a%20method");
            }
        });
        JButton button3 = new JButton("GO");
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { 
                linkButton("https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html#:~:text=An%20enum%20type%20is%20a,the%20days%20of%20the%20week");
            }
        });
        JButton button4 = new JButton("GO");
        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { 
                linkButton("https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html");
            }
        });
        JButton button5 = new JButton("GO");
        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { 
                linkButton("https://www.javatpoint.com/java-arraylist");
            }
        });
        JButton button6 = new JButton("GO");
        button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { 
                linkButton("https://stackoverflow.com/questions/1419835/understanding-enums-in-java#:~:text=Enums%20in%20Java%205%2B%20are,they%20can%20enforce%20type%20safety");
            }
        });
        JButton button7 = new JButton("GO");
        button7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { 
                linkButton("https://www.youtube.com/watch?v=wq9SJb8VeyM");
            }
        });
        JButton button8 = new JButton("GO");
        button8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { 
                linkButton("https://www.youtube.com/watch?v=NbYgm0r7u6o");
            }
        });
        JButton button9 = new JButton("GO");
        button9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { 
                linkButton("https://stackoverflow.com/questions/38092621/is-there-a-particular-or-major-reason-why-i-should-choose-enum-over-array-for");
            }
        });
        JButton button10 = new JButton("GO");
        button10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { 
                linkButton("https://stackoverflow.com/questions/57062110/what-are-the-drawbacks-of-enums-in-java");
            }
        });
        JButton button11 = new JButton("GO");
        button11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { 
                linkButton("https://marcus-biel.com/java-arrays-enums/");
            }
        });
        JButton button12 = new JButton("GO");
        button12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { 
                linkButton("https://www.geeksforgeeks.org/array-vs-arraylist-in-java/");
            }
        });
        JButton button13 = new JButton("GO");
        button13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { 
                linkButton("https://www.freecodecamp.org/news/java-enum-enumeration-in-java-example/");
            }
        });

        //adds labels for the links
        label1.setText("<html> <body width='650'> <center> For more research and a deeper dive into the topics discussed in this section here are some resources! </html>");
        label2.setText("<html> <body width='500'> This covers how to create an array in java: </html>"); //https://www.freecodecamp.org/news/how-to-create-an-array-in-java/#:~:text=In%20Java%2C%20an%20array%20is,a%20value%20from%20a%20method
        label3.setText("<html> <body width='500'> This covers what enum is in java: </html>"); //https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html#:~:text=An%20enum%20type%20is%20a,the%20days%20of%20the%20week
        label4.setText("<html> <body width='500'> This covers what an array list is in java: </html>"); //https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
        label5.setText("<html> <body width='500'> Java Arraylist tutorial: </html>"); //https://www.javatpoint.com/java-arraylist
        label6.setText("<html> <body width='500'> Question about enums answered and explained: </html>"); //https://stackoverflow.com/questions/1419835/understanding-enums-in-java#:~:text=Enums%20in%20Java%205%2B%20are,they%20can%20enforce%20type%20safety
        label7.setText("<html> <body width='500'> Java enums explained in 6 minutes: </html>"); //https://www.youtube.com/watch?v=wq9SJb8VeyM
        label8.setText("<html> <body width='500'> Array vs Arraylist in java tutorial: </html>"); //https://www.youtube.com/watch?v=NbYgm0r7u6o
        label9.setText("<html> <body width='500'> Explanation of why to choose enum over array for short fixed list: </html>"); //https://stackoverflow.com/questions/38092621/is-there-a-particular-or-major-reason-why-i-should-choose-enum-over-array-for
        label10.setText( "<html> <body width='500'> Main drawbacks of enums in java: </html>"); //https://stackoverflow.com/questions/57062110/what-are-the-drawbacks-of-enums-in-java
        label11.setText( "<html> <body width='500'> Fundamental knowledge about Arrays: </html>"); //https://marcus-biel.com/java-arrays-enums/
        label12.setText( "<html> <body width='500'> Differences between in Array and ArrayList syntax: </html>"); //https://www.geeksforgeeks.org/array-vs-arraylist-in-java/
        label13.setText("<html> <body width='500'> The resource shows several examples on enums: </html>"); //https://www.freecodecamp.org/news/java-enum-enumeration-in-java-example/
        
        //adds the labels and buttons to the tabs
        tab.add(label1);
        tab.add(label2);
        tab.add(button2);
        tab.add(label3);
        tab.add(button3);
        tab.add(label4);
        tab.add(button4);
        tab.add(label5);
        tab.add(button5);
        tab.add(label6);
        tab.add(button6);
        tab.add(label7);
        tab.add(button7);
        tab.add(label8);
        tab.add(button8);
        tab.add(label9);
        tab.add(button9);
        tab.add(label10);
        tab.add(button10);
        tab.add(label11);
        tab.add(button11);
        tab.add(label12);
        tab.add(button12);
        tab.add(label13);
        tab.add(button13);

        return tab;
    }

    static void linkButton(String link){
        //Try/Catch block for querying desktop to launch URI link from default browser
        try {
            Desktop.getDesktop().browse(new URI(link));
        } catch (Exception e2) {
            e2.printStackTrace();
        };
    }
}
