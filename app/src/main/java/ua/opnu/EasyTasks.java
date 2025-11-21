package ua.opnu;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class EasyTasks {

    public static void main(String[] args) {
        // Для виконання лабораторної роботи необхідно написати вміст методів згідно з умовами завдання,
        // після чого протестувати метод за допомогою тестів, які знаходяться в папці
        // src\test\TaskTest.java
    }


    public List<Integer> doubling(List<Integer> nums) {
        if (nums == null) return Collections.emptyList();
        return nums.stream()
                .map(i -> i * 2)
                .collect(Collectors.toList());
    }

    public List<Integer> square(List<Integer> nums) {
        if (nums == null) return Collections.emptyList();
        return nums.stream()
                .map(i -> i * i)
                .collect(Collectors.toList());
    }

    public List<String> moreY(List<String> strings) {
        if (strings == null) return Collections.emptyList();
        return strings.stream()
                .map(s -> "y" + s + "y")
                .collect(Collectors.toList());
    }

    public List<Integer> noNeg(List<Integer> nums) {
        if (nums == null) return Collections.emptyList();
        return nums.stream()
                .filter(i -> i >= 0)
                .collect(Collectors.toList());
    }

    public List<Integer> no9(List<Integer> nums) {
        if (nums == null) return Collections.emptyList();
        return nums.stream()
                .filter(i -> Math.abs(i) % 10 != 9)
                .collect(Collectors.toList());
    }

    public List<String> noZ(List<String> strings) {
        if (strings == null) return Collections.emptyList();
        return strings.stream()
                .filter(s -> !s.contains("z"))
                .collect(Collectors.toList());
    }

    public List<String> refinedStrings(List<String> strings) {
        if (strings == null) return Collections.emptyList();
        return strings.stream()
                .distinct()
                .sorted((a, b) -> Integer.compare(b.length(), a.length()))
                .collect(Collectors.toList());
    }

    public List<String> flatten(List<String> strings) {
        if (strings == null) return Collections.emptyList();
        return strings.stream()
                .flatMap(s -> Arrays.stream(s.split(" ")))
                .collect(Collectors.toList());
    }

}
