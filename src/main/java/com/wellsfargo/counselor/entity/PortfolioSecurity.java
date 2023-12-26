package com.wellsfargo.counselor.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class PortfolioSecurity {

    @Id
    @GeneratedValue()
    private long id;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Portfolio portfolio;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Security security;

    @Column(nullable = false)
    private LocalDate purchaseDate;

    @Column(nullable = false)
    private BigDecimal purchasePrice;

    @Column(nullable = false)
    private int quantity;

    protected PortfolioSecurity() {
    }

    public PortfolioSecurity(Portfolio portfolio, Security security, LocalDate purchaseDate, BigDecimal purchasePrice, int quantity) {
        this.portfolio = portfolio;
        this.security = security;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
    }
}
