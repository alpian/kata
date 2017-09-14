package me.iandavies.kata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SimpleInterpreterTest {
    @Test public void
    first_test() {
        assertThat(new SimpleInterpreter().interpret("+ 3 5"), equalTo("8"));
    }
}