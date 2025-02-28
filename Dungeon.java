import java.util.ArrayList;
import java.util.List;

public class Dungeon {
     private String name;
     private List<Room> rooms;
     private List<NPC> npcs;

    public Dungeon(String name, List<Room> rooms, List<NPC> npcs) {
        this.name=name;
        this.rooms=new ArrayList<>(rooms);
        this.npcs=new ArrayList<>(npcs);
    }

    public String getName() {
        return name;
    }
    public List<Room> getRooms() {
        return new ArrayList<>(rooms);
    }
    public List<NPC> getNPCs() {
        return new ArrayList<>(npcs);
    }
    public void addRoom(Room room) {
        rooms.add(room);
    }
    public void addNPC(NPC npc) {
        npcs.add(npc);
    }
    public String toString() {
        return "dungeon: " + name + " | rooms: " + rooms.size() + " | NPCs: " + npcs.size();
    }
}
