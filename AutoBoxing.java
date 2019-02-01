package Autoboxing;

import java.util.ArrayList;

class IntClass{
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {

    public static void main(String[] args) {
        //ArrayList<int> intArrayList = new ArrayList<int>(); won't work as int is a primative type
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));

//        Integer integer = new Integer(69);
//        Double doubleValue = new Double(19.4);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();

        for(int i=0; i < 11; i++){
            intArrayList.add(Integer.valueOf(i));//Autoboxing
        }

        for(int i=0; i < 11; i++){
            System.out.println(i + " --> " + intArrayList.get(i).intValue());
        }

        //There's another short way

        Integer myIntvalue = 56;//This works

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for(double dbl = 0.0; dbl <= 10.0;dbl+=0.5){
            myDoubleValues.add(dbl); //Autoboxing
        }

        for(int i = 0;i < myDoubleValues.size();i++){
            double value = myDoubleValues.get(i);//Unboxing
            System.out.println(i + " --> " + value);
        }



    }
}
