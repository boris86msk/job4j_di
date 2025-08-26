package ru.job4j.di.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.job4j.di.aop.config.Config;
import ru.job4j.di.aop.model.Comment;
import ru.job4j.di.aop.service.ProcessComment;

import java.io.*;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {

        LocalDateTime time = LocalDateTime.now();
        System.out.println(time);

        //time.atZone(ZoneId.of("UTC"));
        //time.plus(1, ChronoUnit.WEEKS);
        time.withHour(0);
        System.out.println(time);
        String t = "dd";
    }

}
