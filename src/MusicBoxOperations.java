/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

/**
 *
 * @author hollands251
 */
public class MusicBoxOperations {
    
    private Song workingSong;
    private ArrayList<Song> workingList = new ArrayList();
    
    
    public MusicBoxOperations (ArrayList<Song> workingList) {
        
        this.workingList = workingList;
        this.workingSong = workingSong;
        
    }
    
    public void add(Song song) {
        
        workingList.add(song);
        
    }
    
    public void delete(String title) {
        
        for (int i = 0; i < workingList.size(); i++) {
            
            if (workingList.get(i).getSongTitle().equals(title)) {
                
                workingList.remove(workingList.get(i));
                
            }
        
        }
        
    }
    
    public Song search(int ID) {
        
        for (int i = 0; i < workingList.size(); i++) {
            
            if (workingList.get(i).getID() == ID) {
                
                return workingList.get(i);
                
            }
            
        }
        
     return null;
     
    }
    
    public Song search(String title) {
        
        for (int i = 0; i < workingList.size(); i++) {
            
            if (workingList.get(i).getSongTitle().equals(title)) {
                
                return workingList.get(i);
                
            }
            
        }
        
     return null;
     
    }
    

    public ArrayList<Song> getWorkingList() {
        
        return workingList;
        
    }
    
}
