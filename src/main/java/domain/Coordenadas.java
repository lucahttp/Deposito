package domain;

class Coordenadas {
    int x;
    int y;

    public boolean equals(Object o) {
        Coordenadas c = (Coordenadas) o;
        return c.x == x && c.y == y;
    }

    public Coordenadas(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    public int enDondeEsta() {
        return new Integer(x + "," + y);
    }
}
