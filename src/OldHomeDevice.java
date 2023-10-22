class OldHomeDevice {
    private int brightness = 0;

    void activate() {
        System.out.println("Устройство включено");
    }

    void deactivate() {
        System.out.println("Устройство отключено");
    }

    void setLight(int level) {
        brightness = level;
        System.out.println("Яркоссть изменилась на " + brightness);
    }

    int getLight() {
        return brightness;
    }
}
