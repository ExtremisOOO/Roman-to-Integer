public class Solution {
    public static int romanToInt(String s) {
        String inRoman = s;
        inRoman += inRoman.substring(inRoman.length() - 1);
        int arabicNumber = 0;
        
        for(int i=1;i<inRoman.length();i++)
        {
            int firstNumber = fromRomantoInteger(inRoman.charAt(i-1));
            int secondNumber = fromRomantoInteger(inRoman.charAt(i));
            if(firstNumber<secondNumber)
            {
                arabicNumber += (secondNumber-firstNumber);
                i++;
            }else{
                arabicNumber += firstNumber;
            }
        }
        return arabicNumber;
    }
    public static int fromRomantoInteger(char inRoman){

        char[] romainNumbers =  {'I','V','X','L','C','D','M'};
        int[]  arabicNumbers =  {1,5,10,50,100,500,1000};

        for(int i=0;i<romainNumbers.length;i++)
        {
            if(romainNumbers[i]==inRoman)
            {
                return arabicNumbers[i];
            }
        }
        return 0;
    }
}