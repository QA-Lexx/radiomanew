public class Radio {
    private int minStation = 0;
    private int maxStation = 9;
    private int currentStation = minStation;
    private int amountStation = 10;

    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume = minVolume;

    private int nextStation = currentStation + 1;
    private int previousStation = currentStation - 1;
    private int nextVolume = currentVolume + 1;
    private int previousVolume = currentVolume - 1;


    public Radio(int minStation, int maxStation, int minVolume, int maxVolume) {
        this.minStation = minStation;
        this.maxStation = maxStation;
        this.currentStation = minStation;

        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
        this.currentVolume = minVolume;
    }

    public Radio(int amountStation) {
        this.amountStation = amountStation;
    }

    public Radio(int nextStation, int currentStation, int nextVolume) {
        this.nextStation = nextStation;
        this.currentStation = currentStation;
        this.nextVolume = nextVolume;
    }

    public Radio(int currentVolume, int previousVolume) {
        this.currentVolume = currentVolume;
        this.previousVolume = previousVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getAmountStation() {
        return amountStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getNextStation() {
        if (currentStation < maxStation) {
            nextStation = currentStation + 1;
        }
        return nextStation;
    }

    public int getPreviousStation() {
        if (currentStation < maxStation) {
            previousStation = currentStation - 1;
        }
        return previousStation;
    }

    public int getNextVolume() {
        if (currentVolume < maxVolume) {
            nextVolume = currentVolume + 1;
        }
        return nextVolume;
    }

    public int getPreviousVolume() {
        if (currentVolume < maxVolume) {
            previousVolume = currentVolume - 1;
        }
        return previousVolume;
    }
}
