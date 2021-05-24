package structural.adapter;

public class ChiefAdapter implements Chief {

    private Plumber p;

    public ChiefAdapter(Plumber p) {
        this.p = p;
    }

    @Override
    public Object makeBreakfast() {
        return p.getKey();
    }

    @Override
    public Object makeDinner() {
        return p.getPipe();
    }

    @Override
    public Object makeSupper() {
        return p.getScrewDriver();
    }
}
