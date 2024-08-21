package myschool.api;

public record ApiReponse<T>(
        String message,
        T data
) {
}
