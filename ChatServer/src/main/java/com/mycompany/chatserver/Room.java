/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chatserver;

import java.util.List;

/**
 *
 * @author DucHuy
 */
public class Room {
    private int id;
    private String name;
    private List<String> users;
    private static final int currentRoomID=1;

    public Room(String name, List<String> users) {
        this.id=currentRoomID;
        this.name = name;
        this.users = users;
    }
    public static Room fidRoom(List<Room> roomList,int id){
        for (Room room : roomList){
			if (room.id == id)
				return room;
        }
		return null;
    }
    
    
}
