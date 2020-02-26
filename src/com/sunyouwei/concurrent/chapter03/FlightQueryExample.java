package com.sunyouwei.concurrent.chapter03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlightQueryExample {
    private static List<String> fightCompany = Arrays.asList("CSA", "CEA", "HNA");

    public static void main(String[] args) {
        List<String> results = search("SH", "BJ");
        System.out.println("==================result=================");
        results.forEach(System.out::println);
    }

    private static List<String> search(String original, String dest) {

        final List<String> result = new ArrayList<>();
        List<FlightQueryTask> tasks = fightCompany.stream()
                .map(f -> createSearchTask(f, original, dest))
                .collect(Collectors.toList());

        tasks.forEach(Thread::start);

        tasks.forEach(t -> {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        tasks.stream().map(FlightQuery::get).forEach(result::addAll);

        return result;
    }

    private static FlightQueryTask createSearchTask(String flight, String original, String dest) {
        return new FlightQueryTask(flight, original, dest);
    }
}
