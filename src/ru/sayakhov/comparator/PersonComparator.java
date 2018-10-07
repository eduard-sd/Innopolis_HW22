package ru.sayakhov.comparator;

import java.util.Comparator;
public class PersonComparator implements Comparator<PersonSecond> {
    public int compare(PersonSecond obj1, PersonSecond obj2)
    {
        String str1 = obj1.getName();
        String str2 = obj2.getName();

        return str1.compareTo(str2);
    }
}
