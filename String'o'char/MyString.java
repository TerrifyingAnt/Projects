public class MyString {

    char[] mystring;

    MyString(String str)
    {
        mystring = str.toCharArray();
    }

    public MyString concat(MyString str)
    {
        char[] new_string = new char[mystring.length + str.mystring.length];
        for(int i = 0; i < mystring.length; i++)
            new_string[i] = mystring[i];
        for(int i = mystring.length, j = 0; i < mystring.length + str.mystring.length; i++, j++)
            new_string[i] = str.mystring[j];
        MyString newString = new MyString(String.valueOf(new_string));
        return newString;
    }

    public char charAt(int index)
    {
        if(index >= 0 && index < mystring.length)
            return mystring[index];
        else
            return '~';
    }

    public boolean equals(MyString str)
    {
        if(mystring == str.mystring)
            return true;
        else
            return false;
    }

    public MyString trim()
    {
        char[] new_string = new char[mystring.length - 1];
        for(int i = 0; i < mystring.length - 1; i++)
            new_string[i] = mystring[i];

        MyString newString = new MyString(String.valueOf(new_string));
        return newString;
    }

    public boolean empty()
    {
        if(mystring.length == 0)
            return true;
        else
            return false;
    }

    @Override
    public String toString()
    {
        String tmp = new String(String.valueOf(mystring));
        return tmp;
    }
}
