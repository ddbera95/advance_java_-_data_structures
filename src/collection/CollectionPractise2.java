package collection;

import java.util.*;

public class CollectionPractise2 {


    public static void main(String[] args) {





        TreeSet<Student> t = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o, Object t1) {
                return ((Student)o).id > ((Student)t1).id ? -1 : ((Student)o).id < ((Student)t1).id ? 1 : 0;
            }
        });

        t.add(new Student(1 , "dhaval"));
        t.add(new Student(2 , "mihir"));


        t.remove(new Student(2 , "mihir"));

      //  System.out.println(t.remove(new Student(1 , "")));




        HashMap<Student , Student> hashMap = new HashMap();

        Student s1 = new Student(1 , "dhaval");

        Student s2 = new Student(2,"mihir");

        hashMap.put(s1 , null);

        System.out.println(s1.hashCode());

        hashMap.put(s2 , null);

        System.out.println(s2.hashCode());

        System.out.println(hashMap.size());

        Student s3 = new Student(1 , "dhaval");



        System.out.println(s3.hashCode());

        System.out.println(hashMap.containsKey(new Student(2 , "mihir")));

       // System.out.println(hashMap.remove(new Student(1 , "")));

        System.out.println(hashMap.size());

        hashMap.put(new Student(4 , "lgsg") , null);

        hashMap.put(new Student(99 , "hello"), null);

        hashMap.put(new Student(34 , "jshlkshj") , null);

        hashMap.put(new Student(23 , "sglkfg") , null);


        

        TreeMap<Student , Student> treeMap = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student student, Student t1) {

                return student.id  > t1.id ? 1 : student.id < t1.id ? -1 : 0;
            }
        });

        treeMap.putAll(hashMap);

        for(Map.Entry s : treeMap.entrySet())
        {
            System.out.println(((Student)s.getKey()).id + " " + ((Student)s.getKey()).name );
        }

    }
}


class Student
{
    int id;

    String name;

    Student(int id , String name)
    {
        this.id = id;

        this.name = name;
    }

    public  int hashCode()
    {

        return this.id;
    }

    public boolean equals(Object o)
    {

        return this.id == ((Student)o).id;
    }

}

