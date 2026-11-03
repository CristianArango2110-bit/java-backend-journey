package week02;

public class HttpStatusMessage {
    public static void main(String[] args) {
        int statusCode = 418;
        String message = switch (statusCode) {
            case 200 -> "OK";
            case 201 -> "Created";
            case 400 -> "Bad Request";
            case 404 -> "Not Found";
            case 500 -> "Internal Server Error";
            default -> "Unknown status";
        };

        System.out.println("Message: " + message);
    }
}