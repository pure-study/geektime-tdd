package net.will;

import org.junit.jupiter.api.Test;

public class ArgsTest {
    // -l -p 8080 -d /usr/logs

    @Test
    public void should() {
//        assertTrue( true );
    }

    // -g this is a list -d 1 2 -3 5


    static record Options(@Option("l") boolean logging, @Option("p") int port, @Option("d") String directory) {
    }

    static record ListOptions(@Option("g") String[] group, @Option("d") int[] decimals) {
    }
}
