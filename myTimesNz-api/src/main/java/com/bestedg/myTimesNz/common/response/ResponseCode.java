package com.bestedg.myTimesNz.common.response;

/**
 * 
 * the customized code will no be included this class and it's value should greater than
 * <b>1000</b>.
 * <p>
 * This class only predefined some common codes that litter than <b>1000</b>
 * 
 * @date 15 Jun, 2015 5:54:23 pm
 * @version v1.0
 */
public class ResponseCode {
    /** The success code */
    public static final int SUCCESS = 1;
    
	/** 失败 */
    public static final int FAIL = 2;
    
    /** The args passed from client is not valid */
    public static final int INVALID_ARGS = 400;
    /** Authentication failed */
    public static final int INVALID_AUTH = 401;
    
    public static final int PAGE_NOT_EXSIST = 404;

    /** The erros/exception occurs when call the biz logic */
    public static final int INTERNAL_ERROR = 500;
   
    /** need login */
    public static final int MUST_AUTH = 40100;
    
}
