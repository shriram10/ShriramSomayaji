
import java.io.*;
import java.util.Arrays;
import java.io.BufferedReader;
import java.util.*;

public class mazerunner {
	ArrayList<Integer> h=null;
	int m;
	int array[][];
	static BufferedWriter fout1=null;
	
	
	
	BufferedWriter fout=null;
	File file=new File("Destination.txt");
	
	public void create() throws Exception
	{
	
	 
	ArrayList<Integer>g=new ArrayList<Integer>();
int d=0;	
	
		BufferedReader fin=null;
		Scanner sn=new Scanner(System.in);
	    
	  
		   fin=new BufferedReader(new FileReader("CreateMaze.txt"));
		   
		   String s=fin.readLine();
		   while(s!=null)
		   {
			   m++;
			   String[]z=s.split(" ");
			   int len=z.length;
			   for(int k=0;k<len;k++)
			   {
				  
				   g.add(Integer.parseInt(z[k]));
				   
			   }
			    
			   s=fin.readLine();
			  
		   }
	   //System.out.println("m"+m);
	   int len=g.size();
	  /* for(int o=0;o<len;o++)
	   {
		   System.out.println(g.get(o));
		   
	   }
	   System.out.println("end");*/
	     
	 array=new int[m][5];
		
		for(int j=0;j<len;j++)
		{
			int v=g.get(j);
			
			if(j%5==0)
			{
				array[d][0]=v;
				if(j!=0)
				{d++;}
			}
			if(j%5==1)
			{array[d][1]=g.get(j);
			}
			
			if(j%5==2)
			{array[d][2]=g.get(j);}
			if(j%5==3){
			array[d][3]=g.get(j);}
			
			if(j%5==4){
				array[d][4]=g.get(j);
				}
		}
			
			//int l=g.get(j);
			
			//array[i][j]=l;	
			
				
		}
		 

	
	public void traverse() throws Exception
	{
		FileWriter fw=new FileWriter(file);
		fout1=new BufferedWriter(fw);
		BufferedReader fin=null;
		
			 fin=new BufferedReader(new FileReader("TraverseMaze.txt"));
			 String s1=fin.readLine();
			while(s1!=null)
			{
				h=new ArrayList<Integer>();
			 String[]z1=s1.split(" ");
			   int len1=z1.length;
			   for(int c=0;c<len1;c++)
			   {
				   h.add(Integer.parseInt(z1[c]));
				   
			   }
			   int cur=h.get(0);
			   int b=0;
			   for(int q=1;q<h.size();q++)
			   {
				   //System.out.print("pr"+cur+" ");
				   int mov=h.get(q);
				   
				   
					   int x=array[cur-1][mov+1];
					   
					   if(x>0)
					   {
						   cur=x;
					   }
				   
				   
				 
			   }
			   System.out.println("room:"+cur);
			   
			   if(fout1!=null)
			   {
				   fout1.write(new Integer(cur).toString());
				   fout1.newLine();
				   fout1.flush();
			   }
			   s1=fin.readLine();
		}
			
			
	
	
		 
		
		  
		
			 
		}
	
	public void check()
	{
			
				
				int k=array[1][3];	
				System.out.println("chec"+k);
					
			
	}
			
		
	}

