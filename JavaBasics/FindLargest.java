package com.sparta.golam;

public class FindLargest {

    public static int findMaximum(int numberOne, int numberTwo, int numberThree) {
        Integer[] myNums = {numberOne, numberTwo, numberThree};

        int counter = 0;
        int largestNum = myNums[0];

        while(counter < myNums.length) {
            if (myNums[counter] > largestNum) {
                largestNum = myNums[counter];
            }
            counter+= 1 ;
        }

        return largestNum;
    }
}
