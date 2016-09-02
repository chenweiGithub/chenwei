package com.bestedg.myTimesNz.common.response;

/**
 * The base class of API response (Web and Mobile client). If you want represent the response with
 * JSON format the JSON text will like this.
 * 
 * <pre>
 * {
 *   "data":{},
 *   "code":200,
 *   "msg":"Successfully call the api"
 * }
 * 
 * {
 *   "data":[{},{}],
 *   "code":200,
 *   "msg":"Successfully call the api"
 * }
 * </pre>
 * 
 * Also, You can represent your response with xml or another styles.
 * 
 * @see ResponseCode
 * @see ListResponse
 * @see SimpleResponse
 * @date 15 Jun, 2015 5:58:29 pm
 * @version v1.0
 */
public class ResponseBase {

    /* The request response code , please refer to ResponseCode.java */
    private Integer code = ResponseCode.SUCCESS;
    /* The additional message for this reponse */
    private String msg="SUCCESS";

    public ResponseBase unAuthorizedAccess() {
        this.code = ResponseCode.INVALID_AUTH;
        return this;
    }

    public ResponseBase unAuthorizedAccess(String errMsg) {
        this.code = ResponseCode.INVALID_AUTH;
        this.msg = errMsg;
        return this;
    }

    public ResponseBase invalidArgs() {
        this.code = ResponseCode.INVALID_ARGS;
        return this;
    }

    public ResponseBase invalidArgs(String errMsg) {
        this.code = ResponseCode.INVALID_ARGS;
        this.msg = errMsg;
        return this;
    }

    public ResponseBase internalError() {
        this.code = ResponseCode.INTERNAL_ERROR;
        return this;
    }

    public ResponseBase internalError(String errMsg) {
        this.code = ResponseCode.INTERNAL_ERROR;
        this.msg = errMsg;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

	public void mustAuth(String msg) {
		 this.code = ResponseCode.MUST_AUTH;
	     this.msg = msg;
	}
}
