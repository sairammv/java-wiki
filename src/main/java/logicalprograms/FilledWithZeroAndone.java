package main.java.logicalprograms;

public class FilledWithZeroAndone {

    public static void main(String args[]){

        int[] input = {1,0,0,1,0,1,0};

        int count0 = 0;

        for(int i=0 ; i < input.length; i++){
            System.out.print(input[i]+" ");
        }

        System.out.println("\n");

        for (int i=0; i< input.length; i++){
            if(input[i] == 0){
                count0++;
            }
        }


        for (int i =0 ; i < count0;i++){
            input[i] = 0;
        }

        while (count0 < input.length)
        {
            input[count0] = 1;
            count0++;
        }

        for(int i=0 ; i < input.length; i++){
            System.out.print(input[i]+" ");
        }


    }
}
