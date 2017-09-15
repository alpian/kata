package me.iandavies.kata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SimpleInterpreterTest {
    @Test
    public void
    first_test() {
        addition_test("+ 5 3", "8");
    }

    @Test
    public void
    second_test() {
        addition_test("+ 9 1", "10");
    }

    @Test
    public void
    third_test() {
        addition_test("+ 12 6", "18");
    }

    @Test
    public void
    fourth_test() {
        addition_test("+ 1 2 3", "6");
    }

    @Test
    public void
    fifth_test() {
        addition_test("+ 1 2 3 4", "10");
    }

    private void
    addition_test(final String input, final String output) {
        assertThat(new SimpleInterpreter().interpret(input), equalTo(output));
    }
}