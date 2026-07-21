package Types;

public class Args {
    String args;
    Args(String value) {
        this.args = value;
    }

    public static String toArgs(String[] prompt) {
        String[] p = prompt; //[comando, arg1, arg2]
        String arguments = "";
        for(int i = 0; i < p.length - 1; i++) {
            if(arguments != "") {
                arguments = arguments + " " + p[i + 1];
            }
            else {
                arguments = p[i + 1];
            }
        }
        
        return arguments;
    }

    public String[] toList() {
        String[] ArgsArray = {"j", "a"};
        System.out.println(args);
        args.split(" ");

        return ArgsArray;
    }
}