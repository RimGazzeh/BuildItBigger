package io.geekgirl.android.lib;

import java.util.Random;

public class JokesBank {

    public String getJoke() {
        String jokes[] = {
                "Unix is user friendly. It's just selective about who its friends are.",
                "If at first you don't succeed, call it version 1.0",
                "Programmer: A machine that turns coffee into codes.",
                "Q. How did the programmer die in the shower?\n" +
                        "\n" +
                        "A. He read the shampoo bottle instructions: Lather. Rinse. Repeat.",
                "One hundred little bugs in the code\n" +
                        "\n" +
                        "One hundred little bugs.\n" +
                        "\n" +
                        "Fix a bug, link the fix in,\n" +
                        "\n" +
                        "One hundred little bugs in the code."
        };

        return jokes[new Random().nextInt(jokes.length)];
    }

}
