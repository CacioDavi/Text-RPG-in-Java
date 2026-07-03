package Types;

import java.util.Arrays;

public class Args {
    String args;
    Args(String value) {
        this.args = value;
    }

    public String toArgs(String[] prompt) {
        String[] p = prompt;

        for(int i = 0; i < p.length; i++) {
            p[i] = p[i + 1];
        }

        return Arrays.toString(p);
    }

    public String[] toList() {
        String[] ArgsArray = {"j", "a"};
        System.out.println(args);
        args.split(" ");

        return ArgsArray;
    }
}