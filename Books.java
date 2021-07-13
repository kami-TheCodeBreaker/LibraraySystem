package JavaProgram_no_4_12_7_2021;

import java.util.*;


public class Books {

    private static boolean showTotalBooks = false;
    private HashMap<String, Integer> bookcount = new HashMap<>();
    private HashMap<String, Integer> totalBookCount = new HashMap<>();

    public HashMap<String, Integer> availableBooks() {
        return bookcount;
    }

    private HashMap<Integer, String> bookNameAndSbn = new HashMap<>();

    public void setBooks(int sbnNumber, String bookName) {
        this.bookNameAndSbn.put(sbnNumber, bookName);

    }


    public void showTotalBooks() {

        //this.calculateCountOfAvailableBooks();

        System.out.println("The total number of books  in the library is  : ");
        for (Map.Entry<String, Integer> set : totalBookCount.entrySet()) {
            System.out.println("Number of books available : " + set.getValue() + " ---> " + set.getKey());

        }
        Books.showTotalBooks = true;
    }

    public void showRemainingBooks() {
        System.out.println("The books available in the library is  : ");

//      if(true)
//            {

        HashMap<String, Integer> availableBooks2 = this.availableBooks();

        for (Map.Entry<String, Integer> set : availableBooks2.entrySet()) {
            System.out.println("Number of books available : " + set.getValue() + " ---> " + set.getKey());

        }

//        }
//        else
//        {
//            calculateCountOfAvailableBooks();
//            HashMap<String, Integer> availableBooks2 = this.availableBooks();
//
//            for (Map.Entry<String, Integer> set : availableBooks2.entrySet()) {
//                System.out.println("Number of books available : " + set.getValue() + " ---> " + set.getKey());
//
//            }
//        }
    }

    public void calculateCountOfAvailableBooks() {
        LinkedList<String> bookName = new LinkedList<>();

        for (Map.Entry<Integer, String> set : bookNameAndSbn.entrySet()) {
            bookName.add(set.getValue());
        }


        for (int i = 0; i < bookName.size(); i++) {
            int count = 1;

            for (int j = 0; j < bookName.size(); j++) {
                if (bookName.get(i).equals(bookName.get(j))) {

                    bookcount.put(bookName.get(i), count);
                    totalBookCount.put(bookName.get(i), count);
                    count++;

                }

            }
        }


    }

    public void addBooks() {
        Books books = new Books();
        int sbn = 0, choice = 0;
        String bookName = null;

//        do {
//            Scanner scan = new Scanner(System.in);
//            System.out.println("Enter 1  to add books and 2 to exit ...");
//            choice = scan.nextInt();
//
//            switch (choice) {
//                case 1:
//                    try {
        List<Integer> sbnNumbers = List.of(12, 3, 4, 6, 7);
        List<String> booksname = List.of("java", "c++", "c++", "web", "php");
        for (int i = 0; i < sbnNumbers.size(); i++) {

            bookNameAndSbn.put(sbnNumbers.get(i), booksname.get(i));
        }
        this.calculateCountOfAvailableBooks();

        // the below code is commented because i want the static input from the abov lists
//
//                        System.out.print("Enter sbn number of the book : ");
//                        sbn = scan.nextInt();
//
//
//                        System.out.print("Enter name of the book with sbn number : " + sbn + ": ");
//                        scan.nextLine();
//                        bookName = scan.nextLine();
//                        System.out.println("Book : "+bookName+" is successfully inserted ... ");
//                        System.out.println();
//                        bookNameAndSbn.put(sbn, bookName);

//                    } catch (InputMismatchException e) {
//                        System.out.println("The sbn number must be integer ........ \n");
//                    }
//
//                    break;
//
//                case 2:
//                    break;
//
//                default:
//                    System.out.println("Incorrect choice select between (1-2) ");
//                    break;
//            }
//
//        } while (choice != 2);


    }



}
