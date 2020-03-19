package demo.ecommerce.model.common.exception;

import demo.ecommerce.model.common.api.IErrorCode;

/**
 * @author hanv
 */
public class Asserts {

    public static void fail(String message) {
        throw new ApiException(message);
    }

    public static void fail(IErrorCode errorCode) {
        throw new ApiException(errorCode);
    }
}
