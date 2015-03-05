import java.util.Scanner;
public class Menu2
{  static Node realN=null;
    static Node treeRoot;
	 static int pp=0;
    static String[] menuHolder=new String[100];
	 static String[] menuHolder1=new String[20];
    static String[] firstLevelMenu=new String[20];
	
	public static void disp(Node x)
	{  System.out.println("import java.util.Scanner;");  
	   System.out.println("public class Test");
		System.out.println("{");
		System.out.println("\tpublic static void main(String[] args)");
		System.out.println("\t{");
		for(int g=0;g<firstLevelMenu.length;++g)
	   {
			firstLevelMenu[g]=null;	
	   }

		FirstR(x);
		System.out.println("\t\tString s1;");
		System.out.println("\t\tSystem.out.println(\"============================\");");
      System.out.println("\t\tSystem.out.println(\"|   MENU SELECTION DEMO    |\");");
      System.out.println("\t\tSystem.out.println(\"============================\");");
		System.out.println("\t\tSystem.out.println(\"|     THE ELEMENTS ARE:     |\");");
		for(int k=0;k<firstLevelMenu.length;++k)
	   {	
			  if(firstLevelMenu[k]!=null)
		     {
			      System.out.println("\t\tSystem.out.println(\"|      *"+firstLevelMenu[k]+"              |\");");
   
			  }

      }

		System.out.println("\t\tScanner in = new Scanner(System.in);");
		System.out.println("\t\tSystem.out.println(\"Enter the choice:\");");
		System.out.println("\t\ts1=in.nextLine();");
      if(firstLevelMenu[0]!=null)
		   System.out.println("\t\tswitch(s1) {");
		for(String d :firstLevelMenu)
		{  
		   if(d!=null)
			{
			   System.out.println("\t\t\tcase\""+d+"\":");
			   System.out.println("\t\t\t\tfn_"+d+"();");
				System.out.println("\t\t\t\tbreak;");
			}  
		}
		if(firstLevelMenu[0]!=null)
		   System.out.println("\t\t}");

		System.out.println("\t}");
		
		

	    
	}
	public static void gen(String s,Node t)
	{  
	   for(int j=0;j<menuHolder.length;++j)
		{
			menuHolder[j]=null;
		} 
	   Node n;
		treeRoot=t;
		inorder1(treeRoot.left);
		  
		   for(int k=0;k<menuHolder.length;++k)
		  {  if(menuHolder[0]==null)
		        {
				   System.out.println("}");
		         System.exit(0);
				  }
		     if(menuHolder[k]!=null)
			  {    
			  		genFn(menuHolder[k]);
			  }
		  }
		  
		  for(int g=0;g<menuHolder.length;++g)
		  {
		  	  gen(menuHolder[g],treeRoot);
		  }
		  
	}
	public static void gen1(String s,Node t)
	{  
	   for(int j=0;j<menuHolder1.length;++j)
		{
			menuHolder1[j]=null;
		} 
	   int i=0;
	   Node n;
	  	inorder(t,s);
		treeRoot=t;
		Node useFul;
		
		  useFul=realN;
		   if(useFul.left!=null)
		   {
		      useFul=useFul.left;
		      menuHolder1[i]=useFul.Sval;
		      ++i;
				 while(useFul.right!=null)
		    {
		    	useFul=useFul.right;
		      menuHolder1[i]=useFul.Sval;
		      ++i;
		    }

		    }
		       		

	}

   static void gg(Node x)
	{
	    realN=x;
	   // System.out.println(realN.Sval);
	}
	
	 static void gg1(String s)
	{
	    
		 menuHolder[pp]=s;
		 ++pp;
	}

	
	static void inorder(Node n1,String s1)
	{   
	
	    if(n1!=null && n1.Sval.equals(s1))
		   { 
		      Node x=n1;
		      gg(n1);    
		   }
		
		if(n1!=null)
		   {
		   		inorder(n1.left,s1);
		   		inorder(n1.right,s1);
		   }	
		
        
	}
	public static void inorder1(Node n1)
	{   
	    
	    if(n1!=null)
		   {  
			   gg1(n1.Sval);
            inorder1(n1.left);
			 	inorder1(n1.right);  
				
         }
						
        
	}

	public static void genFn(String fnname)
	{ 
		System.out.println("\tpublic static void fn_" + fnname + "()");
		System.out.println("\t{");
		//System.out.println("\t\tMenu  "+fnname+"   Selected");
		for(int i=0;i<menuHolder1.length;++i)
		{
			menuHolder1[i]=null;
		}

		gen1(fnname,treeRoot);
		if(menuHolder1[0]!=null)
		{  
		   System.out.println("\t\tScanner in = new Scanner(System.in);");
			System.out.println("\t\tString s;");		
	      System.out.println("\t\tSystem.out.println(\"============================\");");
         System.out.println("\t\tSystem.out.println(\"|   MENU SELECTION DEMO    |\");");
         System.out.println("\t\tSystem.out.println(\"============================\");");
			System.out.println("\t\tSystem.out.println(\"Enter the choice:          |\");");
			System.out.println("\t\tSystem.out.println(\"|     THE ELEMENTS ARE:     |\");");
			for(int k=0;k<menuHolder1.length;++k)
	     {	
			  if(menuHolder1[k]!=null)
		     {
			      System.out.println("\t\tSystem.out.println(\"|      *"+menuHolder1[k]+"              |\");");
   
			  }

          }
			System.out.println("\t\ts=in.nextLine();");

	     }
   	if(menuHolder1[0]!=null)
			System.out.println("\t\tswitch(s) {");
		for(int k=0;k<menuHolder1.length;++k)
	   {	
			if(menuHolder1[k]!=null)
		   {System.out.println("\t\t\tcase \""+menuHolder1[k]+"\":");
			System.out.println("\t\t\t\tfn_"+menuHolder1[k]+"();");
			System.out.println("\t\t\t\tbreak;");
			}
		}
		if(menuHolder1[0]!=null)
			System.out.println("\t\t}");
			
      System.out.println("\t}");
		
   }
	
	
	public static void FirstR(Node x)
	{  
	   for(int r=0;r<firstLevelMenu.length;++r)
		{
			firstLevelMenu[r]=null;
		}
	   int kk=0;
		Node x1=x;
		if(x1.left != null)
		{  
		   x1=x1.left;
			firstLevelMenu[kk]=x1.Sval;
			++kk;
			while(x1.right!=null)
			{
				x1=x1.right;
			   firstLevelMenu[kk]=x1.Sval;
				++kk;
			}
		}
		

	}

		
	}
	

