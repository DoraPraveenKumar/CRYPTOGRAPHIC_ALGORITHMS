public class vigenerecipher
{
    public static void main(String args[])                                      //           ONLY FOR UPPER CASE
    {
        String input="GEEKSFORGEEKS";
        System.out.println("Plain text = "+input);
        String key="AYUSH",key1="";
        System.out.println("key entered is = "+key);
        key1=key;
        if(key1.length()<input.length())
        {
        for(int i=0;;i++)
        {
            int x=input.length();
            if(x!=key1.length())
            {
                key1+=key1.charAt(i);
            }
            else if(i==(key.length()-1))        //   key generation
            {
                i=0;
            }
            else
            {
                break;
            }
        }
        }
        else
        {
            key1=key1.substring(0,input.length());
        }
        System.out.println("Generated key is = "+key1);
        String encrypt="",decrypt="";
        int a;
        for(int i=0;i<input.length();i++)
        {
            a=(input.charAt(i)+key1.charAt(i))%26;      //      Encryption
            encrypt+=(char)(65+a);
        }
        System.out.println("Encrypted text = "+encrypt);
        
        for(int i=0;i<encrypt.length();i++)
        {
            a=(encrypt.charAt(i)-key1.charAt(i)+26)%26;     //          Decryption
            decrypt+=(char)(65+a);
        }
        System.out.println("Decrypted text = "+decrypt);
        
    }
}