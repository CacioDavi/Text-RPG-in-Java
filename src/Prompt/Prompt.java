package Prompt;
import java.lang.reflect.Method;

public class Prompt {

    public static void SendPrompt(String[] prompt) {
        try{
            Class<?> CmdClass = Class.forName("Prompt.cmd." + prompt[0]);
            Method CmdExecution = CmdClass.getMethod("start");
            Object CmdObjInstance = CmdClass.getDeclaredConstructor().newInstance();
            CmdExecution.invoke(CmdObjInstance);
        } catch (Exception exception) {
            System.out.println("Comando não encontrado!");
            System.out.println("Error:\n" + exception +"\n \n");
        }
    }
}