public abstract class LazadoGep implements Urhajo{
    float sebesseg;
    boolean meghibasodhatE;

    public LazadoGep(float sebesseg, boolean meghibasodhatE) {
        this.sebesseg = sebesseg;
        this.meghibasodhatE = meghibasodhatE;
    }
    public abstract boolean elkapjaAVonosugar();

    @Override
    public boolean legyorsuljaE(String Urhajo) {
        return false;
    }

    @Override
    public float milyenGyors() {
        return sebesseg;
    }

    public float getSebesseg() {
        return sebesseg;
    }

    public void setMeghibasodhatE(boolean meghibasodhatE) {
        this.meghibasodhatE = meghibasodhatE;
    }

    public void setSebesseg(float sebesseg) {
        this.sebesseg = sebesseg;
    }
}
