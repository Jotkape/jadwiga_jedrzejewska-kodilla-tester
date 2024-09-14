package com.kodilla.collections.adv.maps.homework;
/*
Klasę School, która będzie reprezentowała szkołę, a w niej pole (typu ArrayList),
które będzie przechowywało listę liczb uczniów w poszczególnych klasach.
 */
import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Integer> school = new ArrayList<>();

    public School(List<Integer> school) {
        this.school = school;
    }

    public School(int ... classes) {
        for (int school: classes) {
            this.school.add(school);
        }
    }

    public int getSum() {
        int sum = 0;
        for (int school : school)
            sum += school;
        return sum;
    }

    @Override
    public String toString() {
        return "School{" +
                "school=" + school +
                '}';
    }

}
