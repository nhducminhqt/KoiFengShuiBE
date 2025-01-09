package com.fengshuisystem.demo.configuration;

public class EndPoint {

    public static final String[] ADMIN_GET_ENDPOINTS = {
            "/animals", "/animals/animal-search", "/shelters", "/shelters/search-name", "/shelters/{search}",
            "/colors", "shapes", "/animal-images", "/shelter-images", "colors/getAll-Colors",
            "shapes/shape-search", "/users", "/users/search-name", "/roles",
            "colors/search-colors", "api/bills"
            ,"/users/new-users-today", "/users/new-users-this-week", "/users/new-users-this-month",
            "/api/consultation-requests/completed-count",  "/posts/count", "/consultation-results/completed-count",
            "/api/bills/total-income-this-month", "/api/bills/total-income-between-dates"
    };

    public static final String[] ADMIN_POST_ENDPOINTS = {
            "/animals", "/shelters", "/colors", "/shapes", "/consulation-animal", "/consulation-shelter",
            "/users{userId}/set-roles", "/animal-images/{id}", "/shelter-images/{id}", "/packages",
            "/api/consultation-results/requestId/{requestId}",
            "/api/consultation-animals/",
            "/api/consultation-shelters/resultId/{resultId}/shelter-category-id/{shelterCategoryId}",
    };

    public static final String[] ADMIN_PUT_ENDPOINTS = {
            "/animals/{id}", "/shelters/{id}", "/colors/{id}", "/shapes/{id}",
            "/packages/{id}", "/api/consultation-results/send-email/{resultId}",
            "/api/consultation-results/{id}",
            "/api/consultation-request-details/{id}",
            "/api/consultation-requests"
    };

    public static final String[] ADMIN_DELETE_ENDPOINTS = {
            "/animals/{id}", "/shelters/{id}", "/colors/{id}", "/shapes/{id}", "/packages/{id}"
    };

    public static final String[] PUBLIC_ENDPOINTS = {
            "/users", "/users/admin", "/auth/token", "/auth/introspect", "/auth/logout", "/auth/refresh",
            "/auth/outbound/authentication", "/roles", "auth/token-email",
            "/destinys/compatibility/{yearOfBirth}"
    };

    public static final String[] PUBLIC_GET_ENDPOINTS = {
            "users/existByUserName", "users/existByEmail", "users/activate",
            "/destinys/destiny/{yearOfBirth}", "/destinys/autoConsultation/{yearOfBirth}",
            "api/vn_pay/create_vn_pay", "/api/number"
            , "colors/getAll-Colors","api/direction",
            "shapes/getAll-Shapes"
    };

    public static final String[] USER_GET_ENDPOINTS = {
            "/posts", "/posts/search-posts", "/post/comments", "/post/images",
            "api/bills/{billId}", "/vn_pay/create_vn_pay","/search-posts/title","/search-posts/email",
            "/animals/animal-destiny" , "/posts/search-posts/year", "/animals/animal-destiny-name"
    };

    public static final String[] USER_POST_ENDPOINTS = {
            "users/reset-password", "users/forgot-password", "/posts", "/post/comments", "/post/images",
            "api/bills/request/{requestId}/payments/{paymentId}",
            "/api/consultation-requests",
            "/api/consultation-request-details/request-id/{requestId}",
            "users/update-password"
    };

    public static final String[] USER_PUT_ENDPOINTS = {
            "/posts/{id}", "/post/comments/{id}", "/post/images/{id}", "api/bills/{id}", "/api/consultation-requests"
    };

    public static final String[] USER_DELETE_ENDPOINTS = {
            "/posts/{id}", "/post/comments/{id}", "/post/images/{id}"
    };

    public static final String[] BOTH_GET_ENDPOINTS = {
            "api/bills/{id}/status",
            "/api/bills/{billId}",
            "/destinys", "/api/bills/search", "/shelters/shelter-search",  "/shelters/shelter-search-name", "/packages/{id}", "/shelters/shelterCategory", "animals/animalCategory"
    };

    public static final String[] BOTH_DELETE_ENDPOINTS = {
            "/posts/{id}",
    };
}