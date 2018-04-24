package io.github.cdimascio.examples.dotenv;

import io.github.cdimascio.dotenv.Dotenv;

public class Main {

    public static void main(String[] args) {
        Dotenv dotenv = Dotenv.configure().load();
        System.out.println(dotenv.get("MY_ENV"));
    }
}
