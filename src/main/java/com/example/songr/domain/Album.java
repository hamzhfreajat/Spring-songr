
package com.example.songr.domain;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;


@Setter
@Getter
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
public class Album {
    @Setter(value = AccessLevel.NONE)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @NonNull
    private String title;
    @NonNull
    private String artist;
    @NonNull
    private int songCount;
    @NonNull
    private int secondsLength ;
    @NonNull
    private String imageUrl ;

    @OneToMany(mappedBy = "album")
    private Set<Song> songs;
}