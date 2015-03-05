    
    
    import java.util.Scanner;
    public class Test
    {
    	public static void main(String[] args)
    	{
    		String s1;
    		System.out.println("============================");
    		System.out.println("|   MENU SELECTION DEMO    |");
    		System.out.println("============================");
    		System.out.println("|     THE ELEMENTS ARE:     |");
    		System.out.println("|      *FILE              |");
    		System.out.println("|      *TOOLS              |");
    		System.out.println("|      *VIEW              |");
    		Scanner in = new Scanner(System.in);
    		System.out.println("Enter the choice:");
    		s1=in.nextLine();
    		switch(s1) {
    			case"FILE":
    				fn_FILE();
    				break;
    			case"TOOLS":
    				fn_TOOLS();
    				break;
    			case"VIEW":
    				fn_VIEW();
    				break;
    		}
    	}
    	public static void fn_FILE()
    	{
    		Scanner in = new Scanner(System.in);
    		String s;
    		System.out.println("============================");
    		System.out.println("|   MENU SELECTION DEMO    |");
    		System.out.println("============================");
    		System.out.println("Enter the choice:          |");
    		System.out.println("|     THE ELEMENTS ARE:     |");
    		System.out.println("|      *Info              |");
    		System.out.println("|      *New              |");
    		System.out.println("|      *Open              |");
    		System.out.println("|      *Save              |");
    		System.out.println("|      *Print              |");
    		s=in.nextLine();
    		switch(s) {
    			case "Info":
    				fn_Info();
    				break;
    			case "New":
    				fn_New();
    				break;
    			case "Open":
    				fn_Open();
    				break;
    			case "Save":
    				fn_Save();
    				break;
    			case "Print":
    				fn_Print();
    				break;
    		}
    	}
    	public static void fn_Info()
    	{
    	}
    	public static void fn_New()
    	{
    	}
    	public static void fn_Open()
    	{
    	}
    	public static void fn_Save()
    	{
    	}
    	public static void fn_Print()
    	{
    	}
    	public static void fn_TOOLS()
    	{
    		Scanner in = new Scanner(System.in);
    		String s;
    		System.out.println("============================");
    		System.out.println("|   MENU SELECTION DEMO    |");
    		System.out.println("============================");
    		System.out.println("Enter the choice:          |");
    		System.out.println("|     THE ELEMENTS ARE:     |");
    		System.out.println("|      *Find              |");
    		s=in.nextLine();
    		switch(s) {
    			case "Find":
    				fn_Find();
    				break;
    		}
    	}
    	public static void fn_Find()
    	{
    	}
    	public static void fn_VIEW()
    	{
    		Scanner in = new Scanner(System.in);
    		String s;
    		System.out.println("============================");
    		System.out.println("|   MENU SELECTION DEMO    |");
    		System.out.println("============================");
    		System.out.println("Enter the choice:          |");
    		System.out.println("|     THE ELEMENTS ARE:     |");
    		System.out.println("|      *Navigation_Pane              |");
    		System.out.println("|      *Show_comments              |");
    		System.out.println("|      *Column_width              |");
    		System.out.println("|      *Page_colour              |");
    		System.out.println("|      *Page_Layout              |");
    		s=in.nextLine();
    		switch(s) {
    			case "Navigation_Pane":
    				fn_Navigation_Pane();
    				break;
    			case "Show_comments":
    				fn_Show_comments();
    				break;
    			case "Column_width":
    				fn_Column_width();
    				break;
    			case "Page_colour":
    				fn_Page_colour();
    				break;
    			case "Page_Layout":
    				fn_Page_Layout();
    				break;
    		}
    	}
    	public static void fn_Navigation_Pane()
    	{
    	}
    	public static void fn_Show_comments()
    	{
    	}
    	public static void fn_Column_width()
    	{
    		Scanner in = new Scanner(System.in);
    		String s;
    		System.out.println("============================");
    		System.out.println("|   MENU SELECTION DEMO    |");
    		System.out.println("============================");
    		System.out.println("Enter the choice:          |");
    		System.out.println("|     THE ELEMENTS ARE:     |");
    		System.out.println("|      *Narrow              |");
    		System.out.println("|      *Default              |");
    		System.out.println("|      *Wide              |");
    		s=in.nextLine();
    		switch(s) {
    			case "Narrow":
    				fn_Narrow();
    				break;
    			case "Default":
    				fn_Default();
    				break;
    			case "Wide":
    				fn_Wide();
    				break;
    		}
    	}
    	public static void fn_Narrow()
    	{
    	}
    	public static void fn_Default()
    	{
    	}
    	public static void fn_Wide()
    	{
    	}
    	public static void fn_Page_colour()
    	{
    		Scanner in = new Scanner(System.in);
    		String s;
    		System.out.println("============================");
    		System.out.println("|   MENU SELECTION DEMO    |");
    		System.out.println("============================");
    		System.out.println("Enter the choice:          |");
    		System.out.println("|     THE ELEMENTS ARE:     |");
    		System.out.println("|      *None              |");
    		System.out.println("|      *Sepia              |");
    		System.out.println("|      *Inverse              |");
    		s=in.nextLine();
    		switch(s) {
    			case "None":
    				fn_None();
    				break;
    			case "Sepia":
    				fn_Sepia();
    				break;
    			case "Inverse":
    				fn_Inverse();
    				break;
    		}
    	}
    	public static void fn_None()
    	{
    	}
    	public static void fn_Sepia()
    	{
    	}
    	public static void fn_Inverse()
    	{
    	}
    	public static void fn_Page_Layout()
    	{
    		Scanner in = new Scanner(System.in);
    		String s;
    		System.out.println("============================");
    		System.out.println("|   MENU SELECTION DEMO    |");
    		System.out.println("============================");
    		System.out.println("Enter the choice:          |");
    		System.out.println("|     THE ELEMENTS ARE:     |");
    		System.out.println("|      *Column_Layout              |");
    		System.out.println("|      *Paper_Layout              |");
    		s=in.nextLine();
    		switch(s) {
    			case "Column_Layout":
    				fn_Column_Layout();
    				break;
    			case "Paper_Layout":
    				fn_Paper_Layout();
    				break;
    		}
    	}
    	public static void fn_Column_Layout()
    	{
    	}
    	public static void fn_Paper_Layout()
    	{
    	}
    }
    