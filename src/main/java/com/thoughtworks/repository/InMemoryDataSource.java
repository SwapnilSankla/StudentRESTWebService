package com.thoughtworks.repository;

import com.thoughtworks.business.object.Student;
import java.util.HashMap;
import java.util.Map;

public class InMemoryDataSource implements DataSource {

    private Map<Integer,Student> students = new HashMap<Integer,Student>();

    @Override
    public void add(Student studentObj) {
        students.put(studentObj.getID(), studentObj);
    }

    @Override
    public Student getStudentByID(int i) {
        return students.get(i);
    }
}