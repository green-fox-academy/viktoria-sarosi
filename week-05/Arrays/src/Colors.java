public class Colors {
    public static void main(String[] args) {
        String[][] colors = new String[3][];
        colors[0] = new String[]{"lime", "forest green", "olive", "pale green", "spring green"};
        colors[1] = new String[]{"orange red", "red", "tomato"};
        colors[2] = new String[]{"orchid", "violet", "pink", "hot pink"};
        for (int i = 0; i < colors.length; i++) {
            for (int j = 0; j < colors[i].length; j++) {
                System.out.print(colors[i][j] + " ");

            }
            System.out.println();
        }
    }
}
