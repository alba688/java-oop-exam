public class Ball extends Equipment {
//OPPGAVE 1 - CREATE CHILD CLASS OF EQUIPMENT

    private String ballType;
    private boolean needsAir;

    public Ball(int idNr, String locker, boolean replace, String ballType, boolean needsAir) {
        super(idNr, locker, replace);
        this.ballType = ballType;
        this.needsAir = needsAir;
    }

    public String getBallType() {
        return ballType;
    }

    public void setBallType(String ballType) {
        this.ballType = ballType;
    }

    public boolean isNeedsAir() {
        return needsAir;
    }

    public void setNeedsAir(boolean needsAir) {
        this.needsAir = needsAir;
    }

    @Override
    public String toString() {
        if (this.isNeedsAir()) {
            return String.format("Ball {Type= %s, needs air, %s}", ballType, super.toString());
        }
        return String.format("Ball {Type= %s, does not need air, %s}", ballType, super.toString());
    }
}
