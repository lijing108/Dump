package group.dump.web.exception;

public class DumpException extends RuntimeException {

    public DumpException(String msg) {
        super(msg);
    }

    public DumpException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
