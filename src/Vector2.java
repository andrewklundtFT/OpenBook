public class Vector2 extends MathObject implements Cloneable {
    public static void main(String[] args) throws Exception {
        Vector2 a = new Vector2(1, 2); 
        Vector2 b = new Vector2(4, 2);
        System.out.println(a + " a magnitude: " + a.magnitude());
        System.out.println(b + " b magnitude: " + b.magnitude());
        System.out.println("a plus b = " + a.add(b));
        System.out.println("is a equal to b? " + a.equals(b));
        System.out.println("Vector2 a has how many dimensions? " + a.getDimension());
        
        Vector2 c = (Vector2)a.clone();
        System.out.println("Vector2 c, " + c + ", is a clone of a, " + a);
        c.setX(3);
        System.out.println("I can use .setX() to change c without changing a: c " + c + ", a " + a);
    }

    private int x;
    private int y;

    public Vector2(int clientX, int clientY) {
        x = clientX;
        y = clientY;
    }

    public int getDimension() {
        return 2;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public int getX () {
        return x;
    }

    public int getY () {
        return y;
    }

    public void setX (int clientX) {
        x = clientX;
    }

    public void setY (int clientY) {
        y = clientY;
    }

    public double magnitude () {
        return Math.sqrt((x * x) + (y * y));
    }

    public Vector2 add (Vector2 b) {
        Vector2 result = new Vector2(x + b.getX(), y + b.getY());
        return result;
    }

    public boolean isEqual (Vector2 b) {
        if (x == b.getX() && y == b.getY()) {
            return true;
        }
        return false;
    }

    @Override
    public String toString () {
        return "(" + x + "," + y + ")";
    }

}
