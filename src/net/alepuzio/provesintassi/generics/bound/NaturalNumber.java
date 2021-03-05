package net.alepuzio.provesintassi.generics.bound;

public class NaturalNumber<T extends Integer> {
/*
 * WARNING because The type parameter T should not be bounded by the final type Integer.
 *  Final types cannot be further extended	
 * */
    private T n;

    public NaturalNumber(T n)  { this.n = n; }

    public boolean isEven() {
        return n.intValue() % 2 == 0;//punta a metodo di class Integer
    }

    // ...
}