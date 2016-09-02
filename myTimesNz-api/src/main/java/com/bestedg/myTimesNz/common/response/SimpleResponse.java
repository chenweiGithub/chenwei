package com.bestedg.myTimesNz.common.response;

/**
 * <pre>
 * {
 *   "data":"Lewis Liu",
 *   "code":200,
 *   "msg":"Successfully call the api"
 * }
 * 
 * <b>or</b> 
 * {
 *   "data":2323,
 *   "code":200,
 *   "msg":"Successfully call the api"
 * } 
 * 
 * <b>or the complex type</b>
 * {
 *   "data":{"name":"Lewis Liu","gender":"male"},
 *   "code":200,
 *   "msg":"Successfully call the api"
 * }
 * </pre>
 * 
 * @date 23 Jun, 2015 5:35:31 pm
 * @version v1.0
 */
public class SimpleResponse<T> extends ResponseBase {
    /* The payload is simple object */
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
