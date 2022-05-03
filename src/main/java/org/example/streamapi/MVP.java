package org.example.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class MVP {

    /*
        Convert a List<String> to an object stream and for each element -> System,out.println.
     */

    public void printNames(List<String> names) {
        // Implement me :)
        names.stream().forEach(System.out::println);
    }

    /*
        Given a List<Integers>, return a List<Integer> with even numbers.
     */
    public List<Integer> returnEvenNumbers(List<Integer> numbers) {
        // Implement me :)
        return numbers
                .stream()
                .filter(n -> n%2==0)
                .collect(Collectors.toList());
    }

    /*
        Given an int [], double the value of each int and return an int [].
    */
    public int[] doubleInts(int[] numbers) {
        // Implement me :)
        return Arrays.stream(numbers)
                .map(n -> n*2)
                .toArray();
    }

    /*
        Given a String, return a List<String>, all caps.
     */
    public List<String> splitToAllCapsList(String input) {
        // Implement me :)
        return Arrays.stream(input
                .split(""))
                .map(s -> s.toUpperCase(Locale.ROOT))
                .collect(Collectors.toList());
    }

    /*
    Given a list of animals:
     - filter the ones that start with a given letter
     - return sorted List<String>, all caps.
    */
    public List<String> filterByFirstLetterAndOrder(List<String> list, String letter) {
        // Implement me :)
        return list
                .stream()
                .filter(e -> e.substring(0,1).equalsIgnoreCase(letter))
                .map(e -> e.toUpperCase(Locale.ROOT))
                .sorted()
                .collect(Collectors.toList());

    }

    /*
        Given a list of words, return elements that:
         - are shorter than the given number and
         - start with a given letter.
    */
    public List<String> filterWords(List<String> words, int maxLength, String firstLetter) {
        // Implement me :)
        return words
                .stream()
                .filter(word -> word.length()< maxLength)
                .filter(word-> word.substring(0,1).equalsIgnoreCase(firstLetter))
                .collect(Collectors.toList());
    }
}