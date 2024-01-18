package StringExercise;

public class String2 {
    public static void main(String[] args) {
        /*

         */
        System.out.println(
                "    _______\n" +
                "   /      /,\n" +
                "  /      //\n" +
                " /______//\n" +
                "(______(/\n"
                );
        System.out.println("/  \\.-\"\"\"-./  \\\n" +
                "\\    -   -    /\n" +
                " |   o   o   |\n" +
                " \\  .-'''-.  /\n" +
                "  '-\\__Y__/-'\n" +
                "     `---`  ");


        String s1 = "/  \\.-\"\"\"-./  \\\n" +
                "\\    -   -    /\n" +
                " |   o   o   |\n" +
                " \\  .-'''-.  /\n" +
                "  '-\\__Y__/-'\n" +
                "     `---`  ";
        String s2= "    _______\n" +
                "   /      /,\n" +
                "  /      //\n" +
                " /______//\n" +
                "(______(/ \n" +
                " ";

       String[] str = s1.split("\n");
       String[] str2 = s2.split("\n");
        for (int i=0;i<str.length;i++)
            System.out.println(str[i]+"\t"+str2[i]);
    }
}
