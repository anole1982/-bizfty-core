package com.icss.regie.api.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class ValueString {

    @Column(name = "DEFAULT_STRING", nullable = true, length = 255)
    private String defaultString;
    @Column(name = "PARTTERN", nullable = true, length = 255)
    private String parttern;
    @Column(name = "MAX_LENGTH", precision = 5, scale = 0)
    private int maxLength;
    @Column(name = "MIN_LENGTH", precision = 5, scale = 0)
    private int minLength;
    @Column(name = "VALUE_LENGTH", precision = 5, scale = 0)
    private int length;

    public String getDefaultString() {
        return defaultString;
    }

    public void setDefaultString(String defaultString) {
        this.defaultString = defaultString;
    }

    public String getParttern() {
        return parttern;
    }

    public void setParttern(String parttern) {
        this.parttern = parttern;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(int maxLength) {
        this.maxLength = maxLength;
    }

    public int getMinLength() {
        return minLength;
    }

    public void setMinLength(int minLength) {
        this.minLength = minLength;
    }

    /**
     * @return the length
     */
    public int getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(int length) {
        this.length = length;
    }
}
