public class SzyfrowanieK {

    public String szyfruj(String tekst, int k){

        tekst = tekst.trim();
        StringBuilder zwrot = new StringBuilder();
        for(int i = 0; i<tekst.length();i++){
            char znak = tekst.charAt(i);
            zwrot.append(bank(znak,k));
        }

        return zwrot.toString();
    }

    public char bank(char znak,int k){

        boolean checker;
        checker = Character.isUpperCase(znak);
        if(checker){
            znak = Character.toLowerCase(znak);
        }
        int numeruj = switch (znak){
            case 'a' -> 1;
            case 'b' -> 2;
            case 'c' -> 3;
            case 'd' -> 4;
            case 'e' -> 5;
            case 'f' -> 6;
            case 'g' -> 7;
            case 'h' -> 8;
            case 'i' -> 9;
            case 'j' -> 10;
            case 'k' -> 11;
            case 'l' -> 12;
            case 'm' -> 13;
            case 'n' -> 14;
            case 'o' -> 15;
            case 'p' -> 16;
            case 'q' -> 17;
            case 'r' -> 18;
            case 's' -> 19;
            case 't' -> 20;
            case 'u' -> 21;
            case 'v' -> 22;
            case 'w' -> 23;
            case 'x' -> 24;
            case 'y' -> 25;
            case 'z' -> 26;
            default -> 100;
        };
        numeruj += k;
        if(numeruj>26&& numeruj != 100){
            numeruj -= 26;
        }

        char zwrot = switch (numeruj) {
            case 1 -> 'a';
            case 2 -> 'b';
            case 3 -> 'c';
            case 4 -> 'd';
            case 5 -> 'e';
            case 6 -> 'f';
            case 7 -> 'g';
            case 8 -> 'h';
            case 9 -> 'i';
            case 10 -> 'j';
            case 11 -> 'k';
            case 12 -> 'l';
            case 13 -> 'm';
            case 14 -> 'n';
            case 15 -> 'o';
            case 16 -> 'p';
            case 17 -> 'q';
            case 18 -> 'r';
            case 19 -> 's';
            case 20 -> 't';
            case 21 -> 'u';
            case 22 -> 'v';
            case 23 -> 'w';
            case 24 -> 'x';
            case 25 -> 'y';
            case 26 -> 'z';
            default -> ' ';
        };

        if(checker){
            zwrot = Character.toUpperCase(zwrot);
        }


        return zwrot;
    }

}
