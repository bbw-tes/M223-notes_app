package ch.zli.notes_app.models;

import java.math.BigInteger;

import jakarta.persistence.*;

@Entity
@Table(name = "expenses")
public class Expense {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private BigInteger amount;

    @Column(nullable = false)
    private String description;

    @ManyToOne
    private ApplicationUser owner;
    
}
