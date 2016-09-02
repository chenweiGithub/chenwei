package com.bestedg.myTimesNz.common.response;

import java.util.List;

/**
 * <pre>
 * {
 *   "data":[{},{}],
 *   "code":200,
 *   "msg":"Successfully call the api"
 * }
 * </pre>
 * 
 * @date 23 Jun, 2015 5:35:31 pm
 * @version v1.0
 */
public class ListResponse<T> extends ResponseBase {
    /* The payload is list */
    private List<T> data;

    public ListResponse() {}

    public ListResponse(List<T> data) {
        this.data = data;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
