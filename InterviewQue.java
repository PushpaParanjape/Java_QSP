/* 
Question : hello*3 ==> Ifmmp*3

fetch single char
find char is alpha or not
if alpha + 1
if not then keep as it is
check char is vowel or not
if vowel then char convert to uppercase (lowercase - 32 = uppercase)
if z is there then z converted into "a"
*/
class InterviewQue
{
	public static void main(String[] args) {
		
		String str = "hello*3";
		String str1 = " ";
		System.out.println(str);

		for(int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			System.out.println(ch);
		}


			}
	}
