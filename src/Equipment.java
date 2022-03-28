public abstract class Equipment {
// OPPGAVE 1 - CREATE PARENT EQUIPMENT CLASS

    private int idNr;
    private String locker;
    private boolean replace;

    public Equipment(int idNr, String locker, boolean replace) {
        this.idNr = idNr;
        this.locker = locker;
        this.replace = replace;
    }

    public int getIdNr() {
        return idNr;
    }

    public void setIdNr(int idNr) {
        this.idNr = idNr;
    }

    public String getLocker() {
        return locker;
    }

    public void setLocker(String locker) {
        this.locker = locker;
    }

    public boolean toReplace() {
        return replace;
    }

    public void setReplace(boolean replace) {
        this.replace = replace;
    }

    @Override
    public String toString() {
        if(this.toReplace()) {
            return String.format("Equipment ID %s, belongs in %s, and needs a replacement.", idNr, locker);
        }
        return String.format("Equipment ID %s, belongs in %s, and does not need replacement.", idNr, locker);
    }
}
