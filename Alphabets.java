rmport java.util.Scanner;


public class Alphabets {

public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("This program diaplays input alphabets as  star alphabet pattern");
		System.out.println("Enter string value(use only alphabets and spaces)");
		String s= new String();
		s = scan.nextLine();
		int n= 12;
		int i,j,k;
		for(i=0;i<n;i++)
		{
			for(k=0;k<s.length();k++)
			{
				char ch = s.charAt(k);
				switch(ch)
				{
				case 'a' :
					for(j=0;j<=n/2;j++)
					{
						if(((j==0||j==n/2)&&(i!=0))||((i==0||i==n/2)&&(j>0&&j<n/2)))
						{
							System.out.print("*");
						}
						else
							System.out.print(" ");
					}
					System.out.print("    ");
					break;
				case 'b' :
					for(j=0;j<=n/2;j++)
					{
						if(((j==n/2)&&(i!=n/2 && i!=0 && i!=n-1))||j==0||((i==0||i==n/2||i==n-1)&&(j>0&&j<n/2)))
						{
							System.out.print("*");
						}
						else
							System.out.print(" ");
					}
					System.out.print("    ");
					break;
					
				case 'c' :
					for(j=0;j<=n/2;j++)
					{
						if(((j==0)&&(i!=0&&i!=n-1))||((i==0||i==n-1)&&(j!=0)))
						{
							System.out.print("*");
						}
						else
							System.out.print(" ");
					}
					System.out.print("    ");
					break;
					
				case 'd' :
					for(j=0;j<=n/2;j++)
					{
						if(((j==n/2)&&(i!=0 && i!=n-1))||j==1||((i==0||i==n-1)&&(j>0&&j<n/2)))
						{
							System.out.print("*");
						}
						else
							System.out.print(" ");
					}
					System.out.print("    ");
					break;
					
				case 'e' :
					for(j=0;j<=n/2;j++)
					{
						if(j==0||((i==0||i==n/2||i==n-1)&&(j>0&&j<=n/2)))
						{
							System.out.print("*");
						}
						else
							System.out.print(" ");
					}
					System.out.print("    ");
					break;
					
				case 'f' :
					for(j=0;j<=n/2;j++)
					{
						if(j==0||((i==0||i==n/2)&&(j>0&&j<=n/2)))
						{
							System.out.print("*");
						}
						else
							System.out.print(" ");
					}
					System.out.print("    ");
					break;
					
				case 'g' :
					for(j=0;j<=n/2;j++)
					{
						if(j==0||(j==n/2 && i>n/2)||((i==0||i==n-1)&&(j>0&&j<=n/2))||(i==n/2 && (j>=n/4&&j<=n/2)))
						{
							System.out.print("*");
						}
						else
							System.out.print(" ");
					}
					System.out.print("    ");
					break;
					
				case 'h' :
					for(j=0;j<=n/2;j++)
					{
						if(j==n/2||j==0||((i==n/2)&&(j>0&&j<n/2)))
						{
							System.out.print("*");
						}
						else
							System.out.print(" ");
					}
					System.out.print("    ");
					break;
					
				case 'i' :
					for(j=0;j<=n/2;j++)
					{
						if(j==n/4||((i==n-1||i==0)&&(j>=0&&j<=n/2)))
						{
							System.out.print("*");
						}
						else
							System.out.print(" ");
					}
					System.out.print("    ");
					break;
					
				case 'j' :
					for(j=0;j<=n/2;j++)
					{
						if(j==n/4+1||((i==0)&&(j>=0&&j<=n/2))||((i==n-1)&&(j>0&&j<=n/4))||((j==0)&&(i>n/2 &&i<n-1)))
						{
							System.out.print("*");
						}
						else
							System.out.print(" ");
					}
					System.out.print("    ");
					break;
					
				case 'k' :
					for(j=0;j<=n/2;j++)
					{
						if(j==0||(i+j==n/2||i-j==n/2)&&j<=n/2)
						{
							System.out.print("*");
						}
						else
							System.out.print(" ");
					}
					System.out.print("    ");
					break;
					
				case 'l' :
					for(j=0;j<=n/2;j++)
					{
						if(j==0||i==n-1&&j<=n/2)
						{
							System.out.print("*");
						}
						else
							System.out.print(" ");
					}
					System.out.print("    ");
					break;
					
				case 'm' :
					for(j=0;j<=n/2;j++)
					{
						if(j==n/2||j==0||((i==2*j)&&(j<=n/4))||((i+2*j==n)&&(i<=n/2)))
						{
							System.out.print("*");
						}
						else
							System.out.print(" ");
					}
					System.out.print("    ");
					break;
					
				case 'n' :
					for(j=0;j<=n/2;j++)
					{
						if(j==n/2||j==0||((i==2*j)))
						{
							System.out.print("*");
						}
						else
							System.out.print(" ");
					}
					System.out.print("    ");
					break;
					
				case 'o' :
					for(j=0;j<=n/2;j++)
					{
						if(((j==n/2||j==0) && (i!=0 && i!=n-1))||((i==0||i==n-1)&&(j!=0 && j!=n/2 ) ))
						{
							System.out.print("*");
						}
						else
							System.out.print(" ");
					}
					System.out.print("    ");
					break;
					
				case 'p' :
					for(j=0;j<=n/2;j++)
					{
						if(((j==0) && (i!=0 ))||(j==n/2 &&(i!=0 && i<n/2))||((i==0||i==n/2)&&(j!=0 && j!=n/2 ) ))
						{
							System.out.print("*");
						}
						else
							System.out.print(" ");
					}
					System.out.print("    ");
					break;
					
				case 'q' :
					for(j=0;j<=n/2;j++)
					{
						if(((j==(n/2)-1||j==0) && (i>0 && i<n-2))||((i==0||i==n-2)&&(j>0 && j<n/2-1 ) ) || ((i-(2*j-1)==0)&&(j>=n/4)))
						{
							System.out.print("*");
						}
						else
							System.out.print(" ");
					}
					System.out.print("    ");
					break;
					
				case 'r' :
					for(j=0;j<=n/2;j++)
					{
						if(((j==(n/2)) && (i>0 && i<n/2-1))||(j==0 &&i>0 )||((i==0)&&(j>0 && j<n/2 ) ) || ((i-(2*j-1)==0)&&(j>=n/4)) ||((i==n/2-1)&&(j>=n/4 && j<n/2)))
						{
							System.out.print("*");
						}
						else
							System.out.print(" ");
					}
					System.out.print("    ");
					break;
					
				case 's' :
					for(j=0;j<=n/2;j++)
					{
						if(((j==0) && (i>0 && i<n/2))||((j==n/2) && (i>n/2 && i<n-1 ))||((i==0||i==n/2|| i==n-1)&&(j!=0 && j!=n/2 ) ))
						{
							System.out.print("*");
						}
						else
							System.out.print(" ");
					}
					System.out.print("    ");
					break;
					
				case 't' :
					for(j=0;j<=n/2;j++)
					{
						if(j==n/4||((i==0)&&(j>=0&&j<=n/2)))
						{
							System.out.print("*");
						}
						else
							System.out.print(" ");
					}
					System.out.print("    ");
					break;
					
				case 'u' :
					for(j=0;j<=n/2;j++)
					{
						if(((j==n/2||j==0) && ( i!=n-1))||((i==n-1)&&(j!=0 && j!=n/2 ) ))
						{
							System.out.print("*");
						}
						else
							System.out.print(" ");
					}
					System.out.print("    ");
					break;
					
				case 'v' :
					for(j=0;j<=n/2;j++)
					{
						if(((j==n/2||j==0) && (i<n/2))||((i-n/2==2*j)&&(j<=n/4))||(((i-n/2)+2*j==n))||(i==n-1 && j==n/4))
						{
							System.out.print("*");
						}
						else
							System.out.print(" ");
					}
					System.out.print("    ");
					break;
					
				case 'w' :
					for(j=0;j<=n/2;j++)
					{
						if(j==n/2||j==0||((i==2*j)&&(j>=n/4))||((i+2*j==n)&&(i>=n/2)))
						{
							System.out.print("*");
						}
						else
							System.out.print(" ");
					}
					System.out.print("    ");
					break;
					
				case 'x' :
					for(j=0;j<=n/2;j++)
					{
						if(i==2*j||i+2*j==n)
						{
							System.out.print("*");
						}
						else
							System.out.print(" ");
					}
					System.out.print("    ");
					break;
					
				case 'y' :
					for(j=0;j<=n/2;j++)
					{
						if((j==n/4 && i>n/2)||((i==2*j)&&(j<=n/4))||((i+2*j==n)&&(i<=n/2)))
						{
							System.out.print("*");
						}
						else
							System.out.print(" ");
					}
					System.out.print("    ");
					break;
					
				case 'z' :
					for(j=0;j<=n/2;j++)
					{
						if(i+2*j ==n-1||((i==n-1||i==0)&&(j>=0&&j<=n/2)))
						{
							System.out.print("*");
						}
						else
							System.out.print(" ");
					}
					System.out.print("    ");
					break;
					
				case ' ' :
					for(j=0;j<=n/2;j++)
					{
						System.out.print(" ");
					}
					System.out.print("    ");
					break;
				}
				
			}
			System.out.println();
		}
		System.out.println("linkedin.com/in/mohanreddy070");
		System.out.println("fb.com/mohanreddy070");
	}


}
