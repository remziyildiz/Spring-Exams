package com.haydikodlayalim.entity;

import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name = "kisi")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of ={"id"})
@ToString

public class Kisi {
    @Id
    @SequenceGenerator(name = "seq_kisi",allocationSize = 1)
    @GeneratedValue(generator ="seq_kisi",strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(length = 100, name = "adi")
    private String adi;

    @Column(length = 100, name = "soyadi")
    private String soyadi;

    @OneToMany
    @JoinColumn(name = "kisi_adres_id")
    private List<Adres> adresleri;

}
