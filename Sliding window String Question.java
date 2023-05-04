// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static String charRemove(String str, int p , int q) {  
              return str.substring(p + 1, q + 1);  
           }  
           
    public static void main(String[] args) {
        String s = "abbabbabbabbababa";
        String pattern = "abb";
        String temp = "";
        int wstart = 0 ;
        int wend = 0;
        int count = 0;
        int key = pattern.length();
        int size = s.length();
        while (wend < size)
        {
            temp  = temp +  s.charAt(wend);
            if(wend - wstart + 1 == key)
            {
                if(pattern.equals(temp))
                count++;
                temp = charRemove(s , wstart , wend);
                wstart++;
            }
            wend++;
        }
        System.out.println(count);
    }
}

OUTPUT
java -cp /tmp/uWvNFmaLEV HelloWorld
4
