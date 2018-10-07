package ru.sayakhov.comparator;

import java.util.Comparator;

public class PersonComparatorAge implements Comparator<PersonSecond> {
        public int compare(PersonSecond obj1, PersonSecond obj2)
        {
            float price1 = obj1.getAge();
            float price2 = obj2.getAge();

            if (price1 > price2) {
                return 1;
            } else if (price1 < price2) {
                return -1;
            } else {
                return 0;
            }
        }
}
