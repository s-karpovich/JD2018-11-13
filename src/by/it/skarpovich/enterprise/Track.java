package by.it.skarpovich.enterprise;

class Track {

    private String name;
    private int length;

    Track(String name, int minLength, int maxLength) {
        this.name = name;
        this.length = minLength + (int) (Math.random() * (maxLength - minLength + 1));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
