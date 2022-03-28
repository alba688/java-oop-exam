public class TableTennisRacket extends Equipment {
// OPPGAVE 1 - CREATE CHILD CLASS OF EQUIPMENT

    private boolean newPad;


    public TableTennisRacket(int idNr, String locker, boolean replace, boolean newPad) {
        super(idNr, locker, replace);
        this.newPad = newPad;
    }

    public boolean isNewPad() {
        return newPad;
    }

    public void setNewPad(boolean newPad) {
        this.newPad = newPad;
    }

    @Override
    public String toString() {
        if (this.isNewPad()) {
            return String.format("Table Tennis Racket {Needs pad replaced, %s}", super.toString());
        }
        return String.format("Table Tennis Racket {Pad in good condition, %s}", super.toString());
    }
}
