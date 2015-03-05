      public class Tree2
   {
      Node root,curr;
      String string="\t";
		String stringprev="";
      public Tree2()
      {  
           root=null;
      }
      public void insert(String s)
      {  String st=s;
         Node temp=new Node(st.trim());
         root=insertR(root,temp,s);
			
      }
   
      Node insertR(Node root,Node temp,String s)
      {  
		  
			boolean h=true;
        		
		   if(root==null)
		   	{
					root=temp;
					curr=root;
     			}    
         else if(s.startsWith(string))
         {  curr.left=insertR(curr.left,temp,s);
			   stringprev=string;
			   string+="\t";
				h=true;
				
			}
		    else if(s.startsWith(stringprev)&&h)
         {
			   curr.right=insertR(curr.right,temp,s);
			  // root=insertPos(root,temp);
          
		   } 
			else 
			{  
			 // if(s.startsWith(stringprev.replaceFirst("\t","")))
			  {int spaces =( s.length() - s.replace("\t", "").length());
            
			   Node q=root;
				//for(int j=0;j<1;++j)
      //      {
				   //while(q.left!=null)
					q=q.left;
				//}
				            
				   while(q.right!=null)
					q=q.right;
				
				for(int j=1;j<spaces;++j)
				{
					if(q.left!=null)
					  q=q.left;
				   while(q.right!=null)
					  q=q.right;
					  
				}
				q.right=temp;
				//string=string.trim();
				string="";
				for(int i=0;i<=spaces;++i)
				string+="\t";
				stringprev=string.replaceFirst("\t","");
  				curr=temp;
				h=false;
				}	
					
			}
         return root;
      }
				
      public void disp1()
      {
      // display in inorder
         inorder(root);
         System.out.println();
      }
      private void inorder(Node root)
      {
      // if the tree is not empty
      //	visit the left subtree in inorder
      //	visit the root
      //	visit the right subtree in inorder
         if(root != null)
         {
            inorder(root.left);
            System.out.println(root.Sval + " ");
            inorder(root.right);
				
         }
      }
		 public void disp2()
      {
      // display in inorder
         postorder(root);
         System.out.println();
      }
      private void postorder(Node root)
      {
      // if the tree is not empty
      //	visit the left subtree in inorder
      //	visit the root
      //	visit the right subtree in inorder
         if(root != null)
         {
            postorder(root.left);
            
            postorder(root.right);
				System.out.println(root.Sval + " ");
				
         }
      }

   
   
   
   }

   class Node
   {
      String Sval;
      Node left;
      Node right;
      public Node(String k)
      {
         Sval = k;
         left = right = null;
      }
   
   }