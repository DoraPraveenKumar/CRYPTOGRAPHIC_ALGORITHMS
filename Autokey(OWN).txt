public class autokey
{
    public static void main(String args[])
    {
        String plaintext="ZYX";
        System.out.println("Plain text is = "+plaintext);
        char ke='Z';
        System.out.println("Key is = "+ke);
        String key=ke+plaintext.substring(0,plaintext.length()-1);
        System.out.println("Generated key is = "+key);                  //  Generated  Key
        String encrypt="",decrypt="";
        int a;
        for(int i=0;i<plaintext.length();i++)
        {
            a=(plaintext.charAt(i)+key.charAt(i))%26;                   //  Encryption
            encrypt+=(char)(a+65);
        }
        System.out.println("Encrypted text = "+encrypt);
        for(int i=0;i<encrypt.length();i++)
        {
            a=(encrypt.charAt(i)-key.charAt(i))%26; 			//  Decryption
            a = (a < 0) ? a + 26 : a;
            decrypt+=(char)(a+65);
        }
        System.out.println("Decrypted text = "+decrypt);
    }
}