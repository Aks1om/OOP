/*
package pr2;

class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return name + " (" + gender + ") at " + email;
    }
}

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Tan Ah Teck", "ahTeck@somewhere.com", 'M');

        System.out.println(author);
        System.out.println(author.getName());
        System.out.println(author.getEmail());
        System.out.println(author.getGender());

        author.setEmail("TanAhTeck@somewhere.com");
        System.out.println(author.getEmail());
    }
}
*/

/*
package pr2;

class Ball {
    private double x = 0.0;
    private double y = 0.0;

    public Ball() {
    }

    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void move(double xDisp, double yDisp) {
        x += xDisp;
        y += yDisp;
    }

    @Override
    public String toString() {
        return "Ball @ (" + this.x + ", " + this.y + ").";
    }
}

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(100, 100);
        System.out.println(b1);
        b1.move(30, 15);
        System.out.println(b1);
    }
}
*/
