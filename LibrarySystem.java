package JavaProgram_no_4_12_7_2021;

import java.util.*;

public class LibrarySystem {
    private Books books;
    private HashMap<String, String> listOfissueBooks = new HashMap<>();
    Student studentObj;

    public void registerStudent() {
        studentObj = new Student();

    }

    public void displayListOfIssueBooks() {
        if (!(this.listOfissueBooks.isEmpty())) {
            System.out.println("The list of issued books are : ");
            for (Map.Entry<String, String> set : this.listOfissueBooks.entrySet()) {
                System.out.println(set.getKey() + " Book is issued to ---> " + set.getValue());
            }
        } else {
            System.out.println("No book is issued ....... ");
        }

    }

    public boolean bookeIssued(String name, String bookName) {


        for (Map.Entry<String, String> set : this.listOfissueBooks.entrySet()) {
            if (set.getValue().equals(name) && set.getKey().equals(bookName)) {
                return true;
            }
        }
        return false;
    }

    public void returnBooks() {
        String bookName, name;
        if (!(Objects.isNull(studentObj))) {

            Scanner scan = new Scanner(System.in);
            System.out.print("Enter your name : ");
            name = scan.nextLine();
            System.out.print("Enter the name of the book you want to return : ");
            bookName = scan.nextLine();

            if (bookeIssued(name, bookName)) {
                for (Map.Entry<String, String> set : listOfissueBooks.entrySet()) {

                    if (bookName.equals(set.getKey())) {
                        listOfissueBooks.remove(bookName);

                    }
                }


                int count = 0;
                for (Map.Entry<String, Integer> set : books.availableBooks().entrySet()) {
                    if (bookName.equals(set.getKey())) {
                        count = set.getValue();
                        count++;
                        books.availableBooks().put(set.getKey(), count);
                    }

                }
                System.out.println(name + " returned the book of : " + bookName + " successfully ");
            } else {
                System.out.println(name + " don't issue the book : " + bookName);
            }

        } else {
            System.out.println("To return a book you must need to register ...... ");
        }


    }

    public void callShowRegisteredStudentsMethod() {
        if (Objects.isNull(studentObj)) {
            System.out.println("No student is registered yet .......... ");
        } else {
            studentObj.showRegisteredStudents();
        }
    }

    private boolean isRegistered(String studentName) {
        for (Map.Entry<Integer, String> set : studentObj.getRegisteredStudents().entrySet()) {
            if (set.getValue().equals(studentName)) {
                return true;
            }
        }
        return false;
    }

    public void issueBook() {

        Scanner scan = new Scanner(System.in);
        String bookName = null, studentName = null;
        boolean isIssued=false;

        if (!(Objects.isNull(studentObj))) {
            System.out.print("Enter the name of the student who want the book : ");
            studentName = scan.nextLine();
            System.out.print("Enter the name of the book you want to issue : ");
            bookName = scan.nextLine();
            if (isRegistered(studentName)) {

                for (Map.Entry<String, Integer> set : books.availableBooks().entrySet()) {
                    if (bookName.equals(set.getKey())) {
                        int count = set.getValue();
                        if (count > 0) {
                        // String name = studentObj.getName();

                            listOfissueBooks.put(set.getKey(), studentName);
                            count--;
                            books.availableBooks().put(set.getKey(), count);
                            isIssued=true;

                        } else {
                            System.out.println("\n" + bookName + " Book is not available \n");
                        }
                    }

                }
            } else {
                System.out.println("The student : " + studentName + " is not registered ...... ");
            }


        } else {
            System.out.println("You can not issue any book because you are not registered yet ....... ");
        }
        if(isIssued)
        {
            System.out.println("The book : "+bookName+" is successfully issued to : ---- "+studentName);
        }
    }


    public void libraryFunctions() // this will perform all the function on the library
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 1 if you are already registered and 2 if you are a new student : ");
        int isRegistered = scan.nextInt();
        if (!(isRegistered == 1)) {
            registerStudent();
            int choice;
            do {

                System.out.println("\nEnter 1 to show the total books .... ");
                System.out.println("Enter 2 to issue a book .... ");
                System.out.println("Enter 3 to show the list of issued books ");
                System.out.println("Enter 4 to show to registered students .... ");
                System.out.println("Enter 5 to register a student ");
                System.out.println("Enter 6 to show the remaining books .... ");
                System.out.println("Enter 7 to return  a book .... ");
                System.out.println("Enter 8 to exit .... ");
                choice = scan.nextInt();
                switch (choice) {
                    case 1:
                        books.showTotalBooks();
                        break;


                    case 2:
                        issueBook();
                        break;

                    case 3:
                        this.displayListOfIssueBooks();
                        break;

                    case 4:
                        callShowRegisteredStudentsMethod();
                        break;

                    case 5:
                        registerStudent();
                        break;

                    case 6:
                        books.showRemainingBooks();
                        break;

                    case 7:
                        returnBooks();
                        break;

                    case 8:
                        System.out.println("Exiting the program ....... ");
                        break;


                    default:
                        System.out.println("You choice is incorrect please select between ( 1 - 8 )  ");

                }
            } while (choice != 8);


        } else {
            int choice;
            do {

                System.out.println("\nEnter 1 to show the available books .... ");
                System.out.println("Enter 2 to issue a book .... ");
                System.out.println("Enter 3 to show the list of issued books ");
                System.out.println("Enter 4 to show to registered students .... ");
                System.out.println("Enter 5 to register a student ");
                System.out.println("Enter 6 to show the remaining books .... ");
                System.out.println("Enter 7 to return  a book .... ");
                System.out.println("Enter 8 to exit .... ");
                System.out.println();


                choice = scan.nextInt();
                switch (choice) {
                    case 1:
                        books.showTotalBooks();
                        break;

                    case 2:
                        issueBook();
                        break;

                    case 3:
                        this.displayListOfIssueBooks();
                        break;

                    case 4:

                        callShowRegisteredStudentsMethod();
                        break;

                    case 5:
                        registerStudent();
                        break;

                    case 6:
                        books.showRemainingBooks();
                        break;

                    case 7:
                        returnBooks();
                        break;


                    case 8:
                        System.out.println("Exiting the program ....... ");
                        break;


                    default:
                        System.out.println("You choice is incorrect please select between ( 1 - 8 )  ");

                }
            } while (choice != 8);

        }
    }

    public LibrarySystem() {
        this.books = new Books();

    }

    public void enterBooks() {
        this.books.addBooks();
    }

    public void displaybooks() {
        this.books.showTotalBooks();
    }

    public static void main(String[] args) {
        LibrarySystem obj = new LibrarySystem();
        obj.enterBooks();
        obj.libraryFunctions();


    }
}
