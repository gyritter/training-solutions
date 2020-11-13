package week02;

import javax.management.ObjectInstance;
import java.util.ArrayList;
import java.util.List;

public class Office {


    public List<MeetingRoom> meetingRooms = new ArrayList<>();

    public void addMeetingRoom(MeetingRoom meetingRoom) {
        meetingRooms.add(meetingRoom);
        System.out.println(meetingRooms.size());;
    }



    public void printNames() {
        System.out.println("printNames");

        for (MeetingRoom meetingRoom: meetingRooms) {
            System.out.println(meetingRoom.getName());



        }
    }


    public void printNamesReverse() {

        for(int i =  meetingRooms.size(); i>-1; i--) {
            System.out.println(meetingRooms.get(i).getName());
        }
    }
    public void printEvenNames() {

        for(int i = 0; i < meetingRooms.size(); i++) {
            if(i % 2 == 0)
            System.out.println(meetingRooms.get(i).getName());
        }
    }
    public void printAreas() {

        for (MeetingRoom meetingRoom: meetingRooms) {
            String kiirni;
            kiirni = "Tárgyaló: " + meetingRoom.getName();
            kiirni = kiirni + " Szélesség: " + meetingRoom.getWidth();
            kiirni = kiirni + " Hosszúság: " + meetingRoom.getLength();
            kiirni = kiirni + " Terület: " + meetingRoom.getWidth()*meetingRoom.getLength();
            // kiirni = kiirni + " Terület: " + meetingRoom.getArea();
            System.out.println((kiirni));
        }
    }
    public void printMeeetingRoomsWithName(String name){

        for (MeetingRoom meetingRoom: meetingRooms) {
            String kiirni;
            String room = meetingRoom.getName();
            if (room.equals(name)) {
                kiirni = "Tárgyaló: " + room;
                kiirni = kiirni + " Szélesség: " + meetingRoom.getWidth();
                kiirni = kiirni + " Hosszúság: " + meetingRoom.getLength();
                kiirni = kiirni + " Terület: " + meetingRoom.getWidth()*meetingRoom.getLength();
                System.out.println((kiirni));

            }
        }
    }
    public void printMeetingRoomsContains(String part){

        for (MeetingRoom meetingRoom: meetingRooms) {
            String kiirni;
            String room = (meetingRoom.getName());
           // String room2= room.toLowerCase;
            if (room.contains(part)) {
                kiirni = "Tárgyaló: " + meetingRoom.getName();
                kiirni = kiirni + " Szélesség: " + meetingRoom.getWidth();
                kiirni = kiirni + " Hosszúság: " + meetingRoom.getLength();
                kiirni = kiirni + " Terület: " + meetingRoom.getWidth()*meetingRoom.getLength();
                System.out.println((kiirni));

            }
        }
    }
    public void printAreasLargerThan(int area){

        for(int i = 0; i < meetingRooms.size(); i++) {
            String kiirni;
            int room = meetingRooms.get(i).getWidth()*meetingRooms.get(i).getLength();
            if (room > area) {
                kiirni = "Tárgyaló: " + meetingRooms.get(i).getName();
                kiirni = kiirni + " Szélesség: " + meetingRooms.get(i).getWidth();
                kiirni = kiirni + " Hosszúság: " + meetingRooms.get(i).getLength();
                kiirni = kiirni + " Terület: " + meetingRooms.get(i).getWidth()*meetingRooms.get(i).getLength();
                System.out.println((kiirni));
                i = meetingRooms.size()+1;
            }
        }
    }
    public List<MeetingRoom> getMeetingRooms() {
        return meetingRooms;
    }

    public void setMeetingRooms(List<MeetingRoom> meetingRooms) {
        this.meetingRooms = meetingRooms;
    }
}
