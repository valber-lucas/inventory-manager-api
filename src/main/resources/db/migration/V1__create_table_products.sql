CREATE TABLE tb_products (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    sku VARCHAR(255) NOT NULL UNIQUE,
    name VARCHAR(255) NOT NULL,
    description VARCHAR(255),
    price DECIMAL(19, 2) NOT NULL,
    quantity INT NOT NULL,
    min_stock_threshold INT NOT NULL,
    created_at DATETIME(6)
);