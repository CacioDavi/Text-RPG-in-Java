import java.io.IOException;

public class GameIntro {
    public static void main() throws IOException {
        
        System.out.println("Welcome to Realmgate");
        System.out.println("A Text RPG with many possibilities."); 
        System.out.println("\n");
      
        //NewPlayerConfig();

    }

    public static void NewPlayerConfig() {
        System.out.println("What's your character name?");
        // colocar aqui uma forma de salvar o nome do personagem

        System.out.println("Choose a race:");
        System.out.println("1 - Human\n2 - Elf\n3 - Dwarf");
        //Mostre todas as raças que o jogo possui
        //Salve a escolha e aplique-a ao personagem do jogador
    }
}
