package com.web.csi;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 

import java.io.PrintWriter;
import java.net.URL;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 * Servlet implementation class Query
 */
public class Query extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Query() {
        super();
        // TODO Auto-generated constructor stub
    }

    
    
    
/*    public void run(HttpServletResponse response) {
    	 
    	response.setContentType("text/html");
		
    	URL url = getClass().getResource("hello.csv");
    	
        String csvFile = url.getPath();
        BufferedReader br = null;
    	String line = "";
    	String cvsSplitBy = "\\|";
     
    	try {
    		PrintWriter out = response.getWriter();
    		br = new BufferedReader(new FileReader(csvFile));
    		out.println("<table border=\"2\">");
			
    		while ((line = br.readLine()) != null) {
     
   			line = line.replace("\"","");
    			String[] data = line.split(cvsSplitBy);
    			out.println("<tr>");
    			for(int i=0;i<data.length;i++)
    			{
    				if(data[i].equals(""))
    				{
    				out.println("<td>"+"</td>");
    				continue;
    				}
   // 				System.out.println(data[i]);
    				out.println("<td>"+data[i]+"</td>");
    			}
    			
    //			System.out.println();
    			
    		}
    		out.println("</tr>");
    		out.println("</table>");
    	} catch (FileNotFoundException e) {
    		e.printStackTrace();
    		
    	} catch (IOException e) {
    		e.printStackTrace();
    	} finally {
    		if (br != null) {
    			try {
    				br.close();
    			} catch (IOException e) {
    				e.printStackTrace();
    			}
    		}
    	}
     
    	System.out.println("Done");
      }
    
    */
    public void search(HttpServletResponse response,String name) {
   	 
    	response.setContentType("text/html");
    	
    	URL url = getClass().getResource("hello.csv");
//    	
        String csvFile = url.getPath();
 //   	String csvFile = "";
    	//System.out.println(csvFile);
    	BufferedReader br = null;
    	String line = "";
    	String cvsSplitBy = "\\|";
     
    	try {
    		
    		PrintWriter out = response.getWriter();
    		br = new BufferedReader(new FileReader(csvFile));
    		
    		out.println("<table border=\"2\">");
	
    		out.println("<tr><td>sno</td><td>name</td><td>year</td><td>roll</td><td>branch</td><td>mob_num</td><td>email_id</td><td>gender</td><td>verify</td><td>rand</td><td>login</td><td>ip</td><td>form_finalize</td><td>form_contri</td><td>form_yantra</td><td>form_sanganitra1</td><td>form_sanganitra2</td><td>form_addsanganitra</td><td>form_vidyut1</td><td>form_vidyut2</td><td>form_addvidyut</td><td>form_sahitya1</td><td>form_sahitya2</td><td>form_addsahitya</td><td>form_yantrika1</td><td>form_yantrika2</td><td>form_addyantrika</td><td>form_karyavata1</td><td>form_karyavata2</td><td>form_addkaryavata</td><td>form_media1</td><td>form_media2</td><td>form_addmedia</td><td>form_favevent</td><td>form_weekend</td><td>personal_not1</td><td>personal_not2</td><td>testscore_1</td><td>testscore_2</td><td>testscore_3</td><td>testscore_4</td><td>test_comment</td><td>gd_team</td><td>gd_comments</td><td>gd_rating</td><td>gd_panel</td><td>pisan_comment_behave</td><td>pisan_comments_tech</td><td>pisan_rating</td><td>pisan_panel</td><td>pivid_comment_behave</td><td>pivid_comments_tech</td><td>pivid_rating</td><td>pivid_panel</td><td>piyan_comment_behave</td><td>piyan_comments_tech</td><td>piyan_rating</td><td>piyan_panel</td><td>pinontech_comment_behave</td><td>pinontech_comments_tech</td><td>pinontech_rating</td><td>pinontech_panel</td><td>final_type</td><td>final_comment_behave</td><td>final_comments_tech</td><td>final_rating</td><td>final_panel</td><td>final_pref</td><td>max_rating</td><td>round_test</td><td>round_gd</td><td>round_pisan</td><td>round_pivid</td><td>round_piyan</td><td>round_pinontech</td><td>round_final</td><td>misc1</td><td>misc2</td><td>misc3</td><td>misc4</td><td>misc5</td><td>misc6</td><td>misc7</td><td>misc8</td></tr>");
    		
    		
    		
   /* 		line = br.readLine();
    		System.out.println(line);
    		line = line.replace("\"","");
			String[] data = line.split(cvsSplitBy);
			System.out.println("Data[2]");
			System.out.println(data[2]);*/
			out.println("<tr>");
/*			for(int i=0;i<data.length;i++)
			{
				if(data[i].equals(""))
				{
				out.println("<td>"+"</td>");
				continue;
				}
				System.out.println(data[i]);
				out.println("<td><b>"+data[i]+"</b></td>");
			}
    		*/
    		while ((line = br.readLine()) != null) {
    			
   			line = line.replace("\"","");
   			//System.out.println(line);
   			//System.out.println("Another While");
   			 String[]  data = line.split(cvsSplitBy);
    			//System.out.println(data[1]);
    			//System.out.println("Name which you have passed");
    			System.out.println(name);
    			if( data[0].equals(name)  ||  data[1].equals(name)   ||  data[3].equals(name)    ||    data[5].equals(name)  ||     data[6].equals(name) )
    			{
    				System.out.println("In If");
    				out.println("<tr>");
        			for(int i=0;i<data.length;i++)
        			{
        				if(data[i].equals(""))
        				{
        				out.println("<td>"+"</td>");
        				continue;
        				}
        				//System.out.println(data[i]);
        				out.println("<td>"+data[i]+"</td>");
        			}
        			
        			System.out.println();
    			}
    			
    		}
    		out.println("</tr>");
    		out.println("</table>");
    	} catch (FileNotFoundException e) {
    		e.printStackTrace();
    		
    	} catch (IOException e) {
    		e.printStackTrace();
    	} finally {
    		if (br != null) {
    			try {
    				br.close();
    			} catch (IOException e) {
    				e.printStackTrace();
    			}
    		}
    	}
      }
    
    
    

    
    
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
      }
    
        
        
        
		


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		Query obj = new Query();
		//obj.run(response);
		String name = request.getParameter("firstName");
		//String name = JOptionPane.showInputDialog("Enter Student Name");
		obj.search(response, name);
// 		
//		out.println("Hello World");
//		
	}

}
