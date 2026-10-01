public class Odszyfrowanie {

    public String odszyfruj(String tekst){

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
            case 'a' -> 'u';
            case 'b' -> 'v';
            case 'c' -> 'w';
            case 'd' -> 'x';
            case 'e' -> 'y';
            case 'f' -> 'z';
            case 'g' -> 'a';
            case 'h' -> 'b';
            case 'i' -> 'c';
            case 'j' -> 'd';
            case 'k' -> 'e';
            case 'l' -> 'f';
            case 'm' -> 'g';
            case 'n' -> 'h';
            case 'o' -> 'i';
            case 'p' -> 'j';
            case 'q' -> 'k';
            case 'r' -> 'l';
            case 's' -> 'm';
            case 't' -> 'n';
            case 'u' -> 'o';
            case 'v' -> 'p';
            case 'w' -> 'q';
            case 'x' -> 'r';
            case 'y' -> 's';
            case 'z' -> 't';
            default -> znak;
        };

        if(checker){
            zwrot = Character.toUpperCase(zwrot);
        }


        return zwrot;
    }


}
