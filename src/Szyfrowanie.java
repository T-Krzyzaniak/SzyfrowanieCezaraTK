import java.lang.*;
public class Szyfrowanie {

    public String szyfruj(String tekst){

        tekst = tekst.trim();
        StringBuilder zwrot = new StringBuilder();
        for(int i = 0; i<tekst.length();i++){
            char znak = tekst.charAt(i);
            zwrot.append(bank(znak));
        }

        return zwrot.toString();
    }

    public char bank(char znak){

        boolean checker;
        checker = Character.isUpperCase(znak);
        if(checker){
            znak = Character.toLowerCase(znak);
        }
        char zwrot = switch (znak){
            case 'a' -> 'g';
            case 'b' -> 'h';
            case 'c' -> 'i';
            case 'd' -> 'j';
            case 'e' -> 'k';
            case 'f' -> 'l';
            case 'g' -> 'm';
            case 'h' -> 'n';
            case 'i' -> 'o';
            case 'j' -> 'p';
            case 'k' -> 'q';
            case 'l' -> 'r';
            case 'm' -> 's';
            case 'n' -> 't';
            case 'o' -> 'u';
            case 'p' -> 'v';
            case 'q' -> 'w';
            case 'r' -> 'x';
            case 's' -> 'y';
            case 't' -> 'z';
            case 'u' -> 'a';
            case 'v' -> 'b';
            case 'w' -> 'c';
            case 'x' -> 'd';
            case 'y' -> 'e';
            case 'z' -> 'f';
            default -> znak;
        };

        if(checker){
            zwrot = Character.toUpperCase(zwrot);
        }


        return zwrot;
    }
}
