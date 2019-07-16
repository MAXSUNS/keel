package com.github.keel.gateway.exception;

/**
 * 403 授权拒绝
 */
public class KeelDeniedException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public KeelDeniedException() {
    }

    public KeelDeniedException(String message) {
        super(message);
    }

    public KeelDeniedException(Throwable cause) {
        super(cause);
    }

    public KeelDeniedException(String message, Throwable cause) {
        super(message, cause);
    }

    public KeelDeniedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
