package com.example.songr.infrastructure;

import com.example.songr.domain.Album;
import org.springframework.data.repository.CrudRepository;

public interface AlbumRepo extends CrudRepository<Album , Integer> {



}
