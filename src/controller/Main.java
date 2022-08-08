package controller;


import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		
	
        
        try {
        	
        	SessionFactory factory = new Configuration()
    				.configure("config.xml")			
    				.addAnnotatedClass(Student.class)
    				.addAnnotatedClass(Skills.class)
    				.buildSessionFactory();
            
            Session session = factory.openSession();
            
        	session.beginTransaction();
        	
//        
            Student stu=new Student();
            stu.setUserName("mo3");
            
            Skills sk1 = new Skills();
            sk1.setSkillName("pyp");
            
            Skills sk2 = new Skills();
            sk2.setSkillName("c++");
            
            stu.getListOfSkills().add(sk1);
            stu.getListOfSkills().add(sk2);
            session.save(stu);
        	
//        	 Student stu=session.get(Student.class, 1);
        	 
//        	 Skills sk2 = new Skills();
//             sk2.setSkillName("R");
//        	 stu.getListOfSkills().add(sk2);
        	 
                
//        
//             stu=session.get(Student.class, 1);
//             Set<Skills> st=stu.getListOfSkills();
//             
//             for(Skills sk : st) {
//            	 if(sk.getSkillName().equals("c++")) {
//            		 st.remove(sk); break;
//            	 }
//             }
             
             
             
           
//              System.out.println(st);
             
//             System.out.println(stu.toString());
            
           
            session.getTransaction().commit();
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
			e.getStackTrace();
			return;
		}
		System.out.println("Done");
		
		
	}

}
