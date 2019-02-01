package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        LinkedList<String> locations = new LinkedList<>();
        addInOrder(locations,"C");
        addInOrder(locations,"A");
        addInOrder(locations,"F");
        addInOrder(locations,"S");
        addInOrder(locations,"P");
        addInOrder(locations,"O");
        addInOrder(locations,"L");
        printList(locations);

        visit(locations);
    }

    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()){
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("=====================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String city){
        ListIterator<String>stringListIterator = linkedList.listIterator();

        while(stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(city);
            if(comparison == 0){

                //equal, do not add
                System.out.println(city + " is already an included destination");
                return false;

            }else if(comparison > 0){
                // new City, should appear before this one
                stringListIterator.previous();
                stringListIterator.add(city);
                return true;

            }else if(comparison < 0){
                //nothing needs to be added, move on

            }
        }
        stringListIterator.add(city);
        return true;
    }

    private static void visit (LinkedList cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty()){
            System.out.println("No cities in the list");
        }else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }
        while (!quit){
            int action = scanner.nextInt();
            switch (action){

                case 0:
                    System.out.println("Days are over, quitting");
                    quit = true;
                    break;

                case 1:
                    if(!goingForward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now visiting " + listIterator.next());
                    }else{
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;

                case 2:
                    if(goingForward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now visiting " + listIterator.previous());
                    }else {
                        System.out.println("We are at the start of the list.");
                        goingForward = true;
                    }
                    break;

                case 3:
                    printMenu();
                    break;
            }
        }

    }

    private static void printMenu(){
        System.out.println("Available actions :\npress ");
        System.out.println("0 to quit\n1 go to next entry\n2 go to previous entry\n3 print options");
    }












}
