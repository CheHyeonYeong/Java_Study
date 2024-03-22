package E_java;

import obj.Dog;

import java.util.TreeSet;

import E_java.compare.DogComparator;

public class E09_ObjCompare {
    public static void main(String[] args) {
        Dog d1 = new Dog("진돗개", "뽀비", 15);
        Dog d2 = new Dog("말티즈", "삐삐", 5);
        Dog d3 = new Dog("진돗개", "뽀삐", 15);
        //Dog d3와 d1을 비교

        System.out.println(d1==d3);
        System.out.println(d1.equals(d3));
        System.out.println(d1);
        System.out.println(d3);

        //크기 비교
        TreeSet<Dog> treeTest = new TreeSet<>(new DogComparator());

        System.out.println(treeTest.add(d1));
        System.out.println(treeTest.add(d2));
        System.out.println(treeTest.add(d3));
        for(Dog dog : treeTest){
            System.out.println(dog);
        }
    }
}
