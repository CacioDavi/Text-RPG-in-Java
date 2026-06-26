package Prompt;

import java.lang.reflect.Method;

public class Prompt {

    public static void SendPrompt(String[] prompt) {
        String args = prompt.toString().replace(prompt[0], "");
        System.out.println(args);
        try{
            Class<?> teste = Class.forName("cmd." + prompt[0]);
            Method t = teste.getMethod("executar", String[].class);
            //t.invoke(t, prompt)
        } catch (Exception exception) {
            System.out.println("Comando não encontrado!");
            System.out.println("Error:\n" + exception +"\n \n");
        }
    }
}