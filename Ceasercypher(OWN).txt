public class ceaser
{
    public static void main(String args[])
    {
        String input="ABCDEFGHIJKLMNOPQRSTUVWXYZ abcdefghijklmnopqrstuvwxyz";
        String encrypt="",decrypt="";
        int key=6;
        System.out.println("Original text  ="+input);
        char ch,c;
        
        //encryption
        
        for(int i=0;i<input.length();i++)
        {
            c=input.charAt(i);
            if(Character.isUpperCase(c))
            {
                if(((int)c+key)<=90)
                {
                    ch=(char)((int)c+key);      // for uppercase
                    encrypt+=ch;
                }
                else
                {
                    ch=(char)(((int)c+key-91)+65);
                    encrypt+=ch;
                }
            }
            else if(Character.isLowerCase(c))
            {
                if(((int)c+key)<=122)
                {
                    ch=(char)((int)c+key);      // for lowercase
                    encrypt+=ch;
                }
                else
                {
                    ch=(char)(((int)c+key-123)+97);
                    encrypt+=ch;
                }   
            }
            else
            {
                encrypt+=c;
            }
        }
        System.out.println("Encrypted text ="+encrypt);
        
        // decryption
        
        for(int i=0;i<encrypt.length();i++)
        {
            c=encrypt.charAt(i);
            if(Character.isUpperCase(c))
            {
                if((int)c-key>=65)
                {
                    ch=(char)((int)c-key);         // for uppercase
                    decrypt+=ch;
                }
                else
                {
                    ch=(char)((((int)c-key)-65)+91);
                    decrypt+=ch;
                }
            }
            else if(Character.isLowerCase(c))
            {
                if(((int)c-key)>=97)
                {
                    ch=(char)((int)c-key);      // for lowercase
                    decrypt+=ch;
                }
                else
                {
                    ch=(char)(((int)c-key-97)+123);
                    decrypt+=ch;
                }   
            }
            else
            {
                decrypt+=c;
            }
        }
        System.out.println("Decrypted text ="+decrypt);
    }
}