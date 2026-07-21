package Prompt.cmd;

public class Clear implements Cmd{
    @Override
    public void start(String args) {
        String[] a = args.split(" ");
        int lines = Integer.parseInt(a[0]);

        for(int line = 0; line < lines; line++) {
            System.out.print("\033[A\033[2K");
        }
    }
}
