import java.util.Scanner;

public class CaesarCipher {
    public static String encrypt(String clearphrase, int level){
        if(level>26){
            level = level % 26;
        } else if(level<0){
            level = (level%26)+26;
        }
        String cyphText = "";
        int length = clearphrase.length();
        for (int i=0; i<length; i++){
            char ch = clearphrase.charAt(i);
            if(Character.isLetter(ch)){
                if(Character.isLowerCase(ch)){
                    char c = (char)(ch+level);
                    if (c>'z'){
                        cyphText += (char)(ch -(26-level));
                    } else {
                        cyphText += c;
                    }
                } else if(Character.isUpperCase(ch)){
                    char c = (char)(ch + level);
                    if(c>'Z'){
                        cyphText += (char)(ch - (26-level));
                    } else {
                        cyphText += c;
                    }
                }    
            } else {
                cyphText += ch;
            }
        }
        return cyphText;
    }
    public static String decrypt(String clearphrase, int level){
        if(level>26){
            level = level % 26;
        } else if(level<0){
            level = (level%26)+26;
        }
        String cyphText = "";
        int length = clearphrase.length();
        for (int i=0; i<length; i++){
            char ch = clearphrase.charAt(i);
            if(Character.isLetter(ch)){
                if(Character.isLowerCase(ch)){
                    char c = (char)(ch-level);
                    if (c<'a'){
                        cyphText += (char)(ch +(26-level));
                    } else {
                        cyphText += c;
                    }
                } else if(Character.isUpperCase(ch)){
                    char c = (char)(ch - level);
                    if(c<'A'){
                        cyphText += (char)(ch + (26-level));
                    } else {
                        cyphText += c;
                    }
                }    
            } else {
                cyphText += ch;
            }
        }
        return cyphText;
    }
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Digite a frase a ser codificada.");
        String clearphrase = s.nextLine();
        System.out.println("Insira o nivel de mudança do codigo.");
        int level = s.nextInt();
        String cipher = encrypt(clearphrase, level);
        System.out.println(cipher);
        System.out.println("E retornando a mesma mensagem ao nivel 0:");
        String decrypted = decrypt(cipher, level);
        System.out.println(decrypted);
    }
}
