package net.alepuzio.provesintassi.generics.bound;

public class NaturalNumber<T extends Integer> {

    private T n;

    public NaturalNumber(T n)  { this.n = n; }

    public boolean isEven() {
        return n.intValue() % 2 == 0;//punta a metodo di class Integer
    }

    // ...
}