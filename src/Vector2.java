import java.util.HashMap;
import java.util.Scanner;

public class Vector2 extends MathObject implements Cloneable {
    public static void main(String[] args) throws Exception {
        Vector2 a = new Vector2(1, 2, "woo"); 
        Vector2 b = new Vector2(4, 2, "wee");
        System.out.println(a + " a magnitude: " + a.magnitude());
        System.out.println(b + " b magnitude: " + b.magnitude());
        System.out.println("a plus b = " + a.add(b));
        System.out.println("is a equal to b? " + a.equals(b));
        System.out.println("Vector2 a has how many dimensions? " + a.getDimension() + "\n");
        
        Vector2 c = (Vector2) a.clone();
        System.out.println("Vector2 c, " + c + ", is a clone of a, " + a);
        c.setX(3);
        System.out.println("I can use .setX() to change c without changing a: c " + c + ", a " + a + "\n");


        Vector2 d = new Vector2(6,2, "waa");
        Vector2 e = new Vector2(5, 9, "wii");
        HashMap<String, MathObject> instanceHashMap = new HashMap<>();
        instanceHashMap.put(a.getDescription(), a); 
        instanceHashMap.put(b.getDescription(), b);
        instanceHashMap.put(d.getDescription(), d);
        instanceHashMap.put(e.getDescription(), e);   

        Scanner scan = new Scanner(System.in);    
        System.out.println("retrieve Vector2 from description");
        String keyToCheck = scan.nextLine();
        if (instanceHashMap.get(keyToCheck) != null) {
            System.out.println(instanceHashMap.get(keyToCheck));
        } else {
            System.out.println("Error: instanceHashMap contains no mapping for this key");
        }
        System.out.println();
        
        for (String notI : instanceHashMap.keySet()) { // cause you shouldn't name it i
            System.out.println(instanceHashMap.get(notI));
        }
        scan.close();
    }

    private int x;
    private int y;

    public Vector2(int clientX, int clientY, String clientDescription) {
        x = clientX;
        y = clientY;
        description = clientDescription;
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

    public String getDescription() {
        return description;
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
        Vector2 result = new Vector2(x + b.getX(), y + b.getY(), "Vector2 result of adding " + this + "and " + b);
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
