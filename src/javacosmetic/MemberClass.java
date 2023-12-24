/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacosmetic;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ozlem
 */
public class MemberClass {
    static ArrayList <Member> memberArr;

    public static void setMemberArr(ArrayList<Member> memberArr) {
        MemberClass.memberArr = memberArr;
    }

    public static ArrayList<Member> getMemberArr() {
        return memberArr;
    }
    
    
    
    static boolean checkMember(String nick, String password){
        //if(member.isEmpty()!=true){
        for(int i=0; i<memberArr.size();i++){
            if(memberArr.get(i).getNick().equals(nick) & memberArr.get(i).getPassword().equals(password)){
                return true;
            }
            
        }
        //}
        return false;
    }
    
    static boolean isThereThisNick(String nick){
        for(int i=0; i<memberArr.size();i++){
            if(memberArr.get(i).getNick().equals(nick)){
                return true;
            }
            
        }
        return false;
        
    }
    
    /*public static void WriteArrayListBin() throws FileNotFoundException, IOException{
        
            FileOutputStream fos = new FileOutputStream("Member.txt");
            ObjectOutputStream oos= new ObjectOutputStream(fos) ;
            oos.writeObject(memberArr);
            oos.close();
            fos.close();
            
        
    }
    
    public static void readtxtFile() throws IOException{
        if(memberArr.size()>0){
            memberArr.clear();
        }
        
        Scanner sc= new Scanner(new File("Member.txt"));
        
        while(sc.hasNext()){
            String nick=sc.next();
            String password=sc.next();
            Member m= new Member(nick,password);
            memberArr.add(m);
            
        }
    }
 */   
}
