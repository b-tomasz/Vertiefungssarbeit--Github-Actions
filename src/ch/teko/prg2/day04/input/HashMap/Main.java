package ch.teko.prg2.day04.input.HashMap;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // HashMap erstellen
        HashMap<Integer, Student> studentHashMap = new HashMap<>();

        // Schlüsselwert-Paare hinzufügen
        studentHashMap.put(0123, new Student("Meier", "Hans"));
        studentHashMap.put(0124, new Student("Tobler", "Peter"));
        studentHashMap.put(0125, new Student("Hans", "Fritz"));

        // Schleife über alle Keys
        Set<Integer> keySet = studentHashMap.keySet();
        for (Integer i: keySet) {
            System.out.println(i);
        }

        // Schleife über alle Values
        Collection<Student> values = studentHashMap.values();
        for (Student s: values) {
            System.out.println(s.getForename());
        }

        // Schleife über das Map.Entry Objekt
        Set<Map.Entry<Integer, Student>> entrySet = studentHashMap.entrySet();
        for (Map.Entry<Integer, Student> e: entrySet) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        // Key-value pair entfernen über den key
        studentHashMap.remove(0123);
    }
}
