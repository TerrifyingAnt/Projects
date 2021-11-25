
public class Main
{
    public static void main(String args[]) {
        Integer a = 2;
        MyArrayList<Integer> myArrayList = new MyArrayList<Integer>(a.getClass(), 5);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);
        myArrayList.add(1234);
        myArrayList.add(5, 2);
        myArrayList.add(111, 2);
        System.out.println(myArrayList.toString());
        myArrayList.clear();
        System.out.println(myArrayList.isEmpty());
        System.out.println(myArrayList.size());
    }

}
