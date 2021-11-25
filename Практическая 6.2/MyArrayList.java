import javax.lang.model.type.NullType;
import java.lang.reflect.Array;

public class MyArrayList<E>
{

    private int count;
    private E[] myArrayList;

    // конструктор
    public MyArrayList(Class type, int size)
    {
        count = 0;
        myArrayList = (E[]) Array.newInstance(type, size);
    }

    // метод расширения
    private void expand(Class type,  int size)
    {
        E[] newMyArrayList = (E[]) Array.newInstance(type, size);
        for(int i = 0; i < size(); i++)
            newMyArrayList[i] = myArrayList[i];
        this.myArrayList = (E[]) Array.newInstance(type, size);
        for(int i = 0; i < size(); i++)
            myArrayList[i] = newMyArrayList[i];
    }



    // метод добавления элемента в конец списка
    public void add(E item)
    {
        if(count == myArrayList.length)
        {
            expand(myArrayList.getClass(), myArrayList.length + 1);
        }
            myArrayList[count] = item;
            count = count + 1;

    }

    // метод добавления элемента в середину списка, со смещением всех оставшихся вправо
    public void add(E item, int index)
    {
        if(count == myArrayList.length - 1)
        {
            expand(item.getClass(), myArrayList.length + 1);
        }
        for(int i = count + 1; i > index; i--)
        {
            myArrayList[i] = myArrayList[i - 1];
        }
        myArrayList[index] = item;
        count = count + 1;

    }

    // метод удаления всех элементов
    public void clear()
    {
        for(int i = 0; i < count; i++)
        {
            myArrayList[i] = null;
        }
        count = 0;
    }

    // метод проверяет, является список пустым или нет
    public boolean isEmpty()
    {
        if(count == 0)
            return true;
        else
            return false;
    }

    // метод возвращает число заполненных элементов
    public int size()
    {
        return count;
    }

    // метод возвращает все элементы через запятую в виде строки
    public String toString()
    {
        String answ = "";

            for (int i = 0; i < count; i++) {
                if(answ == "")
                    answ = "There are these elements in list: " + myArrayList[i];
                else
                answ = answ + ", " + myArrayList[i];
            }
        return answ;
    }
}
