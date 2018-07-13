package com.icss.regie.api.models;


import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class ValueBlob {

    @Column(name = "MAX_LENGTH", precision = 5, scale = 0)
    private int maxLength;

    /**
     * @return the maxLength
     */
    public int getMaxLength() {
        return maxLength;
    }

    /**
     * @param maxLength the maxLength to set
     */
    public void setMaxLength(int maxLength) {
        this.maxLength = maxLength;
    }
}
