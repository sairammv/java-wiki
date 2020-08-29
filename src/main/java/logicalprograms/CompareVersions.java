package main.java.logicalprograms;

public class CompareVersions {
    public static void main(String args[]){

        int output = versionCompare("1.2.3.4","1.1.1.5.6");

        System.out.print("output is "+output);

    }


    static int versionCompare(String v1,String v2){

        String [] input1 = v1.split("\\.");
        String[] input2 = v2.split("\\.");


         for(int i = 0 ; i < input1.length;i++){

             if( i < input2.length){

                 if(Integer.parseInt(input1[i]) > Integer.parseInt(input2[i])){
                     return 1;
                     }
                 else if(Integer.parseInt(input1[i]) < Integer.parseInt(input2[i])) {
                     return -1;
                 }else
                     i++;
             }
         }

        return 0;
    }
}
