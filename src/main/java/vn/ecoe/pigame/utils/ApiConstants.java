package vn.ecoe.pigame.utils;

public class ApiConstants {


    private ApiConstants() {
    }

    public static final String API_VERSION_1 = "api/v1";
    public static final String HISTORY = "/history";

    /**
     * Report Type Endpoint
     */
    public static final String REPORT_TYPE_END_POINT = "/reportType";
    public static final String REPORT_TYPE_BY_ID_END_POINT = REPORT_TYPE_END_POINT + "/{id}";


    /**
     * Customer Endpoint
     */
    public static final String CUSTOMERS_END_POINT = "/customers";
    public static final String CUSTOMER_END_POINT = "/customer";
    public static final String CUSTOMER_BY_ID_END_POINT = CUSTOMER_END_POINT + "/{id}";


    /**
     * Product Endpoint
     */
    public static final String PRODUCTS_END_POINT = "/products";
    public static final String PRODUCT_END_POINT = "/product";
    public static final String PRODUCT_BY_ID_END_POINT = PRODUCT_END_POINT + "/{id}";

    /**
     * Category Endpoint
     */
    public static final String CATEGORIES_END_POINT = "/categories";
    public static final String CATEGORY_END_POINT = "/category";
    public static final String CATEGORY_BY_ID_END_POINT = CATEGORY_END_POINT + "/{id}";

    /**
     * Trading end point
     */
    public static final String TRADINGS_END_POINT = "/tradings";
    public static final String TRADING_END_POINT = "/trading";
    public static final String TRADING_BY_ID_END_POINT = TRADING_END_POINT + "/{id}";


    /**
     * Trading end point
     */
    public static final String CITES_END_POINT = "/cities";
    public static final String CITTES_BY_ID_END_POINT = CITES_END_POINT + "/{id}";
}
