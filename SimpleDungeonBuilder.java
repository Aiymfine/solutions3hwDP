import java.util.ArrayList;
import java.util.List;

public class SimpleDungeonBuilder implements IDungeonBuilder{
     String name;
     List<Room> rooms=new ArrayList<>();
     List<NPC> npcs=new ArrayList<>();

    public IDungeonBuilder setDungeonName(String name){
        this.name=name;
        return this;
    }
    public IDungeonBuilder addRoom(Room room){
        rooms.add(room);
        return this;
    }
    public IDungeonBuilder addNPC(NPC npc){
        npcs.add(npc);
        return this;
    }
    public Dungeon build(){
        return new Dungeon(name, rooms, npcs);
    }
}
