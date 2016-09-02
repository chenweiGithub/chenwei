package com.bestedg.myTimesNz.common.response;

import java.util.List;

/**
 * 
 * This class provide the convineints methods to construct the read-easily
 * Response Object.
 * <p>
 * for each type of response methods
 * (SimpleResponse/ListResponse/ArrayResponse...) there are 3 ways to build the
 * response object like :
 * <ul>
 * <li><b><code>simpleResponse(T data)</code></b><br>
 * the code will be 200 and the msg will be DEFAULT_SUCCESS_MSG
 * <li><b><code> simpleResponse(String msg, T data)</code></b><br>
 * the code will be 200
 * <li><b><code>simpleResponse(int code,String msg, T data)</code></b><br>
 * </ul>
 * 
 * 
 * @date 12 Jan, 2016 5:44:35 pm
 * @version v1.0
 */
public class ResponseBuilder {

	private static String DEFAULT_SUCCESS_MSG = "OK";

	// allow each system to customize the default success msg
	// Notice that this method will will impact all response
	public static void setDefaultSuccessMsg(String defaultMsg) {
		DEFAULT_SUCCESS_MSG = defaultMsg;
	}

	/**
	 * @author yliu
	 * @date 13 Jan, 2016 10:13:20 am
	 * @return the success ResponseBase with default msg "OK" and code:200
	 */
	public static final ResponseBase success() {
		ResponseBase base = new ResponseBase();
		base.setMsg(DEFAULT_SUCCESS_MSG);
		return base;
	}

	public static final ResponseBase success(String msg) {
		ResponseBase base = new ResponseBase();
		base.setMsg(msg);
		return base;
	}

	public static final ResponseBase invalidArgs(String errMsg) {
		ResponseBase base = new ResponseBase();
		base.invalidArgs(errMsg);
		return base;
	}

	public static final ResponseBase internalError(String errMsg) {
		ResponseBase base = new ResponseBase();
		base.internalError(errMsg);
		return base;
	}

	public static final ResponseBase unAuthorizedAccess(String errMsg) {
		ResponseBase base = new ResponseBase();
		base.unAuthorizedAccess(errMsg);
		return base;
	}

	public static final ResponseBase baseResponse(int code, String msg) {
		ResponseBase base = new ResponseBase();
		base.setCode(code);
		base.setMsg(msg);
		return base;
	}

	public static final GenericResponse genericResponse(Object data) {
		GenericResponse response = new GenericResponse();
		response.setData(data);
		response.setMsg(DEFAULT_SUCCESS_MSG);
		return response;
	}

	public static final GenericResponse genericResponse(String msg, Object data) {
		GenericResponse response = new GenericResponse();
		response.setData(data);
		response.setMsg(msg);
		return response;
	}

	public static final GenericResponse genericResponse(int code, String msg, Object data) {
		GenericResponse response = new GenericResponse();
		response.setCode(code);
		response.setMsg(msg);
		response.setData(data);
		return response;
	}

	public static final <T> SimpleResponse<T> simpleResponse(T data) {
		SimpleResponse<T> response = new SimpleResponse<T>();
		response.setData(data);
		response.setMsg(DEFAULT_SUCCESS_MSG);
		return response;
	}

	public static final <T> SimpleResponse<T> simpleResponse(String msg, T data) {
		SimpleResponse<T> response = new SimpleResponse<T>();
		response.setData(data);
		response.setMsg(msg);
		return response;
	}

	public static final <T> SimpleResponse<T> simpleResponse(int code, String msg, T data) {
		SimpleResponse<T> response = new SimpleResponse<T>();
		response.setCode(code);
		response.setMsg(msg);
		response.setData(data);
		return response;
	}

	public static final <T> ListResponse<T> listResponse(List<T> data) {
		ListResponse<T> response = new ListResponse<T>();
		response.setData(data);
		response.setMsg(DEFAULT_SUCCESS_MSG);
		return response;
	}

	public static final <T> ListResponse<T> listResponse(String msg, List<T> data) {
		ListResponse<T> response = new ListResponse<T>();
		response.setMsg(msg);
		response.setData(data);
		return response;
	}

	public static final <T> ListResponse<T> listResponse(int code, String msg, List<T> data) {
		ListResponse<T> response = new ListResponse<T>();
		response.setCode(code);
		response.setMsg(msg);
		response.setData(data);
		return response;
	}

	public static final <T> ArrayResponse<T> arrayResponse(T[] data) {
		ArrayResponse<T> response = new ArrayResponse<T>();
		response.setData(data);
		response.setMsg(DEFAULT_SUCCESS_MSG);
		return response;
	}

	public static final <T> ArrayResponse<T> arrayResponse(String msg, T[] data) {
		ArrayResponse<T> response = new ArrayResponse<T>();
		response.setMsg(msg);
		response.setData(data);
		return response;
	}

	public static final <T> ArrayResponse<T> arrayResponse(int code, String msg, T[] data) {
		ArrayResponse<T> response = new ArrayResponse<T>();
		response.setCode(code);
		response.setMsg(msg);
		response.setData(data);
		return response;
	}
}
