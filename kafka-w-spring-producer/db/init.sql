CREATE TABLE orders (
    order_id BINARY(16) PRIMARY KEY,
    order_date TIMESTAMP NOT NULL,
    order_region VARCHAR(50) NOT NULL,
    order_total DECIMAL(10, 2) NOT NULL,
    order_status VARCHAR(50) NOT NULL,
    order_discount DECIMAL(10, 2) NOT NULL,
    order_shipping DECIMAL(10, 2) NOT NULL,
    order_tax DECIMAL(10, 2) NOT NULL
);