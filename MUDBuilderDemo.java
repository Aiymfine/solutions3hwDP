public class MUDBuilderDemo {
    public static void main(String[] args) {
        IDungeonBuilder builder= new SimpleDungeonBuilder();
        Dungeon dungeon= builder.setDungeonName("вark сave")
                .addRoom(new Room("Entrance", "A damp entrance hall."))
                .addRoom(new Room("Chamber", "A dark chamber with a flickering torch."))
                .addNPC(new NPC("Goblin", "A sneaky goblin lurking in the shadows."))
                .build();
        System.out.println(dungeon);
        System.out.println("Rooms:");
        dungeon.getRooms().forEach(room -> System.out.println(" - " + room.getName()));
        System.out.println("NPCs:");
        dungeon.getNPCs().forEach(npc -> System.out.println(" - " + npc.getName()));
    }
}