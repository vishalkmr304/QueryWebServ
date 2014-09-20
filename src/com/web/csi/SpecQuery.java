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

/**
 * Servlet implementation class SpecQuery
 */
public class SpecQuery extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SpecQuery() {
        super();
        // TODO Auto-generated constructor stub
    }

	/*
    public void run(HttpServletResponse response) {
   	 
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
    				System.out.println(data[i]);
    				out.println("<td>"+data[i]+"</td>");
    			}
    			
    			System.out.println();
    			
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
    public void search(HttpServletResponse response,String gender,String Yantras, String Test,String Sang_score,String Vid_score,String Yan_score,String PISAN,String PIVID,String PIYAN,String GD) {
      	 
    	response.setContentType("text/html");
    	
    	URL url = getClass().getResource("hello.csv");
    	
        String csvFile = url.getPath();
    	BufferedReader br = null;
    	String line = "";
    	String cvsSplitBy = "\\|";
    	int count=0; 
    	Double score,sanscore,vidscore,yanscore,pisan,pivid,piyan,gd;
    	sanscore=Double.valueOf(Sang_score);
    	vidscore=Double.valueOf(Vid_score);
    	yanscore=Double.valueOf(Yan_score);
    	pisan=Double.valueOf(PISAN);
    	pivid=Double.valueOf(PIVID);
    	piyan=Double.valueOf(PIYAN);
    	gd=Double.valueOf(GD);
   /* 	if(Sang_score.equals("NONE"))
    	{
    		 sanscore=0.0;
    	}
    	
    	if(Vid_score.equals("NONE"))
    	{
    		 vidscore=0.0;
    	}
    	
    	if(Yan_score.equals("NONE"))
    	{
    		 yanscore=0.0;
    	}
    */	
    	score= Double.valueOf(Test);
    	try {
    		//System.out.println(gender);
    		PrintWriter out = response.getWriter();
    		br = new BufferedReader(new FileReader(csvFile));
    		out.println("<table border=\"2\">");
			
    		out.println("<tr><td>sno</td><td>name</td><td>year</td><td>roll</td><td>branch</td><td>mob_num</td><td>email_id</td><td>gender</td><td>verify</td><td>rand</td><td>login</td><td>ip</td><td>form_finalize</td><td>form_contri</td><td>form_yantra</td><td>form_sanganitra1</td><td>form_sanganitra2</td><td>form_addsanganitra</td><td>form_vidyut1</td><td>form_vidyut2</td><td>form_addvidyut</td><td>form_sahitya1</td><td>form_sahitya2</td><td>form_addsahitya</td><td>form_yantrika1</td><td>form_yantrika2</td><td>form_addyantrika</td><td>form_karyavata1</td><td>form_karyavata2</td><td>form_addkaryavata</td><td>form_media1</td><td>form_media2</td><td>form_addmedia</td><td>form_favevent</td><td>form_weekend</td><td>personal_not1</td><td>personal_not2</td><td>testscore_1</td><td>testscore_2</td><td>testscore_3</td><td>testscore_4</td><td>test_comment</td><td>gd_team</td><td>gd_comments</td><td>gd_rating</td><td>gd_panel</td><td>pisan_comment_behave</td><td>pisan_comments_tech</td><td>pisan_rating</td><td>pisan_panel</td><td>pivid_comment_behave</td><td>pivid_comments_tech</td><td>pivid_rating</td><td>pivid_panel</td><td>piyan_comment_behave</td><td>piyan_comments_tech</td><td>piyan_rating</td><td>piyan_panel</td><td>pinontech_comment_behave</td><td>pinontech_comments_tech</td><td>pinontech_rating</td><td>pinontech_panel</td><td>final_type</td><td>final_comment_behave</td><td>final_comments_tech</td><td>final_rating</td><td>final_panel</td><td>final_pref</td><td>max_rating</td><td>round_test</td><td>round_gd</td><td>round_pisan</td><td>round_pivid</td><td>round_piyan</td><td>round_pinontech</td><td>round_final</td><td>misc1</td><td>misc2</td><td>misc3</td><td>misc4</td><td>misc5</td><td>misc6</td><td>misc7</td><td>misc8</td></tr>");
    		
    		
    		
    	/*	line = br.readLine();
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
				System.out.println(data[i]);
				out.println("<td><b>"+data[i]+"</b></td>");
			}
    		*/
    		while ((line = br.readLine()) != null) {
     
   			line = line.replace("\"","");
    		String[]	data = line.split(cvsSplitBy);
    		
    		Double apti= Double.valueOf(data[37]);
    		Double s1=Double.valueOf(data[38]);
    		Double s2=Double.valueOf(data[39]);
    		Double s3=Double.valueOf(data[40]);
    		Double sanr=Double.valueOf(data[48]);
    		Double vidr=Double.valueOf(data[52]);
    		Double yanr=Double.valueOf(data[56]);
    		Double gdr=Double.valueOf(data[44]);
    		
    		if( ( (data[7].equals(gender)) || gender.equals("Select"))   &&   Yantras.equals("All")   && ( (apti>=score) &&  (s1>=sanscore) && (s2>=vidscore) && (s3>=yanscore)  && (sanr>=pisan) && (vidr>=pivid) && (yanr>=piyan) && (gdr>=gd) ))
			{
    			count++;
				out.println("<tr>");
    			for(int i=0;i<data.length;i++)
    			{
    				if(data[i].equals(""))
    				{
    				out.println("<td>"+"</td>");
    				continue;
    				}
    			//	System.out.println(data[i]);
    				out.println("<td>"+data[i]+"</td>");
    			}
    			
    			//System.out.println();
			}
			
    		
    		
   			if( ( (data[7].equals(gender)) || gender.equals("Select"))   &&   ((!(data[15].equals("NONE"))) || (!(data[16].equals("NONE"))) || (!(data[17].equals("NONE")))    )  &&  Yantras.equals("Sanganitra")     && ( (apti>=score) &&  (s1>=sanscore) && (s2>=vidscore) && (s3>=yanscore)     && (sanr>=pisan) && (vidr>=pivid) && (yanr>=piyan)  && (gdr>=gd)  )  )
    			{
    				count++;
    				out.println("<tr>");
        			for(int i=0;i<data.length;i++)
        			{
        				if(data[i].equals(""))
        				{
        				out.println("<td>"+"</td>");
        				continue;
        				}
        			//	System.out.println(data[i]);
        				out.println("<td>"+data[i]+"</td>");
        			}
        			
        		//	System.out.println();
    			}
    			
    			if( ( (data[7].equals(gender)) || gender.equals("Select"))   &&   ((!(data[18].equals("NONE"))) || (!(data[19].equals("NONE"))) || (!(data[20].equals("NONE")))    )  &&  Yantras.equals("Vidyut")   && ( (apti>=score) &&  (s1>=sanscore) && (s2>=vidscore) && (s3>=yanscore)   && (sanr>=pisan) && (vidr>=pivid) && (yanr>=piyan)  && (gdr>=gd)  ) )
    			{
    				count++;
    				out.println("<tr>");
        			for(int i=0;i<data.length;i++)
        			{
        				if(data[i].equals(""))
        				{
        				out.println("<td>"+"</td>");
        				continue;
        				}
        		//		System.out.println(data[i]);
        				out.println("<td>"+data[i]+"</td>");
        			}
        			
        			//System.out.println();
    			}
    			
    			
    			if( ( (data[7].equals(gender)) || gender.equals("Select"))   &&   ((!(data[24].equals("NONE"))) || (!(data[25].equals("NONE"))) || (!(data[26].equals("NONE")))    )  &&  Yantras.equals("Yantrika")    &&   ( (apti>=score) &&  (s1>=sanscore) && (s2>=vidscore) && (s3>=yanscore)      && (sanr>=pisan) && (vidr>=pivid) && (yanr>=piyan)  && (gdr>=gd)    ))
    			{
    				count++;
    				out.println("<tr>");
        			for(int i=0;i<data.length;i++)
        			{
        				if(data[i].equals(""))
        				{
        				out.println("<td>"+"</td>");
        				continue;
        				}
        			//	System.out.println(data[i]);
        				out.println("<td>"+data[i]+"</td>");
        			}
        			
        		//	System.out.println();
    			}
    			
    			
    			if( ( (data[7].equals(gender)) || gender.equals("Select"))   &&   ((!(data[21].equals("NONE"))) || (!(data[22].equals("NONE"))) || (!(data[23].equals("NONE")))  ||  (!(data[27].equals("NONE"))) ||   (!(data[28].equals("NONE")))    ||   (!(data[29].equals("NONE")))   ||    (!(data[30].equals("NONE")))   ||   (!(data[31].equals("NONE")))  ||  (!(data[32].equals("NONE")))  )  &&  Yantras.equals("NonTech")    && ( (apti>=score) &&  (s1>=sanscore) && (s2>=vidscore) && (s3>=yanscore)    && (sanr>=pisan) && (vidr>=pivid) && (yanr>=piyan) && (gdr>=gd)  ))
    			{
    				count++;
    				out.println("<tr>");
        			for(int i=0;i<data.length;i++)
        			{
        				if(data[i].equals(""))
        				{
        				out.println("<td>"+"</td>");
        				continue;
        				}
        			//	System.out.println(data[i]);
        				out.println("<td>"+data[i]+"</td>");
        			}
        			
        		//	System.out.println();
    			}
    			
    			
    			
    /*			
    			if(Yantras.equals("Sanganitra"))
    			{
    				if((!(data[16].equals("NONE"))) || (!(data[17].equals("NONE"))) || (!(data[18].equals("NONE")))    )
    				{	
    					count++;
    					out.println("<tr>");
            			for(int i=0;i<data.length;i++)
            			{
            				if(data[i].equals(""))
            				{
            				out.println("<td>"+"</td>");
            				continue;
            				}
            				System.out.println(data[i]);
            				out.println("<td>"+data[i]+"</td>");
            			}
            			
    				}
    			}
    			*/
    			
    		}
    		out.println(count);
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

    
    
    
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		SpecQuery obj = new SpecQuery();
		String gender = request.getParameter("gender");
		String Yantras= request.getParameter("Yantras");
		String Test= request.getParameter("test");
		String Sang_score=request.getParameter("Sang_score");
		String Vid_score=request.getParameter("Vid_score");
		String Yan_score=request.getParameter("Yan_score");
		String PISAN=request.getParameter("pisan");
		String PIVID=request.getParameter("pivid");
		String PIYAN=request.getParameter("piyan");
		String GD=request.getParameter("gd");
		String MAX=request.getParameter("max");
//		String Sang_score=request.getParameter("Sang_score");
		System.out.println(gender);
		obj.search(response,gender,Yantras,Test,Sang_score,Vid_score,Yan_score,PISAN,PIVID,PIYAN,GD);
		
		
		
		//out.println("Hello World");
		
	}

}
