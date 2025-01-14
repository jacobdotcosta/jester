package io.jester.examples.quarkus.jdbc.mysql;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;

@Entity
@Table(name = "book")
public class BookReactive extends PanacheEntity {
    @NotBlank(message = "book title must be set")
    public String title;

    @NotBlank(message = "book author must be set")
    public String author;
}
