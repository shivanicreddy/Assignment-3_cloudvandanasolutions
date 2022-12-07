import java.util.Scanner;
class String_Extract
{	
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence:");
		String str_Sentence = sc.nextLine();
		getInput(str_Sentence);
		char chr_continue = 'N';
		do
		{
		System.out.println("\n\nDo you want to continue(Y/N)?");
		chr_continue = sc.next().charAt(0);
		chr_continue = Character.toUpperCase(chr_continue);
		if(chr_continue == 'Y')
		{
			getInput(str_Sentence);
		}
		else
			System.exit(0);
		}while(chr_continue == 'Y');	
	}
	public static void getInput(String str_Sentence )
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.println("\nEnter a Letter:");
		String str_Input = sc1.nextLine();
		
		if(str_Input.length() == 1)
		{
			char chr_ToFind = str_Input.charAt(0);
			int ascii = chr_ToFind;
			if(ascii >= 32 && ascii <= 126)			
			{
				char chr_Sentence[] = str_Sentence.toCharArray();
				int charIndex = -1;
				boolean flg = false;
				for(int i=0;i<=str_Sentence.length()-1;i++)
				{
					if(chr_ToFind == chr_Sentence[i])
					{
						charIndex = i;
						flg = true;
					}
					if(charIndex != -1)			// to avoid second occurence
						 break;
				}
				if(flg)
				{
					for(int i=charIndex+1;i<=str_Sentence.length()-1;i++)
						System.out.print(chr_Sentence[i]);
				}
				else
					System.out.println("The letter does not exist in the sentence");
			}
			else
				System.out.println("Input is not a letter");
		}
		else
			System.out.println("You entered more than one letter");
	}
}