public class Vector2 {
    public static void main(String[] args) throws Exception {
        Vector2 a = new Vector2(1, 2); 
        Vector2 b = new Vector2(4, 2);
        System.out.println(a + " a magnitude: " + a.magnitude());
        System.out.println(b + " b magnitude: " + b.magnitude());
        System.out.println("a plus b = " + a.add(b));
    }

    private int x;
    private int y;

    public Vector2(int userX, int userY) {
        x = userX;
        y = userY;
    }

    public double magnitude () {
        return Math.sqrt((x * x) + (y * y));
    }

    public Vector2 add (Vector2 b) {
        Vector2 result = new Vector2(x + b.x, y + b.y);
        return result;
    }

    public boolean isEqual (Vector2 b) {
        if (x == b.x && y == b.y) {
            return true;
        }
        return false;
    }

    @Override
    public String toString () {
        return "(" + x + "," + y + ")";
    }

}
