package com.bestedg.myTimesNz.common.response;

public class GenericResponse extends ResponseBase {
    /* The response real payload */
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
