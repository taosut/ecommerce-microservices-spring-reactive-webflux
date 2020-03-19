package demo.ecommerce.model.common.api;

/**
 * @author hanv
 */
public enum ResultCode implements IErrorCode {

    SUCCESS(200, "Successful"),
    FAILED(500, "Failed"),
    VALIDATE_FAILED(404, "Parameter validate failed"),
    UNAUTHORIZED(401, "Not logged in or the token has expired"),
    FORBIDDEN(403, "No related permissions");

    private long code;
    private String message;

    ResultCode(long code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public long getCode() {
        return 0;
    }

    @Override
    public String getMessage() {
        return null;
    }
}
