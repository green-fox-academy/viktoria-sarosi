public class ToDoPrint {
    public static void main(String... args){
        String todoText = " - Buy milk\n";
        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention

        // Expected outpt:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo
        String td = "My todo:\n";
        String dg = " - Download games\n";
        String d = "\t - Diablo\n";

        todoText = td.concat(todoText).concat(dg).concat(d);

        System.out.println(todoText);
    }

}
