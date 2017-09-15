package me.iandavies.kata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SimpleInterpreterTest {
    @Test public void
    first_test() {
        assertThat(new SimpleInterpreter().interpret("+ 5 3"), equalTo("8"));
    }

    @Test public void
    second_test() {
        assertThat(new SimpleInterpreter().interpret("+ 9 1"), equalTo("10"));
    }

    @Test public void
    third_test() {
        assertThat(new SimpleInterpreter().interpret("+ 12 6"), equalTo("18"));
    }

    @Test public void
    fourth_test() {
        assertThat(new SimpleInterpreter().interpret("+ 1 2 3"), equalTo("6"));
    }
}