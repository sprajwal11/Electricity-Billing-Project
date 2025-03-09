CREATE TABLE bills (
                       id BIGINT AUTO_INCREMENT PRIMARY KEY,
                       user_id BIGINT NOT NULL,
                       amount DECIMAL(10,2) NOT NULL,
                       tariff_code VARCHAR(20) NOT NULL,
                       due_date DATE NOT NULL,
                       status ENUM('PENDING', 'PAID', 'OVERDUE') NOT NULL DEFAULT 'PENDING',
                       created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
