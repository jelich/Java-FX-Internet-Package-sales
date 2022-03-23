package org.sample;

import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;

public class Data {

    private SimpleStringProperty firstName;
    private SimpleStringProperty lastName;
    private SimpleStringProperty address;
    private SimpleObjectProperty speed;
    private SimpleObjectProperty bandwidth;
    private SimpleObjectProperty duration;

    public Data(String firstName, String lastName, String address, Object speed, Object bandwidth, Object duration) {
        this.firstName = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);
        this.address = new SimpleStringProperty(address);
        this.speed = new SimpleObjectProperty(speed);
        this.bandwidth = new SimpleObjectProperty(bandwidth);
        this.duration = new SimpleObjectProperty(duration);
    }

    public String getFirstName() {
        return firstName.get();
    }

    public SimpleStringProperty firstNameProperty() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }

    public String getLastName() {
        return lastName.get();
    }

    public SimpleStringProperty lastNameProperty() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName.set(lastName);
    }

    public String getAddress() {
        return address.get();
    }

    public SimpleStringProperty addressProperty() {
        return address;
    }

    public void setAddress(String address) {
        this.address.set(address);
    }

    public Object getSpeed() {
        return speed.get();
    }

    public SimpleObjectProperty speedProperty() {
        return speed;
    }

    public void setSpeed(Object speed) {
        this.speed.set(speed);
    }

    public Object getBandwidth() {
        return bandwidth.get();
    }

    public SimpleObjectProperty bandwidthProperty() {
        return bandwidth;
    }

    public void setBandwidth(Object bandwidth) {
        this.bandwidth.set(bandwidth);
    }

    public Object getDuration() {
        return duration.get();
    }

    public SimpleObjectProperty durationProperty() {
        return duration;
    }

    public void setDuration(Object duration) {
        this.duration.set(duration);
    }
}
