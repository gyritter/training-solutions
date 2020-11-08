package week02;

import javax.management.ObjectInstance;
import java.util.ArrayList;
import java.util.List;

public class Office {
    List<MeetingRoom> meetingRooms = new ArrayList<MeetingRoom>();

    public void addMeetingRoom(ObjectInstance meetingRoom) { meetingRooms.add(meetingRoom);
    }

    public void printNames() {

        for(int i = 0; i < meetingRooms.size(); i++) {
        System.out.println(meetingRooms[i].getName());
        }
    }
    public void printNamesReverse() {

        for(int i = meetingRooms.size(); i>-1; i--) {
            System.out.println(meetingRooms[i].getName());
        }
    }
    public void printEvenNames() {

        for(int i = 1; i < meetingRooms.size(); i++) {
            System.out.println(meetingRooms[i].getName());
        }
    }
    public void printAreas() {

        for(int i = 0; i < meetingRooms.size(); i++) {
            String kiirni;
            kiirni = "Tárgyaló: " + meetingRooms[i].getName();
            kiirni = kiirni + " Szélesség: " + meetingRooms[i].getWidth();
            kiirni = kiirni + " Hosszúság: " + meetingRooms[i].getLength();
            kiirni = kiirni + " Terület: " + meetingRooms[i].getArea();
            System.out.println((kiirni));
        }
    }
    public void printMeeetingRoomsWithName(String name){

        for(int i = 0; i < meetingRooms.size(); i++) {
            String kiirni;
            String room = meetingRooms[i].getName();
            if (room.equals(name)) {
                kiirni = "Tárgyaló: " + room;
                kiirni = kiirni + " Szélesség: " + meetingRooms[i].getWidth();
                kiirni = kiirni + " Hosszúság: " + meetingRooms[i].getLength();
                kiirni = kiirni + " Terület: " + meetingRooms[i].getArea();
                System.out.println((kiirni));
                i = meetingRooms.size()+1;
            }
        }
    }
    public void printMeetingRoomsContains(String part){

        for(int i = 0; i < meetingRooms.size(); i++) {
            String kiirni;
            String room = meetingRooms[i].getName().toLowerCase;
            if (room.contains(part)) {
                kiirni = "Tárgyaló: " + meetingRooms[i].getName();
                kiirni = kiirni + " Szélesség: " + meetingRooms[i].getWidth();
                kiirni = kiirni + " Hosszúság: " + meetingRooms[i].getLength();
                kiirni = kiirni + " Terület: " + meetingRooms[i].getArea();
                System.out.println((kiirni));
                i = meetingRooms.size()+1;
            }
        }
    }
    public void printAreasLargerThan(int area){

        for(int i = 0; i < meetingRooms.size(); i++) {
            String kiirni;
            int room = meetingRooms[i].getArea();
            if (room > area) {
                kiirni = "Tárgyaló: " + meetingRooms[i].getName();
                kiirni = kiirni + " Szélesség: " + meetingRooms[i].getWidth();
                kiirni = kiirni + " Hosszúság: " + meetingRooms[i].getLength();
                kiirni = kiirni + " Terület: " + meetingRooms[i].getArea();
                System.out.println((kiirni));
                i = meetingRooms.size()+1;
            }
        }
    }
}
