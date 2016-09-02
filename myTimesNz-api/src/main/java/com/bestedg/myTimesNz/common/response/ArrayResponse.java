package com.bestedg.myTimesNz.common.response;

/**
 * <pre>
 * {
 *   "data":[
 *      12,
 *      15,
 *      18
 *    ],
 *   "code":200,
 *   "msg":"Successfully call the api"
 * }
 * 
 * or this style just like List Response
 * 
 * {
 *   "data":[
 *      {},
 *      {},
 *      {}
 *    ],
 *   "code":200,
 *   "msg":"Successfully call the api"
 * }
 * </pre>
 * 
 * @date 12 Jan, 2016 5:55:58 pm
 * @version v1.0
 */
public class ArrayResponse<T> extends ResponseBase {
	/* The payload is list */
	private T[] data;

	public ArrayResponse() {
	}

	public ArrayResponse(T[] data) {
		this.data = data;
	}

	public T[] getData() {
		return data;
	}

	public void setData(T[] data) {
		this.data = data;
	}
}
