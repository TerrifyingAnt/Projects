public class Main {
    public static void main(String[] args){

        MyString str1 = new MyString("Test1abc");
        MyString str2 = new MyString("Test2xyz");

        System.out.println(str1.toString());
        System.out.println(str2.toString());

        System.out.println(str1.charAt(3));
        System.out.println(str1.charAt(5));

        str1 = str1.concat(str2);
        System.out.println(str1);

        System.out.println(str1.trim().trim().trim());

        System.out.println(str1.equals(str2));

        System.out.println(str2.empty());
        str2 = str2.trim().trim().trim().trim().trim().trim().trim().trim();
        System.out.println(str2.empty());

        System.out.println(str2.compareTo(str1));
        System.out.println(str1.substring(1, 3));
        System.out.println(str2.length());
    }
}
