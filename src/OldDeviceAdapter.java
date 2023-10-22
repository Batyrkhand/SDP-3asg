class OldDeviceAdapter implements SmartHomeDevice {
    private OldHomeDevice oldDevice;

    public OldDeviceAdapter(OldHomeDevice oldDevice) {
        this.oldDevice = oldDevice;
    }

    @Override
    public void turnOn() {
        oldDevice.activate();
    }

    @Override
    public void turnOff() {
        oldDevice.deactivate();
    }

    @Override
    public void setBrightness(int level) {
        oldDevice.setLight(level);
    }

    @Override
    public int getBrightness() {
        return oldDevice.getLight();
    }
}
