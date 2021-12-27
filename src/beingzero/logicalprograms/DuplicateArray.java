package logicalprograms;

public class DuplicateArray {
    public static void main(String args[]){

        String input = "praneetha";

        char[] inputChar1= input.toCharArray();

        int[] count1 = new int[256];

         int[] output =  duplicates(inputChar1,count1 );

        for(int i = 0; i< output.length ; i++){
            if(output[i] != 0)
                System.out.println((char)(i)+" count is "+output[i]);
        }

        System.out.println("-------------------------------------------");

        for(char ch: inputChar1){
            System.out.println(ch+" count is "+output[ch]);
        }


        int max= 0;

        System.out.println("-------------------------------------------");

        for (int i=  count1.length-1;  i>= 0; i--){

            if(count1[i] > max){

                max = count1[i];

                System.out.println(" word is "+ (char)i);

            }
        }

        System.out.println("max value is "+max);
    }


        static int[] duplicates(char[] inputChar, int[] count){



            for(int i=0; i < inputChar.length; i++ ){

                int characterInteger =  inputChar[i];

                if(count[characterInteger] == 0){

                    count[characterInteger] = 1;
                }else {

                    count[characterInteger] = count[characterInteger] +1;
                }


            }

            return count;




    }




}









