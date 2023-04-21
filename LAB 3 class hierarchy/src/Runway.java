public class Runway {
    private int length;
    private boolean isAvailable;

    // constructor
    public Runway(int length) {
        this.length = length;
        this.isAvailable = true;
    }

    // getters and setters
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }


    }
}
