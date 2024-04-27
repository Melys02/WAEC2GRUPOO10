package appT2GRUPO10.WAEC2GRUPOO10.model.bd.pk;

import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@NoArgsConstructor
    @Entity
    @Data
    @Table(name = "rol")
    public class Rol {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer idrol;
        private String nomrol;
    }

