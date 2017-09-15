package me.iandavies.kata;

public class SimpleInterpreter implements Interpreter {
    @Override
    public String interpret(String... lines) {
        final String line = lines[0];
        final String[] tokens = line.split(" ");
        int sum = 0;

        for(int i = 1; i < tokens.length; i++) {
            sum += Integer.parseInt(tokens[i]);
        }

        return "" + sum;
    }
}
